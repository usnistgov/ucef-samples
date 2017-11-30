package gov.nist.hla.samples.aggregator;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gov.nist.hla.ii.InjectionCallback;
import gov.nist.hla.ii.InjectionFederate;
import gov.nist.hla.ii.config.InjectionFederateConfig;
import hla.rti.FederateNotExecutionMember;
import hla.rti.InteractionClassNotPublished;
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;

public class Aggregator implements InjectionCallback {
    private static final Logger log = LogManager.getLogger();
    
    private static final String OBJECT_SPEED_SENSOR = "ObjectRoot.Sensor.SpeedSensor";
    private static final String OBJECT_VOLUME_SENSOR = "ObjectRoot.Sensor.VolumeSensor";
    private static final String INTERACTION_ENV_INFO = "InteractionRoot.C2WInteractionRoot.EnvironmentInfo";
    private static final String INTERACTION_SIM_END = "InteractionRoot.C2WInteractionRoot.SimulationControl.SimEnd";
    private static final String INTERACTION_SPEED_REPORT = "InteractionRoot.C2WInteractionRoot.Report.SpeedReport";
    private static final String INTERACTION_VOLUME_REPORT = "InteractionRoot.C2WInteractionRoot.Report.VolumeReport";
    
    private InjectionFederate gateway;
    
    private Set<String> discoveredObjects = new HashSet<String>();
    
    private float[] maxClusterSpeed = null;
    private int[] maxClusterVolume = null;
    
    private boolean initialized = false;
    
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
        log.trace("run");
        
