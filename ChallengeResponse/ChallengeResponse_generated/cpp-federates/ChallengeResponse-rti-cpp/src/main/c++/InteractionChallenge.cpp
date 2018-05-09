

#include "InteractionChallenge.hpp"




void InteractionChallenge::init( boost::shared_ptr< RTI::RTIambassador > rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	InteractionBase::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge" );
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

	getClassNameHandleMap().insert(  std::make_pair( "InteractionChallenge", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "InteractionChallenge" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_beginIndex_handle_var() = rti->getParameterHandle( "beginIndex", get_handle() );
			get_stringValue_handle_var() = rti->getParameterHandle( "stringValue", get_handle() );
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
	
	
	getDatamemberTypeMap().insert( std::make_pair("beginIndex", "int") );
	
	
	getDatamemberTypeMap().insert( std::make_pair("stringValue", "String") );
	

}

void InteractionChallenge::publish( boost::shared_ptr< RTI::RTIambassador > rti ) {
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

void InteractionChallenge::unpublish( boost::shared_ptr< RTI::RTIambassador > rti ) {
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

void InteractionChallenge::subscribe( boost::shared_ptr< RTI::RTIambassador > rti ) {
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
	
void InteractionChallenge::unsubscribe( boost::shared_ptr< RTI::RTIambassador > rti ) {
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

bool InteractionChallenge::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "InteractionChallenge" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "InteractionChallenge", &InteractionChallenge::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "InteractionChallenge", (PubsubFunctionPtr)( &InteractionChallenge::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "InteractionChallenge", (PubsubFunctionPtr)( &InteractionChallenge::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "InteractionChallenge", (PubsubFunctionPtr)( &InteractionChallenge::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "InteractionChallenge", (PubsubFunctionPtr)( &InteractionChallenge::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "InteractionChallenge", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "InteractionChallenge", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "beginIndex" );
	getDatamemberNames().push_back( "stringValue" );
	
	
	getAllDatamemberNames().push_back( "beginIndex" );
	getAllDatamemberNames().push_back( "stringValue" );



	return true;
}

std::ostream &operator<<( std::ostream &os, InteractionChallenge::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const InteractionChallenge &entity ) {
	return os << "InteractionChallenge("  << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "beginIndex:" << entity.get_beginIndex() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "id:" << entity.get_id() << ", " << "originFed:" << entity.get_originFed() << ", " << "sourceFed:" << entity.get_sourceFed() << ", " << "stringValue:" << entity.get_stringValue()	<< ")";
}





InteractionChallenge::ParameterHandleValuePairSetSP InteractionChallenge::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 2 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_beginIndex() )  );
	datamembers->add( get_beginIndex_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_stringValue() )  );
	datamembers->add( get_stringValue_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

