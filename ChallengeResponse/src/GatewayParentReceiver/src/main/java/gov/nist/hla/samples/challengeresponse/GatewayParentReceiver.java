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

public class GatewayParentReceiver implements GatewayCallback {
    private static final Logger log = LogManager.getLogger();
    
    private static final String INTERACTION_PARENT = "InteractionRoot.C2WInteractionRoot.ParentInteraction";
    private static final String INTERACTION_RESPONSE = "InteractionRoot.C2WInteractionRoot.ParentInteraction.Response";
    private static final String OBJECT_PARENT = "ObjectRoot.ParentObject";
    
    private Set<String> knownId = new HashSet<String>();
    
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
    public void terminate() {
        // do nothing
    }
    
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
