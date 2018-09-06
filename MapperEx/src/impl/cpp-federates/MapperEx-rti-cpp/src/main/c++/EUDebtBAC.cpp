

#include "EUDebtBAC.hpp"




void EUDebtBAC::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	C2WInteractionRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.EUDebtBAC" );
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

	getClassNameHandleMap().insert(  std::make_pair( "EUDebtBAC", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "EUDebtBAC" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_debtInBillionUSDs_handle_var() = rti->getParameterHandle( "debtInBillionUSDs", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "EUDebtBAC,debtInBillionUSDs", get_debtInBillionUSDs_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_debtInBillionUSDs_handle(), "debtInBillionUSDs" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("debtInBillionUSDs", "int") );
	

}

void EUDebtBAC::publish( RTI::RTIambassador *rti ) {
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

void EUDebtBAC::unpublish( RTI::RTIambassador *rti ) {
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

void EUDebtBAC::subscribe( RTI::RTIambassador *rti ) {
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
	
void EUDebtBAC::unsubscribe( RTI::RTIambassador *rti ) {
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

bool EUDebtBAC::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "EUDebtBAC" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "EUDebtBAC", &EUDebtBAC::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "EUDebtBAC", (PubsubFunctionPtr)( &EUDebtBAC::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "EUDebtBAC", (PubsubFunctionPtr)( &EUDebtBAC::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "EUDebtBAC", (PubsubFunctionPtr)( &EUDebtBAC::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "EUDebtBAC", (PubsubFunctionPtr)( &EUDebtBAC::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "EUDebtBAC", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "EUDebtBAC", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "debtInBillionUSDs" );
	
	
	getAllDatamemberNames().push_back( "debtInBillionUSDs" );



	return true;
}

std::ostream &operator<<( std::ostream &os, EUDebtBAC::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const EUDebtBAC &entity ) {
	return os << "EUDebtBAC("  << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "debtInBillionUSDs:" << entity.get_debtInBillionUSDs() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "originFed:" << entity.get_originFed() << ", " << "sourceFed:" << entity.get_sourceFed()	<< ")";
}





EUDebtBAC::ParameterHandleValuePairSetSP EUDebtBAC::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 1 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_debtInBillionUSDs() )  );
	datamembers->add( get_debtInBillionUSDs_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}
