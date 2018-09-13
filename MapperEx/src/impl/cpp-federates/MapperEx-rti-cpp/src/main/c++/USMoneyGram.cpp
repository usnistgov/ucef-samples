

#include "USMoneyGram.hpp"




void USMoneyGram::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	C2WInteractionRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.USMoneyGram" );
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

	getClassNameHandleMap().insert(  std::make_pair( "USMoneyGram", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "USMoneyGram" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_dollars_handle_var() = rti->getParameterHandle( "dollars", get_handle() );
			get_id_handle_var() = rti->getParameterHandle( "id", get_handle() );
			get_receiver_handle_var() = rti->getParameterHandle( "receiver", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "USMoneyGram,dollars", get_dollars_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_dollars_handle(), "dollars" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("dollars", "double") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "USMoneyGram,id", get_id_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_id_handle(), "id" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("id", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "USMoneyGram,receiver", get_receiver_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_receiver_handle(), "receiver" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("receiver", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "USMoneyGram,sender", get_sender_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_sender_handle(), "sender" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("sender", "String") );
	

}

void USMoneyGram::publish( RTI::RTIambassador *rti ) {
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

void USMoneyGram::unpublish( RTI::RTIambassador *rti ) {
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

void USMoneyGram::subscribe( RTI::RTIambassador *rti ) {
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
	
void USMoneyGram::unsubscribe( RTI::RTIambassador *rti ) {
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

bool USMoneyGram::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "USMoneyGram" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "USMoneyGram", &USMoneyGram::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "USMoneyGram", (PubsubFunctionPtr)( &USMoneyGram::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "USMoneyGram", (PubsubFunctionPtr)( &USMoneyGram::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "USMoneyGram", (PubsubFunctionPtr)( &USMoneyGram::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "USMoneyGram", (PubsubFunctionPtr)( &USMoneyGram::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "USMoneyGram", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "USMoneyGram", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "dollars" );
	getDatamemberNames().push_back( "id" );
	getDatamemberNames().push_back( "receiver" );
	getDatamemberNames().push_back( "sender" );
	
	
	getAllDatamemberNames().push_back( "dollars" );
	getAllDatamemberNames().push_back( "id" );
	getAllDatamemberNames().push_back( "receiver" );
	getAllDatamemberNames().push_back( "sender" );



	return true;
}

std::ostream &operator<<( std::ostream &os, USMoneyGram::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const USMoneyGram &entity ) {
	return os << "USMoneyGram("  << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "dollars:" << entity.get_dollars() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "id:" << entity.get_id() << ", " << "originFed:" << entity.get_originFed() << ", " << "receiver:" << entity.get_receiver() << ", " << "sender:" << entity.get_sender() << ", " << "sourceFed:" << entity.get_sourceFed()	<< ")";
}





USMoneyGram::ParameterHandleValuePairSetSP USMoneyGram::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 4 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_dollars() )  );
	datamembers->add( get_dollars_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_id() )  );
	datamembers->add( get_id_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_receiver() )  );
	datamembers->add( get_receiver_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_sender() )  );
	datamembers->add( get_sender_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

