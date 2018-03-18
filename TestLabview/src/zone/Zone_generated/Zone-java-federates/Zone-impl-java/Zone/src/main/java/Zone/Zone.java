package Zone;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.ObjectRoot;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
/**
 * The Zone type of federate for the federation designed in WebGME.
 *
 */
public class Zone extends ZoneBase {

    private final static Logger log = LogManager.getLogger(Zone.class);

    double currentTime = 0;
	private static Configuration configuration;

	/////////////////////////////////////////////
	// variables needed in the simulation
	/////////////////////////////////////////////
	// from the weather
	public double To = 25.0; // outdoor temperature
	double SolarInsolation=0.0;	// direct solar irradiance

	public double Qfixedload = 0.0; // constant fixed load
	public double Ti = 21.0; // indoor temperature 'C
	public double Tsp = 20.0; // temperature setpoint 'C
	public double del = 0.5; // thermostat algorithm hysteresis 'C
	public boolean heatpumprunning = false; // is heatpump running

	public double Qh = 0.0; // Total heat load on house – Heatpump, plug loads,
							// occupants, …
	public double Qhp = 0.0; // Heat pump energy consumption
	public double Qsolar = 0.0;	// solar heat gain
	public double Qout = 0.0;	// Heat flux due to outdoor temperature plus Heat Pump action

	public double Php = 0; // power consumed by heatpump
	public double Psolar = 0; // power produced by solar cells
	public double Pfixedload = 0; // power consumped by plug loads
	public double Ph = 0; // power consumed (produced) by house

	/////////////////////////////////////////////
	// Fit to Net0 House:
	/////////////////////////////////////////////
	public double uae = 172.0; // Lumped Thermal Resistance W per 'C
	public double tau = 104 * 3600.0; // seconds
	public double houseeffectivearea = 6.84; // M2 exposed to sun
	public double sghc = 0.89; // Solar Heat Gain Coefficient
	public double hpbasepower = 1571.0; // heat pump power base consumption when running (will add temperature component)
	public double solarconversionconstant = 1.0; // efficiency of solar panels
	public double solarpaneleffectivearea = 0; // M2 of solar panel 	
	public double Price=0; 		//current price per Wh
	
	// %%%% 20180318 MJB need to get logicalTimeSec from simtime
	public double logicalTimeSec=12; // units of logical time
    ///////////////////////////////////////////////////////////////////////
    // TODO Instantiate objects that must be sent every logical time step
    //
     ZoneState vZoneState = new ZoneState();
    //
    ///////////////////////////////////////////////////////////////////////

    public Zone(FederateConfig params) throws Exception {
        super(params);
        // TODO Must register object instances after super(args)
        //
        vZoneState.registerObject(getLRC());
        //
        ///////////////////////////////////////////////////////////////////////        
    }
    
	public void ComputeZoneLoad() {
		// Heat pump capacity equation in W for cooling season (note: converted to farenheit in this equation)
		if (heatpumprunning) {
			Php = 7.1204*(To*9.0/5.0+32.0) + hpbasepower;	// power consumed by heatpump W
			Qhp = -(323.24 * (To*9.0/5.0+32.0) + 10576.0) / 3.412141633; // Heat pumped by heatpump W 
		} else {
			Php = 0; // W
			Qhp = 0;
		}
		
		// Compute Solar Contribution
		Qsolar = SolarInsolation * houseeffectivearea * sghc; // heat gain
		Psolar = - SolarInsolation * solarconversionconstant * solarpaneleffectivearea ;	// power out
	
		// total energy consumed by house
		Ph =  Php + Psolar + Pfixedload;
		// total thermal energy flux for the house
		Qh = Qhp + Qsolar + Qfixedload;
	}

	// Compute the new indoor temperature for this time step
	public void ComputeZoneTemperature() {
		Ti = To + Qh/uae + (Ti-To - Qh/uae) * Math.exp(-logicalTimeSec/tau);
	}
	
	private static void loadConfiguration(String filepath) throws IOException {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		log.info("reading configuration file configuration from " + filepath);
		try {
			configuration = mapper.readValue(new File(filepath), Configuration.class);
		} catch (JsonParseException e) {
			log.error("invalid format for YAML configuration file " + filepath);
			throw new IOException(e);
		} catch (JsonMappingException e) {
			log.error("invalid options in YAML configuration file " + filepath);
			throw new IOException(e);
		}
	}
    
    private void CheckReceivedSubscriptions(String s) {

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof TMYWeather) {
                handleInteractionClass((TMYWeather) interaction);
            }
            else if (interaction instanceof Supply) {
                handleInteractionClass((Supply) interaction);
            }
            log.info("Interaction received and handled: " + s);
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
		
		uae = configuration.getUae();
		del = configuration.getDel();
		tau = configuration.getTau(); // seconds
		houseeffectivearea = configuration.getHouseeffectivearea(); // M2 exposed to sun
		sghc = configuration.getSghc(); // Solar Heat Gain Coefficient
		hpbasepower = configuration.getHpbasepower(); // heat pump power base consumption when running (will add temperature component)
		solarconversionconstant = configuration.getSolarconversionconstant();
		Tsp = configuration.getTsp(); // temperature setpoint 'C
		Pfixedload = configuration.getPlugload(); // plugload
		solarpaneleffectivearea = configuration.getSolarpaneleffectivearea();
		
		log.info(
				"uae: " + uae
				+ ", del: " + del
				+ ", tau: " + tau
				+ ", sghc: " + sghc
				+ ", solarconversionconstant: " + solarconversionconstant
				+ ", hpbasepower: " + hpbasepower
				+ ", houseeffectivearea: " + houseeffectivearea
				+ ", solarpaneleffectivearea: " + solarpaneleffectivearea
				);

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
            // TODO objects that must be sent every logical time step
            //
                vZoneState.set_CoolingOverride(false);
                vZoneState.set_IATemperature(Ti);
                vZoneState.set_PowerTotal(0.0);
                vZoneState.set_ZoneName("myZone");	// %%%% need to get from instance name
                vZoneState.updateAttributeValues(getLRC(), currentTime);
            //
            //////////////////////////////////////////////////////////////////////////////////////////

            // get latest updates
            CheckReceivedSubscriptions("Main Loop");
            
            // Compute the load on the zone
			ComputeZoneLoad();
			
			// compute the current temperature
			ComputeZoneTemperature();

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


	private void handleInteractionClass(TMYWeather interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
		To = interaction.get_dryBulbTemperature();
		SolarInsolation = interaction.get_directNormalIrradiance();

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
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            Zone federate = new Zone(federateConfig);
			// process parameters file
            File f = new File("conf/config.yml");
            if(f.exists() && !f.isDirectory()) { 
				log.info("Parsing parameter file");
				loadConfiguration(f.getAbsolutePath());
			} else {
				log.info("No parameter file");
				loadConfiguration("classes/config.yml");
			}

            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the Zone federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
