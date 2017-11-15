package gov.nist.hla.samples.aggregator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import gov.nist.hla.ii.InjectionCallback;
import gov.nist.hla.ii.InjectionFederate;

public class Environment implements InjectionCallback {
    private static final Logger log = LogManager.getLogger();
    
    private InjectionFederate gateway;
    
    public static void main(String[] args)
            throws IOException {
        if (args.length != 1) {
            log.error("command line argument for JSON configuration file not specified");
            return;
        }
        
        EnvironmentConfiguration config = Environment.readConfiguration(args[0]);
        Environment environmentFederate = new Environment(config);
        environmentFederate.run();
    }
    
    private static EnvironmentConfiguration readConfiguration(String filepath)
            throws IOException {
        log.info("reading JSON configuration file at " + filepath);
        File configFile = Paths.get(filepath).toFile();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(configFile, EnvironmentConfiguration.class);
    }
    
    public Environment(EnvironmentConfiguration configuration) {
        this.gateway = new InjectionFederate(configuration, this);
    }
    
    public void run() {
        gateway.run();
    }
    
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        // TODO Auto-generated method stub
        
    }

    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        // TODO Auto-generated method stub
        
    }

    public void initializeSelf() {
        // TODO Auto-generated method stub
        
    }

    public void initializeWithPeers() {
        // TODO Auto-generated method stub
        
    }

    public void beforeTimeStep(Double timeStep) {
        // TODO Auto-generated method stub
        
    }

    public void afterTimeStep(Double timeStep) {
        // TODO Auto-generated method stub
        
    }

    public void afterResignation() {
        // TODO Auto-generated method stub
        
    }

}
