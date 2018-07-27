package gov.nist.hla.samples.aggregator;

import gov.nist.hla.gateway.GatewayFederateConfig;
import gov.nist.hla.gateway.exception.ValueNotSet;

public class ReporterConfiguration extends GatewayFederateConfig {
    private String aggregationMethod;
    private boolean aggregationMethodSet;
    
    public void setAggregationMethod(String method) {
        this.aggregationMethod = method;
        this.aggregationMethodSet = true;
    }
    
    public String getAggregationMethod() {
        if (!aggregationMethodSet) {
            throw new ValueNotSet("aggregationMethod");
        }
        return this.aggregationMethod;
    }
}
