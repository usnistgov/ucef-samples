package MapperEx;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The BankOfAmerica type of federate for the federation designed in WebGME.
 *
 */
public class BankOfAmerica extends BankOfAmericaBase {

    private final static Logger log = LogManager.getLogger(BankOfAmerica.class);

    double currentTime = 0;

    public BankOfAmerica(FederateConfig params) throws Exception {
        super(params);
    }

    private void CheckReceivedSubscriptions(String s) {

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof BadDebt) {
                handleInteractionClass((BadDebt) interaction);
            }
            else if (interaction instanceof EUDebtBAC) {
                handleInteractionClass((EUDebtBAC) interaction);
            }
            else if (interaction instanceof USMoneyGram) {
                handleInteractionClass((USMoneyGram) interaction);
            }
            else if (interaction instanceof Hello) {
                handleInteractionClass((Hello) interaction);
            }
            else if (interaction instanceof USTransferReceipt) {
                handleInteractionClass((USTransferReceipt) interaction);
            }
            else if (interaction instanceof FedRescue) {
                handleInteractionClass((FedRescue) interaction);
            }
            else if (interaction instanceof StandardAndPoorsAnalysis) {
                handleInteractionClass((StandardAndPoorsAnalysis) interaction);
            }
            else if (interaction instanceof MoodysAnalysis) {
                handleInteractionClass((MoodysAnalysis) interaction);
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
            //    EUDebtBAC vEUDebtBAC = create_EUDebtBAC();
            //    vEUDebtBAC.set_debtInBillionUSDs( < YOUR VALUE HERE > );
            //    vEUDebtBAC.sendInteraction(getLRC(), currentTime);
            //
            //    Hello vHello = create_Hello();
            //    vHello.sendInteraction(getLRC(), currentTime);
            //
            //    USTransferReceipt vUSTransferReceipt = create_USTransferReceipt();
            //    vUSTransferReceipt.set_id( < YOUR VALUE HERE > );
            //    vUSTransferReceipt.sendInteraction(getLRC(), currentTime);
            //
            //    CurrentAssetsInBillionUSDs vCurrentAssetsInBillionUSDs = create_CurrentAssetsInBillionUSDs();
            //    vCurrentAssetsInBillionUSDs.set_dollars( < YOUR VALUE HERE > );
            //    vCurrentAssetsInBillionUSDs.set_sender( < YOUR VALUE HERE > );
            //    vCurrentAssetsInBillionUSDs.sendInteraction(getLRC(), currentTime);
            //
            //    USMoneyGram vUSMoneyGram = create_USMoneyGram();
            //    vUSMoneyGram.set_dollars( < YOUR VALUE HERE > );
            //    vUSMoneyGram.set_id( < YOUR VALUE HERE > );
            //    vUSMoneyGram.set_receiver( < YOUR VALUE HERE > );
            //    vUSMoneyGram.set_sender( < YOUR VALUE HERE > );
            //    vUSMoneyGram.sendInteraction(getLRC(), currentTime);
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

    private void handleInteractionClass(EUDebtBAC interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(USMoneyGram interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(Hello interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(USTransferReceipt interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(FedRescue interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(StandardAndPoorsAnalysis interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleInteractionClass(MoodysAnalysis interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            BankOfAmerica federate = new BankOfAmerica(federateConfig);
            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the BankOfAmerica federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
