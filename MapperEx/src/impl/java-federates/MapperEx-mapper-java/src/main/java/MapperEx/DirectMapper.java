
package MapperEx;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import hla.rti.EventRetractionHandle;
import hla.rti.LogicalTime;
import hla.rti.ReceivedInteraction;
import org.cpswt.hla.*;

public class DirectMapper extends DirectMapperBase {

    private static Pattern pattern = Pattern.compile( "[^#]" );

	public DirectMapper(String federationId, String federateId)
			throws Exception {
		super(federationId, federateId);
	}

    public DirectMapper( String[] args ) throws Exception {
        super( args );
    }
    
    private static double STEP_EPSILON = 0.000001;
    
    public boolean isMapperFederate() {
        return true;
    }

    
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: 893f1b50_6b74_85d6_6f98_7307d5782d5d) between interactions:
	//
	//         Bonjour --to--> Hello
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DirectMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_Bonjour_to_Hello_893f1b50_6b74_85d6_6f98_7307d5782d5d(Bonjour i1) {
		
		return true;
	}


	public Hello map_Bonjour_to_Hello_893f1b50_6b74_85d6_6f98_7307d5782d5d(Bonjour i1) {
		Hello o1 = create_Hello();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: 82ced9bb_a496_3eaf_8a84_4086d424d2ef) between interactions:
	//
	//         Namaste --to--> Bonjour
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DirectMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_Namaste_to_Bonjour_82ced9bb_a496_3eaf_8a84_4086d424d2ef(Namaste i1) {
		
		return true;
	}


	public Bonjour map_Namaste_to_Bonjour_82ced9bb_a496_3eaf_8a84_4086d424d2ef(Namaste i1) {
		Bonjour o1 = create_Bonjour();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: 5adcd851_b979_2c5f_f2c9_9cba4c78328f) between interactions:
	//
	//         Hello --to--> Bonjour
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DirectMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_Hello_to_Bonjour_5adcd851_b979_2c5f_f2c9_9cba4c78328f(Hello i1) {
		
		return true;
	}


	public Bonjour map_Hello_to_Bonjour_5adcd851_b979_2c5f_f2c9_9cba4c78328f(Hello i1) {
		Bonjour o1 = create_Bonjour();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: b9f8dcb8_cdfb_6ea6_3b48_1515565c1800) between interactions:
	//
	//         Hello --to--> Namaste
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DirectMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_Hello_to_Namaste_b9f8dcb8_cdfb_6ea6_3b48_1515565c1800(Hello i1) {
		
		return true;
	}


	public Namaste map_Hello_to_Namaste_b9f8dcb8_cdfb_6ea6_3b48_1515565c1800(Hello i1) {
		Namaste o1 = create_Namaste();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: 9a789346_a71b_6cbf_d242_0e95ea7f07b2) between interactions:
	//
	//         Namaste --to--> Hello
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DirectMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_Namaste_to_Hello_9a789346_a71b_6cbf_d242_0e95ea7f07b2(Namaste i1) {
		
		return true;
	}


	public Hello map_Namaste_to_Hello_9a789346_a71b_6cbf_d242_0e95ea7f07b2(Namaste i1) {
		Hello o1 = create_Hello();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: a4e46030_6f41_6bbe_10ab_357776317150) between interactions:
	//
	//         Bonjour --to--> Namaste
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DirectMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_Bonjour_to_Namaste_a4e46030_6f41_6bbe_10ab_357776317150(Bonjour i1) {
		
		return true;
	}


	public Namaste map_Bonjour_to_Namaste_a4e46030_6f41_6bbe_10ab_357776317150(Bonjour i1) {
		Namaste o1 = create_Namaste();
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
	    	System.out.print( "DirectMapper: Requesting RTI to proceed to (" + currentTime + ")..." );
	    	
	        atr.requestSyncStart();
	        currentTime = atr.getCurrentTime();

	        System.out.println( "granted!" );

	        InteractionRoot interactionRoot;

	        System.out.println("Now waiting to receive an interaction...");
	        while(  ( interactionRoot = getNextInteractionNoWait() ) != null ) {
	            	
				System.out.println( "DirectMapper: received interaction: \"" + interactionRoot + "\" at time: " + getCurrentTime() );

				boolean interactionMapped = false;			
				
				
				if( interactionRoot instanceof Bonjour ) {
					Bonjour i1 = (Bonjour) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "Hello".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_Bonjour_to_Hello_893f1b50_6b74_85d6_6f98_7307d5782d5d(i1) ) {
								Hello o1 = map_Bonjour_to_Hello_893f1b50_6b74_85d6_6f98_7307d5782d5d(i1);
								System.out.println( "DirectMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof Namaste ) {
					Namaste i1 = (Namaste) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "Bonjour".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_Namaste_to_Bonjour_82ced9bb_a496_3eaf_8a84_4086d424d2ef(i1) ) {
								Bonjour o1 = map_Namaste_to_Bonjour_82ced9bb_a496_3eaf_8a84_4086d424d2ef(i1);
								System.out.println( "DirectMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof Hello ) {
					Hello i1 = (Hello) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "Bonjour".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_Hello_to_Bonjour_5adcd851_b979_2c5f_f2c9_9cba4c78328f(i1) ) {
								Bonjour o1 = map_Hello_to_Bonjour_5adcd851_b979_2c5f_f2c9_9cba4c78328f(i1);
								System.out.println( "DirectMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof Hello ) {
					Hello i1 = (Hello) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "Namaste".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_Hello_to_Namaste_b9f8dcb8_cdfb_6ea6_3b48_1515565c1800(i1) ) {
								Namaste o1 = map_Hello_to_Namaste_b9f8dcb8_cdfb_6ea6_3b48_1515565c1800(i1);
								System.out.println( "DirectMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof Namaste ) {
					Namaste i1 = (Namaste) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "Hello".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_Namaste_to_Hello_9a789346_a71b_6cbf_d242_0e95ea7f07b2(i1) ) {
								Hello o1 = map_Namaste_to_Hello_9a789346_a71b_6cbf_d242_0e95ea7f07b2(i1);
								System.out.println( "DirectMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof Bonjour ) {
					Bonjour i1 = (Bonjour) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "Namaste".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_Bonjour_to_Namaste_a4e46030_6f41_6bbe_10ab_357776317150(i1) ) {
								Namaste o1 = map_Bonjour_to_Namaste_a4e46030_6f41_6bbe_10ab_357776317150(i1);
								System.out.println( "DirectMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}

				if( !interactionMapped ) {
	          		System.out.println( "DirectMapper: Received unknown interaction: " + interactionRoot );
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
	    System.out.println( "DirectMapper federate starting" );
	    try {
	    	DirectMapper mapperFed = new DirectMapper( args );
	        mapperFed.execute();
	    } catch ( Exception e ) {
	        System.err.println( "Exception caught: " + e.getMessage() );
	        e.printStackTrace();
	    }
	}

}
