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

public class GatewayChallenger implements GatewayCallback {
    private static final Logger log = LogManager.getLogger();
    
    private final static String VALID_CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";
    
    private static final String INTERACTION_CHALLENGE =
            "InteractionRoot.C2WInteractionRoot.ParentInteraction.ChallengeInteraction";
    private static final String INTERACTION_RESPONSE = "InteractionRoot.C2WInteractionRoot.ParentInteraction.Response";
    private static final String OBJECT_CHALLENGE = "ObjectRoot.ParentObject.ChallengeObject";
    
    private ChallengerConfiguration configuration;
    
    private ResponseTracker responseTracker;
    
    private GatewayFederate gateway;
    
    private String objectName;
    
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
    
    @Override
    public void doTimeStep(Double timeStep) {
        log.info("t={}", timeStep);
        sendChallengeInteraction();
        sendChallengeObject();
    }

    @Override
    public void initializeSelf() {
        // do nothing
    }

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

    @Override
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        if (className.equals(INTERACTION_RESPONSE)) {
            final String id = parameters.get("challengeId");
            final String substring = parameters.get("substring");
            final String responder = parameters.get("originFed");
            
            if (id.startsWith(configuration.getFederateName())) {
                final Response response = new Response(id, substring, responder, gateway.getLogicalTime());
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
    public void terminate() {
        responseTracker.checkDelinquent(gateway.getLogicalTime());
    }
    
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
    
    private Challenge createChallenge() {
        final String id = configuration.getFederateName() + "#" + sequenceNumber;
        final String stringValue = generateStringValue();
        final int beginIndex = generateBeginIndex();
        final double expirationTime = gateway.getLogicalTime() + 2 * configuration.getStepSize();
        
        final Challenge challenge = new Challenge(id, stringValue, beginIndex, expirationTime);
        log.debug("generated challenge: {}", challenge.toString());
        
        responseTracker.markChallenge(challenge);
        sequenceNumber = sequenceNumber + 1;
        
        return challenge;
    }
    
    private String generateStringValue() {
        StringBuffer buffer = new StringBuffer(configuration.getChallengeLength());
        for (int i = 0; i < configuration.getChallengeLength(); i++) {
            buffer.append(VALID_CHARACTERS.charAt(ThreadLocalRandom.current().nextInt(VALID_CHARACTERS.length())));
        }
        return buffer.toString();
    }
    
    private int generateBeginIndex() {
        return ThreadLocalRandom.current().nextInt(configuration.getChallengeLength()-1);
    }
}
