package ChallengeResponse;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.ObjectRoot;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JavaResponder extends JavaResponderBase {
    private final static Logger log = LogManager.getLogger();

    private boolean exitCondition = false;
    
    private double currentTime = 0;

    public JavaResponder(FederateConfig params) throws Exception {
        super(params);
    }

    private void checkReceivedSubscriptions() {
        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof InteractionChallenge) {
                handleInteractionClass((InteractionChallenge) interaction);
            } else {
                log.warn("skipped interaction {}", interaction.getClassName());
            }
        }
 
        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof ObjectChallenge) {
                handleObjectClass((ObjectChallenge) object);
            } else {
                log.warn("skipped object {}", object.getClassName());
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
            
            checkReceivedSubscriptions();

            currentTime += super.getStepSize();
            AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
            putAdvanceTimeRequest(newATR);
            atr.requestSyncEnd();
            atr = newATR;
        }

        // while loop finished, notify FederationManager about resign
        super.notifyFederationOfResign();
    }

    private void handleInteractionClass(InteractionChallenge interaction) {
        log.debug("received interaction: {}", interaction.toString());
        respond(interaction.get_id(), interaction.get_stringValue(), interaction.get_beginIndex());
    }

    private void handleObjectClass(ObjectChallenge object) {
        log.debug("received object reflection: {}", object.toString());
        respond(object.get_id(), object.get_stringValue(), object.get_beginIndex());
    }
    
    private void respond(String id, String stringValue, int beginIndex) {
        log.info("on challenge: {} {} {}", id, stringValue, beginIndex);
        
        try {
            Response response = create_Response();
            response.set_id(id);
            response.set_substring(stringValue.substring(beginIndex));
            response.sendInteraction(getLRC(), currentTime + getLookAhead());
            log.info("sent response {}", response.toString());
        } catch (Exception e) {
            log.error("failed to send response", e);
        }
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            JavaResponder federate = new JavaResponder(federateConfig);
            federate.execute();
            log.info("Done");
        } catch (Exception e) {
            log.error(e);
        }
    }
}
