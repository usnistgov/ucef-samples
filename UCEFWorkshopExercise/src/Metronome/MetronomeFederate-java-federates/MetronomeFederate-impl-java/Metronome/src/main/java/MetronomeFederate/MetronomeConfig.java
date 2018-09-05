package MetronomeFederate;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateParameter;

public class MetronomeConfig extends FederateConfig {
	@FederateParameter
	public double starttime;
	
	@FederateParameter
	public double stoptime;
	
	@FederateParameter
	public double logicaltimesec;
	
	@FederateParameter
	public double ignoretil;
}
