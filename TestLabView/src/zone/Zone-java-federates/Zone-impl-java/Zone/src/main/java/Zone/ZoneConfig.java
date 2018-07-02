package Zone;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateParameter;

public class ZoneConfig extends FederateConfig {
    @FederateParameter
    public double uae = 172.0; // Lumped Thermal Resistance W per 'C
    
    @FederateParameter
    public double tau = 104 * 3600.0; // seconds
    
    @FederateParameter
    public double houseeffectivearea = 6.84; // M2 exposed to sun
    
    @FederateParameter
    public double sghc = 0.89; // Solar Heat Gain Coefficient
    
    @FederateParameter
    public double hpbasepower = 1571.0; // heat pump power base consumption when running (will add temperature component)
    
    @FederateParameter
    public double solarconversionconstant = 1.0;
    
    @FederateParameter
    public double solarpaneleffectivearea=0;
    
    @FederateParameter
    public String zonename;
}
