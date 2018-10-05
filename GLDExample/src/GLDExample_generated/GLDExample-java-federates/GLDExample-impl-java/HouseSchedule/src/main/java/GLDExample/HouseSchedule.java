package GLDExample;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A federate that controls the cooling set point for 3 GridLAB-D houses based on a simple schedule. The schedule has
 * two time slices: 8:00 AM to 5:00 PM which are work hours, and the remainder of the day which are at home hours. A
 * house can have a different temperature set point for work hours and at home hours. House 1 and House 2 have higher
 * temperature set points during work hours, while House 3 has a constant set point.
 * 
 * The objective of the GridLAB-D example federation is to test if the GridLAB-D federate works under normal cases. An
 * important requirement for the GridLAB-D federate is that it support both interactions and objects for data exchange.
 * House 1 uses interactions, and House 2 & 3 use object classes to ensure both methods of communication work.
 * 
 * The GridLAB-D federate publishes a special interaction called GLDClock that contains the value of its global clock
 * variable. This federate subscribes to GLDClock and uses it to transition between work hours and at home hours to
 * test this feature of the GridLAB-D federate.
 */
public class HouseSchedule extends HouseScheduleBase {
    private final static Logger log = LogManager.getLogger();

    private double currentTime = 0;

    /*
     * True when this federate believes that GridLAB-D is between [8:00 AM, 5:00 PM).
     */
    private boolean isWorkSchedule = false;

    /*
     * The object instance used to update the set point of House 2.
     */
    private CoolingSetPointObject house2 = null;

    /*
     * The object instance used to update the set point of House 3.
     */
    private CoolingSetPointObject house3 = null;

    public HouseSchedule(FederateConfig params) throws Exception {
        super(params);
    }

    private void checkReceivedSubscriptions() {

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof GLDClock) {
                handleInteractionClass((GLDClock) interaction);
            }
            else {
                log.debug("unhandled interaction: {}", interaction.getClassName());
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

        initializeCoolingSetPoints();

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
            
            log.info("t={}", getLRC().queryFederateTime());
            checkReceivedSubscriptions();
            updateCoolingSetPoints();

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

    /*
     * Register the object instances for House 2 and House 3, and send the initial values for all houses.
     */
    private void initializeCoolingSetPoints() {
        CoolingSetPoint house1 = create_CoolingSetPoint();
        house1.set_name("house1");
        house1.set_cooling_setpoint(getCoolingSetPoint1());
        house1.sendInteraction(getLRC());
        log.debug("sent {}", house1.toString());

        house2 = new CoolingSetPointObject();
        house2.registerObject(getLRC());
        house2.set_name("house2");
        house2.set_cooling_setpoint(getCoolingSetPoint2());
        house2.updateAttributeValues(getLRC());
        log.debug("created {}", house2.toString());

        house3 = new CoolingSetPointObject();
        house3.registerObject(getLRC());
        house3.set_name("house3");
        house3.set_cooling_setpoint(getCoolingSetPoint3());
        house3.updateAttributeValues(getLRC());
        log.debug("created {}", house3.toString());
    }
    
    /*
     * Update the cooling set point for each house.
     */
    private void updateCoolingSetPoints() {
        double cooling_setpoint1 = getCoolingSetPoint1();
        double cooling_setpoint2 = getCoolingSetPoint2();
        double cooling_setpoint3 = getCoolingSetPoint3();

        CoolingSetPoint house1 = create_CoolingSetPoint();
        house1.set_name("house1");
        house1.set_cooling_setpoint(cooling_setpoint1);
        house1.sendInteraction(getLRC(), currentTime + getLookAhead());
        log.info("set house1.cooling_setpoint={}", cooling_setpoint1);

        house2.set_cooling_setpoint(cooling_setpoint2);
        house2.updateAttributeValues(getLRC(), currentTime + getLookAhead());
        log.info("set house2.cooling_setpoint={}", cooling_setpoint2);

        house3.set_cooling_setpoint(cooling_setpoint3);
        house3.updateAttributeValues(getLRC(), currentTime + getLookAhead());
        log.info("set house3.cooling_setpoint={}", cooling_setpoint3);
    }
    
    /*
     * Get the set point for House 1 based on the current time of day.
     */
    private double getCoolingSetPoint1() {
        return isWorkSchedule ? 75 : 69;
    }

    /*
     * Get the set point for House 2 based on the current time of day.
     */
    private double getCoolingSetPoint2() {
        return isWorkSchedule ? 77 : 73;
    }

    /*
     * Get the set point for House 3.
     */
    private double getCoolingSetPoint3() {
        return 71;
    }
    
    /*
     * Use the GridLAB-D clock global variable to determine if work hours have started/ended.
     */
    private void handleInteractionClass(GLDClock interaction) {
        final String gldTimeStamp = interaction.get_timeStamp();
        log.debug("received GridLAB-D time stamp as {}", gldTimeStamp);
        handleTimeStamp(gldTimeStamp);
    }

    /*
     * Toggle the boolean that represents work schedule when entering/leaving work hours.
     */
    private void handleTimeStamp(String gldTimeStamp) {
        boolean isWorkHours = isDuringWorkHours(gldTimeStamp);

        // check if it's time to toggle isWorkSchedule
        if (isWorkHours && !isWorkSchedule) {
            log.info("turning on work schedule at {}", gldTimeStamp);
            isWorkSchedule = true;
        } else if (!isWorkHours && isWorkSchedule) {
            log.info("turning off work schedule at {}", gldTimeStamp);
            isWorkSchedule = false;
        }
    }

    /*
     * Check if the GridLAB-D time stamp is between 8:00 AM and 5:00 PM.
     */
    private boolean isDuringWorkHours(String gldTimeStamp) {
        int hourValue = Integer.parseInt(getHour(gldTimeStamp));
        return hourValue >= 8 && hourValue < 17;
    }

    /*
     * Extract the hour value from the GridLAB-D string time stamp.
     */
    private String getHour(String gldTimeStamp) {
        // timestamp format is 'YYYY-MM-DD hh:mm:ss ZZZ'
        int hourStartIndex = gldTimeStamp.indexOf(' ') + 1;
        int hourEndIndex   = gldTimeStamp.indexOf(':');
        String hourString  = gldTimeStamp.substring(hourStartIndex, hourEndIndex);
        log.trace("extracted hour={} from {}", hourString, gldTimeStamp);
        return hourString;
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            HouseSchedule federate = new HouseSchedule(federateConfig);
            federate.execute();
            log.info("Done.");
            System.exit(0);
        } catch (Exception e) {
            log.error(e);
            System.exit(1);
        }
    }
}
