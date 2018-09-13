package UtilityFederate;

import org.cpswt.config.FederateConfigParser;
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

/**
 * The Utility type of federate for the federation designed in WebGME.
 *
 */
public class Utility extends UtilityBase {

    private final static Logger log = LogManager.getLogger(Utility.class);

    double currentTime = 0;
	private UtilityConfig configuration;
	
	/////////////////////////////////////////////
	// startup time elements
	/////////////////////////////////////////////
	long startTime = 0;// 1243947600; 6/2/2009 9:00:00
	double ignoreTil = 1000;
	double logicalTimeSec = 1;	
	boolean receivedSimTime = false;
	boolean receivedTMY = false;
	boolean firsttime = true;
	String numOfLoop;
	
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
	// Demand and price computation variables
	/////////////////////////////////////////////
	private double price = 0;
	private double currentDemand=0;
	private double solarProvidedPower = 0;
	private int numhouses=0;
	house[] theHouses = null;
	private double directsolar=0;

	
	public class house {
		public double power;
		public String federatename;

		public double getPower() {
			return power;
		}

		public void setPower(double power) {
			this.power = power;
		}

		public String getFederatename() {
			return federatename;
		}

		public void setFederatename(String federatename) {
			this.federatename = federatename;
		}


		public house(double power, String federatename) {
			super();
			this.power = power;
			this.federatename = federatename;
		}
	}
	
    public Utility(UtilityConfig params) throws Exception {
        super(params);
        
        this.configuration = params;
    }

    private void CheckReceivedSubscriptions(String s) {

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof SimTime) {
                handleInteractionClass((SimTime) interaction);
            }
            else if (interaction instanceof ResourcePhysicalState) {
                handleInteractionClass((ResourcePhysicalState) interaction);
            }
            else if (interaction instanceof TMYWeather) {
                handleInteractionClass((TMYWeather) interaction);
            }
            //log.info("Interaction received and handled: " + s);
        }
     }


	public void DoPriceComputation() {
		int i;
		double p=0;	// power demand
		double c=0;	// cost per kwh
		double s=0; // solar energy power
		
		/*
			Pricing of Energy:

			Cbp = $0.07 / kWh
			Csol = $0.00 / kWh
			Cfp = $0.04

			Wbp = 100 KW
			Wsol = f(Weather) function TBD

			Wbpused = ∑ Wi - Wsol

			Each house reports in current demand in W

			LMP = Cfp + (Wbpused * Cbp + Wsol * Csol) / ∑ Wi
		 * */
		
		// how much solar is available
		s = configuration.solarpowerperdirectsolar * directsolar;
		
		// compute total demand
		for (i=0;i<numhouses;i++){
			p += theHouses[i].power;
		}
		
		// more power needed then solar?
		c = configuration.pricefixed;
		if (p>s) {
			c += (p-s) * configuration.pricebulk / p 
					+ s*configuration.pricesolar / p;
		} 
		
		price = c;
		currentDemand=p;
		solarProvidedPower = s;
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
    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        /////////////////////////////////////////////
        // TODO perform basic initialization below //
        /////////////////////////////////////////////
		theHouses = new house[configuration.maxHouses];	// allocate the houses array
		
		// set up data logging in MySQL
		//MySQLCon sql = new MySQLCon();
		//ssql.DoCmd("INSERT FOO");

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
        
        
		log.info(
				"Price Bulk: " + configuration.pricebulk
				+ ", Price Solar: " + configuration.pricesolar
				+ ", Price Fixed: " + configuration.pricefixed
				+ ", Solar Conversion (per DNI): " + configuration.solarpowerperdirectsolar
				);


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
            //    Quote vQuote = create_Quote();
            //    vQuote.set_tenderComponent_PriceCurve_price( < YOUR VALUE HERE > );
            //    vQuote.sendInteraction(getLRC(), currentTime);
            //
            ////////////////////////////////////////////////////////////////////////////////////////


           CheckReceivedSubscriptions("Main Loop");

	       	if ((receivedSimTime == true) && (receivedTMY == true)){
	       		// if this is firs time we saw both, initialize calendar time for experiment
	       		if (firsttime == true){
	       			initializeTimeStep();
	       			firsttime = false;
	       		}
				
	       		// after we handled interactions this logical time step, compute price
				DoPriceComputation();
				
				// send price signal
				Quote ps = create_Quote();
				ps.set_tenderComponent_PriceCurve_price(price);
				ps.sendInteraction(getLRC(), currentTime);            
	
				// log status to database
				// ToDo: add DoCmd("INSERT into table xxxx");
	
				log.info("----------");
				log.info("LogicalTime: " + currentTime +"Num Houses: "+numhouses + " Total Demand: " + currentDemand + " Solar provided: " + solarProvidedPower + " Current Price: "+price);
				for (int i=0; i < numhouses;i++){
					log.info("-----> " + theHouses[i].getFederatename() + " demand: " + theHouses[i].getPower());
				}	       	
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

    private void handleInteractionClass(SimTime interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
		ignoreTil = interaction.get_ignoreTil();
		logicalTimeSec = interaction.get_secondsPerLogicalTime();

		if(receivedSimTime == false){
			log.info(
					"startTime: " + startTime + ", ignoreTil: " + ignoreTil + ", logicalTimeSec: " + logicalTimeSec);
		}

		receivedSimTime = true;
	} 
    
    private void handleInteractionClass(ResourcePhysicalState interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
		String federate = interaction.get_sourceFed();
		double power = interaction.get_power();
		int i;

		// see if we know this house
		for (i=0; i<numhouses;i++){
			if (federate.equals(theHouses[i].federatename))
					break;
		}
		
		// check if new house
		if (i==numhouses) {
			// found a new one, add to array of houses
			theHouses[i] = new house(interaction.get_power(),interaction.get_sourceFed());
			log.info("Received new house: "+ theHouses[i].federatename + " Current Power: " + theHouses[i].power);
			numhouses++; 
		}
		else {
			// update power value
			theHouses[i].power = power;
			log.info("Received ResourcePhyscialState: "+ theHouses[i].getFederatename() + " Current Power: " + theHouses[i].getPower());
		}
	} 
    
    private void handleInteractionClass(TMYWeather interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
		directsolar = interaction.get_directNormalIrradiance();
		receivedTMY = true;
	} 

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            UtilityConfig federateConfig = federateConfigParser.parseArgs(args, UtilityConfig.class);
            Utility federate = new Utility(federateConfig);
            federate.execute();
            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the Utility federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
