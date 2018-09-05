package Controller;

import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.ObjectRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Controller type of federate for the federation designed in WebGME.
 *
 */
public class Controller extends ControllerBase {
    private final static Logger log = LogManager.getLogger();

    private double currentTime = 0;
    
    private ControllerConfig configuration;
    
    double Ti=25.0; //indoor temperature
    double Tsp=25.0; // temperature setpoint
    double del=1.0; // hysteresis
    int damper=100; // damper position 0 = closed, 100 = %open
    boolean overridden = false;
    
    ControllerState controllerState = new ControllerState();

    public Controller(ControllerConfig params) throws Exception {
        super(params);
        configuration = params;
        controllerState.registerObject(getLRC());
        log.info("Controller configured for zone {}", configuration.zonename);
    }
    
    public void doThermostat() {
        // if overriden, force 100%
        if (overridden == true) {
            damper = 100;
        }
        else {
            if (Ti >= Tsp + del) {
                damper = 100;
            } else if (Ti <= Tsp - del) {
                damper = 0;
            }
        }
    }

    private void CheckReceivedSubscriptions(String s) {
        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof Setpoint) {
                handleObjectClass((Setpoint) object);
            }
            else if (object instanceof ZoneState) {
                handleObjectClass((ZoneState) object);
            }
        }
    }

    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }
        
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
            atr.requestSyncStart();
            enteredTimeGrantedState();

            // get the current info
            CheckReceivedSubscriptions("Main Loop");
            
            //calculate damper state
            doThermostat();

            // send the current updated state
            controllerState.set_DamperPostionPct(damper);
            controllerState.set_ZoneName(configuration.zonename);
            controllerState.updateAttributeValues(getLRC(), currentTime + this.getLookAhead());
            log.info("t={} damper position at {}", currentTime, damper);

            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            // DO NOT MODIFY FILE BEYOND THIS LINE
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            currentTime += super.getStepSize();
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

    private void handleObjectClass(Setpoint object) {
        if (object.get_ZoneName().equals(configuration.zonename)) {
            Tsp = object.get_ZoneTempSP();
            log.info("t={} received temperature setpoint {} for zone {}", currentTime, Tsp, configuration.zonename);
        }
    }

    private void handleObjectClass(ZoneState object) {
        if (object.get_ZoneName().equals(configuration.zonename)) {
            overridden = object.get_CoolingOverride();
            Ti = object.get_IATemperature();
            log.info("t={} received indoor temperature {} for zone {}", currentTime, Ti, configuration.zonename);
        }
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            ControllerConfig federateConfig = federateConfigParser.parseArgs(args, ControllerConfig.class);
            Controller federate = new Controller(federateConfig);
            federate.execute();
            log.info("Done.");
        } catch (Exception e) {
            log.error("There was a problem executing the Controller federate.", e);
        }
    }
}
