

#include "MoodysAnalysis.hpp"




void MoodysAnalysis::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	C2WInteractionRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.MoodysAnalysis" );
			isNotInitialized = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getInitErrorMessage() << "Federate Not Execution Member" << std::endl;
			return;				
		} catch ( RTI::NameNotFound & ) {
			std::cerr << getInitErrorMessage() << "Name Not Found" << std::endl;
			return;				
		} catch ( ... ) {
			std::cerr << getInitErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}

	getClassNameHandleMap().insert(  std::make_pair( "MoodysAnalysis", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "MoodysAnalysis" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_bank_handle_var() = rti->getParameterHandle( "bank", get_handle() );
			get_debtRating_handle_var() = rti->getParameterHandle( "debtRating", get_handle() );
			isNotInitialized = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getInitErrorMessage() << "Federate Not Execution Member" << std::endl;
			return;				
		} catch ( RTI::InteractionClassNotDefined & ) {
			std::cerr << getInitErrorMessage() << "Interaction Class Not Defined" << std::endl;
			return;				
		} catch ( RTI::NameNotFound & ) {
			std::cerr << getInitErrorMessage() << "Name Not Found" << std::endl;
			return;				
		} catch ( ... ) {
			std::cerr << getInitErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "MoodysAnalysis,bank", get_bank_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_bank_handle(), "bank" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("bank", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "MoodysAnalysis,debtRating", get_debtRating_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_debtRating_handle(), "debtRating" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("debtRating", "int") );
	

}

void MoodysAnalysis::publish( RTI::RTIambassador *rti ) {
	if ( getIsPublished() ) {
		return;
	}

	init( rti );



	bool isNotPublished = true;
	while( isNotPublished ) {
		try {
			rti->publishInteractionClass( get_handle() );
			isNotPublished = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getPublishErrorMessage() << "Federate Not Execution Member" << std::endl;
			return;
		} catch ( RTI::InteractionClassNotDefined & ) {
			std::cerr << getPublishErrorMessage() << "Interaction Class Not Defined" << std::endl;
			return;
		} catch ( ... ) {
			std::cerr << getPublishErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}

	getIsPublished() = true;
}

void MoodysAnalysis::unpublish( RTI::RTIambassador *rti ) {
	if ( !getIsPublished() ) {
		return;
	}

	init( rti );

	bool isNotUnpublished = true;
	while( isNotUnpublished ) {
		try {
			rti->unpublishInteractionClass( get_handle() );
			isNotUnpublished = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getUnpublishErrorMessage() + "Federate Not Execution Member" << std::endl;
			return;
		} catch ( RTI::InteractionClassNotDefined & ) {
			std::cerr << getUnpublishErrorMessage() + "Interaction Class Not Defined" << std::endl;
			return;
		} catch ( RTI::InteractionClassNotPublished & ) {
			std::cerr << getUnpublishErrorMessage() + "Interaction Class Not Published" << std::endl;
			return;
		} catch ( ... ) {
			std::cerr << getUnpublishErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}

	getIsPublished() = false;
}

void MoodysAnalysis::subscribe( RTI::RTIambassador *rti ) {
	if ( getIsSubscribed() ) {
		return;
	}

	init( rti );

	
	bool isNotSubscribed = true;
	while( isNotSubscribed ) {
		try {
			rti->subscribeInteractionClass( get_handle() );
			isNotSubscribed = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getSubscribeErrorMessage() << "Federate Not Execution Member" << std::endl;
			return;
		} catch ( RTI::InteractionClassNotDefined & ) {
			std::cerr << getSubscribeErrorMessage() << "Interaction Class Not Defined" << std::endl;
			return;
		} catch ( ... ) {
			std::cerr << getSubscribeErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}

	getIsSubscribed() = true;
}
	
void MoodysAnalysis::unsubscribe( RTI::RTIambassador *rti ) {
	if ( !getIsSubscribed() ) {
		return;
	}

	init( rti );
	
	bool isNotUnsubscribed = true;
	while( isNotUnsubscribed ) {
		try {
			rti->unsubscribeInteractionClass( get_handle() );
			isNotUnsubscribed = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getUnsubscribeErrorMessage() << "Federate Not Execution Member" << std::endl;
			return;
		} catch ( RTI::InteractionClassNotDefined & ) {
			std::cerr << getUnsubscribeErrorMessage() << "Interaction Class Not Defined" << std::endl;
			return;
		} catch ( RTI::InteractionClassNotSubscribed & ) {
			std::cerr << getUnsubscribeErrorMessage() << "Interaction Class Not Subscribed" << std::endl;
			return;
		} catch ( ... ) {
			std::cerr << getUnsubscribeErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}

	getIsSubscribed() = false;
}

bool MoodysAnalysis::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "MoodysAnalysis" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "MoodysAnalysis", &MoodysAnalysis::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "MoodysAnalysis", (PubsubFunctionPtr)( &MoodysAnalysis::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "MoodysAnalysis", (PubsubFunctionPtr)( &MoodysAnalysis::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "MoodysAnalysis", (PubsubFunctionPtr)( &MoodysAnalysis::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "MoodysAnalysis", (PubsubFunctionPtr)( &MoodysAnalysis::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "MoodysAnalysis", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "MoodysAnalysis", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "bank" );
	getDatamemberNames().push_back( "debtRating" );
	
	
	getAllDatamemberNames().push_back( "bank" );
	getAllDatamemberNames().push_back( "debtRating" );



	return true;
}

std::ostream &operator<<( std::ostream &os, MoodysAnalysis::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const MoodysAnalysis &entity ) {
	return os << "MoodysAnalysis("  << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "bank:" << entity.get_bank() << ", " << "debtRating:" << entity.get_debtRating() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "originFed:" << entity.get_originFed() << ", " << "sourceFed:" << entity.get_sourceFed()	<< ")";
}





MoodysAnalysis::ParameterHandleValuePairSetSP MoodysAnalysis::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 2 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_bank() )  );
	datamembers->add( get_bank_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_debtRating() )  );
	datamembers->add( get_debtRating_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

