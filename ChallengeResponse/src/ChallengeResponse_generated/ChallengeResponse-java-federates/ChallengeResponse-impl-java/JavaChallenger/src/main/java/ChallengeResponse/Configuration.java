package ChallengeResponse;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateParameter;

public class Configuration extends FederateConfig {
    @FederateParameter
    public int challengeLength;
    
    @FederateParameter
    public int numberOfResponders;
}
