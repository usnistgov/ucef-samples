package ChallengeResponse;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.ObjectRoot;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * This class broadcasts response interactions to the federation each time it receives a challenge.
 *
 * A challenge is a randomly generated string paired with an integer index of one of the elements. A correct response
 * for a given challenge is the substring that starts from the challenge index. To generate the correct response, a
 * federate must understand both the string and numeric data in the challenge.
 *
 * This class generates and sends a response to challenges received as either as an interaction or an object update. It
 * is stateless, and will generate one response per received challenge.
 */
public class JavaResponder extends JavaResponderBase {
    private final static Logger log = LogManager.getLogger();

    private double currentTime = 0;

    public JavaResponder(FederateConfig params) throws Exception {
        super(params);
    }

    private void checkReceivedSubscriptions() {
        log.debug("in checkReceivedSubscriptions");

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof ChallengeInteraction) {
                handleInteractionClass((ChallengeInteraction) interaction);
            }
            else {
                log.warn("unhandled interaction: {}", interaction.getClassName());
            }
        }
 
        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof ChallengeObject) {
                handleObjectClass((ChallengeObject) object);
            }
            else {
                log.warn("unhandled object reflection: {}", object.getClassName());
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

            if (!exitCondition) {
                currentTime += super.getStepSize();
                AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
                putAdvanceTimeRequest(newATR);
                atr.requestSyncEnd();
                atr = newATR;
            }
        }
        exitGracefully();
    }

    /*
     * Handle and respond to challenges sent as interactions.
     */
    private void handleInteractionClass(ChallengeInteraction interaction) {
        log.debug("received interaction: {}", interaction.toString());
        respond(interaction.get_challengeId(), interaction.get_stringValue(), interaction.get_beginIndex());
    }

    /*
     * Handle and respond to challenges sent as object updates.
     */
    private void handleObjectClass(ChallengeObject object) {
        log.debug("received object reflection: {}", object.toString());
        respond(object.get_challengeId(), object.get_stringValue(), object.get_beginIndex());
    }

    /*
     * Send a response interaction for the given challenge. The response content will be set to the substring of the
     * given string starting from the given index.
     */
    private void respond(String id, String stringValue, int beginIndex) {
        log.info("on challenge: {} {} {}", id, stringValue, beginIndex);
        
        try {
            Response response = create_Response();
            response.set_challengeId(id);
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
            log.info("Done.");
            System.exit(0);
        } catch (Exception e) {
            log.error(e);
            System.exit(1);
        }
    }
}
