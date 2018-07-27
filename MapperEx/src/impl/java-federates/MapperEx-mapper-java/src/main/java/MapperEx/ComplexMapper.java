
package MapperEx;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import hla.rti.EventRetractionHandle;
import hla.rti.LogicalTime;
import hla.rti.ReceivedInteraction;
import org.cpswt.hla.*;

public class ComplexMapper extends ComplexMapperBase {

    private static Pattern pattern = Pattern.compile( "[^#]" );

	public ComplexMapper(String federationId, String federateId)
			throws Exception {
		super(federationId, federateId);
	}

    public ComplexMapper( String[] args ) throws Exception {
        super( args );
    }
    
    private static double STEP_EPSILON = 0.000001;
    
    public boolean isMapperFederate() {
        return true;
    }

    
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For ComplexMappingConnection (ID: ccf7e717_5e6c_363d_bdc1_24bde7d9153f) between interactions:
	//
	//         EUMoneyGram --to--> NetworkPacket
	//
	// This ComplexMappingConnection is located at:
	//
	//         Mappings/ComplexMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_EUMoneyGram_to_NetworkPacket_ccf7e717_5e6c_363d_bdc1_24bde7d9153f(EUMoneyGram i1) {
		
		return true;
	}


	public NetworkPacket map_EUMoneyGram_to_NetworkPacket_ccf7e717_5e6c_363d_bdc1_24bde7d9153f(EUMoneyGram i1) {
		NetworkPacket o1 = create_NetworkPacket();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		o1.set_senderHost("MapperExNetwork.SocieteGenerale");
 o1.set_senderHostApp("BasicUdpAppWrapper");
 o1.set_receiverHostApp("BasicUdpAppWrapper");
 o1.set_senderAppIndex(0);
 o1.set_receiverAppIndex(0);
 o1.set_receiverAppInterface("eth0");
 String receiverBank = i1.get_receiver();
 if("BankOfAmerica".equals(receiverBank)) {     o1.set_packetType("USMoneyGram");
     o1.set_receiverHost("MapperExNetwork.BankOfAmerica");
     o1.set_data("" + i1.get_id() + "*@*" + i1.get_euros() * 1.25 + "*@*" + "SocieteGenerale" + "*@*" + "BankOfAmerica");
 } else {     o1.set_packetType("IndianMoneyGram");
     o1.set_receiverHost("MapperExNetwork.ICICIBank");
     o1.set_data("" + i1.get_id() + "*@*" + i1.get_euros() * 62.5 + "*@*" + "SocieteGenerale" + "*@*" + "ICICIBank");
 } o1.set_numBytes(1024);

		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For ComplexMappingConnection (ID: 2a2980e9_c186_f8c3_3a70_4b606d174dd7) between interactions:
	//
	//         NetworkPacket --to--> IndianMoneyGram
	//
	// This ComplexMappingConnection is located at:
	//
	//         Mappings/ComplexMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_NetworkPacket_to_IndianMoneyGram_2a2980e9_c186_f8c3_3a70_4b606d174dd7(NetworkPacket i1) {
		
		return true;
	}


	public IndianMoneyGram map_NetworkPacket_to_IndianMoneyGram_2a2980e9_c186_f8c3_3a70_4b606d174dd7(NetworkPacket i1) {
		IndianMoneyGram o1 = create_IndianMoneyGram();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
		boolean __NETWORK_PACKET_CORRUPT__ = false;
		InteractionRoot __I1__ = (InteractionRoot) i1;
		if(__I1__ instanceof NetworkPacket ) {
	    	int numParams = o1.getParameterNames().size();
	    	String __DATA__ = ((NetworkPacket) __I1__).get_data();
	    	if(numParams > 0) {
			    Matcher matcher = pattern.matcher( __DATA__ );
			    if ( !matcher.find() ) {
	    			__NETWORK_PACKET_CORRUPT__ = true;
	    			if(o1IR instanceof NetworkPacket && __DATA__.length() == 0 ) {
			    		__NETWORK_PACKET_CORRUPT__ = false;
			    	}
	    		}
	    	} else {
	    		if(__DATA__.length() > 0) {
	    			__NETWORK_PACKET_CORRUPT__ = true;
	    		}
	    	}
		}
		if(!__NETWORK_PACKET_CORRUPT__) {
		    
			String data = i1.get_data();
 StringTokenizer t = new StringTokenizer( data, "*@*");
 o1.set_id(t.nextToken());
 o1.set_rupees(Double.parseDouble(t.nextToken()));
 o1.set_sender(t.nextToken());
 o1.set_receiver(t.nextToken());

		}
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For ComplexMappingConnection (ID: 13ee4bf3_576e_58fc_7f64_b9cb60c16dae) between interactions:
	//
	//         NetworkPacket --to--> EUMoneyGram
	//
	// This ComplexMappingConnection is located at:
	//
	//         Mappings/ComplexMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_NetworkPacket_to_EUMoneyGram_13ee4bf3_576e_58fc_7f64_b9cb60c16dae(NetworkPacket i1) {
		
		return true;
	}


	public EUMoneyGram map_NetworkPacket_to_EUMoneyGram_13ee4bf3_576e_58fc_7f64_b9cb60c16dae(NetworkPacket i1) {
		EUMoneyGram o1 = create_EUMoneyGram();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
		boolean __NETWORK_PACKET_CORRUPT__ = false;
		InteractionRoot __I1__ = (InteractionRoot) i1;
		if(__I1__ instanceof NetworkPacket ) {
	    	int numParams = o1.getParameterNames().size();
	    	String __DATA__ = ((NetworkPacket) __I1__).get_data();
	    	if(numParams > 0) {
			    Matcher matcher = pattern.matcher( __DATA__ );
			    if ( !matcher.find() ) {
	    			__NETWORK_PACKET_CORRUPT__ = true;
	    			if(o1IR instanceof NetworkPacket && __DATA__.length() == 0 ) {
			    		__NETWORK_PACKET_CORRUPT__ = false;
			    	}
	    		}
	    	} else {
	    		if(__DATA__.length() > 0) {
	    			__NETWORK_PACKET_CORRUPT__ = true;
	    		}
	    	}
		}
		if(!__NETWORK_PACKET_CORRUPT__) {
		    
			String data = i1.get_data();
 StringTokenizer t = new StringTokenizer( data, "*@*");
 o1.set_id(Integer.parseInt(t.nextToken()));
 o1.set_euros(Double.parseDouble(t.nextToken()));
 o1.set_sender(t.nextToken());
 o1.set_receiver(t.nextToken());

		}
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For ComplexMappingConnection (ID: a9edb154_6b43_b7dc_ea19_782ba6c2bb33) between interactions:
	//
	//         IndianMoneyGram --to--> NetworkPacket
	//
	// This ComplexMappingConnection is located at:
	//
	//         Mappings/ComplexMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_IndianMoneyGram_to_NetworkPacket_a9edb154_6b43_b7dc_ea19_782ba6c2bb33(IndianMoneyGram i1) {
		
		return true;
	}


	public NetworkPacket map_IndianMoneyGram_to_NetworkPacket_a9edb154_6b43_b7dc_ea19_782ba6c2bb33(IndianMoneyGram i1) {
		NetworkPacket o1 = create_NetworkPacket();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		o1.set_senderHost("MapperExNetwork.ICICIBank");
 o1.set_senderHostApp("BasicUdpAppWrapper");
 o1.set_receiverHostApp("BasicUdpAppWrapper");
 o1.set_senderAppIndex(0);
 o1.set_receiverAppIndex(0);
 o1.set_receiverAppInterface("eth0");
 String receiverBank = i1.get_receiver();
 if("BankOfAmerica".equals(receiverBank)) {     o1.set_packetType("USMoneyGram");
     o1.set_receiverHost("MapperExNetwork.BankOfAmerica");
     o1.set_data("" + i1.get_id() + "*@*" + i1.get_rupees() * 0.02 + "*@*" + "ICICIBank" + "*@*" + "BankOfAmerica");
 } else {     o1.set_packetType("EUMoneyGram");
     o1.set_receiverHost("MapperExNetwork.SocieteGenerale");
     o1.set_data("" + i1.get_id() + "*@*" + i1.get_rupees() * 0.016 + "*@*" + "ICICIBank" + "*@*" + "SocieteGenerale");
 } o1.set_numBytes(1024);

		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For ComplexMappingConnection (ID: 35cabb96_f515_66da_7851_f04aa286aa7d) between interactions:
	//
	//         NetworkPacket --to--> USMoneyGram
	//
	// This ComplexMappingConnection is located at:
	//
	//         Mappings/ComplexMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_NetworkPacket_to_USMoneyGram_35cabb96_f515_66da_7851_f04aa286aa7d(NetworkPacket i1) {
		
		return true;
	}


	public USMoneyGram map_NetworkPacket_to_USMoneyGram_35cabb96_f515_66da_7851_f04aa286aa7d(NetworkPacket i1) {
		USMoneyGram o1 = create_USMoneyGram();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
		boolean __NETWORK_PACKET_CORRUPT__ = false;
		InteractionRoot __I1__ = (InteractionRoot) i1;
		if(__I1__ instanceof NetworkPacket ) {
	    	int numParams = o1.getParameterNames().size();
	    	String __DATA__ = ((NetworkPacket) __I1__).get_data();
	    	if(numParams > 0) {
			    Matcher matcher = pattern.matcher( __DATA__ );
			    if ( !matcher.find() ) {
	    			__NETWORK_PACKET_CORRUPT__ = true;
	    			if(o1IR instanceof NetworkPacket && __DATA__.length() == 0 ) {
			    		__NETWORK_PACKET_CORRUPT__ = false;
			    	}
	    		}
	    	} else {
	    		if(__DATA__.length() > 0) {
	    			__NETWORK_PACKET_CORRUPT__ = true;
	    		}
	    	}
		}
		if(!__NETWORK_PACKET_CORRUPT__) {
		    
			String data = i1.get_data();
 StringTokenizer t = new StringTokenizer( data, "*@*");
 o1.set_id(Integer.parseInt(t.nextToken()));
 o1.set_dollars(Double.parseDouble(t.nextToken()));
 o1.set_sender(t.nextToken());
 o1.set_receiver(t.nextToken());

		}
		

		o1.set_originFed(i1.get_originFed());
		o1.set_actualLogicalGenerationTime(i1.get_actualLogicalGenerationTime());

		return o1;
	}
    
	///////////////////////////////////////////////////////////////////////////////////////
	//
	// For ComplexMappingConnection (ID: 8756189f_c4f6_ae6b_0894_25e9c62c4231) between interactions:
	//
	//         USMoneyGram --to--> NetworkPacket
	//
	// This ComplexMappingConnection is located at:
	//
	//         Mappings/ComplexMapper
	//
	///////////////////////////////////////////////////////////////////////////////////////
	public boolean isGuardConditionMet_USMoneyGram_to_NetworkPacket_8756189f_c4f6_ae6b_0894_25e9c62c4231(USMoneyGram i1) {
		
		return true;
	}


	public NetworkPacket map_USMoneyGram_to_NetworkPacket_8756189f_c4f6_ae6b_0894_25e9c62c4231(USMoneyGram i1) {
		NetworkPacket o1 = create_NetworkPacket();
		InteractionRoot o1IR = (InteractionRoot) o1;
	    
	    
		o1.set_senderHost("MapperExNetwork.BankOfAmerica");
 o1.set_senderHostApp("BasicUdpAppWrapper");
 o1.set_receiverHostApp("BasicUdpAppWrapper");
 o1.set_senderAppIndex(0);
 o1.set_receiverAppIndex(0);
 o1.set_receiverAppInterface("eth0");
 String receiverBank = i1.get_receiver();
 if("SocieteGenerale".equals(receiverBank)) {     o1.set_packetType("EUMoneyGram");
     o1.set_receiverHost("MapperExNetwork.SocieteGenerale");
     o1.set_data("" + i1.get_id() + "*@*" + i1.get_dollars() * 0.8 + "*@*" + "BankOfAmerica" + "*@*" + "SocieteGenerale");
 } else {     o1.set_packetType("IndianMoneyGram");
     o1.set_receiverHost("MapperExNetwork.ICICIBank");
     o1.set_data("" + i1.get_id() + "*@*" + i1.get_dollars() * 50.0 + "*@*" + "BankOfAmerica" + "*@*" + "ICICIBank");
 } o1.set_numBytes(1024);

		

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
	    	System.out.print( "ComplexMapper: Requesting RTI to proceed to (" + currentTime + ")..." );
	    	
	        atr.requestSyncStart();
	        currentTime = atr.getCurrentTime();

	        System.out.println( "granted!" );

	        InteractionRoot interactionRoot;

	        System.out.println("Now waiting to receive an interaction...");
	        while(  ( interactionRoot = getNextInteractionNoWait() ) != null ) {
	            	
				System.out.println( "ComplexMapper: received interaction: \"" + interactionRoot + "\" at time: " + getCurrentTime() );

				boolean interactionMapped = false;			
				
				
				if( interactionRoot instanceof EUMoneyGram ) {
					EUMoneyGram i1 = (EUMoneyGram) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "NetworkPacket".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_EUMoneyGram_to_NetworkPacket_ccf7e717_5e6c_363d_bdc1_24bde7d9153f(i1) ) {
								NetworkPacket o1 = map_EUMoneyGram_to_NetworkPacket_ccf7e717_5e6c_363d_bdc1_24bde7d9153f(i1);
								System.out.println( "ComplexMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof NetworkPacket ) {
					NetworkPacket i1 = (NetworkPacket) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "IndianMoneyGram".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_NetworkPacket_to_IndianMoneyGram_2a2980e9_c186_f8c3_3a70_4b606d174dd7(i1) ) {
								IndianMoneyGram o1 = map_NetworkPacket_to_IndianMoneyGram_2a2980e9_c186_f8c3_3a70_4b606d174dd7(i1);
								System.out.println( "ComplexMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof NetworkPacket ) {
					NetworkPacket i1 = (NetworkPacket) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "EUMoneyGram".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_NetworkPacket_to_EUMoneyGram_13ee4bf3_576e_58fc_7f64_b9cb60c16dae(i1) ) {
								EUMoneyGram o1 = map_NetworkPacket_to_EUMoneyGram_13ee4bf3_576e_58fc_7f64_b9cb60c16dae(i1);
								System.out.println( "ComplexMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof IndianMoneyGram ) {
					IndianMoneyGram i1 = (IndianMoneyGram) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "NetworkPacket".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_IndianMoneyGram_to_NetworkPacket_a9edb154_6b43_b7dc_ea19_782ba6c2bb33(i1) ) {
								NetworkPacket o1 = map_IndianMoneyGram_to_NetworkPacket_a9edb154_6b43_b7dc_ea19_782ba6c2bb33(i1);
								System.out.println( "ComplexMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof NetworkPacket ) {
					NetworkPacket i1 = (NetworkPacket) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "USMoneyGram".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_NetworkPacket_to_USMoneyGram_35cabb96_f515_66da_7851_f04aa286aa7d(i1) ) {
								USMoneyGram o1 = map_NetworkPacket_to_USMoneyGram_35cabb96_f515_66da_7851_f04aa286aa7d(i1);
								System.out.println( "ComplexMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}
				if( interactionRoot instanceof USMoneyGram ) {
					USMoneyGram i1 = (USMoneyGram) interactionRoot;
					
						if(  !(interactionRoot instanceof NetworkPacket) || "NetworkPacket".equals(((NetworkPacket) interactionRoot).get_packetType())  ) {
	
							if( isGuardConditionMet_USMoneyGram_to_NetworkPacket_8756189f_c4f6_ae6b_0894_25e9c62c4231(i1) ) {
								NetworkPacket o1 = map_USMoneyGram_to_NetworkPacket_8756189f_c4f6_ae6b_0894_25e9c62c4231(i1);
								System.out.println( "ComplexMapper: Sending interaction: " + o1 );
								o1.sendInteraction( getRTI(), getMinTSOTimestamp() );
							}
							
							interactionMapped = true;
						}
						
						
				}

				if( !interactionMapped ) {
	          		System.out.println( "ComplexMapper: Received unknown interaction: " + interactionRoot );
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
	    System.out.println( "ComplexMapper federate starting" );
	    try {
	    	ComplexMapper mapperFed = new ComplexMapper( args );
	        mapperFed.execute();
	    } catch ( Exception e ) {
	        System.err.println( "Exception caught: " + e.getMessage() );
	        e.printStackTrace();
	    }
	}

}
