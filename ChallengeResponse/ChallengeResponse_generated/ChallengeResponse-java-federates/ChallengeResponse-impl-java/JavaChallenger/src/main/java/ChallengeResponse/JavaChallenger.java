package ChallengeResponse;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The JavaChallenger type of federate for the federation designed in WebGME.
 *
 */
public class JavaChallenger extends JavaChallengerBase {

    private final static Logger log = LogManager.getLogger(JavaChallenger.class);

    double currentTime = 0;

    ///////////////////////////////////////////////////////////////////////
    // TODO Instantiate objects that must be sent every logical time step
    //
    // ChallengeObject vChallengeObject = new ChallengeObject();
    //
    ///////////////////////////////////////////////////////////////////////

    public JavaChallenger(FederateConfig params) throws Exception {
        super(params);

        ///////////////////////////////////////////////////////////////////////
        // TODO Must register object instances after super(args)
        //
        // vChallengeObject.registerObject(getLRC());
        //
        ///////////////////////////////////////////////////////////////////////
    }

    private void CheckReceivedSubscriptions(String s) {

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof Response) {
                handleInteractionClass((Response) interaction);
            }
            log.info("Interaction received and handled: " + s);
        }
     }

    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        /////////////////////////////////////////////
        // TODO perform basic initialization below //
        /////////////////////////////////////////////

        AdvanceTimeRequest atr = new AdvanceTimeRequest(currentTime);
        putAdvanceTimeRequest(atr);

        if(!super.isLateJoiner()) {
            readyToPopulate();
        }

        ///////////////////////////////////////////////////////////////////////
        // Call CheckReceivedSubscriptions(<message>) here to receive
        // subscriptions published before the first time step.
        ///////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////
        // TODO perform initialization that depends on other federates below //
        ///////////////////////////////////////////////////////////////////////

        if(!super.isLateJoiner()) {
            readyToRun();
        }

        startAdvanceTimeThread();

        // this is the exit condition of the following while loop
        // it is used to break the loop so that latejoiner federates can
        // notify the federation manager that they left the federation
        boolean exitCondition = false;

        while (true) {
            currentTime += super.getStepSize();

            atr.requestSyncStart();
            enteredTimeGrantedState();

            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO send interactions that must be sent every logical time step below.
            // Set the interaction's parameters.
            //
            //    ChallengeInteraction vChallengeInteraction = create_ChallengeInteraction();
            //    vChallengeInteraction.set_integerValue( < YOUR VALUE HERE > );
            //    vChallengeInteraction.set_stringValue( < YOUR VALUE HERE > );
            //    vChallengeInteraction.sendInteraction(getLRC(), currentTime);
            //
            ////////////////////////////////////////////////////////////////////////////////////////

            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO objects that must be sent every logical time step
            //
            //    vChallengeObject.set_integerValue(<YOUR VALUE HERE >);
            //    vChallengeObject.set_stringValue(<YOUR VALUE HERE >);
            //    vChallengeObject.updateAttributeValues(getLRC(), currentTime);
            //
            //////////////////////////////////////////////////////////////////////////////////////////

            CheckReceivedSubscriptions("Main Loop");

            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            // DO NOT MODIFY FILE BEYOND THIS LINE
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
            putAdvanceTimeRequest(newATR);
            atr.requestSyncEnd();
            atr = newATR;

            if(exitCondition) {
                break;
            }
        }

        // while loop finished, notify FederationManager about resign
        super.notifyFederationOfResign();
    }

    private void handleInteractionClass(Response interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            JavaChallenger federate = new JavaChallenger(federateConfig);
            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the JavaChallenger federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
