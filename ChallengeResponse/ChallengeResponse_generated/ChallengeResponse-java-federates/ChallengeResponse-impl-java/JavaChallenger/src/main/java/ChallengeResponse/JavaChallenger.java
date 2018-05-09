package ChallengeResponse;

import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;

import java.util.concurrent.ThreadLocalRandom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JavaChallenger extends JavaChallengerBase {
    private final static Logger log = LogManager.getLogger();
    
    private final static String VALID_CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";
    
    private ObjectChallenge objectChallenge = new ObjectChallenge();
    
    private ResponseTracker responseTracker;
    
    private boolean exitCondition = false;
    
    private double currentTime = 0;
    
    private int sequenceNumber = 0;
    
    private int challengeLength;

    public JavaChallenger(Configuration params) throws Exception {
        super(params);
        
        if (params.challengeLength < 2) {
            throw new IllegalArgumentException("params.challengeLength must be at least 2");
        }
        objectChallenge.registerObject(getLRC());
        responseTracker = new ResponseTracker(params.numberOfResponders);
        challengeLength = params.challengeLength;
    }

    private void checkReceivedSubscriptions() {
        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof Response) {
                handleInteractionClass((Response) interaction);
            } else {
                log.warn("skipped interaction {}", interaction.getClassName());
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
        
        while (!exitCondition) {
            atr.requestSyncStart();
            enteredTimeGrantedState();
            log.debug("t={}", getCurrentTime());
            
            sendInteractionChallenge();
            sendObjectChallenge();
            
            checkReceivedSubscriptions();
            
            currentTime += super.getStepSize();
            AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
            putAdvanceTimeRequest(newATR);
            atr.requestSyncEnd();
            atr = newATR;
        }
        responseTracker.checkDelinquent(currentTime); // likely not called

        // while loop finished, notify FederationManager about resign
        super.notifyFederationOfResign();
    }

    private void handleInteractionClass(Response interaction) {
        log.trace("received interaction {}", interaction.toString());
        
        final String id = interaction.get_id();
        final String substring = interaction.get_substring();
        final String responder = interaction.get_originFed();
        
        final ResponseInfo response = new ResponseInfo(id, substring, responder, currentTime);
        log.debug("received response: {}", response.toString());
        responseTracker.markResponse(response);
    }
    
    private void sendInteractionChallenge() {
        final Challenge challenge = createChallenge();
        InteractionChallenge interaction = create_InteractionChallenge();
        interaction.set_id(challenge.getId());
        interaction.set_stringValue(challenge.getStringValue());
        interaction.set_beginIndex(challenge.getBeginIndex());
        interaction.sendInteraction(getLRC(), currentTime + getLookAhead());
        log.debug("sent interaction: {}", interaction.toString());
    }
    
    private void sendObjectChallenge() {
        final Challenge challenge = createChallenge();
        objectChallenge.set_id(challenge.getId());
        objectChallenge.set_stringValue(challenge.getStringValue());
        objectChallenge.set_beginIndex(challenge.getBeginIndex());
        objectChallenge.updateAttributeValues(getLRC(), currentTime + getLookAhead());
        log.debug("sent object update: {}", objectChallenge.toString());
    }
    
    private Challenge createChallenge() {
        final String id = getFederateId() + "#" + sequenceNumber;
        final String stringValue = generateStringValue();
        final int beginIndex = generateBeginIndex();
        final double expirationTime = currentTime + 2 * getStepSize();
        
        final Challenge challenge = new Challenge(id, stringValue, beginIndex, expirationTime);
        log.debug("generated challenge: {}", challenge.toString());
        
        responseTracker.markChallenge(challenge);
        sequenceNumber = sequenceNumber + 1;
        
        return challenge;
    }
    
    private String generateStringValue() {
        StringBuffer buffer = new StringBuffer(challengeLength);
        for (int i = 0; i < challengeLength; i++) {
            buffer.append(VALID_CHARACTERS.charAt(ThreadLocalRandom.current().nextInt(VALID_CHARACTERS.length())));
        }
        return buffer.toString();
    }
    
    private int generateBeginIndex() {
        return ThreadLocalRandom.current().nextInt(challengeLength-1);
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            Configuration federateConfig = federateConfigParser.parseArgs(args, Configuration.class);
            JavaChallenger federate = new JavaChallenger(federateConfig);
            federate.execute();
            log.info("Done.");
        } catch (Exception e) {
            log.error(e);
        }
    }
}
