

#include "InteractionBase.hpp"




void InteractionBase::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	C2WInteractionRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.InteractionBase" );
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

	getClassNameHandleMap().insert(  std::make_pair( "InteractionBase", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "InteractionBase" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_id_handle_var() = rti->getParameterHandle( "id", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "InteractionBase,id", get_id_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_id_handle(), "id" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("id", "String") );
	

}

void InteractionBase::publish( RTI::RTIambassador *rti ) {
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

void InteractionBase::unpublish( RTI::RTIambassador *rti ) {
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

void InteractionBase::subscribe( RTI::RTIambassador *rti ) {
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
	
void InteractionBase::unsubscribe( RTI::RTIambassador *rti ) {
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

bool InteractionBase::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "InteractionBase" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "InteractionBase", &InteractionBase::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "InteractionBase", (PubsubFunctionPtr)( &InteractionBase::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "InteractionBase", (PubsubFunctionPtr)( &InteractionBase::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "InteractionBase", (PubsubFunctionPtr)( &InteractionBase::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "InteractionBase", (PubsubFunctionPtr)( &InteractionBase::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "InteractionBase", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "InteractionBase", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "id" );
	
	
	getAllDatamemberNames().push_back( "id" );



	return true;
}

std::ostream &operator<<( std::ostream &os, InteractionBase::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const InteractionBase &entity ) {
	return os << "InteractionBase("  << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "id:" << entity.get_id() << ", " << "originFed:" << entity.get_originFed() << ", " << "sourceFed:" << entity.get_sourceFed()	<< ")";
}





InteractionBase::ParameterHandleValuePairSetSP InteractionBase::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 1 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_id() )  );
	datamembers->add( get_id_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

