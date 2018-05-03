

#include "StartDelayNodeAttack.hpp"




void StartDelayNodeAttack::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	OmnetCommand::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack" );
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

	getClassNameHandleMap().insert(  std::make_pair( "StartDelayNodeAttack", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "StartDelayNodeAttack" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_delayMean_handle_var() = rti->getParameterHandle( "delayMean", get_handle() );
			get_delayStdDev_handle_var() = rti->getParameterHandle( "delayStdDev", get_handle() );
			get_nodeFullPath_handle_var() = rti->getParameterHandle( "nodeFullPath", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "StartDelayNodeAttack,delayMean", get_delayMean_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_delayMean_handle(), "delayMean" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("delayMean", "double") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "StartDelayNodeAttack,delayStdDev", get_delayStdDev_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_delayStdDev_handle(), "delayStdDev" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("delayStdDev", "double") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "StartDelayNodeAttack,nodeFullPath", get_nodeFullPath_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_nodeFullPath_handle(), "nodeFullPath" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("nodeFullPath", "String") );
	

}

void StartDelayNodeAttack::publish( RTI::RTIambassador *rti ) {
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

void StartDelayNodeAttack::unpublish( RTI::RTIambassador *rti ) {
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

void StartDelayNodeAttack::subscribe( RTI::RTIambassador *rti ) {
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
	
void StartDelayNodeAttack::unsubscribe( RTI::RTIambassador *rti ) {
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

bool StartDelayNodeAttack::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "StartDelayNodeAttack" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "StartDelayNodeAttack", &StartDelayNodeAttack::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "StartDelayNodeAttack", (PubsubFunctionPtr)( &StartDelayNodeAttack::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "StartDelayNodeAttack", (PubsubFunctionPtr)( &StartDelayNodeAttack::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "StartDelayNodeAttack", (PubsubFunctionPtr)( &StartDelayNodeAttack::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "StartDelayNodeAttack", (PubsubFunctionPtr)( &StartDelayNodeAttack::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "StartDelayNodeAttack", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "StartDelayNodeAttack", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "delayMean" );
	getDatamemberNames().push_back( "delayStdDev" );
	getDatamemberNames().push_back( "nodeFullPath" );
	
	
	getAllDatamemberNames().push_back( "delayMean" );
	getAllDatamemberNames().push_back( "delayStdDev" );
	getAllDatamemberNames().push_back( "nodeFullPath" );



	return true;
}

std::ostream &operator<<( std::ostream &os, StartDelayNodeAttack::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const StartDelayNodeAttack &entity ) {
	return os << "StartDelayNodeAttack("  << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "delayMean:" << entity.get_delayMean() << ", " << "delayStdDev:" << entity.get_delayStdDev() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "nodeFullPath:" << entity.get_nodeFullPath() << ", " << "originFed:" << entity.get_originFed() << ", " << "sourceFed:" << entity.get_sourceFed() << ", " << "uniqueCommandID:" << entity.get_uniqueCommandID()	<< ")";
}





StartDelayNodeAttack::ParameterHandleValuePairSetSP StartDelayNodeAttack::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 3 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_delayMean() )  );
	datamembers->add( get_delayMean_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_delayStdDev() )  );
	datamembers->add( get_delayStdDev_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_nodeFullPath() )  );
	datamembers->add( get_nodeFullPath_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

