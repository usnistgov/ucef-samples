

#include "CurrentAssetsInBillionUSDs.hpp"




void CurrentAssetsInBillionUSDs::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	C2WInteractionRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs" );
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

	getClassNameHandleMap().insert(  std::make_pair( "CurrentAssetsInBillionUSDs", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "CurrentAssetsInBillionUSDs" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_dollars_handle_var() = rti->getParameterHandle( "dollars", get_handle() );
			get_sender_handle_var() = rti->getParameterHandle( "sender", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "CurrentAssetsInBillionUSDs,dollars", get_dollars_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_dollars_handle(), "dollars" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("dollars", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "CurrentAssetsInBillionUSDs,sender", get_sender_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_sender_handle(), "sender" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("sender", "String") );
	

}

void CurrentAssetsInBillionUSDs::publish( RTI::RTIambassador *rti ) {
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

void CurrentAssetsInBillionUSDs::unpublish( RTI::RTIambassador *rti ) {
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

void CurrentAssetsInBillionUSDs::subscribe( RTI::RTIambassador *rti ) {
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
	
void CurrentAssetsInBillionUSDs::unsubscribe( RTI::RTIambassador *rti ) {
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

bool CurrentAssetsInBillionUSDs::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "CurrentAssetsInBillionUSDs" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "CurrentAssetsInBillionUSDs", &CurrentAssetsInBillionUSDs::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "CurrentAssetsInBillionUSDs", (PubsubFunctionPtr)( &CurrentAssetsInBillionUSDs::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "CurrentAssetsInBillionUSDs", (PubsubFunctionPtr)( &CurrentAssetsInBillionUSDs::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "CurrentAssetsInBillionUSDs", (PubsubFunctionPtr)( &CurrentAssetsInBillionUSDs::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "CurrentAssetsInBillionUSDs", (PubsubFunctionPtr)( &CurrentAssetsInBillionUSDs::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "CurrentAssetsInBillionUSDs", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "CurrentAssetsInBillionUSDs", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "dollars" );
	getDatamemberNames().push_back( "sender" );
	
	
	getAllDatamemberNames().push_back( "dollars" );
	getAllDatamemberNames().push_back( "sender" );



	return true;
}

std::ostream &operator<<( std::ostream &os, CurrentAssetsInBillionUSDs::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const CurrentAssetsInBillionUSDs &entity ) {
	return os << "CurrentAssetsInBillionUSDs("  << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "dollars:" << entity.get_dollars() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "originFed:" << entity.get_originFed() << ", " << "sender:" << entity.get_sender() << ", " << "sourceFed:" << entity.get_sourceFed()	<< ")";
}





CurrentAssetsInBillionUSDs::ParameterHandleValuePairSetSP CurrentAssetsInBillionUSDs::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 2 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_dollars() )  );
	datamembers->add( get_dollars_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_sender() )  );
	datamembers->add( get_sender_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

