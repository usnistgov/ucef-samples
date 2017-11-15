package gov.nist.hla.samples.aggregator;

import gov.nist.hla.ii.config.InjectionFederateConfig;

public class EnvironmentConfiguration extends InjectionFederateConfig {
    private int minimumClusterSize;
    private int maximumClusterSize;
    private int numberOfSpeedClusters;
    private int numberOfVolumeClusters;
    
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
    
    public void setNumberOfSpeedClusters(int count) {
        this.numberOfSpeedClusters = count;
    }
    
    public int getNumberOfSpeedClusters() {
        return this.numberOfSpeedClusters;
    }
    
    public void setNumberOfVolumeClusters(int count) {
        this.numberOfVolumeClusters = count;
    }
    
    public int getNumberOfVolumeClusters() {
        return this.numberOfVolumeClusters;
    }
}
