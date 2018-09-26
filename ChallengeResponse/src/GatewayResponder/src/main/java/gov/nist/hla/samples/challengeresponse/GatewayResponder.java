package gov.nist.hla.samples.challengeresponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ieee.standards.ieee1516._2010.InteractionClassType;
import org.ieee.standards.ieee1516._2010.ObjectClassType;

import gov.nist.hla.gateway.GatewayCallback;
import gov.nist.hla.gateway.GatewayFederate;
import gov.nist.hla.gateway.GatewayFederateConfig;
import hla.rti.FederateNotExecutionMember;
import hla.rti.InteractionClassNotPublished;
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;

/*
 * This class broadcasts response interactions to the federation each time it receives a challenge.
 *
 * A challenge is a randomly generated string paired with an integer index of one of the elements. A correct response
 * for a given challenge is the substring that starts from the challenge index. To generate the correct response, a
 * federate must understand both the string and numeric data in the challenge.
 *
 * This class generates and sends a response to challenges received as either as an interaction or an object update. It
 * is stateless, and will generate one response per received challenge.
 */
public class GatewayResponder implements GatewayCallback {
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
     * A reference to the gateway library used to coordinate with the federation.
     */
    private GatewayFederate gateway;
    
    public static void main(String[] args)
            throws IOException {
        if (args.length != 1) {
            log.error("missing command line argument for JSON configuration file");
            return;
        }
        
        GatewayFederateConfig config = GatewayFederate.readConfiguration(args[0]);
        GatewayResponder responder = new GatewayResponder(config);
        responder.run();
    }
    
    public GatewayResponder(GatewayFederateConfig configuration) {
        this.gateway = new GatewayFederate(configuration, this);
    }
    
    public void run() {
        gateway.run();
    }
    
    @Override
    public void doTimeStep(Double timeStep) {
        log.info("t={}", timeStep);
    }

    @Override
    public void initializeSelf() {
        // do nothing
    }

    @Override
    public void initializeWithPeers() {
        // do nothing
    }

    /*
     * Handle and respond to challenges sent as interactions.
     */
    @Override
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        if (className.equals(INTERACTION_CHALLENGE)) {
            log.debug("received {} as {} @ t={}", className, parameters, timeStep);
            processChallenge(parameters);
        } else {
            InteractionClassType interaction = gateway.getObjectModel().getInteraction(className);
            if (!gateway.getObjectModel().isCoreInteraction(interaction)) {
                log.error("did not expect to receive {}", className);
            }
        }
    }

    /*
     * Handle and respond to challenges sent as object updates.
     */
    @Override
    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        if (className.equals(OBJECT_CHALLENGE)) {
            log.debug("received {}:{} as {} @ t={}", className, instanceName, attributes, timeStep);
            processChallenge(gateway.getObjectState(instanceName));
        } else {
            ObjectClassType object = gateway.getObjectModel().getObject(className);
            if (!gateway.getObjectModel().isCoreObject(object)) {
                log.error("did not expect to receive {}", className);
            }
        }
    }

    @Override
    public void prepareToResign() {
        // do nothing
    }

    @Override
    public void terminate() {
        // do nothing
    }
    
    /*
     * Send a response interaction for the given challenge. The response content will be set to the substring of the
     * given string starting from the given index.
     */
    private void processChallenge(Map<String, String> challenge) {
        if (!checkIfValid(challenge)) {
            return;
        }
        
        final String id = challenge.get("challengeId");
        final String stringValue = challenge.get("stringValue");
        final int beginIndex = Integer.parseInt(challenge.get("beginIndex"));
        
        final String substring = stringValue.substring(beginIndex);
        log.debug("generated substring {} using index={}", substring, beginIndex);
        
        sendResponse(id, substring);
    }
    
    /*
     * Check the content of the challenge to ensure no type conversion exceptions occur at runtime.
     */
    private boolean checkIfValid(Map<String, String> challenge) {
        if (!challenge.containsKey("challengeId")) {
            log.error("no id in challenge: {}", challenge);
            return false;
        }
        
        if (!challenge.containsKey("stringValue")) {
            log.error("no stringValue in challenge: {}", challenge);
            return false;
        }
        
        if (!challenge.containsKey("beginIndex")) {
            log.error("no beginIndex in challenge: {}", challenge);
            return false;
        }
        try {
            Integer.parseInt(challenge.get("beginIndex"));
        } catch (NumberFormatException e) {
            log.error("beginIndex not an integer: {}", challenge);
            return false;
        }
        
        return true;
    }
    
    /*
     * Create a message for the response and broadcast it to the HLA federation.
     */
    private void sendResponse(String id, String substring) {
        Map<String, String> response = new HashMap<String, String>();
        response.put("challengeId", id);
        response.put("substring", substring);
        
        try {
            gateway.sendInteraction(INTERACTION_RESPONSE, response, gateway.getTimeStamp());
            log.trace("sent response {}", response);
        } catch (FederateNotExecutionMember | NameNotFound | InteractionClassNotPublished | InvalidFederationTime e) {
            log.error("failed to send response", e);
        }
    }
}
