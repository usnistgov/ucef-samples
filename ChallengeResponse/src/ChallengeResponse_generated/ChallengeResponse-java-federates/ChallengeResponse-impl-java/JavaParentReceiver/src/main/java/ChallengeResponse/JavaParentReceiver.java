package ChallengeResponse;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.ObjectRoot;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * This passive federate monitors the federation traffic to test HLA's automatic upcasting of interaction classes and
 * object classes.
 * 
 * The challenge-response object model has the challenge interaction class and the challenge object class derive from
 * parent classes. No federate directly publishes the parent classes, but this federate subscribes to both rather than
 * the child classes published at runtime. If the HLA automatic upcasting feature works, this federate should receive
 * one instance of the parent class for each challenge issued during the federation execution.
 * 
 * To verify that each challenge sent is upcasted and received, this class also subscribes to the response interaction.
 * Each time a parent class is received, the challenge id is stored. Each time a response is received, its associated
 * challenge is checked against the stored challenge ids. If this federate receives a response for a challenge that has
 * never been stored, then either the response is corrupt or the challenge was never upcasted to its parent class.
 */
public class JavaParentReceiver extends JavaParentReceiverBase {
    private final static Logger log = LogManager.getLogger();

    private double currentTime = 0;

    /*
     * A set of challenge ids received from the parent interaction and object classes.
     */
    private Set<String> knownId = new HashSet<String>();

    public JavaParentReceiver(FederateConfig params) throws Exception {
        super(params);
    }

    private void checkReceivedSubscriptions() {
        log.debug("in checkReceivedSubscriptions");

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof Response) {
                handleInteractionClass((Response) interaction);
            }
            else if (interaction instanceof ParentInteraction) {
                handleInteractionClass((ParentInteraction) interaction);
            }
            else {
                log.warn("unhandled interaction: {}", interaction.getClassName());
            }
        }
 
        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof ParentObject) {
                handleObjectClass((ParentObject) object);
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
     * Handle the response interaction. If the challenge id in the response has not been stored, then either the
     * response is corrupt or a previous challenge failed to get upcasted into a class subscribed to by this federate.
     * Both cases are treated the same and output as a simple error message. To distinguish between the two cases, the
     * output of the challenger federates would have to be inspected to see if the response was considered corrupt.
     */
    private void handleInteractionClass(Response interaction) {
        log.debug("received interaction {}", interaction.getClassName());
        final String id = interaction.get_challengeId();
        
        if (knownId.contains(id)) {
            log.trace("known id {}", id);
        } else {
            log.error("unknown id {}", id);
        }
    }

    /*
     * Handle a parent interaction by storing its challenge id.
     */
    private void handleInteractionClass(ParentInteraction interaction) {
        log.debug("received interaction {}", interaction.getClassName());
        addId(interaction.get_challengeId());
    }

    /*
     * Handle a parent object by storing its challenge id.
     */
    private void handleObjectClass(ParentObject object) {
        log.debug("received object {}", object.getClassName());
        addId(object.get_challengeId());
    }

    /*
     * Store a new challenge id. If this id has already been stored, output an error message.
     */
    private void addId(String id) {
        if (knownId.add(id)) {
            log.debug("stored id {}", id);
        } else {
            log.error("duplicate id {}", id);
        }
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            JavaParentReceiver federate = new JavaParentReceiver(federateConfig);
            federate.execute();
            log.info("Done.");
            System.exit(0);
        } catch (Exception e) {
            log.error(e);
            System.exit(1);
        }
    }
}
