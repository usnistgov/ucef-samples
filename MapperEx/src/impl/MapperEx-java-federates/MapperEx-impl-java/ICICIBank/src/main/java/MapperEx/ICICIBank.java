package MapperEx;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The ICICIBank type of federate for the federation designed in WebGME.
 *
 */
public class ICICIBank extends ICICIBankBase {

    private final static Logger log = LogManager.getLogger(ICICIBank.class);

    double currentTime = 0;

    public ICICIBank(FederateConfig params) throws Exception {
        super(params);
    }

    private void CheckReceivedSubscriptions(String s) {

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof BadDebt) {
                handleInteractionClass((BadDebt) interaction);
            }
            else if (interaction instanceof Namaste) {
                handleInteractionClass((Namaste) interaction);
            }
            else if (interaction instanceof IndianTransferReceipt) {
                handleInteractionClass((IndianTransferReceipt) interaction);
            }
            else if (interaction instanceof IndianMoneyGram) {
                handleInteractionClass((IndianMoneyGram) interaction);
            }
            else if (interaction instanceof FedRescue) {
                handleInteractionClass((FedRescue) interaction);
            }
            else if (interaction instanceof MoodysAnalysis) {
                handleInteractionClass((MoodysAnalysis) interaction);
            }
            else if (interaction instanceof StandardAndPoorsAnalysis) {
                handleInteractionClass((StandardAndPoorsAnalysis) interaction);
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
            //    IndianTransferReceipt vIndianTransferReceipt = create_IndianTransferReceipt();
            //    vIndianTransferReceipt.set_id( < YOUR VALUE HERE > );
            //    vIndianTransferReceipt.sendInteraction(getLRC(), currentTime);
            //
            //    Namaste vNamaste = create_Namaste();
            //    vNamaste.sendInteraction(getLRC(), currentTime);
            //
            //    IndianMoneyGram vIndianMoneyGram = create_IndianMoneyGram();
            //    vIndianMoneyGram.set_id( < YOUR VALUE HERE > );
            //    vIndianMoneyGram.set_receiver( < YOUR VALUE HERE > );
            //    vIndianMoneyGram.set_rupees( < YOUR VALUE HERE > );
            //    vIndianMoneyGram.set_sender( < YOUR VALUE HERE > );
            //    vIndianMoneyGram.sendInteraction(getLRC(), currentTime);
            //
            //    CurrentAssetsInBillionUSDs vCurrentAssetsInBillionUSDs = create_CurrentAssetsInBillionUSDs();
            //    vCurrentAssetsInBillionUSDs.set_dollars( < YOUR VALUE HERE > );
            //    vCurrentAssetsInBillionUSDs.set_sender( < YOUR VALUE HERE > );
            //    vCurrentAssetsInBillionUSDs.sendInteraction(getLRC(), currentTime);
            //
            ////////////////////////////////////////////////////////////////////////////////////////

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

    private void handleInteractionClass(BadDebt interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(Namaste interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(IndianTransferReceipt interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(IndianMoneyGram interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(FedRescue interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(MoodysAnalysis interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(StandardAndPoorsAnalysis interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            ICICIBank federate = new ICICIBank(federateConfig);
            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the ICICIBank federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
