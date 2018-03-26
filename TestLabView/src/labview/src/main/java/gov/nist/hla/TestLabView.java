package gov.nist.hla;

import java.io.IOException;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gov.nist.hla.gateway.GatewayCallback;
import gov.nist.hla.gateway.GatewayFederate;
import gov.nist.hla.gateway.GatewayFederateConfig;

public class TestLabView implements GatewayCallback {
    private static final Logger log = LogManager.getLogger();

    private GatewayFederate gateway;

    public static void main(String[] args)
            throws IOException {
        if (args.length != 1) {
            log.error("missing command line argument for JSON configuration file");
            return;
        }

        GatewayFederateConfig config = GatewayFederate.readConfiguration(args[0]);
        TestLabView labviewFederate = new TestLabView(config);
        labviewFederate.run();
    }

    public TestLabView(GatewayFederateConfig configuration) {
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
    }

    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        log.info("received interaction {} at t={} with {}", className, timeStep, parameters.toString());
    }

    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        log.info("received object {}.{} at t={} with {}", className, instanceName, timeStep, attributes.toString());
    }

    public void doTimeStep(Double timeStep) {
        log.info("t={}", timeStep);
    }

    public void terminate() {
        log.trace("terminate");
    }
}

