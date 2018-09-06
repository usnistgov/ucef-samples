package ControllerProject;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateParameter;

public class ControllerConfig extends FederateConfig {
    @FederateParameter
    public double kp = 1.0; // proportional constant
    
    @FederateParameter
    public double ki = 1.0; // integral constant
    
    @FederateParameter
    public double kd = 1.0; // derivative constant
    
    @FederateParameter
    public double hyst = 1.0; //hysteresis if simple model
    
    @FederateParameter
    public String zonename;
}
