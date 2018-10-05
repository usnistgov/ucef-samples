package gov.nist.hla.samples.challengeresponse;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ieee.standards.ieee1516._2010.InteractionClassType;
import org.ieee.standards.ieee1516._2010.ObjectClassType;

import com.fasterxml.jackson.databind.ObjectMapper;

import gov.nist.hla.gateway.GatewayCallback;
import gov.nist.hla.gateway.GatewayFederate;
import hla.rti.AttributeNotOwned;
import hla.rti.FederateNotExecutionMember;
import hla.rti.InteractionClassNotPublished;
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;
import hla.rti.ObjectClassNotPublished;
import hla.rti.ObjectNotKnown;

/*
 * This class broadcasts challenges to the federation, and tests if the responses to those challenges are correct.
 *
 * A challenge is a randomly generated string paired with an integer index of one of the elements. A correct response
 * for a given challenge is the substring that starts from the challenge index. To generate the correct response, a
 * federate must understand both the string and numeric data in the challenge.
 *
 * This class generates two challenges each logical time step. One challenge is sent as an interaction, and the other
 * challenge is sent as an update to one registered object instance. The content of the two challenges are different.
 *
 * A response to a challenge is not immediate as both the challenge and its response are TSO messages. Each challenge
 * has an associated timeout, and failure to receive a correct response before the timeout expires is flagged as an
 * error. All failed challenges are output to the logger ERROR channel.
 *
 * When this federate terminates, there will be several outstanding challenges due to the delay before each response.
 * All of these challenges are discarded, and none of them are flagged as errors.
 */
public class GatewayChallenger implements GatewayCallback {
    private static final Logger log = LogManager.getLogger();
    
    /*
     * The class path for the object class that represents a challenge.
     */
    private static final String OBJECT_CHALLENGE = "ObjectRoot.ParentObject.ChallengeObject";
    
    /*
     * The class path for the interaction class that represents a challenge.
     */
    private static final String INTERACTION_CHALLENGE =
            "InteractionRoot.C2WInteractionRoot.ParentInteraction.ChallengeInteraction";
    
    /*
     * The class path for the interaction class that represents a response to a challenge.
     */
    private static final String INTERACTION_RESPONSE = "InteractionRoot.C2WInteractionRoot.ParentInteraction.Response";
    
    /*
     * The set of characters used to generate the challenge string.
     */
    private final static String VALID_CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";
    
    /*
     * The options specified in the JSON configuration file.
     */
    private ChallengerConfiguration configuration;
    
    /*
     * A helper class that tracks challenges, timeouts, and correct responses.
     */
    private ResponseTracker responseTracker;
    
    /*
     * A reference to the gateway library used to coordinate with the federation.
     */
    private GatewayFederate gateway;
    
    /*
     * The name of the object instance that will be updated with new challenges.
     */
    private String objectName;
    
    /*
     * An increasing integer used to generate an id for each challenge.
     */
    private int sequenceNumber = 0;
    
    public static void main(String[] args)
            throws IOException {
        if (args.length != 1) {
            log.error("missing command line argument for JSON configuration file");
            return;
        }
        
        ChallengerConfiguration config = GatewayChallenger.readConfiguration(args[0]);
        GatewayChallenger challenger = new GatewayChallenger(config);
        challenger.run();
    }
    
    private static ChallengerConfiguration readConfiguration(String filepath)
            throws IOException {
        log.info("reading JSON configuration file at " + filepath);
        File configFile = Paths.get(filepath).toFile();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(configFile, ChallengerConfiguration.class);
    }
    
    public GatewayChallenger(ChallengerConfiguration configuration) {
        this.configuration = configuration;
        this.responseTracker = new ResponseTracker(configuration.getNumberOfResponders());
        this.gateway = new GatewayFederate(configuration, this);
    }
    
    public void run() {
        gateway.run();
    }
    
    /*
     * This method executes once per logical time step after receiving all the response interactions. It sends two new
     * challenges for the next logical time step, and validates the responses received this logical time step.
     */
    @Override
    public void doTimeStep(Double timeStep) {
        log.info("t={}", timeStep);
        sendChallengeInteraction();
        sendChallengeObject();
        responseTracker.checkDelinquent(gateway.getLogicalTime());
    }

    @Override
    public void initializeSelf() {
        // do nothing
    }

    /*
     * This method registers the object instance that will be used to send challenges.
     */
    @Override
    public void initializeWithPeers() {
        try {
            objectName = gateway.registerObjectInstance(OBJECT_CHALLENGE);
            log.trace("registered {}:{}", OBJECT_CHALLENGE, objectName);
        } catch (FederateNotExecutionMember | NameNotFound | ObjectClassNotPublished e) {
            log.error("failed to register {} instance", OBJECT_CHALLENGE);
            throw new RuntimeException(e);
        }
    }

