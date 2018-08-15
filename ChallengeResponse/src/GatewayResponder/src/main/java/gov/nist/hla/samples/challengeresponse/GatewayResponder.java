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

public class GatewayResponder implements GatewayCallback {
    private static final Logger log = LogManager.getLogger();
    
    private static final String INTERACTION_CHALLENGE =
            "InteractionRoot.C2WInteractionRoot.ParentInteraction.ChallengeInteraction";
    private static final String INTERACTION_RESPONSE = "InteractionRoot.C2WInteractionRoot.ParentInteraction.Response";
    private static final String OBJECT_CHALLENGE = "ObjectRoot.ParentObject.ChallengeObject";

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
