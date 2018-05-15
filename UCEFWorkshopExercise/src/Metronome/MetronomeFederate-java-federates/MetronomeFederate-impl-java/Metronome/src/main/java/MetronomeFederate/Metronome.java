package MetronomeFederate;

import org.cpswt.config.FederateConfigParser;
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
import org.apache.commons.cli.*;

/**
 * The Metronome type of federate for the federation designed in WebGME.
 *
 */
public class Metronome extends MetronomeBase {

    private final static Logger log = LogManager.getLogger(Metronome.class);

    double currentTime = 0;
	private MetronomeConfig configuration;
	private double startTime;
	private double stopTime;
	private double logicalTimeSec;
	private double ignoreTil;

    public Metronome(MetronomeConfig params) throws Exception {
        super(params);
        
        this.configuration = params;
    }

    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        /////////////////////////////////////////////
        // TODO perform basic initialization below //
        /////////////////////////////////////////////
    	startTime = configuration.starttime;
    	stopTime = configuration.stoptime;
    	logicalTimeSec = configuration.logicaltimesec;
    	ignoreTil = configuration.ignoretil;


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
            MetronomeConfig federateConfig = federateConfigParser.parseArgs(args, MetronomeConfig.class);
            Metronome federate = new Metronome(federateConfig);
            federate.execute();
            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the Metronome federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
