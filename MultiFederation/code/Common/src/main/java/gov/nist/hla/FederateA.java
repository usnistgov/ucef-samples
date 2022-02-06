package gov.nist.hla;

import gov.nist.hla.exception.NotReadyToInteract;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gov.nist.hla.gateway.GatewayCallback;
import gov.nist.hla.gateway.GatewayFederate;
import gov.nist.hla.gateway.GatewayFederateConfig;

import hla.rti.FederateNotExecutionMember;
import hla.rti.InteractionClassNotPublished;
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;

public class FederateA implements GatewayCallback, Runnable {
    private static final Logger log = LogManager.getLogger();

    private static final String INTERACTION_RANDNUMBER  = "InteractionRoot.C2WInteractionRoot.RandNumber";
    private static final String INTERACTION_RANGE       = "InteractionRoot.C2WInteractionRoot.Range";

    private GatewayFederate gateway;

    private int currentNumber;

    private boolean isInitialized = false;
    private boolean readyToInteract = false;

    public FederateA(GatewayFederateConfig configuration) {
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
        readyToInteract = false; // exit the doTimeStep while loop
    }

    public int getCurrentNumber() throws NotReadyToInteract {
        if (!readyToInteract) {
            throw new NotReadyToInteract("getCurrentNumber");
        }
        return currentNumber;
    }

    public void setRange(int min, int max) throws NotReadyToInteract {
        if (!readyToInteract) {
            throw new NotReadyToInteract("setRange");
        }
        
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("min", Integer.toString(min));
        parameters.put("max", Integer.toString(max));

        try {
            if (isInitialized) {
                gateway.sendInteraction(INTERACTION_RANGE, parameters, gateway.getTimeStamp()); // TSO
            } else {
                gateway.sendInteraction(INTERACTION_RANGE, parameters); // RO
            }
        } catch (FederateNotExecutionMember | NameNotFound | InteractionClassNotPublished | InvalidFederationTime e) {
            log.error("failed to send " + INTERACTION_RANGE, e);
        }

        log.info("sent RANGE(min={} max={})", min, max);
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
        waitForInteraction(); // in retrospect this is a pretty horrible name given HLA nomenclature
    }

    @Override
    public void initializeSelf() {
        // do nothing
    }

    @Override
    public void initializeWithPeers() {
        waitForInteraction(); // let the common federate send the initial range (from Federation B)
        isInitialized = true; // swap from RO to TSO messages
    }

    @Override
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        if (className.equals(INTERACTION_RANDNUMBER)) {
            currentNumber = Integer.parseInt(parameters.get("value")); // expect 1 per time step
            log.info("received RANDNUMBER(value={})", currentNumber);
        }
    }

    @Override
    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        // do nothing
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
