package HouseFederate;

import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The House type of federate for the federation designed in WebGME.
 *
 */
public class House extends HouseBase {

    private final static Logger log = LogManager.getLogger(House.class);

    double currentTime = 0;
	private HouseConfig configuration;
	private ResourcePhysicalState vResourcePhysicalState = create_ResourcePhysicalState();

	/////////////////////////////////////////////
	// time elements
	/////////////////////////////////////////////
	boolean receivedSimTime = false;	// flag to block waiting for the SimTime interactions
	boolean receivedTMY = false;
	boolean firsttime = true;
	
	long startTime = 0;
	double ignoreTil = 1000;
	double logicalTimeSec = 1;

	/////////////////////////////////////////////
	// Calendar Time variables used in simulation
	/////////////////////////////////////////////
	long dttime; // current date and time in msec
	Calendar dt = null;
	Long thisTime;
	int timezone = -5; // NY
	String state = "NY";
	DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;
	
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
	
   ///////////////////////////////////////////////////////////////////////
   // TODO Instatiate objects. that must be sent every logical time step 
   //
   //
   ///////////////////////////////////////////////////////////////////////
    public House(HouseConfig params) throws Exception {
        super(params);
        
        this.configuration = params;
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
	public void ComputeIndoorTemperature() {
		Ti = To + Qh/uae + (Ti-To - Qh/uae) * Math.exp(-logicalTimeSec/tau);
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

		// inistialize with startTime
		dt.setTimeInMillis(startTime * 1000);// 1243929600 without -7 hours
		log.debug("year=:" + dt.get(Calendar.YEAR)); // 2009
		log.debug("month=:" + dt.get(Calendar.MONTH)); // 6
		log.debug("Day: " + dt.get(Calendar.DAY_OF_MONTH)); // 2
		log.debug("Hour: " + dt.get(Calendar.HOUR)); // 9
		log.debug("Minute:" + dt.get(Calendar.MINUTE)); // 0


		// get current time in msec and hrs this year
		dttime = dt.getTimeInMillis();
	}

	private void computeNextTimeStep() {
		dt.setTimeInMillis((long) ((startTime + currentTime * logicalTimeSec) * 1000));

		thisTime = dt.getTimeInMillis();

	}

    private void CheckReceivedSubscriptions(String s) {

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof TMYWeather) {
                handleInteractionClass((TMYWeather) interaction);
            }
            else if (interaction instanceof SimTime) {
                handleInteractionClass((SimTime) interaction);
            }
            else if (interaction instanceof Quote) {
                handleInteractionClass((Quote) interaction);
            }
            //log.info("Interaction received and handled: " + s);
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
		
		uae = configuration.uae;
		del = configuration.del;
		tau = configuration.tau; // seconds
		houseeffectivearea = configuration.houseeffectivearea; // M2 exposed to sun
		sghc = configuration.sghc; // Solar Heat Gain Coefficient
		hpbasepower = configuration.hpbasepower; // heat pump power base consumption when running (will add temperature component)
		solarconversionconstant = configuration.solarconversionconstant;
		Tsp = configuration.tsp; // temperature setpoint 'C
		Pfixedload = configuration.plugload; // plugload
		solarpaneleffectivearea = configuration.solarpaneleffectivearea;
		
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
            // TODO send interactions that must be sent every logical time step below.
            // Set the interaction's parameters.
            //
            //    ResourcePhysicalState vResourcePhysicalState = create_ResourcePhysicalState();
            //    vResourcePhysicalState.set_power( < YOUR VALUE HERE > );
            //    vResourcePhysicalState.sendInteraction(getLRC(), currentTime);
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
				vResourcePhysicalState.set_power(Ph);
				vResourcePhysicalState.sendInteraction(getLRC(), currentTime);
				
				String l = "CurrentTime: " + formatter.format(dt.toInstant()) 
				+ ", Power: " + Ph 
				+ ", SolarInsolation: " + SolarInsolation 
				+ ", To: " + To 
				+ ", Ti: " + Ti
				+ ", heatpumprunning: " + heatpumprunning;
				log.info(l);
	   		}

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
		state = interaction.get_stationState();
		timezone = (int) interaction.get_timeZone();
		receivedTMY = true;
    }

    private void handleInteractionClass(SimTime interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
		startTime = (long) interaction.get_startTime();
		ignoreTil = interaction.get_ignoreTil();
		logicalTimeSec = interaction.get_secondsPerLogicalTime();

		if(receivedSimTime == false){
			log.info(
					"startTime: " + startTime + ", ignoreTil: " + ignoreTil + ", logicalTimeSec: " + logicalTimeSec);
		}

		receivedSimTime = true;
    }

    private void handleInteractionClass(Quote interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
		Price = interaction.get_tenderComponent_PriceCurve_price();
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            HouseConfig federateConfig = federateConfigParser.parseArgs(args, HouseConfig.class);
            House federate = new House(federateConfig);
            federate.execute();
            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the House federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
