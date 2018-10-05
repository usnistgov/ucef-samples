package ChallengeResponse;

import java.util.Objects;

/*
 * A simple data structure that stores variables associated with a single challenge. A challenge is a (string,index)
 * pair where the index refers to an element in the string. The expected response to a challenge is the substring of
 * the string that starts from the index.
 * 
 * Two challenges are equivalent iff they share an id.
 */
public class Challenge {
    /*
     * A unique identifier for the challenge.
     */
    private final String id;
    
    /*
     * The string content of the challenge.
     */
    private final String stringValue;
    
    /*
     * An index of the string value.
     */
    private final int beginIndex;
    
    /*
     * The logical time after which the challenge is no longer relevant.
     */
    private final double expirationTime;
    
    /*
     * The expected substring that should be provided as a response to the challenge.
     */
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
