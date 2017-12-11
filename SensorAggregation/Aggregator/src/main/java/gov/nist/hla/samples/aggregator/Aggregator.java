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

import gov.nist.hla.gateway.GatewayCallback;
import gov.nist.hla.gateway.GatewayFederate;
import gov.nist.hla.gateway.GatewayFederateConfig;
import hla.rti.FederateNotExecutionMember;
import hla.rti.InteractionClassNotPublished;
import hla.rti.InvalidFederationTime;
import hla.rti.NameNotFound;

public class Aggregator implements GatewayCallback {
    private static final Logger log = LogManager.getLogger();
    
    private static final String OBJECT_SENSOR = "ObjectRoot.Sensor";
    private static final String INTERACTION_AGG_CONTROL = "InteractionRoot.C2WInteractionRoot.AggregationControl";
    private static final String INTERACTION_AGG_REPORT = "InteractionRoot.C2WInteractionRoot.AggregationReport";
    private static final String INTERACTION_SIM_END = "InteractionRoot.C2WInteractionRoot.SimulationControl.SimEnd";
    
    private class SensorInfo {
        private final int sensorId;
        private final int clusterId;
        
        public SensorInfo(int sensorId, int clusterId) {
            this.sensorId = sensorId;
            this.clusterId = clusterId;
        }
    }
    
    private class AggregateData {
        private String dataType;
        private String maxValue;
        private String sumValue;
        private int numberOfValues;
        
        public AggregateData(String dataType, String initialValue) {
            this.dataType = dataType;
            this.maxValue = initialValue;
            this.sumValue = initialValue;
            this.numberOfValues = 1;
        }
        
        public String toString() {
            return String.format("type=%s values=%d max=%s sum=%s", dataType, numberOfValues, maxValue, sumValue);
        }
    }
    
    private enum AggregationMethod {
        MAXIMUM,
        SUM
    }
    
    private GatewayFederate gateway;
    
    // HLA object instance name -> static sensor information
    Map<String, SensorInfo> discoveredObjects = new HashMap<String, SensorInfo>();
    
    // cluster id -> aggregate data for all sensor attributes in that cluster
    Map<Integer, Map<String, AggregateData>> clusterData = new HashMap<Integer, Map<String, AggregateData>>();
    
    private ObjectMapper mapper = new ObjectMapper();
    
    private AggregationMethod aggregationMethod = null;
    
    public static void main(String[] args)
            throws IOException {
        if (args.length != 1) {
            log.error("missing command line argument for JSON configuration file");
            return;
        }
        
        GatewayFederateConfig config = GatewayFederate.readConfiguration(args[0]);
        Aggregator environmentFederate = new Aggregator(config);
        environmentFederate.run();
    }
    
