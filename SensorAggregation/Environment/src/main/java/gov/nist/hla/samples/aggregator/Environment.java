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
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;
import hla.rti.ObjectClassNotPublished;
import hla.rti.ObjectNotKnown;

public class Environment implements InjectionCallback {
    private static final Logger log = LogManager.getLogger();
    
    private static final String OBJECT_SPEED_SENSOR = "ObjectRoot.Sensor.SpeedSensor";
    private static final String OBJECT_VOLUME_SENSOR = "ObjectRoot.Sensor.VolumeSensor";
    
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
        throw new RuntimeException("unexpected interaction received");
    }

    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        throw new RuntimeException("unexpected object reflection");
    }

    public void initializeSelf() {
        final int min = configuration.getMinimumClusterSize();
        final int max = configuration.getMaximumClusterSize();
        
        log.info("creating " + configuration.getNumberOfSpeedClusters() + " speed sensor clusters");
        for (int i = 0; i < configuration.getNumberOfSpeedClusters(); i++) {
            final int numberOfSensors = ThreadLocalRandom.current().nextInt(min, max + 1);
            log.debug(String.format("on speed cluster %d with %d sensors", i, numberOfSensors));
            Set<String> sensors = new HashSet<String>();
            for (int k = 0; k < numberOfSensors; k++) {
                sensors.add(createSensor(OBJECT_SPEED_SENSOR, i, k));
            }
            speedClusters.add(sensors);
        }
        
        log.info("creating " + configuration.getNumberOfVolumeClusters() + " volume sensor clusters");
        for (int i = 0; i < configuration.getNumberOfVolumeClusters(); i++) {
            final int numberOfSensors = ThreadLocalRandom.current().nextInt(min, max + 1);
            log.debug(String.format("on volume cluster %d with %d sensors", i, numberOfSensors));
            Set<String> sensors = new HashSet<String>();
            for (int k = 0; k < numberOfSensors; k++) {
                sensors.add(createSensor(OBJECT_VOLUME_SENSOR, i, k));
            }
            volumeClusters.add(sensors);
        }
    }

    public void initializeWithPeers() {
        // maybe send interaction with expected number of sensors to aggregator
    }

    public void beforeTimeStep(Double timeStep) {
        log.info("updating the speed sensors for each cluster");
        for (int i = 0; i < speedClusters.size(); i++) {
            log.trace("on cluster " + i);
            for (String sensor : speedClusters.get(i)) {
                final float newValue = (float) (ThreadLocalRandom.current().nextInt(300, 600) / 10.0);
                log.trace("\ton sensor " + sensor + " using value " + newValue);
                updateSpeedSensor(sensor, newValue);
            }
        }
        
        log.info("updating the volume sensors for each cluster");
        for (int i = 0; i < volumeClusters.size(); i++) {
            log.trace("on cluster " + i);
            for (String sensor : volumeClusters.get(i)) {
                final int newValue = ThreadLocalRandom.current().nextInt(1, 11);
                log.trace("\ton sensor " + sensor + " using value " + newValue);
                updateVolumeSensor(sensor, newValue);
            }
        }
    }

    public void afterTimeStep(Double timeStep) {
        log.trace("afterTimeStep " + timeStep);
    }

    public void afterResignation() {
        log.trace("afterResignation");
    }
    
    private String createSensor(String type, int cluster, int id) {
        Map<String, String> initialValues = new HashMap<String, String>();
        initialValues.put("clusterId", Integer.toString(cluster));
        initialValues.put("sensorId", Integer.toString(id));
        
        try {
            String name = gateway.registerObjectInstance(type);
            log.debug("new " + type + " with name " + name);
            gateway.updateObject(name, initialValues);
            return name;
        } catch (FederateNotExecutionMember | NameNotFound | ObjectClassNotPublished | ObjectNotKnown | AttributeNotOwned e) {
            throw new RuntimeException(e);
        }
    }
    
    private void updateSpeedSensor(String name, float speed) {
        Map<String, String> updatedValues = new HashMap<String, String>();
        updatedValues.put("speed", Float.toString(speed));
        try {
            gateway.updateObject(name, updatedValues, gateway.getTimeStamp());
        } catch (FederateNotExecutionMember | ObjectNotKnown | NameNotFound | AttributeNotOwned | InvalidFederationTime e) {
            throw new RuntimeException(e);
        }
    }
    
    private void updateVolumeSensor(String name, int count) {
        Map<String, String> updatedValues = new HashMap<String, String>();
        updatedValues.put("count", Integer.toString(count));
        try {
            gateway.updateObject(name, updatedValues, gateway.getTimeStamp());
        } catch (FederateNotExecutionMember | ObjectNotKnown | NameNotFound | AttributeNotOwned | InvalidFederationTime e) {
            throw new RuntimeException(e);
        }
    }
}
