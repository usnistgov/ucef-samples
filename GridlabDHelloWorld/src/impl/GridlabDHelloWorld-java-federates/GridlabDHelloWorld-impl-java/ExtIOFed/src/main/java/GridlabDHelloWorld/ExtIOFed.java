package GridlabDHelloWorld;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The ExtIOFed type of federate for the federation designed in WebGME.
 *
 */
public class ExtIOFed extends ExtIOFedBase {

    private final static Logger log = LogManager.getLogger(ExtIOFed.class);

    double currentTime = 0;

    public ExtIOFed(FederateConfig params) throws Exception {
        super(params);
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

        int ix = 0;
        while (true) {
            //currentTime += super.getStepSize();

            GridlabDInput gridlabDInput = create_GridlabDInput();
            String objectName = "house1";
            String parameterName = "power";
            int operation = 0;
            String units = "";
            gridlabDInput.set_ObjectName(objectName);
            gridlabDInput.set_Parameter(parameterName);
            gridlabDInput.set_Operation(operation);
            gridlabDInput.set_Units(units);
            gridlabDInput.set_Value(0.0);
            
        

            atr.requestSyncStart();
            enteredTimeGrantedState();

            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO send interactions that must be sent every logical time step below.
            // Set the interaction's parameters.
            //
            //    GridlabDInput vGridlabDInput = create_GridlabDInput();
            //    vGridlabDInput.set_ModelName( < YOUR VALUE HERE > );
            //    vGridlabDInput.set_ObjectName( < YOUR VALUE HERE > );
            //    vGridlabDInput.set_Operation( < YOUR VALUE HERE > );
            //    vGridlabDInput.set_Parameter( < YOUR VALUE HERE > );
            //    vGridlabDInput.set_Units( < YOUR VALUE HERE > );
            //    vGridlabDInput.set_Value( < YOUR VALUE HERE > );
            //    vGridlabDInput.sendInteraction(getLRC(), currentTime);
            //
            //    GridlabDControl vGridlabDControl = create_GridlabDControl();
            //    vGridlabDControl.set_IsControl( < YOUR VALUE HERE > );
            //    vGridlabDControl.set_ModelName( < YOUR VALUE HERE > );
            //    vGridlabDControl.set_ObjectName( < YOUR VALUE HERE > );
            //    vGridlabDControl.set_Operation( < YOUR VALUE HERE > );
            //    vGridlabDControl.set_Parameter( < YOUR VALUE HERE > );
            //    vGridlabDControl.set_Period( < YOUR VALUE HERE > );
            //    vGridlabDControl.set_Units( < YOUR VALUE HERE > );
            //    vGridlabDControl.set_Value( < YOUR VALUE HERE > );
            //    vGridlabDControl.sendInteraction(getLRC(), currentTime);
            //
            ////////////////////////////////////////////////////////////////////////////////////////
            System.out.println( "ExtIOFed: Sending GridlabDInput interaction #" + ix );
            gridlabDInput.sendInteraction( super.getLRC(), currentTime + 2.0 );
            
            currentTime += 20;
            ++ix;

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

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            ExtIOFed federate = new ExtIOFed(federateConfig);
            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the ExtIOFed federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
