package gov.nist.hla.samples.aggregator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import gov.nist.hla.ii.InjectionCallback;
import gov.nist.hla.ii.InjectionFederate;
import hla.rti.FederateNotExecutionMember;
import hla.rti.NameNotFound;
import hla.rti.ObjectClassNotPublished;

public class Environment implements InjectionCallback {
    private static final Logger log = LogManager.getLogger();
    
    private static final String OBJECT_SPEED_SENSOR = "ObjectRoot.Sensor.SpeedSensor";
    private static final String OBJECT_VOLUME_SENSOR = "ObjectRoot.Sensor.VolumeSensor";
    
    private InjectionFederate gateway;
    
    private EnvironmentConfiguration configuration;
    
    private Set<String> speedSensors = new HashSet<String>();
    private Set<String> volumeSensors = new HashSet<String>();
    
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
        this.configuration = configuration;
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
        final int speedClusters = configuration.getNumberOfSpeedClusters();
        log.info("creating " + speedClusters + " object instances of " + OBJECT_SPEED_SENSOR);
        for (int i = 0; i < speedClusters; i++) {
            try {
                String name = gateway.registerObjectInstance(OBJECT_SPEED_SENSOR);
                log.debug("\tnew instance with name " + name);
                speedSensors.add(name);
            } catch (FederateNotExecutionMember | NameNotFound | ObjectClassNotPublished e) {
                throw new RuntimeException(e);
            }
        }
        
        final int volumeClusters = configuration.getNumberOfVolumeClusters();
        log.info("creating " + volumeClusters + " object instances of " + OBJECT_VOLUME_SENSOR);
        for (int i = 0; i < volumeClusters; i++) {
            try {
                String name = gateway.registerObjectInstance(OBJECT_VOLUME_SENSOR);
                log.debug("\tnew instance with name " + name);
                volumeSensors.add(name);
            } catch (FederateNotExecutionMember | NameNotFound | ObjectClassNotPublished e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void initializeWithPeers() {
        // maybe send interaction with expected number of sensors to aggregator
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
