package gov.nist.hla.samples.aggregator;

import gov.nist.hla.ii.config.InjectionFederateConfig;
import gov.nist.hla.ii.exception.ValueNotSet;

public class ReporterConfiguration extends InjectionFederateConfig {
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
