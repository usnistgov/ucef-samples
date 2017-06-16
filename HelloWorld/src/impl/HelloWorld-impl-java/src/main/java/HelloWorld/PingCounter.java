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

package HelloWorld;

import c2w.hla.base.AdvanceTimeRequest;
import c2w.hla.base.ObjectReflector;

public class PingCounter extends PingCounterBase {

    public PingCounter( String federation_id, String federate_id ) throws Exception {
        super( federation_id, federate_id );
    }

    public PingCounter( String[] federationInfo ) throws Exception {
        super( federationInfo );
    }

    private void execute() throws Exception {
        
        double currentTime = 0;
        
        AdvanceTimeRequest atr = new AdvanceTimeRequest( currentTime );
        putAdvanceTimeRequest( atr );

        readyToPopulate();
        readyToRun();

        startAdvanceTimeThread();

        ObjectReflector objectReflector;    
        
        while( true ) {
            currentTime += 1;

            atr.requestSyncStart();
            
            while(  ( objectReflector = getNextObjectReflectorNoWait() ) != null ) {
                objectReflector.reflect();
                PingCount pingCount = (PingCount)objectReflector.getObjectRoot();
                System.out.println(
                 "Message from PingCounter:  " + pingCount.get_SinkName() + " has received " +
                  pingCount.get_RunningCount() + " \"Ping\" interactions at time " + pingCount.getTime()
                 );
            }

            AdvanceTimeRequest newATR = new AdvanceTimeRequest( currentTime );
            putAdvanceTimeRequest( newATR );
            
            atr.requestSyncEnd();
            atr = newATR;
        }

    }

    public static void main( String[] args ) {
        try {
            PingCounter pingCounter = new PingCounter( args );
            pingCounter.execute();
        } catch ( Exception e ) {
            System.err.println( "Exception caught: " + e.getMessage() );
            e.printStackTrace();
        }
    }
}
