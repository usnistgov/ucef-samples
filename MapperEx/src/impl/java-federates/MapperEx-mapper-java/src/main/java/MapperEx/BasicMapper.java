
package MapperEx;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import hla.rti.EventRetractionHandle;
import hla.rti.LogicalTime;
import hla.rti.ReceivedInteraction;
import org.cpswt.hla.*;

public class BasicMapper extends BasicMapperBase {

    private static Pattern pattern = Pattern.compile( "[^#]" );

	public BasicMapper(String federationId, String federateId)
			throws Exception {
		super(federationId, federateId);
	}

    public BasicMapper( String[] args ) throws Exception {
        super( args );
    }
    
    private static double STEP_EPSILON = 0.000001;
    
    public boolean isMapperFederate() {
        return true;
    }

    
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: 7524a357_6f61_61e5_9998_2bbd6b912031) between interactions:
	//
	//         EUDebtSG --to--> EUDebtBAC
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/BasicMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_EUDebtSG_to_EUDebtBAC_7524a357_6f61_61e5_9998_2bbd6b912031(EUDebtSG i1) {
		
		return true;
	}


	public EUDebtBAC map_EUDebtSG_to_EUDebtBAC_7524a357_6f61_61e5_9998_2bbd6b912031(EUDebtSG i1) {
		EUDebtBAC o1 = create_EUDebtBAC();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: 6c721800_5b8b_4202_5812_9caef2da3411) between interactions:
	//
	//         EUDebtBAC --to--> EUDebtSG
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/BasicMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_EUDebtBAC_to_EUDebtSG_6c721800_5b8b_4202_5812_9caef2da3411(EUDebtBAC i1) {
		
		return true;
	}


	public EUDebtSG map_EUDebtBAC_to_EUDebtSG_6c721800_5b8b_4202_5812_9caef2da3411(EUDebtBAC i1) {
		EUDebtSG o1 = create_EUDebtSG();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
    
    
    
    

	
	public void execute() throws Exception {
	    double currentTime = 0;

	    AdvanceTimeRequest atr = new AdvanceTimeRequest( currentTime );
	    putAdvanceTimeRequest( atr );

	    readyToPopulate();
	    readyToRun();

	    startAdvanceTimeThread(TIME_ADVANCE_MODE.NEXT_EVENT_REQUEST_AVAILABLE);

	    while( true ) {
	    	System.out.print( "BasicMapper: Requesting RTI to proceed to (" + currentTime + ")..." );
	    	
	        atr.requestSyncStart();
	        currentTime = atr.getCurrentTime();

	        System.out.println( "granted!" );

	        InteractionRoot interactionRoot;

	        System.out.println("Now waiting to receive an interaction...");
	        while(  ( interactionRoot = getNextInteractionNoWait() ) != null ) {
	            	
				System.out.println( "BasicMapper: received interaction: \"" + interactionRoot + "\" at time: " + getCurrentTime() );

				boolean interactionMapped = false;			
				
				
				if( interactionRoot instanceof EUDebtSG ) {
					EUDebtSG i1 = (EUDebtSG) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "EUDebtBAC".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_EUDebtSG_to_EUDebtBAC_7524a357_6f61_61e5_9998_2bbd6b912031(i1) ) {
								EUDebtBAC o1 = map_EUDebtSG_to_EUDebtBAC_7524a357_6f61_61e5_9998_2bbd6b912031(i1);
								System.out.println( "BasicMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof EUDebtBAC ) {
					EUDebtBAC i1 = (EUDebtBAC) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "EUDebtSG".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_EUDebtBAC_to_EUDebtSG_6c721800_5b8b_4202_5812_9caef2da3411(i1) ) {
								EUDebtSG o1 = map_EUDebtBAC_to_EUDebtSG_6c721800_5b8b_4202_5812_9caef2da3411(i1);
								System.out.println( "BasicMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}

				if( !interactionMapped ) {
	          		System.out.println( "BasicMapper: Received unknown interaction: " + interactionRoot );
	           	}
	        }

	        currentTime = getCurrentTime() + 1 + STEP_EPSILON;
	        AdvanceTimeRequest newATR = new AdvanceTimeRequest( currentTime );
	        putAdvanceTimeRequest( newATR );
	        
	        atr.requestSyncEnd();
	        atr = newATR;
	    }
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    System.out.println( "BasicMapper federate starting" );
	    try {
	    	BasicMapper mapperFed = new BasicMapper( args );
	        mapperFed.execute();
	    } catch ( Exception e ) {
	        System.err.println( "Exception caught: " + e.getMessage() );
	        e.printStackTrace();
	    }
	}

}
