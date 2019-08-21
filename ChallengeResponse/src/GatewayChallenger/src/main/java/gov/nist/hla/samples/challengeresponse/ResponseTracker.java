package gov.nist.hla.samples.challengeresponse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * This class tracks the generated challenges, and the responses received from other federates for each challenge.
 * 
 * When a new response is provided using the public methods, a series of checks are performed to check for correctness.
 * These checks are described in detail in the documentation for the markResponse method. If a single check fails, an
 * error will be output to the logger ERROR channel.
 * 
 * The expected number of responses per challenge must be provided to the constructor. This number cannot be changed
 * after construction. If a challenge receives more or less responses than expected, this class will flag an error.
 */
public class ResponseTracker {
    private final static Logger log = LogManager.getLogger();
    
    /*
     * An association from challenge identifier to the details of a challenge.
     */
    private Map<String, Challenge> challenges = new HashMap<String, Challenge>();
    
    /*
     * An association from a challenge to the set of responses received for that challenge.
     */
    private Map<Challenge, Set<String>> responses = new HashMap<Challenge, Set<String>>();

    /*
     * The set of challenges that have not expired, and still expect to receive responses.
     */
    private Set<String> challengesNotExpired = new HashSet<String>();

    /*
     * The expected number of responses per challenge.
     */
    private final int numberOfResponders;
    
    public ResponseTracker(int numberOfResponders) {
        if (numberOfResponders < 1) {
            throw new IllegalArgumentException("numberOfResponders must be positive nonzero");
        }
        this.numberOfResponders = numberOfResponders;
    }
    
    /*
     * Register a new challenge. A challenge must be registered with this method before processing its responses.
     */
    public void markChallenge(Challenge challenge) {
        if (challenges.containsKey(challenge.getId()) || responses.containsKey(challenge)) {
            throw new RuntimeException("duplicate challenge with id=" + challenge.getId());
        }
        challenges.put(challenge.getId(), challenge);
        challengesNotExpired.add(challenge.getId());
        responses.put(challenge, new HashSet<String>());
        log.trace("stored {}", challenge.toString());
    }
    
    /*
     * Check whether a response to an existing challenge is correct. An incorrect response will be output to the logger
     * on the ERROR channel. A response can be incorrect for any of the following reasons:
     * 
     * (a) The response refers to a challenge that was never registered with the markChallenge method,
     * (b) The response originated from a federate that has already responded to the associated challenge,
     * (c) The associated challenge has already received the expected number of responses,
     * (d) The associated challenge has already passed its expiration time, and
     * (e) The response is not the correct response for the associated challenge.
     */
    public void markResponse(ResponseInfo response) {
        log.trace("on response {}", response.toString());
        
        Challenge challenge = challenges.get(response.getId());
        if (challenge == null) {
            log.error("response for a non-existent challenge: {}", response.toString());
            return;
        }
        log.trace("using challenge {}", challenge.toString());
        
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
    
    /*
     * Update the set of expired challenges based on the given logical time. This method expires all challenges with an
     * expiration time less than or equal to the given time. When a challenge is expired, all future responses to that
     * challenge will be considered as incorrect and logged as errors. In addition, a challenge that expires prior to
     * receiving its expected number of responses will also be logged as an error. For correct behavior, this method
     * should only be invoked with non-decreasing time values.
     */
    public void checkDelinquent(double currentTime) {
        Set<String> expiredChallenges = new HashSet<String>();

        for (String challengeId : challengesNotExpired) {
            final Challenge challenge = challenges.get(challengeId);

            if (challenge.getExpirationTime() <= currentTime) {
                expiredChallenges.add(challengeId);
                // once a challenge has expired, it can no longer receive new responses
                // if a challenge expires with fewer responses than expected, someone failed to reply
                if (responses.get(challenge).size() < numberOfResponders) {
                    log.error("fewer responses to {} than expected: {}", challenge.toString(),
                            responses.get(challenge).toString());
                }
            }
        }
        challengesNotExpired.removeAll(expiredChallenges);
    }
}
