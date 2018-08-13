package GLDExample;

import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.ObjectRoot;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A test federate that controls three house objects for the GridLAB-D wrapper. 
 */
public class TestFederate extends TestFederateBase {
    private final static Logger log = LogManager.getLogger();

    private double currentTime = 0;

    private boolean useCelsius;

    private boolean isWorkSchedule = false;

    private CoolingControlObject house2 = null;

    private CoolingControlObject house3 = null;

    public TestFederate(TestFederateConfig params) throws Exception {
        super(params);
        this.useCelsius = params.useCelsius;
    }

    private void checkReceivedSubscriptions() {
        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof House) {
                handleInteractionClass((House) interaction);
            }
            else if (interaction instanceof GLDClock) {
                handleInteractionClass((GLDClock) interaction);
            }
            else {
                log.debug("unhandled interaction: {}", interaction.getClassName());
            }
        }
 
        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof HouseObject) {
                handleObjectClass((HouseObject) object);
            }
            else {
                log.debug("unhandled object reflection: {}", object.getClassName());
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

        sendInitialValues();

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
            updateCoolingSetpoints();

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

    private void sendInitialValues() {
        CoolingControl house1 = create_CoolingControl();
        house1.set_name("house1");
        house1.set_cooling_setpoint(getCoolingSetpoint1());
        house1.sendInteraction(getLRC());
        log.debug("sent {}", house1.toString());

        house2 = new CoolingControlObject();
        house2.registerObject(getLRC());
        house2.set_name("house2");
        house2.set_cooling_setpoint(getCoolingSetpoint2());
        house2.updateAttributeValues(getLRC());
        log.debug("created {}", house2.toString());

        house3 = new CoolingControlObject();
        house3.registerObject(getLRC());
        house3.set_name("house3");
        house3.set_cooling_setpoint(getCoolingSetpoint3());
        house3.updateAttributeValues(getLRC());
        log.debug("created {}", house3.toString());

        SimTime time = create_SimTime();
        time.set_unixTimeStart(1243915200); // 2009-06-02 00:00:00 ET
        time.set_unixTimeStop(1244001600);  // 2009-06-03 00:00:00 ET
        time.set_timeScale(900);            // 15 minutes
        time.set_timeZone("US/MD/Baltimore");
        time.sendInteraction(getLRC());
        log.debug("sent {}", time.toString());
    }

    private double getCoolingSetpoint1() {
        if (useCelsius) {
            return isWorkSchedule ? 24 : 21;
        }
        return isWorkSchedule ? 75 : 69;
    }

    private double getCoolingSetpoint2() {
        if (useCelsius) {
            return isWorkSchedule ? 25 : 23;
        }
        return isWorkSchedule ? 77 : 73;
    }

    private double getCoolingSetpoint3() {
        if (useCelsius) {
            return 22;
        }
        return 71;
    }

    private void updateCoolingSetpoints() {
        double cooling_setpoint1 = getCoolingSetpoint1();
        double cooling_setpoint2 = getCoolingSetpoint2();
        double cooling_setpoint3 = getCoolingSetpoint3();

        CoolingControl coolingControl = create_CoolingControl();
        coolingControl.set_name("house1");
        coolingControl.set_cooling_setpoint(cooling_setpoint1);
        coolingControl.sendInteraction(getLRC(), currentTime + getLookAhead());
        log.info("set house1.cooling_setpoint={}", cooling_setpoint1);

        house2.set_cooling_setpoint(cooling_setpoint2);
        house2.updateAttributeValues(getLRC(), currentTime + getLookAhead());
        log.info("set house2.cooling_setpoint={}", cooling_setpoint2);

        house3.set_cooling_setpoint(cooling_setpoint3);
        house3.updateAttributeValues(getLRC(), currentTime + getLookAhead());
        log.info("set house3.cooling_setpoint={}", cooling_setpoint3);
    }

    private void handleInteractionClass(House interaction) {
        log.debug("received {}", interaction.toString());
    }

    private void handleInteractionClass(GLDClock interaction) {
        final String gldTimeStamp = interaction.get_timeStamp();
        log.debug("received GridLAB-D time stamp as {}", gldTimeStamp);
        handleTimeStamp(gldTimeStamp);
    }

    private void handleObjectClass(HouseObject object) {
        log.debug("received {}", object.toString());
    }

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

    private boolean isDuringWorkHours(String gldTimeStamp) {
        int hourValue = Integer.parseInt(getHour(gldTimeStamp));
        return hourValue >= 8 && hourValue < 17;
    }

    private String getHour(String gldTimeStamp) {
        // timestamp format is 'YYYY-MM-DD hh:mm:ss ZZZ'
        int hourStartIndex = gldTimeStamp.indexOf(' ') + 1;
        int hourEndIndex   = gldTimeStamp.indexOf(':');
        String hourString  = gldTimeStamp.substring(hourStartIndex, hourEndIndex);
        log.debug("extracted hour={} from {}", hourString, gldTimeStamp);
        return hourString;
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            TestFederateConfig federateConfig = federateConfigParser.parseArgs(args, TestFederateConfig.class);
            TestFederate federate = new TestFederate(federateConfig);
            federate.execute();
            log.info("Done.");
            System.exit(0);
        } catch (Exception e) {
            log.error(e);
            System.exit(1);
        }
    }
}
