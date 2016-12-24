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

package GridlabDHelloWorld;


public class ExtIOFed extends ExtIOFedBase {
        
    public ExtIOFed( String[] args ) throws Exception {
        super( args );
    }

    private void execute() throws Exception {
        
        double currentTime = 0;
        
        AdvanceTimeRequest atr = new AdvanceTimeRequest( currentTime );
        putAdvanceTimeRequest( atr );

        readyToPopulate();
        readyToRun();

        startAdvanceTimeThread();

        int ix = 0;
        while( true ) {
            GridlabDInput gridlabDInput = create_GridlabDInput();
            String objectName = "house1";
            String parameterName = "power";
            int operation = 0;
            String units = "";
            gridlabDInput.set_ObjectName(objectName);
            gridlabDInput.set_Parameter(parameterName);
            gridlabDInput.set_Operation(operation);
            gridlabDInput.set_Units(units);
            gridlabDInput.set_Value(0.0);
            
            atr.requestSyncStart();

            System.out.println( "ExtIOFed: Sending GridlabDInput interaction #" + ix );
            gridlabDInput.sendInteraction( getRTI(), currentTime + 2.0 );
            
            currentTime += 20;

            AdvanceTimeRequest newATR = new AdvanceTimeRequest( currentTime );
            putAdvanceTimeRequest( newATR );
            
            atr.requestSyncEnd();
            atr = newATR;

            ++ix;
        }
        
    }
    
    public static void main( String[] args ) {
        try {
            ExtIOFed extIOFed = new ExtIOFed( args );
            extIOFed.execute();
        } catch ( Exception e ) {
            System.err.println( "Exception caught: " + e.getMessage() );
            e.printStackTrace();
        }
    }
}
