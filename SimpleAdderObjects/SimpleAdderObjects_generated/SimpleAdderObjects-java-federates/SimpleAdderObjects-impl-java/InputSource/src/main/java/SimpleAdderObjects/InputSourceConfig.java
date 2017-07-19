package SimpleAdderObjects;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateParameter;

public class InputSourceConfig extends FederateConfig {
	/*
	 * The number of operands to generate for the adder.
	 */
	@FederateParameter
	public int numOfInputs;
	
	/* 
	 * The maximum operand value the input source can generate.
	 */
	@FederateParameter
	public int maxValue;
}
