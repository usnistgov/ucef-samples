package Controller;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.ObjectRoot;
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
 * The Controller type of federate for the federation designed in WebGME.
 *
 */
public class Controller extends ControllerBase {

    private final static Logger log = LogManager.getLogger(Controller.class);

    double currentTime = 0;
	private static Configuration configuration;
	
	double Ti=25.0; //indoor temperature
	double Tsp=25.0; // temperature setpoint
	double del=1.0; // hysteresis
	int damper=100; // damper position 0 = closed, 100 = %open
	boolean overridden = false;

    ///////////////////////////////////////////////////////////////////////
    // TODO Instantiate objects that must be sent every logical time step
    //
     ControllerState vControllerState = new ControllerState();
    //
    ///////////////////////////////////////////////////////////////////////


    public Controller(FederateConfig params) throws Exception {
        super(params);
        // TODO Must register object instances after super(args)
        //
        vControllerState.registerObject(getLRC());
        //
        ///////////////////////////////////////////////////////////////////////
        
    }
    
	public void DoThermostat() {
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

        ///////////////////////////////////////////////////////////////////////
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

        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof Setpoint) {
                handleObjectClass((Setpoint) object);
            }
            else if (object instanceof ZoneState) {
                handleObjectClass((ZoneState) object);
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
    	double kp = configuration.getKp(); // proportional constant
    	double ki = configuration.getKi(); // integral constant
    	double kd = configuration.getKd(); // derivative constant
    	double hyst = configuration.getHyst(); //hysteresis if simple model 
		log.info(
				"kp: " + kp
				+ ", ki: " + ki
				+ ", kd: " + kd
				+ ", hyst: " + hyst
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

            // get the current info
            CheckReceivedSubscriptions("Main Loop");
            
            //calculate damper state
            DoThermostat();

            // send the current updated state
            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO objects that must be sent every logical time step
            //
            vControllerState.set_DamperPostionPct(damper);
            vControllerState.updateAttributeValues(getLRC(), currentTime);
            //
            //////////////////////////////////////////////////////////////////////////////////////////

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

    private void handleObjectClass(Setpoint object) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the object                 //
        //////////////////////////////////////////////////////////////////////////
    	Tsp = object.get_ZoneTempSP();
    }

    private void handleObjectClass(ZoneState object) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the object                 //
        //////////////////////////////////////////////////////////////////////////
    	overridden = object.get_CoolingOverride();
    	Ti = object.get_IATemperature();
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            Controller federate = new Controller(federateConfig);
            
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
            log.error("There was a problem executing the Controller federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
