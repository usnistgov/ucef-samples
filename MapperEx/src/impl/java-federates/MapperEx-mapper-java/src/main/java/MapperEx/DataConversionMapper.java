
package MapperEx;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import hla.rti.EventRetractionHandle;
import hla.rti.LogicalTime;
import hla.rti.ReceivedInteraction;
import org.cpswt.hla.*;

public class DataConversionMapper extends DataConversionMapperBase {

    private static Pattern pattern = Pattern.compile( "[^#]" );

	public DataConversionMapper(String federationId, String federateId)
			throws Exception {
		super(federationId, federateId);
	}

    public DataConversionMapper( String[] args ) throws Exception {
        super( args );
    }
    
    private static double STEP_EPSILON = 0.000001;
    
    public boolean isMapperFederate() {
        return true;
    }

    
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: de06a0c5_cdb1_5d3e_bee9_b060a2d15765) between interactions:
	//
	//         IndianTransferReceipt --to--> USTransferReceipt
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DataConversionMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_IndianTransferReceipt_to_USTransferReceipt_de06a0c5_cdb1_5d3e_bee9_b060a2d15765(IndianTransferReceipt i1) {
		
		return true;
	}


	public USTransferReceipt map_IndianTransferReceipt_to_USTransferReceipt_de06a0c5_cdb1_5d3e_bee9_b060a2d15765(IndianTransferReceipt i1) {
		USTransferReceipt o1 = create_USTransferReceipt();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: 0d25695f_143e_1634_fdd5_823f0bc61ce4) between interactions:
	//
	//         USTransferReceipt --to--> FrenchTransferReceipt
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DataConversionMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_USTransferReceipt_to_FrenchTransferReceipt_0d25695f_143e_1634_fdd5_823f0bc61ce4(USTransferReceipt i1) {
		
		return true;
	}


	public FrenchTransferReceipt map_USTransferReceipt_to_FrenchTransferReceipt_0d25695f_143e_1634_fdd5_823f0bc61ce4(USTransferReceipt i1) {
		FrenchTransferReceipt o1 = create_FrenchTransferReceipt();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: fd092f92_fb85_8ad1_407b_9edaba2990b3) between interactions:
	//
	//         USTransferReceipt --to--> IndianTransferReceipt
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DataConversionMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_USTransferReceipt_to_IndianTransferReceipt_fd092f92_fb85_8ad1_407b_9edaba2990b3(USTransferReceipt i1) {
		
		return true;
	}


	public IndianTransferReceipt map_USTransferReceipt_to_IndianTransferReceipt_fd092f92_fb85_8ad1_407b_9edaba2990b3(USTransferReceipt i1) {
		IndianTransferReceipt o1 = create_IndianTransferReceipt();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: 3d1201b5_74d6_9e7f_9e83_cb8d25d1b0aa) between interactions:
	//
	//         IndianTransferReceipt --to--> FrenchTransferReceipt
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DataConversionMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_IndianTransferReceipt_to_FrenchTransferReceipt_3d1201b5_74d6_9e7f_9e83_cb8d25d1b0aa(IndianTransferReceipt i1) {
		
		return true;
	}


	public FrenchTransferReceipt map_IndianTransferReceipt_to_FrenchTransferReceipt_3d1201b5_74d6_9e7f_9e83_cb8d25d1b0aa(IndianTransferReceipt i1) {
		FrenchTransferReceipt o1 = create_FrenchTransferReceipt();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: 06c583dc_2049_3970_65f0_0cb8f2407b5b) between interactions:
	//
	//         FrenchTransferReceipt --to--> IndianTransferReceipt
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DataConversionMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_FrenchTransferReceipt_to_IndianTransferReceipt_06c583dc_2049_3970_65f0_0cb8f2407b5b(FrenchTransferReceipt i1) {
		
		return true;
	}


	public IndianTransferReceipt map_FrenchTransferReceipt_to_IndianTransferReceipt_06c583dc_2049_3970_65f0_0cb8f2407b5b(FrenchTransferReceipt i1) {
		IndianTransferReceipt o1 = create_IndianTransferReceipt();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For SimpleMappingConnection (ID: 6fa86706_0134_3ed0_bc77_cbe81bd42228) between interactions:
	//
	//         FrenchTransferReceipt --to--> USTransferReceipt
	//
	// This SimpleMappingConnection is located at:
	//
	//         Mappings/DataConversionMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_FrenchTransferReceipt_to_USTransferReceipt_6fa86706_0134_3ed0_bc77_cbe81bd42228(FrenchTransferReceipt i1) {
		
		return true;
	}


	public USTransferReceipt map_FrenchTransferReceipt_to_USTransferReceipt_6fa86706_0134_3ed0_bc77_cbe81bd42228(FrenchTransferReceipt i1) {
		USTransferReceipt o1 = create_USTransferReceipt();
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
	    	System.out.print( "DataConversionMapper: Requesting RTI to proceed to (" + currentTime + ")..." );
	    	
	        atr.requestSyncStart();
	        currentTime = atr.getCurrentTime();

	        System.out.println( "granted!" );

	        InteractionRoot interactionRoot;

	        System.out.println("Now waiting to receive an interaction...");
	        while(  ( interactionRoot = getNextInteractionNoWait() ) != null ) {
	            	
				System.out.println( "DataConversionMapper: received interaction: \"" + interactionRoot + "\" at time: " + getCurrentTime() );

				boolean interactionMapped = false;			
				
				
				if( interactionRoot instanceof IndianTransferReceipt ) {
					IndianTransferReceipt i1 = (IndianTransferReceipt) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "USTransferReceipt".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_IndianTransferReceipt_to_USTransferReceipt_de06a0c5_cdb1_5d3e_bee9_b060a2d15765(i1) ) {
								USTransferReceipt o1 = map_IndianTransferReceipt_to_USTransferReceipt_de06a0c5_cdb1_5d3e_bee9_b060a2d15765(i1);
								System.out.println( "DataConversionMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof USTransferReceipt ) {
					USTransferReceipt i1 = (USTransferReceipt) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "FrenchTransferReceipt".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_USTransferReceipt_to_FrenchTransferReceipt_0d25695f_143e_1634_fdd5_823f0bc61ce4(i1) ) {
								FrenchTransferReceipt o1 = map_USTransferReceipt_to_FrenchTransferReceipt_0d25695f_143e_1634_fdd5_823f0bc61ce4(i1);
								System.out.println( "DataConversionMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof USTransferReceipt ) {
					USTransferReceipt i1 = (USTransferReceipt) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "IndianTransferReceipt".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_USTransferReceipt_to_IndianTransferReceipt_fd092f92_fb85_8ad1_407b_9edaba2990b3(i1) ) {
								IndianTransferReceipt o1 = map_USTransferReceipt_to_IndianTransferReceipt_fd092f92_fb85_8ad1_407b_9edaba2990b3(i1);
								System.out.println( "DataConversionMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof IndianTransferReceipt ) {
					IndianTransferReceipt i1 = (IndianTransferReceipt) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "FrenchTransferReceipt".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_IndianTransferReceipt_to_FrenchTransferReceipt_3d1201b5_74d6_9e7f_9e83_cb8d25d1b0aa(i1) ) {
								FrenchTransferReceipt o1 = map_IndianTransferReceipt_to_FrenchTransferReceipt_3d1201b5_74d6_9e7f_9e83_cb8d25d1b0aa(i1);
								System.out.println( "DataConversionMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof FrenchTransferReceipt ) {
					FrenchTransferReceipt i1 = (FrenchTransferReceipt) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "IndianTransferReceipt".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_FrenchTransferReceipt_to_IndianTransferReceipt_06c583dc_2049_3970_65f0_0cb8f2407b5b(i1) ) {
								IndianTransferReceipt o1 = map_FrenchTransferReceipt_to_IndianTransferReceipt_06c583dc_2049_3970_65f0_0cb8f2407b5b(i1);
								System.out.println( "DataConversionMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof FrenchTransferReceipt ) {
					FrenchTransferReceipt i1 = (FrenchTransferReceipt) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "USTransferReceipt".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_FrenchTransferReceipt_to_USTransferReceipt_6fa86706_0134_3ed0_bc77_cbe81bd42228(i1) ) {
								USTransferReceipt o1 = map_FrenchTransferReceipt_to_USTransferReceipt_6fa86706_0134_3ed0_bc77_cbe81bd42228(i1);
								System.out.println( "DataConversionMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}

				if( !interactionMapped ) {
	          		System.out.println( "DataConversionMapper: Received unknown interaction: " + interactionRoot );
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
	    System.out.println( "DataConversionMapper federate starting" );
	    try {
	    	DataConversionMapper mapperFed = new DataConversionMapper( args );
	        mapperFed.execute();
	    } catch ( Exception e ) {
	        System.err.println( "Exception caught: " + e.getMessage() );
	        e.printStackTrace();
	    }
	}

}
