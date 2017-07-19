package HouseProject;

import c2w.hla.InteractionRoot;
import c2w.hla.base.AdvanceTimeRequest;

import java.io.File;
import java.io.IOException;
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
 * The federate federate for the federation federation designed in WebGME.
 *
 * This federate MUST join the federation before the federation manager starts the experiment.
 * This means that, when the federate joins, the federation logical time must be 0 and both
 * the readyToPopulate and the readyToRun synchronization points must be defined.
 */
public class House extends HouseBase {

	private final static Logger log = LogManager.getLogger(House.class);
	private static Configuration configuration;
	private ResourcePhysicalState vResourcePhysicalState = create_ResourcePhysicalState();

	private int houseid = 1;

	/////////////////////////////////////////////
	// time elements
	/////////////////////////////////////////////
	double logicalTime = 0;
	boolean receivedSimTime = false;	// flag to block waiting for the SimTime interactions
	boolean receivedTMY = false;
	boolean firsttime = true;
	
	long startTime = 0;// 1243947600; 6/2/2009 9:00:00
	double ignoreTil = 1000;
	double logicalTimeSec = 1;

	// Calendar Time variables used in simulation
	long dttime; // current date and time in msec
	long soytime; // start of year time in msec
	Calendar dt = null;
	Calendar soy = null;
	int hoy = 0; // hour of year
	double hoy0 = 0; // hour
	double hoy1 = 0;// hour
	double hoy2 = 0; // hour
	double now = 0;// minutes
	Long thisTime;
	int timezone = 0; // zulu
	String state = "NY";
	
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

	
	// Fit to Net0 House:
	public double UAe = 172.0; // Lumped Thermal Resistance W per 'C
	public double tau = 104 * 3600.0; // seconds
	public double houseEffectiveArea = 6.84; // M2 exposed to sun
	public double sghc = 0.89; // Solar Heat Gain Coefficient
	public double hpBasePower = 1571.0; // heat pump power base consumption when running (will add temperature component)
	public double solarconverionconstant = 1.0; // watts per solar direct
	
	public double Price=0; 		//current price per Wh
	
   ///////////////////////////////////////////////////////////////////////
   // TODO Instatiate objects. that must be sent every logical time step 
   //
   //
   ///////////////////////////////////////////////////////////////////////

    public House(String[] args) throws Exception {
        super(args);
        ///////////////////////////////////////////////////////////////////////
        // TODO Must register object instances after super(args)
        //
        //
        ///////////////////////////////////////////////////////////////////////
	}
	
	public void DoThermostat() {
		if (Ti >= Tsp + del) {
			heatpumprunning = true;
		} else if (Ti <= Tsp - del) {
			heatpumprunning = false;
		}
	}

	public void ComputeHouseLoad() {
		// Heat pump capacity equation in W for cooling season (note: converted to farenheit in this equation)
		if (heatpumprunning) {
			Php = 7.1204*To + hpBasePower;	// power consumed by heatpump W
			Qhp = -(323.24 * (To*9.0/5.0+32.0) + 10576.0) / 3.412141633; // Heat pumped by heatpump W 
		} else {
			Php = 0; // W
			Qhp = 0;
		}
		
		// Compute Solar Contribution
		Qsolar = SolarInsolation * houseEffectiveArea * sghc; // heat gain
		Psolar = - SolarInsolation * solarconverionconstant;	// power out
	
		// total energy consumed by house
		Ph =  Php + Psolar + Pfixedload;
		// total thermal energy flux for the house
		Qh = Qhp + Qsolar + Qfixedload;
	}

