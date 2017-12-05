package gov.nist.hla.samples.aggregator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import gov.nist.hla.ii.InjectionCallback;
import gov.nist.hla.ii.InjectionFederate;
import hla.rti.AttributeNotOwned;
import hla.rti.FederateNotExecutionMember;
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;
import hla.rti.ObjectClassNotPublished;
import hla.rti.ObjectNotKnown;

public class Environment implements InjectionCallback {
    private static final Logger log = LogManager.getLogger();
    
    private static final String OBJECT_TRAFFIC_SENSOR = "ObjectRoot.Sensor.TrafficSensor";
    private static final String OBJECT_TEMPERATURE_SENSOR = "ObjectRoot.Sensor.TemperatureSensor";
    private static final String INTERACTION_SIM_END = "InteractionRoot.C2WInteractionRoot.SimulationControl.SimEnd";
    
    private InjectionFederate gateway;
    private EnvironmentConfiguration configuration;
    
    private Map<Integer, Set<String>> trafficClusters = new HashMap<Integer, Set<String>>();
    private Map<Integer, Set<String>> temperatureClusters = new HashMap<Integer, Set<String>>();
    
    private int numberOfClusters = 0;
    
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
        log.trace("run");
        
        gateway.run();
    }
    
    public void initializeSelf() {
        log.trace("initializeSelf");
    }
    
    public void initializeWithPeers() {
        log.trace("initializeWithPeers");
        
        initializeTrafficClusters();
        initializeTemperatureClusters();
    }
    
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        log.trace(String.format("receiveInteraction %f %s %s", timeStep, className, parameters.toString()));
        
        if (className.equals(INTERACTION_SIM_END)) {
            log.info("received " + INTERACTION_SIM_END);
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
        
        updateTrafficClusters();
        updateTemperatureClusters();
    }
    
    public void terminate() {
        log.trace("terminate");
    }
    
    private void initializeTrafficClusters() {
        log.trace("initializeTrafficClusters");
        
        log.info("creating " + configuration.getNumberOfTrafficClusters() + " traffic clusters");
        for (int i = 0; i < configuration.getNumberOfTrafficClusters(); i++) {
            final int clusterId = numberOfClusters + 1;
            final int numberOfSensors = randClusterSize();
            log.debug(String.format("new traffic cluster %d with %d sensors", clusterId, numberOfSensors));
            
            Set<String> sensors = new HashSet<String>();
            for (int k = 1; k <= numberOfSensors; k++) {
                sensors.add(createSensorObject(OBJECT_TRAFFIC_SENSOR, clusterId, k));
            }
            trafficClusters.put(clusterId, sensors);
            numberOfClusters = numberOfClusters + 1;
        }
    }
    
    private void initializeTemperatureClusters() {
        log.trace("initializeTemperatureClusters");
        
        log.info("creating " + configuration.getNumberOfTemperatureClusters() + " temperature clusters");
        for (int i = 0; i < configuration.getNumberOfTemperatureClusters(); i++) {
            final int clusterId = numberOfClusters + 1;
            final int numberOfSensors = randClusterSize();
            log.debug(String.format("new temperature cluster %d with %d sensors", clusterId, numberOfSensors));
            
            Set<String> sensors = new HashSet<String>();
            for (int k = 1; k <= numberOfSensors; k++) {
                sensors.add(createSensorObject(OBJECT_TEMPERATURE_SENSOR, clusterId, k));
            }
            temperatureClusters.put(clusterId, sensors);
            numberOfClusters = numberOfClusters + 1;
        }
    }
    
    private int randClusterSize() {
        final int min = configuration.getMinimumClusterSize();
        final int max = configuration.getMaximumClusterSize();
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    
    private String createSensorObject(String type, int cluster, int id) {
        log.trace(String.format("createSensorObject %s %d %d", type, cluster, id));
        
        Map<String, String> initialValues = new HashMap<String, String>();
        initialValues.put("clusterId", Integer.toString(cluster));
        initialValues.put("sensorId", Integer.toString(id));
        
        String instanceName;
        try {
            instanceName = gateway.registerObjectInstance(type);
            log.info(String.format("registered object instance %s with class %s", instanceName, type));
        } catch (FederateNotExecutionMember | NameNotFound | ObjectClassNotPublished e) {
            throw new RuntimeException(e);
        }
        
        try {
            gateway.updateObject(instanceName, initialValues); // RO
            log.debug(String.format("initialized %s using %s", instanceName, initialValues.toString()));
        } catch (FederateNotExecutionMember | ObjectNotKnown | NameNotFound | AttributeNotOwned e) {
            throw new RuntimeException(e);
        }
        
        return instanceName;
    }
    
    private void updateTrafficClusters() {
        log.trace("updateTrafficClusters");
        
        for (int clusterId : trafficClusters.keySet()) {
            log.trace("on traffic cluster " + clusterId);
            for (String sensor : trafficClusters.get(clusterId)) {
                final int newValue = ThreadLocalRandom.current().nextInt(0, 11);
                updateTrafficSensor(sensor, newValue);
            }
        }
    }
    
    private void updateTrafficSensor(String name, int count) {
        log.trace(String.format("updateTrafficSensor %s %d", name, count));
        
        Map<String, String> updatedValues = new HashMap<String, String>();
        updatedValues.put("count", Integer.toString(count));
        
        try {
            gateway.updateObject(name, updatedValues, gateway.getTimeStamp()); // TSO
            log.debug(String.format("updated %s using %s", name, updatedValues.toString()));
        } catch (FederateNotExecutionMember | ObjectNotKnown | NameNotFound | AttributeNotOwned
                | InvalidFederationTime e) {
            throw new RuntimeException(e);
        }
    }
    
    private void updateTemperatureClusters() {
        log.trace("updateTemperatureClusters");
        
        for (int clusterId : temperatureClusters.keySet()) {
            log.trace("on temperature cluster " + clusterId);
            for (String sensor : temperatureClusters.get(clusterId)) {
                final double newValue = ThreadLocalRandom.current().nextInt(200, 260) / 10.0;
                updateTemperatureSensor(sensor, newValue);
            }
        }
    }
    
    private void updateTemperatureSensor(String name, double temperature) {
        log.trace(String.format("updateTemperatureSensor %s %f", name, temperature));
        
        Map<String, String> updatedValues = new HashMap<String, String>();
        updatedValues.put("temperature", Double.toString(temperature));
        
        try {
            gateway.updateObject(name, updatedValues, gateway.getTimeStamp()); // TSO
            log.debug(String.format("updated %s using %s", name, updatedValues.toString()));
        } catch (FederateNotExecutionMember | ObjectNotKnown | NameNotFound | AttributeNotOwned
                | InvalidFederationTime e) {
            throw new RuntimeException(e);
        }
    }
}