    public Aggregator(GatewayFederateConfig configuration) {
        this.gateway = new GatewayFederate(configuration, this);
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
                gateway.tick(); // this will call receiveInteraction
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
            } else {
                updateSensor(className, instanceName, attributes);
            }
        } else {
            log.warn("unexpected object update " + className);
        }
    }
    
    public void doTimeStep(Double timeStep) {
        log.trace("doTimeStep " + timeStep);
        
        for (Map.Entry<Integer, Map<String, AggregateData>> entry : clusterData.entrySet()) {
            try {
                final int clusterId = entry.getKey();
                final String report = createReport(entry.getValue());
                
                log.trace("on cluster " + clusterId);
                if (report.equals("[]")) {
                    log.info("no update for cluster " + clusterId);
                    continue;
                }
                sendReportInteraction(entry.getKey(), aggregationMethod, createReport(entry.getValue()));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public void terminate() {
        log.trace("terminate");
    }
    
    private void receiveAggregationControl(Map<String, String> parameters) {
        log.trace("receiveAggregationControl " + parameters.toString());
        
        String stringValue = parameters.get("aggregationMethod");
        this.aggregationMethod = AggregationMethod.valueOf(stringValue.toUpperCase());
        log.info("configured to use the aggregation method: " + aggregationMethod.toString());
    }
    
    private void discoverSensor(String instanceName, Map<String, String> attributes) {
        log.trace(String.format("discoverSensor %s %s", instanceName, attributes.toString()));
        
        if (!attributes.containsKey("sensorId") || !attributes.containsKey("clusterId")) {
            throw new RuntimeException("missing expected attributes for " + instanceName);
        }
        
        final int sensorId = Integer.parseInt(attributes.get("sensorId"));
        final int clusterId = Integer.parseInt(attributes.get("clusterId"));
        SensorInfo discoveredObject = new SensorInfo(sensorId, clusterId);
        
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
        
        if (!discoveredObjects.containsKey(instanceName)) {
            throw new RuntimeException("update from undiscovered sensor " + instanceName);
        }
        
        // we do not check for duplicate updates from the same sensor
        final int sensorId = discoveredObjects.get(instanceName).sensorId;
        final int clusterId = discoveredObjects.get(instanceName).clusterId;
        log.debug("received update from sensor " + sensorId + " in cluster " + clusterId);
        
        Map<String, AggregateData> data = clusterData.get(clusterId);
        
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            final String attribute = entry.getKey();
            final String stringValue = entry.getValue();
            final String dataType = getDataType(className, attribute);
            
            if (!dataType.equals("double") && !dataType.equals("int")) {
                log.warn(String.format("skipping attribute %s with unsupported type %s", attribute, dataType));
            }
            
            if (data.containsKey(attribute)) {
                updateAggregateData(data.get(attribute), stringValue);
            } else {
                data.put(attribute, new AggregateData(dataType, stringValue));
                log.debug(String.format("initial value for %s set to %s", attribute, data.get(attribute).toString()));
            }
        }
    }
    
    private String getDataType(String className, String attributeName) {
        ObjectClassType objectClass = gateway.getObjectModel().getObject(className);
        AttributeType attributeClass = gateway.getObjectModel().getAttribute(objectClass, attributeName);
        return attributeClass.getDataType().getValue();
    }
    
    private void updateAggregateData(AggregateData data, String stringValue) {
        log.trace(String.format("updateAggregateData %s %s", data.toString(), stringValue));
        
        if (data.dataType.equals("double")) {
            final double value = Double.parseDouble(stringValue);
            
            if (Double.parseDouble(data.maxValue) < value) {
                data.maxValue = stringValue;
            }
            data.sumValue = Double.toString(Double.parseDouble(data.sumValue) + value);
            data.numberOfValues = data.numberOfValues + 1;
            log.debug("new aggregate " + data.toString());
        } else if (data.dataType.equals("int")) {
            final int value = Integer.parseInt(stringValue);
            
            if (Integer.parseInt(data.maxValue) < value) {
                data.maxValue = stringValue;
            }
            data.sumValue = Integer.toString(Integer.parseInt(data.sumValue) + value);
            data.numberOfValues = data.numberOfValues + 1;
            log.debug("new aggregate " + data.toString());
        } else {
            throw new RuntimeException("unsupported data type " + data.dataType);
        }
    }
    
    private void sendReportInteraction(int clusterId, AggregationMethod aggregationMethod, String report) {
        log.trace(String.format("sendReportInteraction %d %s %s", clusterId, aggregationMethod, report));
        
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("clusterId", Integer.toString(clusterId));
        parameters.put("aggregationMethod", aggregationMethod.toString());
        parameters.put("report", report);
        
        try {
            gateway.sendInteraction(INTERACTION_AGG_REPORT, parameters, gateway.getTimeStamp());
            log.info(String.format("sent %s using %s", INTERACTION_AGG_REPORT, parameters.toString()));
        } catch (FederateNotExecutionMember | NameNotFound | InteractionClassNotPublished
                | InvalidFederationTime e) {
            throw new RuntimeException(e);
        }
    }
    
    private String createReport(Map<String, AggregateData> data)
            throws JsonProcessingException {
        log.trace("createReport " + data.toString());
        
        ArrayNode root = mapper.createArrayNode();
        for (Map.Entry<String, AggregateData> entry : data.entrySet()) {
            root.add(createReportNode(entry.getKey(), entry.getValue()));
        }
        return mapper.writeValueAsString(root);
    }
    
    private ObjectNode createReportNode(String attributeName, AggregateData data) {
        log.trace("createReportNode " + attributeName + " " + data.toString());
        
        ObjectNode node = mapper.createObjectNode();
        node.put("name", attributeName);
        node.put("type", data.dataType);
        switch (aggregationMethod) {
            case MAXIMUM:
                node.put("value", data.maxValue);
                break;
            case SUM:
                node.put("value", data.sumValue);
                break;
        }
        return node;
    }
}
