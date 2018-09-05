package gov.nist.hla.samples.challengeresponse;

import java.util.Objects;

public class Challenge {
    private final String id;
    
    private final String stringValue;
    
    private final int beginIndex;
    
    private final double expirationTime;
    
    private final String correctResponse;
    
    public Challenge(String id, String stringValue, int beginIndex, double expirationTime) {
        this.id              = id;
        this.stringValue     = stringValue;
        this.beginIndex      = beginIndex;
        this.expirationTime  = expirationTime;
        this.correctResponse = stringValue.substring(beginIndex);
    }
    
    public String getId() {
        return id;
    }
    
    public String getStringValue() {
        return stringValue;
    }
    
    public int getBeginIndex() {
        return beginIndex;
    }
    
    public double getExpirationTime() {
        return expirationTime;
    }
    
    public String getCorrectResponse() {
        return correctResponse;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Challenge)) {
            return false;
        }
        
        Challenge challenge = (Challenge) o;
        return Objects.equals(id, challenge.id);
    }
    
    @Override
    public String toString() {
        return getClass().getName()
                + "(id=" + id
                + ", stringValue=" + stringValue
                + ", beginIndex=" + beginIndex
                + ", expirationTime=" + expirationTime
                + ", correctResponse=" + correctResponse + ")";
    }
}
