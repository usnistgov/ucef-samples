package gov.nist.hla;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gov.nist.hla.gateway.GatewayCallback;
import gov.nist.hla.gateway.GatewayFederate;
import gov.nist.hla.gateway.GatewayFederateConfig;
import hla.rti.AttributeNotOwned;
import hla.rti.FederateNotExecutionMember;
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;
import hla.rti.ObjectAlreadyRegistered;
import hla.rti.ObjectClassNotPublished;
import hla.rti.ObjectNotKnown;

public class Controller implements GatewayCallback {
    private static final Logger log = LogManager.getLogger();

    private GatewayFederate gateway;

    public static void main(String[] args)
            throws IOException {
        if (args.length != 1) {
            log.error("missing command line argument for JSON configuration file");
            return;
        }

        GatewayFederateConfig config = GatewayFederate.readConfiguration(args[0]);
        Controller labviewFederate = new Controller(config);
        labviewFederate.run();
    }

    public Controller(GatewayFederateConfig configuration) {
        this.gateway = new GatewayFederate(configuration, this);
    }

    public void run() {
        log.trace("run");
        gateway.run();
    }

    public void initializeSelf() {
        log.trace("initializeSelf");
    }

    public void initializeWithPeers() {
        log.trace("initializeWithPeers");
        try {
			gateway.registerObjectInstance("ControllerState", "ControllerState-Zone1");
	        gateway.registerObjectInstance("ControllerState", "ControllerState-Zone2");
		} catch (FederateNotExecutionMember | NameNotFound | ObjectClassNotPublished | ObjectAlreadyRegistered e) {
			log.error("failed to register object instances", e);
		}
    }

    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        log.info("received interaction {} at t={} with {}", className, timeStep, parameters.toString());
    }

    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        log.info("received object {}.{} at t={} with {}", className, instanceName, timeStep, attributes.toString());
    }

    public void doTimeStep(Double timeStep) {
        log.trace("t={}", timeStep);

        try {
            // something just to test the damper federate
            Map<String, String> valuesZone1 = new HashMap<String, String>();
            valuesZone1.put("zone", Integer.toString(1));
            valuesZone1.put("damperPosition", Integer.toString(0));
            gateway.updateObject("ControllerState-Zone1", valuesZone1, gateway.getTimeStamp());
            
            Map<String, String> valuesZone2 = new HashMap<String, String>();
            valuesZone2.put("zone", Integer.toString(2));
            valuesZone2.put("damperPosition", Integer.toString(1));
            gateway.updateObject("ControllerState-Zone2", valuesZone2, gateway.getTimeStamp());
        } catch (FederateNotExecutionMember | NameNotFound | ObjectNotKnown | AttributeNotOwned | InvalidFederationTime e) {
            log.error("failed to update object instances", e);
        }
    }

    public void terminate() {
        log.trace("terminate");
    }
}