    /*
     * This method handles responses to the challenges. A response can be for challenges sent using either interactions
     * or registered object instances. If there are multiple federates that send challenges, the responses for all the
     * federates will pass through this method.
     */
    @Override
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        if (className.equals(INTERACTION_RESPONSE)) {
            final String id = parameters.get("challengeId");
            final String substring = parameters.get("substring");
            final String responder = parameters.get("originFed");
            
            if (id.startsWith(configuration.getFederateName())) { // only react to challenges issued by this federate
                final ResponseInfo response = new ResponseInfo(id, substring, responder, gateway.getLogicalTime());
                log.debug("received response: {}", response.toString());
                responseTracker.markResponse(response);
            }
        } else {
            InteractionClassType interaction = gateway.getObjectModel().getInteraction(className);
            if (!gateway.getObjectModel().isCoreInteraction(interaction)) {
                log.error("did not expect to receive {}", className);
            }
        }
    }

    @Override
    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        ObjectClassType object = gateway.getObjectModel().getObject(className);
        if (!gateway.getObjectModel().isCoreObject(object)) {
            log.error("did not expect to receive {}", className);
        }
    }

    @Override
    public void prepareToResign() {
        // do nothing
    }

    @Override
    public void terminate() {
        responseTracker.checkDelinquent(gateway.getLogicalTime());
    }
    
    /*
     * This method creates and sends an interaction that contains a new challenge.
     */
    private void sendChallengeInteraction() {
        final Challenge challenge = createChallenge();
        
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("challengeId", challenge.getId());
        parameters.put("stringValue", challenge.getStringValue());
        parameters.put("beginIndex", Integer.toString(challenge.getBeginIndex()));
        
        try {
            gateway.sendInteraction(INTERACTION_CHALLENGE, parameters, gateway.getTimeStamp());
            log.trace("sent {} as {}", INTERACTION_CHALLENGE, parameters);
        } catch (FederateNotExecutionMember | NameNotFound | InteractionClassNotPublished | InvalidFederationTime e) {
            log.error("failed to send " + INTERACTION_CHALLENGE, e);
        }
    }
    
    /*
     * This method updates the registered object instance for the next challenge.
     */
    private void sendChallengeObject() {
        final Challenge challenge = createChallenge();
        
        Map<String, String> attributes = new HashMap<String, String>();
        attributes.put("challengeId", challenge.getId());
        attributes.put("stringValue", challenge.getStringValue());
        attributes.put("beginIndex", Integer.toString(challenge.getBeginIndex()));
        
        try {
            gateway.updateObject(objectName, attributes, gateway.getTimeStamp());
            log.trace("sent {}:{} as {}", OBJECT_CHALLENGE, objectName, attributes);
        } catch (FederateNotExecutionMember | ObjectNotKnown | NameNotFound | AttributeNotOwned | InvalidFederationTime e) {
            log.error("failed to update " + OBJECT_CHALLENGE + ":" + objectName, e);
        }
    }
    
    /*
     * This method returns a new random challenge. As part of the creation process, the challenge sequence number will
     * be incremented and the new challenge will be registered with the response tracker. The returned challenge must
     * be sent to the federation during the same time step as this method call. Otherwise, the response tracker will
     * report multiple errors when no responses are received before its internal timeout.
     */
    private Challenge createChallenge() {
        final String id = configuration.getFederateName() + "#" + sequenceNumber;
        final String stringValue = generateStringValue();
        final int beginIndex = generateBeginIndex();
        // it takes 1 step for the other federates to receive the challenge, and 1 more step to receive the response
        // NOTE this assumes all federates in the federation use the same logical step size and may not work otherwise
        final double expirationTime = gateway.getLogicalTime() + 2 * configuration.getStepSize();
        
        final Challenge challenge = new Challenge(id, stringValue, beginIndex, expirationTime);
        log.debug("generated challenge: {}", challenge.toString());
        
        responseTracker.markChallenge(challenge);
        sequenceNumber = sequenceNumber + 1;
        
        return challenge;
    }
    
    /*
     * Generate and return a random challenge string.
     */
    private String generateStringValue() {
        StringBuffer buffer = new StringBuffer(configuration.getChallengeLength());
        for (int i = 0; i < configuration.getChallengeLength(); i++) {
            buffer.append(VALID_CHARACTERS.charAt(ThreadLocalRandom.current().nextInt(VALID_CHARACTERS.length())));
        }
        return buffer.toString();
    }
    
    /*
     * Generate and return an index into the challenge string. This index will be in the range [1,challengeLength-1].
     * The first element is excluded so that the correct response is never equivalent to the challenge string.
     */
    private int generateBeginIndex() {
        return ThreadLocalRandom.current().nextInt(configuration.getChallengeLength()-1) + 1;
    }
}
