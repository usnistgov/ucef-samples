package gov.nist.hla.samples.challengeresponse;

import gov.nist.hla.gateway.GatewayFederateConfig;
import gov.nist.hla.gateway.exception.ValueNotSet;

public class ChallengerConfiguration extends GatewayFederateConfig {
    private int challengeLength = 32;
    
    private int numberOfResponders;
    private boolean numberOfRespondersSet = false;
    
    public void setChallengeLength(int length) {
        if (length < 2) {
            throw new IllegalArgumentException("challengeLength must be at least 2");
        }
        this.challengeLength = length;
    }
    
    public int getChallengeLength() {
        return challengeLength;
    }
    
    public void setNumberOfResponders(int count) {
        if (count < 1) {
            throw new IllegalArgumentException("numberOfResponders must be at least 1");
        }
        this.numberOfResponders = count;
        this.numberOfRespondersSet = true;
    }
    
    public int getNumberOfResponders() {
        if (!numberOfRespondersSet) {
            throw new ValueNotSet("numberOfResponders");
        }
        return numberOfResponders;
    }
}
