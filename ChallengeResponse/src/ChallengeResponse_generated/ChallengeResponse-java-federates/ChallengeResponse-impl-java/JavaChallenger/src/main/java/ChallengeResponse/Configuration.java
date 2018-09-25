package ChallengeResponse;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateParameter;

/*
 * A custom configuration file for the challenger federate.
 */
public class Configuration extends FederateConfig {
    /*
     * The number of characters to generate for the challenge string.
     */
    @FederateParameter
    public int challengeLength;
    
    /*
     * The number of responses that should be received for each challenge.
     */
    @FederateParameter
    public int numberOfResponders;
}
