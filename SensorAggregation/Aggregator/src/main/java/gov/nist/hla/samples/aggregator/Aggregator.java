package gov.nist.hla.samples.aggregator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ieee.standards.ieee1516._2010.AttributeType;
import org.ieee.standards.ieee1516._2010.ObjectClassType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import gov.nist.hla.ii.InjectionCallback;
import gov.nist.hla.ii.InjectionFederate;
import gov.nist.hla.ii.config.InjectionFederateConfig;
import hla.rti.FederateNotExecutionMember;
import hla.rti.InteractionClassNotPublished;
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;

public class Aggregator implements InjectionCallback {
    private static final Logger log = LogManager.getLogger();
    
    private static final String OBJECT_SENSOR = "ObjectRoot.Sensor";
    private static final String INTERACTION_AGG_CONTROL = "InteractionRoot.C2WInteractionRoot.AggregationControl";
    private static final String INTERACTION_AGG_REPORT = "InteractionRoot.C2WInteractionRoot.AggregationReport";
    private static final String INTERACTION_SIM_END = "InteractionRoot.C2WInteractionRoot.SimulationControl.SimEnd";
    
    private class ObjectInfo {
        private final int sensorId;
        private final int clusterId;
        
        public ObjectInfo(int sensorId, int clusterId) {
            this.sensorId = sensorId;
            this.clusterId = clusterId;
        }
    }
    
    private class AggregateData {
        private String dataType;
        private String maxValue;
        private String sumValue;
        private int numberOfValues;
        
        public AggregateData(String initialValue, String dataType) {
            this.dataType = dataType;
            this.maxValue = initialValue;
            this.sumValue = initialValue;
            this.numberOfValues = 1;
        }
        
        public String toString() {
            return String.format("(type=%s values=%d max=%s sum=%s)", dataType, numberOfValues, maxValue, sumValue);
        }
    }
    
    private InjectionFederate gateway;
    
    Map<String, ObjectInfo> discoveredObjects = new HashMap<String, ObjectInfo>();
    
    Map<Integer, Map<String, AggregateData>> clusterData = new HashMap<Integer, Map<String, AggregateData>>();
    
    private String aggregationMethod = null;
    
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
    
    public void initializeSelf() {
        log.trace("initializeSelf");
    }

