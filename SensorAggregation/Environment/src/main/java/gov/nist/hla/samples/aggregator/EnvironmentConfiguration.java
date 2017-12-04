package gov.nist.hla.samples.aggregator;

import gov.nist.hla.ii.config.InjectionFederateConfig;

public class EnvironmentConfiguration extends InjectionFederateConfig {
    private int minimumClusterSize = 2;
    private int maximumClusterSize = 2;
    private int numberOfTrafficClusters = 1;
    private int numberOfTemperatureClusters = 1;
    
    public void setMinimumClusterSize(int min) {
        this.minimumClusterSize = min;
    }
    
    public int getMinimumClusterSize() {
        return this.minimumClusterSize;
    }
    
    public void setMaximumClusterSize(int max) {
        this.maximumClusterSize = max;
    }
    
    public int getMaximumClusterSize() {
        return this.maximumClusterSize;
    }
    
    public void setNumberOfTrafficClusters(int count) {
        this.numberOfTrafficClusters = count;
    }
    
    public int getNumberOfTrafficClusters() {
        return this.numberOfTrafficClusters;
    }
    
    public void setNumberOfTemperatureClusters(int count) {
        this.numberOfTemperatureClusters = count;
    }
    
    public int getNumberOfTemperatureClusters() {
        return this.numberOfTemperatureClusters;
    }
}
