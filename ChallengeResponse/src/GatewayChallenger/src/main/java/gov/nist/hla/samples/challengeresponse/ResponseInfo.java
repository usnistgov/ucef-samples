package gov.nist.hla.samples.challengeresponse;

import java.util.Objects;

/*
 * A simple data structure that stores a single response to a challenge.
 * 
 * Two responses are equivalent iff they refer to the same challenge id and come from the same responder.
 */
public class ResponseInfo {
    /*
     * The unique identifier of the associated challenge.
     */
    private final String id;
    
    /*
     * The response to the challenge.
     */
    private final String substring;
    
    /*
     * The federate that sent the response.
     */
    private final String responder;
    
    /*
     * The logical time when the response was received.
     */
    private final double responseTime;
    
    public ResponseInfo(String id, String substring, String responder, double responseTime) {
        this.id           = id;
        this.substring    = substring;
        this.responder    = responder;
        this.responseTime = responseTime;
    }
    
    public String getId() {
        return id;
    }
    
    public String getSubstring() {
        return substring;
    }
    
    public String getResponder() {
        return responder;
    }
    
    public double getResponseTime() {
        return responseTime;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, responder);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ResponseInfo)) {
            return false;
        }
        
        ResponseInfo response = (ResponseInfo) o;
        return Objects.equals(id, response.id) && Objects.equals(responder, response.responder);
    }
    
    @Override
    public String toString() {
        return getClass().getName()
                + "(id=" + id
                + ", substring=" + substring
                + ", responder=" + responder
                + ", responseTime=" + responseTime + ")";
    }
}
