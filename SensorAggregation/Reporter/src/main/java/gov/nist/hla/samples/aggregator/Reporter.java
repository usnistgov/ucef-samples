package gov.nist.hla.samples.aggregator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import gov.nist.hla.ii.InjectionCallback;
import gov.nist.hla.ii.InjectionFederate;
import hla.rti.FederateNotExecutionMember;
import hla.rti.InteractionClassNotPublished;
import hla.rti.NameNotFound;

public class Reporter implements InjectionCallback {
    private static final Logger log = LogManager.getLogger();
    
    private static final String INTERACTION_AGG_CONTROL = "InteractionRoot.C2WInteractionRoot.AggregationControl";
    private static final String INTERACTION_AGG_REPORT = "InteractionRoot.C2WInteractionRoot.AggregationReport";
    private static final String INTERACTION_SIM_END = "InteractionRoot.C2WInteractionRoot.SimulationControl.SimEnd";
    
    private InjectionFederate gateway;
    private ReporterConfiguration configuration;
    
    public static void main(String[] args)
            throws IOException {
        if (args.length != 1) {
            log.error("missing command line argument for JSON configuration file");
            return;
        }
        
        ReporterConfiguration config = Reporter.readConfiguration(args[0]);
        Reporter reporterFederate = new Reporter(config);
        reporterFederate.run();
    }
    
    private static ReporterConfiguration readConfiguration(String filepath)
            throws IOException {
        log.info("reading JSON configuration file at " + filepath);
        File configFile = Paths.get(filepath).toFile();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(configFile, ReporterConfiguration.class);
    }
    
    public Reporter(ReporterConfiguration configuration) {
        this.gateway = new InjectionFederate(configuration, this);
        this.configuration = configuration;
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
        
        sendAggregationControl();
    }
    
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        log.trace(String.format("receiveInteraction %f %s %s", timeStep, className, parameters.toString()));
        
        if (className.equals(INTERACTION_SIM_END)) {
            log.info("received " + INTERACTION_SIM_END);
        } else if (className.equals(INTERACTION_AGG_REPORT)) {
            handleAggregationReport(timeStep, parameters);
        } else {
            log.warn("unexpected interaction " + className);
        }
    }

    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        log.trace(String.format("receiveObject %f %s %s %s", timeStep, className, instanceName, attributes.toString()));
        
        log.warn("unexpected object " + className);
    }
    
    public void doTimeStep(Double timeStep) {
        log.trace("doTimeStep " + timeStep);
    }

    public void terminate() {
        log.trace("terminate");
    }
    
    private void sendAggregationControl() {
        log.trace("sendAggregationControl");
        
        Map<String, String> values = new HashMap<String, String>();
        values.put("aggregationMethod", configuration.getAggregationMethod());
        
        try {
            gateway.injectInteraction(INTERACTION_AGG_CONTROL, values);
            log.info(String.format("sent %s using %s", INTERACTION_AGG_CONTROL, values.toString()));
        } catch (FederateNotExecutionMember | NameNotFound | InteractionClassNotPublished e) {
            throw new RuntimeException(e);
        }
    }
    
    private void handleAggregationReport(Double timeStep, Map<String, String> parameters) {
        log.trace(String.format("handleAggregationReport %f %s", timeStep, parameters.toString()));
        
        final int cluster = Integer.parseInt(parameters.get("clusterId"));
        final String method = parameters.get("aggregationMethod");
        final String report = parameters.get("report");
        log.info(String.format("t=%f cluster %d report (using %s): %s", timeStep, cluster, method, report));
    }
}
