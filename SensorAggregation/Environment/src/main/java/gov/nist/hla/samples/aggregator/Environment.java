package gov.nist.hla.samples.aggregator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
import hla.rti.InteractionClassNotPublished;
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;
import hla.rti.ObjectClassNotPublished;
import hla.rti.ObjectNotKnown;

public class Environment implements InjectionCallback {
    private static final Logger log = LogManager.getLogger();
    
    private static final String OBJECT_SPEED_SENSOR = "ObjectRoot.Sensor.SpeedSensor";
    private static final String OBJECT_VOLUME_SENSOR = "ObjectRoot.Sensor.VolumeSensor";
    private static final String INTERACTION_ENV_INFO = "InteractionRoot.C2WInteractionRoot.EnvironmentInfo";
    private static final String INTERACTION_SIM_END = "InteractionRoot.C2WInteractionRoot.SimulationControl.SimEnd";
    
    private InjectionFederate gateway;
    private EnvironmentConfiguration configuration;
    
    private List<Set<String>> speedClusters = new ArrayList<Set<String>>();
    private List<Set<String>> volumeClusters = new ArrayList<Set<String>>();
    
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
    
    public Environment(EnvironmentConfiguration configuration) {
        this.gateway = new InjectionFederate(configuration, this);
        this.configuration = configuration;
    }
    
