package gov.nist.hla;

import gov.nist.hla.exception.NotReadyToInteract;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gov.nist.hla.gateway.GatewayCallback;
import gov.nist.hla.gateway.GatewayFederate;
import gov.nist.hla.gateway.GatewayFederateConfig;

import hla.rti.AttributeNotOwned;
import hla.rti.FederateNotExecutionMember;
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;
import hla.rti.ObjectClassNotPublished;
import hla.rti.ObjectNotKnown;

public class FederateB implements GatewayCallback, Runnable {
    private static final Logger log = LogManager.getLogger();

    private static final String OBJECT_REPORT = "ObjectRoot.Report";
    private static final String OBJECT_CONFIG = "ObjectRoot.Config";

    private GatewayFederate gateway;

    private String objectName;

    private int min;
    private int max;

    private boolean isInitialized = false;
    private boolean readyToInteract = false;

    public FederateB(GatewayFederateConfig configuration) {
        this.gateway = new GatewayFederate(configuration, this);
    }
    
    public void run() {
        this.gateway.run();
    }

    public boolean isReadyToInteract() {
        return readyToInteract;
    }

    public double getLogicalTime() {
        return gateway.getLogicalTime();
    }

    public void requestTimeAdvance() throws NotReadyToInteract {
        if (!readyToInteract) {
            throw new NotReadyToInteract("requestTimeAdvance");
        }
        readyToInteract = false; // exit the waitForInteraction while loop
    }

    public int getMin() throws NotReadyToInteract {
        if (!readyToInteract) {
            throw new NotReadyToInteract("getMin");
        }
        return min;
    }

    public int getMax() throws NotReadyToInteract {
        if (!readyToInteract) {
            throw new NotReadyToInteract("getMax");
        }
        return max;
    }

    public void setAverage(double average) throws NotReadyToInteract {
        if (!readyToInteract) {
            throw new NotReadyToInteract("setAverage");
        }

        Map<String, String> attributes = new HashMap<String, String>();
        attributes.put("average", Double.toString(average));
        try {
            gateway.updateObject(objectName, attributes, gateway.getTimeStamp());
        } catch (FederateNotExecutionMember | ObjectNotKnown | NameNotFound | AttributeNotOwned | InvalidFederationTime e) {
            log.error("failed to update " + OBJECT_REPORT + ":" + objectName, e);
        }

        log.info("sent REPORT(average={})", average);
    }

    private void waitForInteraction() {
        readyToInteract = true;
        while (readyToInteract) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                log.fatal("run halted due to interrupt");
                throw new RuntimeException("waitForInteraction cannot be interrupted");
            }
        }
    }
    
    @Override
    public void doTimeStep(Double timeStep) {
        waitForInteraction();
    }

    @Override
    public void initializeSelf() {
        // do nothing
    }

    @Override
    public void initializeWithPeers() {
        try {
            objectName = gateway.registerObjectInstance(OBJECT_REPORT);
        } catch (FederateNotExecutionMember | NameNotFound | ObjectClassNotPublished e) {
            log.error("failed to register {} instance", OBJECT_REPORT);
            throw new RuntimeException(e);
        }

        while (!isInitialized) { // wait to receive the config object
            try {
                gateway.tick();
            } catch (FederateNotExecutionMember e) {
                throw new RuntimeException(e);
            }
        }

        waitForInteraction(); // let the config propogate to Federation A
    }

    @Override
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        // do nothing
    }

    @Override
    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        if (className.equals(OBJECT_CONFIG)) {
            isInitialized = true; // relevant for the first update received

            if (attributes.containsKey("min")) { // required because the CPSWT code only sends values that change
                min = Integer.parseInt(attributes.get("min"));
            }
            if (attributes.containsKey("max")) { // required because the CPSWT code only sends values that change
                max = Integer.parseInt(attributes.get("max"));
            }

            log.info("received CONFIG(min={} max={})", min, max);
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
}
