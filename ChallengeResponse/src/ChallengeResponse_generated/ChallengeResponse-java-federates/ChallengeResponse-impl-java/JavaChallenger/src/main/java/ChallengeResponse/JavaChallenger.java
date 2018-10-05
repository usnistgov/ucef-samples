package ChallengeResponse;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;

import java.util.concurrent.ThreadLocalRandom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * This class broadcasts challenges to the federation, and tests if the responses to those challenges are correct.
 *
 * A challenge is a randomly generated string paired with an integer index of one of the elements. A correct response
 * for a given challenge is the substring that starts from the challenge index. To generate the correct response, a
 * federate must understand both the string and numeric data in the challenge.
 *
 * This class generates two challenges each logical time step. One challenge is sent as an interaction, and the other
 * challenge is sent as an update to one registered object instance. The content of the two challenges are different.
 *
 * A response to a challenge is not immediate as both the challenge and its response are TSO messages. Each challenge
 * has an associated timeout, and failure to receive a correct response before the timeout expires is flagged as an
 * error. All failed challenges are output to the logger ERROR channel.
 *
 * When this federate terminates, there will be several outstanding challenges due to the delay before each response.
 * All of these challenges are discarded, and none of them are flagged as errors.
 */
public class JavaChallenger extends JavaChallengerBase {
    private final static Logger log = LogManager.getLogger();

    /*
     * The set of characters used to generate the challenge string.
     */
    private final static String VALID_CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";

    /*
     * The object instance used for the challenge sent via object updates.
     */
    private ChallengeObject objectChallenge = new ChallengeObject();

    /*
     * A helper class that tracks challenges, timeouts, and correct responses.
     */
    private ResponseTracker responseTracker;

    /*
     * The current logical time managed by the WebGME generated code.
     */
    private double currentTime = 0;

    /*
     * An increasing integer used to generate an id for each challenge.
     */
    private int sequenceNumber = 0;

    /*
     * The number of characters in the challenge string.
     */
    private int challengeLength;

    public JavaChallenger(Configuration params) throws Exception {
        super(params);
        
        objectChallenge.registerObject(getLRC());
        responseTracker = new ResponseTracker(params.numberOfResponders);
        
        if (params.challengeLength < 2) {
            throw new IllegalArgumentException("params.challengeLength must be at least 2");
        }
        challengeLength = params.challengeLength;
    }

    private void checkReceivedSubscriptions() {
        log.debug("in checkReceivedSubscriptions");

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof Response) {
                handleInteractionClass((Response) interaction);
            }
            else {
                log.warn("unhandled interaction: {}", interaction.getClassName());
            }
        }
    }

    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            log.info("turning off time regulation (late joiner)");
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        AdvanceTimeRequest atr = new AdvanceTimeRequest(currentTime);
        putAdvanceTimeRequest(atr);

        if(!super.isLateJoiner()) {
            log.info("waiting on readyToPopulate");
            readyToPopulate();
        }

        if(!super.isLateJoiner()) {
            log.info("waiting on readyToRun");
            readyToRun();
        }

        startAdvanceTimeThread();
        log.info("started logical time progression");

        // one iteration of the while loop is one time step
        // each time step sends two challenges, handles responses, and checks for timeouts
        while (!exitCondition) {
            atr.requestSyncStart();
            enteredTimeGrantedState();
            log.debug("t={}", getCurrentTime());

            sendChallengeInteraction();
            sendChallengeObject();

            checkReceivedSubscriptions();
            responseTracker.checkDelinquent(currentTime);

            if (!exitCondition) {
                currentTime += super.getStepSize();
                AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
                putAdvanceTimeRequest(newATR);
                atr.requestSyncEnd();
                atr = newATR;
            }
        }
        responseTracker.checkDelinquent(currentTime);

        exitGracefully();
    }

    /*
     * This method handles responses to the challenges. A response can be for challenges sent using either interactions
     * or registered object instances. If there are multiple federates that send challenges, the responses for all the
     * federates will pass through this method.
     */
    private void handleInteractionClass(Response interaction) {
        log.trace("received interaction {}", interaction.toString());
        
        final String id = interaction.get_challengeId();
        final String substring = interaction.get_substring();
        final String responder = interaction.get_originFed();
        
        if (id.startsWith(getFederateId())) { // only react to challenges issued by this federate
            final ResponseInfo response = new ResponseInfo(id, substring, responder, currentTime);
            log.debug("received response: {}", response.toString());
            responseTracker.markResponse(response);
        }
    }

    /*
     * This method creates and sends an interaction that contains a new challenge.
     */
    private void sendChallengeInteraction() {
        final Challenge challenge = createChallenge();
        ChallengeInteraction interaction = create_ChallengeInteraction();
        interaction.set_challengeId(challenge.getId());
        interaction.set_stringValue(challenge.getStringValue());
        interaction.set_beginIndex(challenge.getBeginIndex());
        interaction.sendInteraction(getLRC(), currentTime + getLookAhead());
        log.debug("sent interaction: {}", interaction.toString());
    }
    
    /*
     * This method updates the registered object instance for the next challenge.
     */
    private void sendChallengeObject() {
        final Challenge challenge = createChallenge();
        objectChallenge.set_challengeId(challenge.getId());
        objectChallenge.set_stringValue(challenge.getStringValue());
        objectChallenge.set_beginIndex(challenge.getBeginIndex());
        objectChallenge.updateAttributeValues(getLRC(), currentTime + getLookAhead());
        log.debug("sent object update: {}", objectChallenge.toString());
    }
    
    /*
     * This method returns a new random challenge. As part of the creation process, the challenge sequence number will
     * be incremented and the new challenge will be registered with the response tracker. The returned challenge must
     * be sent to the federation during the same time step as this method call. Otherwise, the response tracker will
     * report multiple errors when no responses are received before its internal timeout.
     */
    private Challenge createChallenge() {
        final String id = getFederateId() + "#" + sequenceNumber;
        final String stringValue = generateStringValue();
        final int beginIndex = generateBeginIndex();
        // it takes 1 step for the other federates to receive the challenge, and 1 more step to receive the response
        // NOTE this assumes all federates in the federation use the same logical step size and may not work otherwise
        final double expirationTime = currentTime + 2 * getStepSize();
        
        final Challenge challenge = new Challenge(id, stringValue, beginIndex, expirationTime);
        log.debug("generated challenge: {}", challenge.toString());
        
        responseTracker.markChallenge(challenge);
        sequenceNumber = sequenceNumber + 1;
        
        return challenge;
    }
    
    /*
     * Generate and return a random challenge string.
     */
    private String generateStringValue() {
        StringBuffer buffer = new StringBuffer(challengeLength);
        for (int i = 0; i < challengeLength; i++) {
            buffer.append(VALID_CHARACTERS.charAt(ThreadLocalRandom.current().nextInt(VALID_CHARACTERS.length())));
        }
        return buffer.toString();
    }
    
    /*
     * Generate and return an index into the challenge string. This index will be in the range [1,challengeLength-1].
     * The first element is excluded so that the correct response is never equivalent to the challenge string.
     */
    private int generateBeginIndex() {
        return ThreadLocalRandom.current().nextInt(challengeLength-1) + 1;
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            Configuration federateConfig = federateConfigParser.parseArgs(args, Configuration.class);
            JavaChallenger federate = new JavaChallenger(federateConfig);
            federate.execute();
            log.info("Done.");
            System.exit(0);
        } catch (Exception e) {
            log.error(e);
            System.exit(1);
        }
    }
}