	// Compute the new indoor temperature for this time step
	public void ComputeIndoorTemperature() {
		Ti = To + Qh/UAe + (Ti-To - Qh/UAe) * Math.exp(-logicalTimeSec/tau);
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

	
	private void initializeTimeStep() {
		
		log.info("Initializing calendar time attributes");
		
		// initialize timezone support
		int tzhours = timezone;// -7
		log.info("time zone hours=:" + tzhours);
		SimpleTimeZone tz = new SimpleTimeZone(tzhours * 3600000, "GMT");

		// DST Support all of US uses same DST rules if not AZ,HI which doesn't switch over
		if (!(state.equals("AZ") || state.equals("HI"))) {
			tz.setStartRule(Calendar.MARCH, 8, -Calendar.SUNDAY, 2 * 60 * 60 * 1000);
			tz.setEndRule(Calendar.NOVEMBER, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
		}

		// establish calendar time reference
		dt = new GregorianCalendar(tz); // get calendar
		soy = new GregorianCalendar(tz); // get calendar

		// inistialize with startTime
		dt.setTimeInMillis(startTime * 1000);// 1243929600 without -7 hours
		log.debug("year=:" + dt.get(Calendar.YEAR)); // 2009
		log.debug("month=:" + dt.get(Calendar.MONTH)); // 6
		log.debug("Day: " + dt.get(Calendar.DAY_OF_MONTH)); // 2
		log.debug("Hour: " + dt.get(Calendar.HOUR)); // 9
		log.debug("Minute:" + dt.get(Calendar.MINUTE)); // 0

		// determine start time of year in UTC
		soy.set(dt.get(Calendar.YEAR), 0, 1, 0, 0, 0);// e.g. 2009/1/1 0:0:0
		log.debug("year=:" + soy.get(Calendar.YEAR)); // 2009
		log.debug("month=:" + soy.get(Calendar.MONTH)); // 6
		log.debug("Day: " + soy.get(Calendar.DAY_OF_MONTH)); // 2
		log.debug("Hour: " + soy.get(Calendar.HOUR_OF_DAY)); // 9
		log.debug("Minute:" + soy.get(Calendar.MINUTE)); // 0

		// get current time in msec and hrs this year
		dttime = dt.getTimeInMillis();
		soytime = soy.getTimeInMillis();
		hoy = (int) ((dttime - soytime) / 3600000); // 3656 vs 8760
		log.debug("Hour of year=:" + hoy);
	}

	private void computeNextTimeStep() {
		dt.setTimeInMillis((long) ((startTime + logicalTime * logicalTimeSec) * 1000));

		thisTime = dt.getTimeInMillis();
		hoy = (int) ((thisTime - soytime) / 3600000);

		log.debug("LogicalTime: " + logicalTime + ", CalendarTime=:" + thisTime);
		log.debug("hoy=:" + hoy);

	}

    private void CheckReceivedSubscriptions(String s) {

        InteractionRoot interaction = null;

            while ((interaction = getNextInteractionNoWait()) != null) {
                if (interaction instanceof SimTime) {
                    handleInteractionClass((SimTime) interaction);
                }
                else if (interaction instanceof Quote) {
                    handleInteractionClass((Quote) interaction);
                }
                else if (interaction instanceof TMYWeather) {
                    handleInteractionClass((TMYWeather) interaction);
                }
                // log.info("Interaction received and handled: " + s);
            }
 
        }

	private void execute() throws Exception {

        /////////////////////////////////////////////
        // TODO perform basic initialization below 
        /////////////////////////////////////////////
		
		houseid = configuration.getHouseid();
		UAe = configuration.getUAe();
		
		tau = configuration.getTau(); // seconds
		houseEffectiveArea = configuration.getHouseEffectiveArea(); // M2 exposed to sun
		sghc = configuration.getSghc(); // Solar Heat Gain Coefficient
		hpBasePower = configuration.getHpBasePower(); // heat pump power base consumption when running (will add temperature component)
		solarconverionconstant = configuration.getSolarconverionconstant();
		Tsp = configuration.getTsp(); // temperature setpoint 'C
		

        AdvanceTimeRequest atr = new AdvanceTimeRequest(logicalTime);
        putAdvanceTimeRequest(atr);

        readyToPopulate();

        ///////////////////////////////////////////////////////////////////////
        // Call CheckReceivedSubscriptions(<message>) here to receive 
        // subscriptions published before the first time step.
        ///////////////////////////////////////////////////////////////////////
        
        ///////////////////////////////////////////////////////////////////////
        // TODO perform initialization that depends on other federates below
        ///////////////////////////////////////////////////////////////////////
        readyToRun();

        startAdvanceTimeThread();
    
        while (true) {
            //////////////////////////////////////////////////////////////
            // TODO update step size for logical time progression below
            //////////////////////////////////////////////////////////////
            logicalTime += 1.0;

            atr.requestSyncStart();
            

            
            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO send interactions that must be sent every logical time step below.
            // Set the interaction's parameters.
            //
            //    ResourcePhysicalState vResourcePhysicalState = create_ResourcePhysicalState(); 
            //    vResourcePhysicalState.set_power( < YOUR VALUE HERE > );
            //    vResourcePhysicalState.sendInteraction(getRTI(), logicalTime);
            //
            ////////////////////////////////////////////////////////////////////////////////////////

            CheckReceivedSubscriptions("Main Loop");
			
	       	if ((receivedSimTime == true) && (receivedTMY == true)){
	       		// if this is firs time we saw both, initialize calendar time for experiment
	       		if (firsttime == true){
	       			initializeTimeStep();
	       			firsttime = false;
	       		}
	       		
	       		// now we can compute the next time and do computations
	       		computeNextTimeStep();
	       		DoThermostat();
				ComputeHouseLoad();
				ComputeIndoorTemperature();
	
				// send out state
				vResourcePhysicalState.set_power(Qh);
				vResourcePhysicalState.sendInteraction(getRTI(), logicalTime);
	   		}

            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            // DO NOT MODIFY FILE BEYOND THIS LINE
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            AdvanceTimeRequest newATR = new AdvanceTimeRequest(logicalTime);
            putAdvanceTimeRequest(newATR);
            atr.requestSyncEnd();
            atr = newATR;
        }
    }
        
    
    private void handleInteractionClass(SimTime interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            
        //////////////////////////////////////////////////////////////////////////
		startTime = (long) interaction.get_startTime();
		ignoreTil = interaction.get_ignoreTil();
		logicalTimeSec = interaction.get_secondsPerLogicalTime();

		log.info(
				"startTime: " + startTime + ", ignoreTil: " + ignoreTil + ", logicalTimeSec: " + logicalTimeSec);

		receivedSimTime = true;
    } 

    
    private void handleInteractionClass(Quote interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            
        //////////////////////////////////////////////////////////////////////////
		Price = interaction.get_tenderComponent_PriceCurve_price();
    } 
    
    private void handleInteractionClass(TMYWeather interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            
        //////////////////////////////////////////////////////////////////////////
		
		To = interaction.get_dryBulbTemperature();
		SolarInsolation = interaction.get_directNormalIlluminance();
		state = interaction.get_stationState();
		timezone = (int) interaction.get_timeZone();
		receivedTMY = true;
    } 
    

    

    public static void main(String[] args) {
        try {
            // Comment from MB.
            House instance = new House(args);

			// process parameters file
			if (args.length >= 4) {
				log.info("Parsing parameter file");
				loadConfiguration(args[3]);
			} else {
				log.info("No parameter file");
				loadConfiguration("classes/config.yml");
			}
			
			// run the federate
            instance.execute();
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

