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

import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;

public class Sink extends SinkBase {

    private static final Logger logger = LogManager.getLogger(Source.class);

    public Sink(FederateConfig params) throws Exception {
        super(params);
    }

    private void execute() throws Exception {

        double currentTime = 0;

        if (super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        double timeOrderOffsetIncrement = 0.00001;

        AdvanceTimeRequest atr = new AdvanceTimeRequest(currentTime);
        putAdvanceTimeRequest(atr);

        if(!super.isLateJoiner()) {
            readyToPopulate();
            readyToRun();
        }

        startAdvanceTimeThread();

        InteractionRoot interactionRoot;

        PingCount pingCount = new PingCount();
        pingCount.set_SinkName("Sink");
        pingCount.set_RunningCount(0);

        pingCount.registerObject(super.getLRC());
        pingCount.updateAttributeValues(super.getLRC(), currentTime + super.getLookAhead());

        while (true) {
            double timeOrderOffset = 0;
            currentTime += super.getStepSize();

            atr.requestSyncStart();

            while ((interactionRoot = getNextInteractionNoWait()) != null) {
                Ping ping = (Ping) interactionRoot;
                logger.info("Sink: Received Ping interaction #{}", ping.get_Count());
                pingCount.set_RunningCount(pingCount.get_RunningCount() + 1);
                pingCount.updateAttributeValues(super.getLRC(), currentTime + super.getLookAhead() + timeOrderOffset);
                timeOrderOffset += timeOrderOffsetIncrement;
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
            Sink sink = new Sink(federateConfig);
            sink.execute();
        } catch (Exception e) {
            logger.error("There was a problem executing the Sink federate: {}", e.getMessage());
            logger.error(e);
        }
    }
}
