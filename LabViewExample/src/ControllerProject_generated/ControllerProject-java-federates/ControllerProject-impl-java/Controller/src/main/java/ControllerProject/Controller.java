package ControllerProject;

import org.cpswt.config.FederateConfig;
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

    private void checkReceivedSubscriptions() {

        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof ZoneState) {
                handleObjectClass((ZoneState) object);
            }
            else if (object instanceof Setpoint) {
                handleObjectClass((Setpoint) object);
            }
            else {
                log.debug("unhandled object reflection: {}", object.getClassName());
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
            log.info("waiting on readyToPopulate...");
            readyToPopulate();
            log.info("...synchronized on readyToPopulate");
        }

        if(!super.isLateJoiner()) {
            log.info("waiting on readyToRun...");
            readyToRun();
            log.info("...synchronized on readyToRun");
        }

        startAdvanceTimeThread();
        log.info("started logical time progression");

        while (!exitCondition) {
            atr.requestSyncStart();
            enteredTimeGrantedState();

            // get the current info
            checkReceivedSubscriptions();

            // calculate damper state
            doThermostat();

            // send the current updated state
            controllerState.set_DamperPostionPct(damper);
            controllerState.set_ZoneName(configuration.zonename);
            controllerState.updateAttributeValues(getLRC(), currentTime + this.getLookAhead());
            log.info("t={} damper position at {}", currentTime, damper);

            if (!exitCondition) {
                currentTime += super.getStepSize();
                AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
                putAdvanceTimeRequest(newATR);
                atr.requestSyncEnd();
                atr = newATR;
            }
        }

        // call exitGracefully to shut down federate
        exitGracefully();
    }

    private void handleObjectClass(ZoneState object) {
        if (object.get_ZoneName().equals(configuration.zonename)) {
            overridden = object.get_CoolingOverride();
            Ti = object.get_IATemperature();
            log.info("t={} received indoor temperature {} for zone {}", currentTime, Ti, configuration.zonename);
        }
    }

    private void handleObjectClass(Setpoint object) {
        if (object.get_ZoneName().equals(configuration.zonename)) {
            Tsp = object.get_ZoneTempSP();
            log.info("t={} received temperature setpoint {} for zone {}", currentTime, Tsp, configuration.zonename);
        }
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            ControllerConfig federateConfig = federateConfigParser.parseArgs(args, ControllerConfig.class);
            Controller federate = new Controller(federateConfig);
            federate.execute();
            log.info("Done.");
            System.exit(0);
        } catch (Exception e) {
            log.error(e);
            System.exit(1);
        }
    }
}
