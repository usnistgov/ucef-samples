package HelloWorld;


import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PingCounter extends PingCounterBase {

    private static final Logger logger = LogManager.getLogger(PingCounter.class);

    public PingCounter(FederateConfig params) throws Exception {
        super(params);
    }

    private void execute() throws Exception {

        double currentTime = 0;

        if (super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        AdvanceTimeRequest atr = new AdvanceTimeRequest(currentTime);
        putAdvanceTimeRequest(atr);

        if(!super.isLateJoiner()) {
            readyToPopulate();
            readyToRun();
        }

        startAdvanceTimeThread();

        ObjectReflector objectReflector;

        while (true) {
            currentTime += 1;

            atr.requestSyncStart();

            while ((objectReflector = getNextObjectReflectorNoWait()) != null) {
                objectReflector.reflect();
                PingCount pingCount = (PingCount) objectReflector.getObjectRoot();
                logger.info("Message from PingCounter: {} has received {} \"Ping\" interactions at time {}",
                        pingCount.get_SinkName(), pingCount.get_RunningCount(), pingCount.getTime());
            }

            AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
            putAdvanceTimeRequest(newATR);

            atr.requestSyncEnd();
            atr = newATR;
        }

    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            PingCounter pingCounter = new PingCounter(federateConfig);
            pingCounter.execute();
        } catch (Exception e) {
            logger.error("There was a problem executing the PingCounter federate: {}", e.getMessage());
            logger.error(e);
        }
    }
}
