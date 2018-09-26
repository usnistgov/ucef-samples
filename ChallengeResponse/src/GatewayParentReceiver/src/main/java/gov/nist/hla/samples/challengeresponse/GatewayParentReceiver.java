package gov.nist.hla.samples.challengeresponse;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ieee.standards.ieee1516._2010.InteractionClassType;
import org.ieee.standards.ieee1516._2010.ObjectClassType;

import gov.nist.hla.gateway.GatewayCallback;
import gov.nist.hla.gateway.GatewayFederate;
import gov.nist.hla.gateway.GatewayFederateConfig;

/*
 * This passive federate monitors the federation traffic to test HLA's automatic upcasting of interaction classes and
 * object classes.
 * 
 * The challenge-response object model has the challenge interaction class and the challenge object class derive from
 * parent classes. No federate directly publishes the parent classes, but this federate subscribes to both rather than
 * the child classes published at runtime. If the HLA automatic upcasting feature works, this federate should receive
 * one instance of the parent class for each challenge issued during the federation execution.
 * 
 * To verify that each challenge sent is upcasted and received, this class also subscribes to the response interaction.
 * Each time a parent class is received, the challenge id is stored. Each time a response is received, its associated
 * challenge is checked against the stored challenge ids. If this federate receives a response for a challenge that has
 * never been stored, then either the response is corrupt or the challenge was never upcasted to its parent class.
 */
public class GatewayParentReceiver implements GatewayCallback {
    private static final Logger log = LogManager.getLogger();
    
    /*
     * The class path for the object class that is the parent of the object class used to send challenges.
     */
    private static final String OBJECT_PARENT = "ObjectRoot.ParentObject";
    
    /*
     * The class path for the interaction class that is the parent of the interaction class used to send challenges.
     */
    private static final String INTERACTION_PARENT = "InteractionRoot.C2WInteractionRoot.ParentInteraction";
    
    /*
     * The class path for the interaction class that represents a response to a challenge.
     */
    private static final String INTERACTION_RESPONSE = "InteractionRoot.C2WInteractionRoot.ParentInteraction.Response";
    
    /*
     * A set of challenge ids received from the parent interaction and object classes.
     */
    private Set<String> knownId = new HashSet<String>();
    
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
        GatewayParentReceiver parentReceiver = new GatewayParentReceiver(config);
        parentReceiver.run();
    }
    
    public GatewayParentReceiver(GatewayFederateConfig configuration) {
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
     * Handle a parent interaction by storing its challenge id, and handles the response interaction. If the challenge
     * id in a response has not been stored, then either the response is corrupt or a previous challenge failed to get
     * upcasted into a class subscribed to by this federate. Both cases are treated the same and output as a simple
     * error message. To distinguish between the two cases, the output of the challenger federates would have to be
     * inspected to see if the response was considered corrupt.
     */
    @Override
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        if (className.equals(INTERACTION_PARENT)) {
            log.debug("received {} as {} @ t={}", className, parameters, timeStep);
            storeId(parameters.get("challengeId"));
        } else if (className.equals(INTERACTION_RESPONSE)) {
            log.debug("received {} as {} @ t={}", className, parameters, timeStep);
            processId(parameters.get("challengeId"));
        } else {
            InteractionClassType interaction = gateway.getObjectModel().getInteraction(className);
            if (!gateway.getObjectModel().isCoreInteraction(interaction)) {
                log.error("did not expect to receive {}", className);
            }
        }
    }

    /*
     * Handle a parent object by storing its challenge id.
     */
    @Override
    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        if (className.equals(OBJECT_PARENT)) {
            log.debug("received {}:{} as {} @ t={}", className, instanceName, attributes, timeStep);
            storeId(attributes.get("challengeId"));
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
     * Store a new challenge id. If this id has already been stored, output an error message.
     */
    private void storeId(String id) {
        if (id == null) {
            log.error("received null id");
        } else if (id.isEmpty()) {
            log.error("received empty id");
        } else if (!knownId.add(id)) {
            log.error("duplicate id {}", id);
        } else {
            log.trace("stored id {}", id);
        }
    }
    
    /*
     * Check for an existing challenge id. If this id has not been stored, output an error message.
     */
    private void processId(String id) {
        if (id == null) {
            log.error("received null id");
        } else if (id.isEmpty()) {
            log.error("received empty id");
        } else if (!knownId.contains(id)) {
            log.error("unknown id {}", id);
        } else {
            log.trace("known id {}", id);
        }
    }
}
