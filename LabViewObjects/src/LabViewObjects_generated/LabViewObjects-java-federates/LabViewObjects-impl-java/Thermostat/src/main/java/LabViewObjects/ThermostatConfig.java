package LabViewObjects;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateParameter;

public class ThermostatConfig extends FederateConfig {
	@FederateParameter
	public int zone;
	
	@FederateParameter
	public double occupiedSetPoint;
	
	@FederateParameter
	public double unoccupiedSetPoint;
}
