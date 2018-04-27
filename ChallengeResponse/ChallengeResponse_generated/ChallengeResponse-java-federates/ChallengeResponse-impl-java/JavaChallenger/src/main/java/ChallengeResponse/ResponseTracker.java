package ChallengeResponse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResponseTracker {
    private final static Logger log = LogManager.getLogger();
    
    private Map<String, Challenge> challenges = new HashMap<String, Challenge>();
    
    private Map<Challenge, Set<String>> responses = new HashMap<Challenge, Set<String>>();
    
    private final int numberOfResponders;
    
    public ResponseTracker(int numberOfResponders) {
        this.numberOfResponders = numberOfResponders;
    }
    
    public void markChallenge(Challenge challenge) {
        if (challenges.containsKey(challenge.getId()) || responses.containsKey(challenge)) {
            throw new RuntimeException("duplicate challenge with id=" + challenge.getId());
        }
        challenges.put(challenge.getId(), challenge);
        responses.put(challenge, new HashSet<String>());
        log.debug("stored {}", challenge.toString());
    }
    
    public void markResponse(ResponseInfo response) {
        log.debug("on response {}", response.toString());
        
        Challenge challenge = challenges.get(response.getId());
        if (challenge == null) {
            log.error("response for a non-existent challenge: {}", response.toString());
            return;
        }
        log.debug("using challenge {}", challenge.toString());
        
        Set<String> responderSet = responses.get(challenge);
        if (responderSet.contains(response.getResponder())) {
            log.error("multiple responses to {} from {}", challenge.getId(), response.getResponder());
            return;
        }
        log.trace("responses from {}", responderSet.toString());
        
        responderSet.add(response.getResponder());
        if (responderSet.size() > numberOfResponders) {
            log.error("more responses to {} than expected: {}", challenge.getId(), responderSet.toString());
        }
        
        if (response.getResponseTime() > challenge.getExpirationTime()) {
            log.error("late response to {} from {}", challenge.getId(), response.getResponder());
        }
        
        if (!challenge.getCorrectResponse().equals(response.getSubstring())) {
            log.error("bad response to {} from {}", challenge.getId(), response.getResponder());
        }
    }
    
    public void checkDelinquent(double endTime) {
        for (Map.Entry<Challenge, Set<String>> entry : responses.entrySet()) {
            final Challenge challenge = entry.getKey();
            final Set<String> responderSet = entry.getValue();
            if (responderSet.size() < numberOfResponders && challenge.getExpirationTime() < endTime) {
                log.error("fewer responses to {} than expected: {}", challenge.toString(), responderSet.toString());
            }
        }
    }
}
