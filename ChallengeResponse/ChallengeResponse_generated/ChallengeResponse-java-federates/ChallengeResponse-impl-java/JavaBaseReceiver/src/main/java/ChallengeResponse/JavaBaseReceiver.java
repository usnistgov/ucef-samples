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

/**
 * The JavaBaseReceiver type of federate for the federation designed in WebGME.
 *
 */
public class JavaBaseReceiver extends JavaBaseReceiverBase {
    private final static Logger log = LogManager.getLogger();

    private double currentTime = 0;
    
    private boolean exitCondition = false;
    
    private Set<String> knownId = new HashSet<String>();

    public JavaBaseReceiver(FederateConfig params) throws Exception {
        super(params);
    }

    private void CheckReceivedSubscriptions() {
        log.debug("in CheckReceivedSubscriptions");

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof Response) {
                handleInteractionClass((Response) interaction);
            }
            else if (interaction instanceof InteractionBase) {
                handleInteractionClass((InteractionBase) interaction);
            }
            else {
                log.warn("unhandled interaction: {}", interaction.getClassName());
            }
        }
 
        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof ObjectBase) {
                handleObjectClass((ObjectBase) object);
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

            CheckReceivedSubscriptions();

            currentTime += super.getStepSize();
            AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
            putAdvanceTimeRequest(newATR);
            atr.requestSyncEnd();
            atr = newATR;
        }

        // while loop finished, notify FederationManager about resign
        super.notifyFederationOfResign();
    }

    private void handleInteractionClass(InteractionBase interaction) {
        log.debug("received interaction {}", interaction.getClassName());
        addId(interaction.get_id());
    }

    private void handleInteractionClass(Response interaction) {
        log.debug("received interaction {}", interaction.getClassName());
        final String id = interaction.get_id();
        
        if (knownId.contains(id)) {
            log.trace("known id {}", id);
        } else {
            log.error("unknown id {}", id);
        }
    }

    private void handleObjectClass(ObjectBase object) {
        log.debug("received object {}", object.getClassName());
        addId(object.get_id());
    }
    
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
            JavaBaseReceiver federate = new JavaBaseReceiver(federateConfig);
            federate.execute();
            log.info("Done.");
        } catch (Exception e) {
            log.error(e);
        }
    }
}
