

#include "StartNodeAttack.hpp"




void StartNodeAttack::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	OmnetCommand::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartNodeAttack" );
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

	getClassNameHandleMap().insert(  std::make_pair( "StartNodeAttack", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "StartNodeAttack" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_recordingNodeFullPath_handle_var() = rti->getParameterHandle( "recordingNodeFullPath", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "StartNodeAttack,recordingNodeFullPath", get_recordingNodeFullPath_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_recordingNodeFullPath_handle(), "recordingNodeFullPath" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("recordingNodeFullPath", "String") );
	

}

void StartNodeAttack::publish( RTI::RTIambassador *rti ) {
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

void StartNodeAttack::unpublish( RTI::RTIambassador *rti ) {
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

void StartNodeAttack::subscribe( RTI::RTIambassador *rti ) {
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
	
void StartNodeAttack::unsubscribe( RTI::RTIambassador *rti ) {
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

bool StartNodeAttack::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "StartNodeAttack" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "StartNodeAttack", &StartNodeAttack::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "StartNodeAttack", (PubsubFunctionPtr)( &StartNodeAttack::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "StartNodeAttack", (PubsubFunctionPtr)( &StartNodeAttack::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "StartNodeAttack", (PubsubFunctionPtr)( &StartNodeAttack::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "StartNodeAttack", (PubsubFunctionPtr)( &StartNodeAttack::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "StartNodeAttack", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "StartNodeAttack", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "recordingNodeFullPath" );
	
	
	getAllDatamemberNames().push_back( "recordingNodeFullPath" );



	return true;
}

std::ostream &operator<<( std::ostream &os, StartNodeAttack::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const StartNodeAttack &entity ) {
	return os << "StartNodeAttack("  << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "originFed:" << entity.get_originFed() << ", " << "recordingNodeFullPath:" << entity.get_recordingNodeFullPath() << ", " << "sourceFed:" << entity.get_sourceFed() << ", " << "uniqueCommandID:" << entity.get_uniqueCommandID()	<< ")";
}





StartNodeAttack::ParameterHandleValuePairSetSP StartNodeAttack::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 1 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_recordingNodeFullPath() )  );
	datamembers->add( get_recordingNodeFullPath_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

