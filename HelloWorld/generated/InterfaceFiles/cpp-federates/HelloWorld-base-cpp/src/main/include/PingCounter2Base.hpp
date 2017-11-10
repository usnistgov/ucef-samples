#ifndef _PingCounter2Base_
#define _PingCounter2Base_

#include <vector>

#include "SynchronizedFederate.hpp"
#include "SubscribedInteractionFilter.hpp"



#include "PingCount.hpp"
#include "C2WLogger.hpp"

class PingCounter2Base : public SynchronizedFederate {

public:
	typedef SynchronizedFederate Super;
	

	typedef std::vector< std::string > ArgVector;
	
	static double getLookAhead( void ) {
		static double lookAhead = 0.2;
		return lookAhead;
	}

	virtual ~PingCounter2Base( void )
	 throw (RTI::FederateInternalError) { }

private:
	SubscribedInteractionFilter _subscribedInteractionFilter;

protected:
	void init( ArgVector argVector ) {

		createRTI();
		joinFederation( argVector[ 0 ], argVector[ 1 ] );
		
		std::string loglevel="";
		ArgVector loggerArgVector;
		if ( argVector.size() == 3 ) {
			loggerArgVector.push_back( argVector[ 2 ] );
		} else if ( argVector.size() > 3 ) {
			loggerArgVector.push_back( argVector[ 3 ] );
		}
		_logger->init(loggerArgVector);
		
		if ( argVector.size() == 5 ) {
			loglevel = argVector[ 4 ];
		}
			

		enableTimeConstrained();



		enableTimeRegulation( getLookAhead() );



		enableAsynchronousDelivery();



        // interaction pubsub
        
        
          
          
		
		// object pubsub
        
          

         
        
        
        PingCount::subscribe_SinkName();
        PingCount::subscribe_RunningCount(); 
        PingCount::subscribe( getRTI() );  
   
        
         // enable pubsub log
         if( argVector.size() > 2 ){
			
			  
			
			  
			
			  
			
			
			
			PingCount::enableSubscribeLog("PingCount", "SinkName", "PingCounter2", "NORMAL", loglevel);
			PingCount::enableSubscribeLog("PingCount", "RunningCount", "PingCounter2", "NORMAL", loglevel);   
		}

	}

	void init( int argc, char *argv[] ) {
		ArgVector argVector;
		for( int ix = 1 ; ix < argc ; ++ix ) argVector.push_back( argv[ ix ] );
		init( argVector );
	}
	
	void init( const std::string &federation_id, const std::string &federate_id ) {
		ArgVector argVector;
		argVector.push_back( federation_id );
		argVector.push_back( federate_id );
		init( argVector );
	}
	
public:	
	// default constructor
	PingCounter2Base( void ) { }
	
	// constructor
	PingCounter2Base( const std::string &federation_id, const std::string &federate_id ) { init( federation_id, federate_id ); }

	// constructor	
	PingCounter2Base( int argc, char *argv[] ) { init( argc, argv ); }

	
	  

    
    virtual void receiveInteraction(
	 RTI::InteractionClassHandle theInteraction,
	 const RTI::ParameterHandleValuePairSet& theParameters,
	 const RTI::FedTime& theTime,
	 const char *theTag,
	 RTI::EventRetractionHandle theHandle
	)
	 throw ( RTI::InteractionClassNotKnown, RTI::InteractionParameterNotKnown, RTI::InvalidFederationTime, RTI::FederateInternalError) {

		if ( getMoreATRs() ) {
			InteractionRoot::SP interactionRootSP = InteractionRoot::create_interaction( theInteraction, theParameters, theTime );
			C2WInteractionRootSP c2wInteractionRootSP = boost::dynamic_pointer_cast< C2WInteractionRoot >( interactionRootSP );
			if ( c2wInteractionRootSP != 0 ) {

	            // Filter interaction if src/origin fed requirements (if any) are not met
	            if (  _subscribedInteractionFilter.filterC2WInteraction( getFederateId(), c2wInteractionRootSP )  ) {
	            	return;
	            }
	        }

	        Super::receiveInteraction( theInteraction, theParameters, theTime, theTag, theHandle );
	    }
	}

	virtual void receiveInteraction(
	 RTI::InteractionClassHandle theInteraction,
	 const RTI::ParameterHandleValuePairSet& theParameters,
	 const char *theTag
	)
	 throw ( RTI::InteractionClassNotKnown, RTI::InteractionParameterNotKnown, RTI::FederateInternalError) {
		if ( getMoreATRs() ) {
			InteractionRoot::SP interactionRootSP = InteractionRoot::create_interaction( theInteraction, theParameters );
			C2WInteractionRootSP c2wInteractionRootSP = boost::dynamic_pointer_cast< C2WInteractionRoot >( interactionRootSP );
			if ( c2wInteractionRootSP != 0 ) {

	            // Filter interaction if src/origin fed requirements (if any) are not met
	            if (  _subscribedInteractionFilter.filterC2WInteraction( getFederateId(), c2wInteractionRootSP )  ) {
	            	return;
	            }
	        }

			Super::receiveInteraction( theInteraction, theParameters, theTag );
		}
	}
};

#endif

