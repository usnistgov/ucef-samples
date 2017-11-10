/*
 * Copyright (c) 2008, Institute for Software Integrated Systems, Vanderbilt University
 * All rights reserved.
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation for any purpose, without fee, and without written agreement is
 * hereby granted, provided that the above copyright notice, the following
 * two paragraphs and the author appear in all copies of this software.
 *
 * IN NO EVENT SHALL THE VANDERBILT UNIVERSITY BE LIABLE TO ANY PARTY FOR
 * DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES ARISING OUT
 * OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF THE VANDERBILT
 * UNIVERSITY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * THE VANDERBILT UNIVERSITY SPECIFICALLY DISCLAIMS ANY WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS FOR A PARTICULAR PURPOSE.  THE SOFTWARE PROVIDED HEREUNDER IS
 * ON AN "AS IS" BASIS, AND THE VANDERBILT UNIVERSITY HAS NO OBLIGATION TO
 * PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 */

package HelloWorld_Java_Tutorial;


import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.utils.CpswtDefaults;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;

public class PingCounter extends PingCounterBase {

    private static final Logger logger = LogManager.getLogger(Source.class);

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
