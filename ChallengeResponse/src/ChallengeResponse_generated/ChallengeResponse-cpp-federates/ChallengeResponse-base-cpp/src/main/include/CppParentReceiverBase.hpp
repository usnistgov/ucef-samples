#ifndef _CppParentReceiverBase_
#define _CppParentReceiverBase_

#include <vector>

#include "SynchronizedFederate.hpp"
#include "SubscribedInteractionFilter.hpp"


#include "Response.hpp"
#include "ParentInteraction.hpp"

#include "ParentObject.hpp"
#include "C2WLogger.hpp"

#include "FederateConfig.h"

class CppParentReceiverBase : public SynchronizedFederate {

public:
	typedef SynchronizedFederate Super;
	

	typedef std::vector< std::string > ArgVector;
	
	static double getLookAhead( void ) {
		static double lookAhead = 0.2;
		return lookAhead;
	}

	virtual ~CppParentReceiverBase( void )
	 throw (RTI::FederateInternalError) { }

private:
	SubscribedInteractionFilter _subscribedInteractionFilter;

protected:
	void init() {

		createRTI();
		joinFederation();
		
					

		enableTimeConstrained();



		enableTimeRegulation( getLookAhead() );



		enableAsynchronousDelivery();



        // interaction pubsub
        
        
          
          
        Response::subscribe( getRTI() );
		_subscribedInteractionFilter.setFedFilters( Response::get_handle(), SubscribedInteractionFilter::ORIGIN_FILTER_DISABLED, SubscribedInteractionFilter::SOURCE_FILTER_DISABLED );  
        ParentInteraction::subscribe( getRTI() );
		_subscribedInteractionFilter.setFedFilters( ParentInteraction::get_handle(), SubscribedInteractionFilter::ORIGIN_FILTER_DISABLED, SubscribedInteractionFilter::SOURCE_FILTER_DISABLED );  
		
		// object pubsub
        
          

         
        
        
        ParentObject::subscribe_challengeId(); 
        ParentObject::subscribe( getRTI() );  
   
        
         // enable pubsub log
         

	}

public:	
	// constructor	
	CppParentReceiverBase(FederateConfig *fedconfig): Super(fedconfig) { init(); }



	
	  

    
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

