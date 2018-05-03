

#include "BadDebt.hpp"




void BadDebt::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	C2WInteractionRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.BadDebt" );
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

	getClassNameHandleMap().insert(  std::make_pair( "BadDebt", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "BadDebt" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_dollarsInBillionUSDs_handle_var() = rti->getParameterHandle( "dollarsInBillionUSDs", get_handle() );
			get_writeOffBank_handle_var() = rti->getParameterHandle( "writeOffBank", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "BadDebt,dollarsInBillionUSDs", get_dollarsInBillionUSDs_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_dollarsInBillionUSDs_handle(), "dollarsInBillionUSDs" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("dollarsInBillionUSDs", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "BadDebt,writeOffBank", get_writeOffBank_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_writeOffBank_handle(), "writeOffBank" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("writeOffBank", "String") );
	

}

void BadDebt::publish( RTI::RTIambassador *rti ) {
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

void BadDebt::unpublish( RTI::RTIambassador *rti ) {
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

void BadDebt::subscribe( RTI::RTIambassador *rti ) {
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
	
void BadDebt::unsubscribe( RTI::RTIambassador *rti ) {
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

bool BadDebt::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "BadDebt" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "BadDebt", &BadDebt::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "BadDebt", (PubsubFunctionPtr)( &BadDebt::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "BadDebt", (PubsubFunctionPtr)( &BadDebt::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "BadDebt", (PubsubFunctionPtr)( &BadDebt::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "BadDebt", (PubsubFunctionPtr)( &BadDebt::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "BadDebt", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "BadDebt", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "dollarsInBillionUSDs" );
	getDatamemberNames().push_back( "writeOffBank" );
	
	
	getAllDatamemberNames().push_back( "dollarsInBillionUSDs" );
	getAllDatamemberNames().push_back( "writeOffBank" );



	return true;
}

std::ostream &operator<<( std::ostream &os, BadDebt::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const BadDebt &entity ) {
	return os << "BadDebt("  << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "dollarsInBillionUSDs:" << entity.get_dollarsInBillionUSDs() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "originFed:" << entity.get_originFed() << ", " << "sourceFed:" << entity.get_sourceFed() << ", " << "writeOffBank:" << entity.get_writeOffBank()	<< ")";
}





BadDebt::ParameterHandleValuePairSetSP BadDebt::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 2 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_dollarsInBillionUSDs() )  );
	datamembers->add( get_dollarsInBillionUSDs_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_writeOffBank() )  );
	datamembers->add( get_writeOffBank_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

