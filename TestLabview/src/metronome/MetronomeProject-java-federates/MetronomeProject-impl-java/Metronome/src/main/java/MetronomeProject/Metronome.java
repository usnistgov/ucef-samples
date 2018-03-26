package MetronomeProject;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import MetronomeProject.Configuration;

import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.cli.*;

/**
 * The Metronome type of federate for the federation designed in WebGME.
 *
 */
public class Metronome extends MetronomeBase {

    private final static Logger log = LogManager.getLogger(Metronome.class);

    double currentTime = 0;
	private static Configuration configuration;
	private double startTime;
	private double stopTime;
	private double logicalTimeSec;
	private double ignoreTil;

    public Metronome(FederateConfig params) throws Exception {
        super(params);
    }
    
	private static void loadConfiguration(String filepath) throws IOException {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE);
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
    	startTime = configuration.getStarttime();
    	stopTime = configuration.getStoptime();
    	logicalTimeSec = configuration.getLogicaltimeSec();
    	ignoreTil = configuration.getIgnoretil();


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
        
            SimTime vSimTime = create_SimTime();
            vSimTime.set_ignoreTil( ignoreTil);
            vSimTime.set_secondsPerLogicalTime(logicalTimeSec);
            vSimTime.set_startTime( startTime );
            vSimTime.set_stopTime( stopTime);
            vSimTime.sendInteraction(getLRC(), currentTime);
        //////////////////////////////////////////////////////////////////////////////////////
            log.info(
            	"curentTime: " + currentTime
				+ ", startTime: " + startTime 
				+ ", ignoreTil: " + ignoreTil 
				+ ", logicalTimeSec: " + logicalTimeSec 
				+ ", stopTime: "+ stopTime
				);

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

    public static void main(String[] args) {
        try {
        	
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);

            Metronome federate = new Metronome(federateConfig);
  
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
            log.error("There was a problem executing the Metronome federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