    public void initializeWithPeers() {
        log.trace("initializeWithPeers");
        
        log.info("waiting to receive " + INTERACTION_AGG_CONTROL);
        while (aggregationMethod == null) {
            try {
                gateway.tick();
            } catch (FederateNotExecutionMember e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public void receiveInteraction(Double timeStep, String className, Map<String, String> parameters) {
        log.trace(String.format("receiveInteraction %f %s %s", timeStep, className, parameters.toString()));
        
        if (className.equals(INTERACTION_AGG_CONTROL)) {
            receiveAggregationControl(parameters);
        } else if (className.equals(INTERACTION_SIM_END)) {
            log.info("received " + INTERACTION_SIM_END);
        } else {
            log.warn("unexpected interaction " + className);
        }
    }
    
    public void receiveObject(Double timeStep, String className, String instanceName, Map<String, String> attributes) {
        log.trace(String.format("receiveObject %f %s %s %s", timeStep, className, instanceName, attributes.toString()));
        
        if (className.contains(OBJECT_SENSOR)) {
            if (!gateway.hasTimeStarted()) {
                discoverSensor(instanceName, attributes);
            } else if (discoveredObjects.containsKey(instanceName)) {
                updateSensor(className, instanceName, attributes);
            } else {
                log.error("sensor object not discovered during initialization: " + instanceName);
            }
        } else {
            log.warn("unexpected object update " + className);
        }
    }
    
    public void doTimeStep(Double timeStep) {
        log.trace("doTimeStep " + timeStep);
        
        ObjectMapper mapper = new ObjectMapper();
        for (int clusterId : clusterData.keySet()) {
            ArrayNode root = mapper.createArrayNode();
            Map<String, AggregateData> data = clusterData.get(clusterId);
            for (Map.Entry<String, AggregateData> entry : data.entrySet()) {
                String attributeName = entry.getKey();
                String aggregateValue;
                if (aggregationMethod.equals("maximum")) {
                    aggregateValue = entry.getValue().maxValue;
                } else if (aggregationMethod.equals("sum")) {
                    aggregateValue = entry.getValue().sumValue;
                } else {
                    log.warn("unsupported aggregation method " + aggregationMethod);
                    continue;
                }
                ObjectNode node = mapper.createObjectNode();
                node.put("name", attributeName);
                node.put("value", aggregateValue);
                node.put("type", entry.getValue().dataType);
                root.add(node);
            }
            try {
                sendReportInteraction(clusterId, aggregationMethod, mapper.writeValueAsString(root));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
            data.clear();
        }
    }

    public void terminate() {
        log.trace("terminate");
    }
    
    private void receiveAggregationControl(Map<String, String> parameters) {
        log.trace("receiveAggregationControl " + parameters.toString());
        
        this.aggregationMethod = parameters.get("aggregationMethod");
        log.info("configured to use the aggregation method: " + aggregationMethod);
    }
    
    private void discoverSensor(String instanceName, Map<String, String> attributes) {
        log.trace(String.format("discoverObject %s %s", instanceName, attributes.toString()));
        
        final int sensorId = Integer.parseInt(attributes.get("sensorId"));
        final int clusterId = Integer.parseInt(attributes.get("clusterId"));
        ObjectInfo discoveredObject = new ObjectInfo(sensorId, clusterId);
        
        if (discoveredObjects.put(instanceName, discoveredObject) != null) {
            log.warn("discovered multiple sensors named " + instanceName);
        }
        if (!clusterData.containsKey(clusterId)) {
            log.info("discovered new cluster with id " + clusterId);
            clusterData.put(clusterId, new HashMap<String, AggregateData>());
        }
    }
    
    private void updateSensor(String className, String instanceName, Map<String, String> attributes) {
        log.trace(String.format("updateSensor %s %s %s", className, instanceName, attributes.toString()));
        
        // we do not check for duplicate updates from the same sensor
        final int sensorId = discoveredObjects.get(instanceName).sensorId;
        final int clusterId = discoveredObjects.get(instanceName).clusterId;
        log.info("received update from sensor " + sensorId + " in cluster " + clusterId);
        
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            final String attribute = entry.getKey();
            final String stringValue = entry.getValue();
            final String dataType = getDataType(className, attribute);
            
            Map<String, AggregateData> data = clusterData.get(clusterId);
            if (data.containsKey(attribute)) {
                aggregateValues(data.get(attribute), stringValue);
            } else {
                data.put(attribute, new AggregateData(stringValue, dataType));
                log.debug("initial aggregate " + data.get(attribute).toString());
            }
        }
    }
    
    private String getDataType(String className, String attributeName) {
        ObjectClassType objectClass = this.gateway.getObjectModel().getObject(className);
        AttributeType attributeClass = this.gateway.getObjectModel().getAttribute(objectClass, attributeName);
        return attributeClass.getDataType().getValue();
    }
    
    private void aggregateValues(AggregateData data, String stringValue) {
        log.trace(String.format("aggregateValues %s %s", data.toString(), stringValue));
        
        if (data.dataType.equals("double")) {
            final double value = Double.parseDouble(stringValue);
            double sum = Double.parseDouble(data.sumValue) + value;
            
            if (Double.parseDouble(data.maxValue) < value) {
                data.maxValue = stringValue;
            }
            data.sumValue = Double.toString(sum);
            data.numberOfValues = data.numberOfValues + 1;
            log.debug("new aggregate " + data.toString());
        } else if (data.dataType.equals("int")) {
            final int value = Integer.parseInt(stringValue);
            int sum = Integer.parseInt(data.sumValue) + value;
            
            if (Integer.parseInt(data.maxValue) < value) {
                data.maxValue = stringValue;
            }
            data.sumValue = Integer.toString(sum);
            data.numberOfValues = data.numberOfValues + 1;
            log.debug("new aggregate " + data.toString());
        } else {
            log.warn("not supported");
        }
    }
    
    private void sendReportInteraction(int clusterId, String aggregationMethod, String report) {
        log.trace(String.format("sendReportInteraction %d %s %s", clusterId, aggregationMethod, report));
        
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("clusterId", Integer.toString(clusterId));
        parameters.put("aggregationMethod", aggregationMethod);
        parameters.put("report", report);
        
        try {
            gateway.injectInteraction(INTERACTION_AGG_REPORT, parameters, gateway.getTimeStamp());
            log.debug(String.format("sent %s using %s", INTERACTION_AGG_REPORT, parameters.toString()));
        } catch (FederateNotExecutionMember | NameNotFound | InteractionClassNotPublished
                | InvalidFederationTime e) {
            throw new RuntimeException(e);
        }
    }
}
