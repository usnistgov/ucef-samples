package ZoneProject;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.ObjectRoot;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Zone type of federate for the federation designed in WebGME.
 *
 */
public class Zone extends ZoneBase {
    private final static Logger log = LogManager.getLogger();

    private double currentTime = 0;

    private ZoneConfig configuration;

    /////////////////////////////////////////////
    // variables needed in the simulation
    /////////////////////////////////////////////
    // from the weather
    private double To = 25.0; // outdoor temperature
    private double SolarInsolation=0.0; // direct solar irradiance

    private double Qfixedload = 0.0; // constant fixed load
    private double Ti = 21.0; // indoor temperature 'C
    private double Tsp = 20.0; // temperature setpoint 'C
    private double del = 0.5; // thermostat algorithm hysteresis 'C
    private boolean heatpumprunning = false; // is heatpump running

    private double Qh = 0.0; // Total heat load on house – Heatpump, plug loads, occupants, …
    private double Qhp = 0.0; // Heat pump energy consumption
    private double Qsolar = 0.0;    // solar heat gain
    private double Qout = 0.0;  // Heat flux due to outdoor temperature plus Heat Pump action

    private double Php = 0; // power consumed by heatpump
    private double Psolar = 0; // power produced by solar cells
    private double Pfixedload = 0; // power consumped by plug loads
    private double Ph = 0; // power consumed (produced) by house
    
    // %%%% 20180318 MJB need to get logicalTimeSec from simtime
    public double logicalTimeSec=12; // units of logical time
    
    ZoneState zoneState = new ZoneState();

    public Zone(ZoneConfig params) throws Exception {
        super(params);
        configuration = params;
        zoneState.registerObject(getLRC());
        log.info("Starting as zone {}", configuration.zonename);
    }

    public void computeZoneLoad() {
        // Heat pump capacity equation in W for cooling season (note: converted to farenheit in this equation)
        if (heatpumprunning) {
            Php = 7.1204*(To*9.0/5.0+32.0) + configuration.hpbasepower; // power consumed by heatpump W
            Qhp = -(323.24 * (To*9.0/5.0+32.0) + 10576.0) / 3.412141633; // Heat pumped by heatpump W 
        } else {
            Php = 0; // W
            Qhp = 0;
        }
        
        // Compute Solar Contribution
        Qsolar = SolarInsolation * configuration.houseeffectivearea * configuration.sghc; // heat gain
        Psolar = - SolarInsolation * configuration.solarconversionconstant * configuration.solarpaneleffectivearea ;    // power out
    
        // total energy consumed by house
        Ph =  Php + Psolar + Pfixedload;
        // total thermal energy flux for the house
        Qh = Qhp + Qsolar + Qfixedload;
    }

    // Compute the new indoor temperature for this time step
    public void computeZoneTemperature() {
        Ti = To + Qh/configuration.uae + (Ti-To - Qh/configuration.uae) * Math.exp(-logicalTimeSec/configuration.tau);
    }

    private void checkReceivedSubscriptions() {

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof TMYWeather) {
                handleInteractionClass((TMYWeather) interaction);
            }
            else if (interaction instanceof Supply) {
                handleInteractionClass((Supply) interaction);
            }
            else {
                log.debug("unhandled interaction: {}", interaction.getClassName());
            }
        }
 
        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof ControllerState) {
                handleObjectClass((ControllerState) object);
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

            zoneState.set_CoolingOverride(false);
            zoneState.set_IATemperature(Ti);
            zoneState.set_PowerTotal(0.0);
            zoneState.set_ZoneName(configuration.zonename);
            zoneState.updateAttributeValues(getLRC(), currentTime + this.getLookAhead());
            log.info("t={} indoor temperature at {}", currentTime, Ti);

            // get latest updates
            checkReceivedSubscriptions();

            // Compute the load on the zone
            computeZoneLoad();
            
            // compute the current temperature
            computeZoneTemperature();

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

    private void handleInteractionClass(TMYWeather interaction) {
        To = interaction.get_dryBulbTemperature();
        SolarInsolation = interaction.get_directNormalIrradiance();
        log.info("t={} received outdoor temperature {}", currentTime, To);
    }

    private void handleInteractionClass(Supply interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleObjectClass(ControllerState object) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the object                 //
        //////////////////////////////////////////////////////////////////////////
    }

    private void handleObjectClass(Setpoint object) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the object                 //
        //////////////////////////////////////////////////////////////////////////
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            ZoneConfig federateConfig = federateConfigParser.parseArgs(args, ZoneConfig.class);
            Zone federate = new Zone(federateConfig);
            federate.execute();
            log.info("Done.");
            System.exit(0);
        } catch (Exception e) {
            log.error(e);
            System.exit(1);
        }
    }
}
