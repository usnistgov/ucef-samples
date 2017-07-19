package UtilityProject;

import c2w.hla.InteractionRoot;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import c2w.hla.base.ObjectReflector;
import c2w.hla.ObjectRoot;
import c2w.hla.base.AdvanceTimeRequest;

import hla.rti.SuppliedAttributes;
import hla.rti.jlc.RtiFactory;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import UtilityProject.Configuration;


/**
 * The federate federate for the federation federation designed in WebGME.
 *
 * This federate MUST join the federation before the federation manager starts the experiment.
 * This means that, when the federate joins, the federation logical time must be 0 and both
 * the readyToPopulate and the readyToRun synchronization points must be defined.
 */
public class Utility extends UtilityBase {

	private final static Logger log = LogManager.getLogger(Utility.class);
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

	   public Utility(String[] args) throws Exception {
        super(args);
        ///////////////////////////////////////////////////////////////////////
        // TODO Must register object instances after super(args)
        //
        //
        ///////////////////////////////////////////////////////////////////////
	}

    private void CheckReceivedSubscriptions(String s) {

        InteractionRoot interaction = null;
        ObjectReflector reflector = null;

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
                // log.info("Interaction received and handled: " + s);
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
		double logicalTime = 0;
		InteractionRoot interaction = null;
		ObjectReflector reflector = null;

		/////////////////////////////////////////////
		// TODO perform basic initialization below //
		/////////////////////////////////////////////
		theHouses = new house[configuration.getMaxHouses()];	// allocate the houses array
		
		// set up data logging in MySQL
		//MySQLCon sql = new MySQLCon();
		//ssql.DoCmd("INSERT FOO");
		

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
			
			//log.info("logicalTime step= " + logicalTime);

            atr.requestSyncStart();
            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO send interactions that must be sent every logical time step below.
            // Set the interaction's parameters.
            //
            //    Quote vQuote = create_Quote(); 
            //    vQuote.set_tenderComponent_PriceCurve_price( < YOUR VALUE HERE > );
            //    vQuote.sendInteraction(getRTI(), logicalTime);
            //
            ////////////////////////////////////////////////////////////////////////////////////////


           CheckReceivedSubscriptions("Main Loop");
			
			// after we handled interactions this logical time step, compute price
			DoPriceComputation();
			
			// send price signal
			Quote ps = create_Quote();
			ps.set_tenderComponent_PriceCurve_price(price);
			ps.sendInteraction(getRTI(), logicalTime);            

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
        // TODO implement how to handle reception of the interaction            
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
        // TODO implement how to handle reception of the interaction            
        //////////////////////////////////////////////////////////////////////////
		directsolar = interaction.get_directNormalIlluminance();
	} 



    public static void main(String[] args) {
        try {
            // Comment from MB.
            Utility instance = new Utility(args);

			// process parameters file
			if (args.length >= 4) {
				log.info("Parsing parameter file", args[3]);
				loadConfiguration(args[3]);
			} else {
				log.info("No parameter file");
				loadConfiguration("classes/config.yml");
			}
			
             instance.execute();
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}