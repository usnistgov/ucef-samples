package UtilityFederate;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateParameter;

public class UtilityConfig extends FederateConfig {
	@FederateParameter
	public int maxHouses = 50;	// maximum houses supported
	
	@FederateParameter
	public double pricebulk = 0.07;	// price per kwh bulk power
	
	@FederateParameter
	public double pricesolar = 0.0;	// price for solar per kwh
	
	@FederateParameter
	public double pricefixed = 0.04;	// fixed capital costs per kwh
	
	@FederateParameter
	public double solarpowerperdirectsolar=1000.0;	// solar energy produced based on direct insolation
}
