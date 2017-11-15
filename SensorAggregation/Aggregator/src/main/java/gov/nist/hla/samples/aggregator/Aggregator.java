package gov.nist.hla.samples.aggregator;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gov.nist.hla.ii.InjectionCallback;
import gov.nist.hla.ii.InjectionFederate;
import gov.nist.hla.ii.config.InjectionFederateConfig;

public class Aggregator implements InjectionCallback {
    private static final Logger log = LogManager.getLogger();
    
    private InjectionFederate gateway;
    
    private Set<String> discoveredObjects = new HashSet<String>();
    
    public static void main(String[] args)
            throws IOException {
        if (args.length != 1) {
            log.error("command line argument for JSON configuration file not specified");
            return;
        }
        
        InjectionFederateConfig config = InjectionFederate.readConfiguration(args[0]);
        Aggregator environmentFederate = new Aggregator(config);
        environmentFederate.run();
    }
    
    public Aggregator(InjectionFederateConfig configuration) {
        this.gateway = new InjectionFederate(configuration, this);
    }
    
    public void run() {
        gateway.run();
    }
    
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        log.error("unexpected interaction " + className);
    }

    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        if (!discoveredObjects.contains(instanceName)) {
            log.info("first update for " + instanceName + " of type " + className);
            discoveredObjects.add(instanceName);
        }
        log.info(String.format("t=%f type=%s name=%s data=%s", timeStep, className, instanceName, attributes.toString()));
    }

    public void initializeSelf() {
        log.trace("initializeSelf");
    }

    public void initializeWithPeers() {
        log.trace("initializeWithPeers");
    }

    public void beforeTimeStep(Double timeStep) {
        log.trace("beforeTimeStep " + timeStep);
    }

    public void afterTimeStep(Double timeStep) {
        // not implemented
    }

    public void afterResignation() {
        log.trace("afterResignation");
    }
}
