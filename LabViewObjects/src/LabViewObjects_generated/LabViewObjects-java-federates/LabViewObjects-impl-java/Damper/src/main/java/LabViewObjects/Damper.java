package LabViewObjects;

import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.ObjectRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Damper type of federate for the federation designed in WebGME.
 *
 */
public class Damper extends DamperBase {

    private final static Logger log = LogManager.getLogger(Damper.class);

    private double currentTime = 0;
    
    private final int zone;

    public Damper(DamperConfig params) throws Exception {
        super(params);
        zone = params.zone;
        log.info("Zone {} Damper", zone);
    }

    private void CheckReceivedSubscriptions(String s) {

        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof ControllerState) {
                handleObjectClass((ControllerState) object);
            }
            log.info("Object received and handled: " + s);
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

    private void handleObjectClass(ControllerState object) {
    	log.trace("received ControllerState {}", object.toString());
    	if (object.get_zone() == zone) {
    		log.info("t={} received zone {} damper position {}", currentTime, zone, object.get_damperPosition());
    	}
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            DamperConfig federateConfig = federateConfigParser.parseArgs(args, DamperConfig.class);
            Damper federate = new Damper(federateConfig);
            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the Damper federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
