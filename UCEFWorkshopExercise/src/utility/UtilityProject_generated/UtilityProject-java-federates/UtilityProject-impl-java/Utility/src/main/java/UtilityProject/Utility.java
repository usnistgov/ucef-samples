package UtilityProject;

import org.cpswt.config.FederateConfig;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import UtilityProject.Configuration;


/**
 * The Utility type of federate for the federation designed in WebGME.
 *
 */
public class Utility extends UtilityBase {

    private final static Logger log = LogManager.getLogger(Utility.class);

    double currentTime = 0;
	private static Configuration configuration;
	
	// time elements
	double logicalTime = 0;
	long startTime = 0;// 1243947600; 6/2/2009 9:00:00
	double ignoreTil = 1000;
	double logicalTimeSec = 1;	
	boolean notReady = true;
	String numOfLoop;
	
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
    public Utility(FederateConfig params) throws Exception {
        super(params);
        ///////////////////////////////////////////////////////////////////////
        // TODO Must register object instances after super(args)
        //
        //
        ///////////////////////////////////////////////////////////////////////
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
		s = configuration.getSolarpowerperdirectsolar() * directsolar;
		
		// compute total demand
		for (i=0;i<numhouses;i++){
			p += theHouses[i].power;
		}
		
		// more power needed then solar?
		c = configuration.getPricefixed();
		if (p>s) {
			c += (p-s) * configuration.getPricebulk() / p 
					+ s*configuration.getPricesolar() / p;
		} 
		
		price = c;
		currentDemand=p;
		solarProvidedPower = s;
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
	
    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        /////////////////////////////////////////////
        // TODO perform basic initialization below //
        /////////////////////////////////////////////
		theHouses = new house[configuration.getMaxHouses()];	// allocate the houses array
		
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
			
			// after we handled interactions this logical time step, compute price
			DoPriceComputation();
			
			// send price signal
			Quote ps = create_Quote();
			ps.set_tenderComponent_PriceCurve_price(price);
			ps.sendInteraction(getLRC(), currentTime);            

			// log status to database
			// ToDo: add DoCmd("INSERT into table xxxx");

			log.info("----------");
			log.info("LogicalTime: " + logicalTime +"Num Houses: "+numhouses + " Total Demand: " + currentDemand + " Solar provided: " + solarProvidedPower + " Current Price: "+price);
			for (int i=0; i < numhouses;i++){
				log.info("-----> " + theHouses[i].getFederatename() + " demand: " + theHouses[i].getPower());
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

		log.info(
				"startTime: " + startTime + ", ignoreTil: " + ignoreTil + ", logicalTimeSec: " + logicalTimeSec);
		// check if we are past ignoreTil
		if (logicalTime >= ignoreTil) {
			notReady = false;
		}
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
		directsolar = interaction.get_directNormalIlluminance();
	} 

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            Utility federate = new Utility(federateConfig);
			// process parameters file
			if (args.length >= 1) {
				log.info("Parsing parameter file", args[1]);
				loadConfiguration(args[1]);
			} else {
				log.info("No parameter file");
				loadConfiguration("classes/config.yml");
			}
            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the Utility federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