        gateway.run();
    }
    
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        log.trace(String.format("receiveInteraction %f %s %s", timeStep, className, parameters.toString()));
        
        if (className.equals(INTERACTION_ENV_INFO)) {
            receiveEnvironmentInfo(parameters);
        } else if (className.equals(INTERACTION_SIM_END)) {
            log.info("received " + INTERACTION_SIM_END);
        } else {
            log.warn("unexpected interaction " + className);
        }
    }

    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        log.trace(String.format("receiveObject %f %s %s %s", timeStep, className, instanceName, attributes.toString()));
        
        if (!discoveredObjects.contains(instanceName)) {
            discoveredObjects.add(instanceName);
            log.info(String.format("discovered object instance %s with class %s", instanceName, className));
        }
        
        if (className.equals(OBJECT_SPEED_SENSOR)) {
            receiveSpeedSensor(instanceName, attributes);
        } else if (className.equals(OBJECT_VOLUME_SENSOR)) {
            receiveVolumeSensor(instanceName, attributes);
        } else {
            log.warn("unexpected object update " + className);
        }
    }

    public void initializeSelf() {
        log.trace("initializeSelf");
    }

    public void initializeWithPeers() {
        log.trace("initializeWithPeers");
        
        log.info("waiting to receive " + INTERACTION_ENV_INFO);
        while (!initialized) {
            try {
                gateway.tick(); // wait for environment info interaction
            } catch (FederateNotExecutionMember e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void doTimeStep(Double timeStep) {
        log.trace("doTimeStep " + timeStep);
        
        for (int i = 0; i < maxClusterSpeed.length; i++) {
            reportAggregateSpeed(i, maxClusterSpeed[i]);
        }
        for (int i = 0; i < maxClusterVolume.length; i++) {
            reportAggregateVolume(i, maxClusterVolume[i]);
        }
        resetDataStructures();
    }

    public void terminate() {
        log.trace("terminate");
    }
    
    private void receiveEnvironmentInfo(Map<String, String> parameters) {
        log.trace("receiveEnvironmentInfo " + parameters.toString());
        
        final int numSpeedClusters = Integer.parseInt(parameters.get("numberOfSpeedClusters"));
        final int numVolumeClusters = Integer.parseInt(parameters.get("numberOfVolumeClusters"));
        
        this.maxClusterSpeed = new float[numSpeedClusters];
        this.maxClusterVolume = new int[numVolumeClusters];
        resetDataStructures();
        this.initialized = true;
        
        log.debug(String.format("initialized %d speed and %d volume clusters", numSpeedClusters, numVolumeClusters));
    }
    
    private void resetDataStructures() {
        log.trace("resetDataStructures");
        
        Arrays.fill(maxClusterSpeed, -1);
        Arrays.fill(maxClusterVolume, -1);
    }
    
    private void receiveSpeedSensor(String instanceName, Map<String, String> attributes) {
        log.trace(String.format("receiveSpeedSensor %s %s", instanceName, attributes.toString()));
        
        final int cluster = Integer.parseInt(attributes.get("clusterId"));
        final float speed = Float.parseFloat(attributes.get("speed"));
        
        if (cluster < 0 || cluster >= maxClusterSpeed.length) {
            log.error("speed sensor reported invalid cluster ID " + cluster);
        } else {
            log.debug(String.format("received update from speed sensor %d-%s", cluster, instanceName));
            if (maxClusterSpeed[cluster] < speed) {
                maxClusterSpeed[cluster] = speed;
                log.trace("new max speed " + speed);
            }
        }
    }
    
    private void receiveVolumeSensor(String instanceName, Map<String, String> attributes) {
        log.trace(String.format("receiveVolumeSensor %s %s", instanceName, attributes.toString()));
        
        final int cluster = Integer.parseInt(attributes.get("clusterId"));
        final int count = Integer.parseInt(attributes.get("count"));
        
        if (cluster < 0 || cluster >= maxClusterVolume.length) {
            log.error("volume sensor reported invalid cluster ID " + cluster);
        } else {
            log.debug(String.format("received update from volume sensor %d-%s", cluster, instanceName));
            if (maxClusterVolume[cluster] < count) {
                maxClusterVolume[cluster] = count;
                log.trace("new max volume " + count);
            }
        }
    }
    
    private void reportAggregateSpeed(int cluster, float maxSpeed) {
        log.trace(String.format("reportAggregateSpeed %d %f", cluster, maxSpeed));
        
        if (maxSpeed < 0) {
            log.warn("received no updates for speed cluster " + cluster);
        } else {
            Map<String, String> parameters = new HashMap<String, String>();
            parameters.put("clusterId", Integer.toString(cluster));
            parameters.put("speed", Float.toString(maxSpeed));
            parameters.put("aggregationMethod", "maxValue");
            
            try {
                gateway.injectInteraction(INTERACTION_SPEED_REPORT, parameters, gateway.getTimeStamp());
                log.debug(String.format("sent %s using %s", INTERACTION_SPEED_REPORT, parameters.toString()));
            } catch (FederateNotExecutionMember | NameNotFound | InteractionClassNotPublished
                    | InvalidFederationTime e) {
                throw new RuntimeException(e);
            }
            
            log.info(String.format("speed cluster %d reports aggregate value %f", cluster, maxSpeed));
        }
    }
    
    private void reportAggregateVolume(int cluster, int maxVolume) {
        log.trace(String.format("reportAggregateVolume %d %d", cluster, maxVolume));
        
        if (maxVolume < 0) {
            log.warn("received no updates for volume cluster " + cluster);
        } else {
            Map<String, String> parameters = new HashMap<String, String>();
            parameters.put("clusterId", Integer.toString(cluster));
            parameters.put("count", Integer.toString(maxVolume));
            parameters.put("aggregationMethod", "maxValue");
            
            try {
                gateway.injectInteraction(INTERACTION_VOLUME_REPORT, parameters, gateway.getTimeStamp());
                log.debug(String.format("sent %s using %s", INTERACTION_VOLUME_REPORT, parameters.toString()));
            } catch (FederateNotExecutionMember | NameNotFound | InteractionClassNotPublished
                    | InvalidFederationTime e) {
                throw new RuntimeException(e);
            }
            
            log.info(String.format("volume cluster %d reports aggregate value %d", cluster, maxVolume));
        }
    }
}