    public void run() {
        log.trace("run");
        
        gateway.run();
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

    public void initializeSelf() {
        log.trace("initializeSelf");
        
        initializeSpeedClusters();
        initializeVolumeClusters();
    }
    
    public void initializeWithPeers() {
        log.trace("initializeWithPeers");
        
        sendEnvironmentInfo();
    }
    
    public void doTimeStep(Double timeStep) {
        log.trace("doTimeStep " + timeStep);
        
        updateSpeedClusters();
        updateVolumeClusters();
    }

    public void terminate() {
        log.trace("terminate");
    }
    
    private static EnvironmentConfiguration readConfiguration(String filepath)
            throws IOException {
        log.info("reading JSON configuration file at " + filepath);
        File configFile = Paths.get(filepath).toFile();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(configFile, EnvironmentConfiguration.class);
    }
    
    private void initializeSpeedClusters() {
        log.trace("initializeSpeedClusters");
        
        final int min = configuration.getMinimumClusterSize();
        final int max = configuration.getMaximumClusterSize();
        
        log.info("creating " + configuration.getNumberOfSpeedClusters() + " speed clusters");
        for (int i = 0; i < configuration.getNumberOfSpeedClusters(); i++) {
            final int numberOfSensors = ThreadLocalRandom.current().nextInt(min, max + 1);
            log.trace(String.format("on speed cluster %d with %d sensors", i, numberOfSensors));
            
            Set<String> sensors = new HashSet<String>();
            for (int k = 0; k < numberOfSensors; k++) {
                sensors.add(createSensorObject(OBJECT_SPEED_SENSOR, i, k));
            }
            speedClusters.add(sensors);
        }
    }
    
    private void initializeVolumeClusters() {
        log.trace("initializeVolumeClusters");
        
        final int min = configuration.getMinimumClusterSize();
        final int max = configuration.getMaximumClusterSize();
        
        log.info("creating " + configuration.getNumberOfVolumeClusters() + " volume clusters");
        for (int i = 0; i < configuration.getNumberOfVolumeClusters(); i++) {
            final int numberOfSensors = ThreadLocalRandom.current().nextInt(min, max + 1);
            log.trace(String.format("on volume cluster %d with %d sensors", i, numberOfSensors));
            
            Set<String> sensors = new HashSet<String>();
            for (int k = 0; k < numberOfSensors; k++) {
                sensors.add(createSensorObject(OBJECT_VOLUME_SENSOR, i, k));
            }
            volumeClusters.add(sensors);
        }
    }

    private String createSensorObject(String type, int cluster, int id) {
        log.trace(String.format("createSensor %s %d %d", type, cluster, id));
        
        Map<String, String> initialValues = new HashMap<String, String>();
        initialValues.put("clusterId", Integer.toString(cluster));
        initialValues.put("sensorId", Integer.toString(id));
        
        String instanceName;
        try {
            instanceName = gateway.registerObjectInstance(type);
            log.info(String.format("registered %s of type %s", instanceName, type));
        } catch (FederateNotExecutionMember | NameNotFound | ObjectClassNotPublished e) {
            throw new RuntimeException(e);
        }
        /* broken due to incomplete object update
        try {
            gateway.updateObject(instanceName, initialValues);
            log.debug(String.format("initialized %s using %s", instanceName, initialValues.toString()));
        } catch (FederateNotExecutionMember | ObjectNotKnown | NameNotFound | AttributeNotOwned e) {
            throw new RuntimeException(e);
        }
        */
        return instanceName;
    }
    
    private void sendEnvironmentInfo() {
        log.trace("sendEnvironmentInfo");
        
        Map<String, String> values = new HashMap<String, String>();
        values.put("numberOfSpeedClusters", Integer.toString(configuration.getNumberOfSpeedClusters()));
        values.put("numberOfVolumeClusters", Integer.toString(configuration.getNumberOfVolumeClusters()));
        
        try {
            gateway.injectInteraction(INTERACTION_ENV_INFO, values);
            log.info(String.format("sent %s using %s", INTERACTION_ENV_INFO, values.toString()));
        } catch (FederateNotExecutionMember | NameNotFound | InteractionClassNotPublished e) {
            throw new RuntimeException(e);
        }
    }
    
    private void updateSpeedClusters() {
        log.trace("updateSpeedClusters");
        
        for (int i = 0; i < speedClusters.size(); i++) {
            log.trace("on speed cluster " + i);
            for (String sensor : speedClusters.get(i)) {
                final float newValue = (float) (ThreadLocalRandom.current().nextInt(300, 600) / 10.0);
                updateSpeedSensor(sensor, i, newValue);
            }
        }
    }
    
    private void updateVolumeClusters() {
        log.trace("updateVolumeClusters");
        
        for (int i = 0; i < volumeClusters.size(); i++) {
            log.trace("on volume cluster " + i);
            for (String sensor : volumeClusters.get(i)) {
                final int newValue = ThreadLocalRandom.current().nextInt(1, 25);
                updateVolumeSensor(sensor, i, newValue);
            }
        }
    }
    
    private void updateSpeedSensor(String name, int cluster, float speed) {
        log.trace(String.format("updateSpeedSensor %s %d %f", name, cluster, speed));
        
        Map<String, String> updatedValues = new HashMap<String, String>();
        updatedValues.put("clusterId", Integer.toString(cluster));
        updatedValues.put("speed", Float.toString(speed));
        
        try {
            gateway.updateObject(name, updatedValues, gateway.getTimeStamp());
            log.debug(String.format("updated object %s using %s", name, updatedValues.toString()));
        } catch (FederateNotExecutionMember | ObjectNotKnown | NameNotFound | AttributeNotOwned
                | InvalidFederationTime e) {
            throw new RuntimeException(e);
        }
    }
    
    private void updateVolumeSensor(String name, int cluster, int count) {
        log.trace(String.format("updateVolumeSensor %s %d %d", name, cluster, count));
        
        Map<String, String> updatedValues = new HashMap<String, String>();
        updatedValues.put("clusterId", Integer.toString(cluster));
        updatedValues.put("count", Integer.toString(count));
        
        try {
            gateway.updateObject(name, updatedValues, gateway.getTimeStamp());
            log.debug(String.format("updated object %s using %s", name, updatedValues.toString()));
        } catch (FederateNotExecutionMember | ObjectNotKnown | NameNotFound | AttributeNotOwned
                | InvalidFederationTime e) {
            throw new RuntimeException(e);
        }
    }
}
