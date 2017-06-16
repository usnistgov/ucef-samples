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
import c2w.hla.InteractionRoot;

public class Sink extends SinkBase {

    public Sink( String args[] ) throws Exception {
        super( args );
    }

    private void execute() throws Exception {
        
        double currentTime = 0;
        double timeOrderOffsetIncrement = 0.00001;
        
        AdvanceTimeRequest atr = new AdvanceTimeRequest( currentTime );
        putAdvanceTimeRequest( atr );

        readyToPopulate();
        readyToRun();

        startAdvanceTimeThread();

        InteractionRoot interactionRoot;    
        
        PingCount pingCount = new PingCount();
        pingCount.set_SinkName( "Sink" );
        pingCount.set_RunningCount( 0 );

        pingCount.registerObject( getRTI() );
        pingCount.updateAttributeValues( getRTI(), currentTime + getLookahead() );
        
        while( true ) {
            double timeOrderOffset = 0;
            currentTime += 1;

            atr.requestSyncStart();
            
            while(  ( interactionRoot = getNextInteractionNoWait() ) != null ) {
                Ping ping = (Ping)interactionRoot;
                System.out.println( "Sink: Received Ping interaction #" + ping.get_Count() );
                pingCount.set_RunningCount( pingCount.get_RunningCount() + 1 );
                pingCount.updateAttributeValues( getRTI(), currentTime + getLookahead() + timeOrderOffset  );
                timeOrderOffset += timeOrderOffsetIncrement;
            }

            AdvanceTimeRequest newATR = new AdvanceTimeRequest( currentTime );
            putAdvanceTimeRequest( newATR );
            
            atr.requestSyncEnd();
            atr = newATR;
        }
        
    }

    public static void main( String[] args ) {
        try {
            Sink sink = new Sink( args );
            sink.execute();
        } catch ( Exception e ) {
            System.err.println( "Exception caught: " + e.getMessage() );
            e.printStackTrace();
        }
    }
}
