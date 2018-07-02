package LabViewObjects;

import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Thermostat type of federate for the federation designed in WebGME.
 *
 */
public class Thermostat extends ThermostatBase {
    private final static Logger log = LogManager.getLogger(Thermostat.class);

    private double currentTime = 0;
    
    private final int zone;
    
    private final double occupiedSetPoint;
    
    private final double unoccupiedSetPoint;
    
    private ControllerSetPoint setPoint = new ControllerSetPoint();

    public Thermostat(ThermostatConfig params) throws Exception {
        super(params);
        zone = params.zone;
        log.info("Zone {} Thermostat", zone);
        occupiedSetPoint = params.occupiedSetPoint;
        unoccupiedSetPoint = params.unoccupiedSetPoint;
        setPoint.registerObject(getLRC(), "ControllerSetPoint-Zone" + zone);
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
            atr.requestSyncStart();
            enteredTimeGrantedState();
            
            boolean isOccupied = isOccupied(currentTime);
            double temperatureSetPoint = (isOccupied ? occupiedSetPoint : unoccupiedSetPoint);
            
            setPoint.set_zone(zone);
            setPoint.set_isOccupied(isOccupied);
            setPoint.set_temperatureSetPoint(temperatureSetPoint);
            setPoint.updateAttributeValues(getLRC(), currentTime + getLookAhead());

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
    
    private boolean isOccupied(double logicalTime) {
    	int hour = ((int)logicalTime) % 24;
    	return (hour >= 9 && hour <= 17);
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            ThermostatConfig federateConfig = federateConfigParser.parseArgs(args, ThermostatConfig.class);
            Thermostat federate = new Thermostat(federateConfig);
            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the Thermostat federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
