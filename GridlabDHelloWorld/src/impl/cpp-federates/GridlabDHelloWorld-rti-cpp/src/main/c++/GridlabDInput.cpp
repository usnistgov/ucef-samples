

#include "GridlabDInput.hpp"




void GridlabDInput::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	C2WInteractionRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.GridlabDInput" );
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

	getClassNameHandleMap().insert(  std::make_pair( "GridlabDInput", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "GridlabDInput" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_ModelName_handle_var() = rti->getParameterHandle( "ModelName", get_handle() );
			get_ObjectName_handle_var() = rti->getParameterHandle( "ObjectName", get_handle() );
			get_Operation_handle_var() = rti->getParameterHandle( "Operation", get_handle() );
			get_Parameter_handle_var() = rti->getParameterHandle( "Parameter", get_handle() );
			get_Units_handle_var() = rti->getParameterHandle( "Units", get_handle() );
			get_Value_handle_var() = rti->getParameterHandle( "Value", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDInput,ModelName", get_ModelName_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_ModelName_handle(), "ModelName" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("ModelName", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDInput,ObjectName", get_ObjectName_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_ObjectName_handle(), "ObjectName" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("ObjectName", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDInput,Operation", get_Operation_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_Operation_handle(), "Operation" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("Operation", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDInput,Parameter", get_Parameter_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_Parameter_handle(), "Parameter" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("Parameter", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDInput,Units", get_Units_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_Units_handle(), "Units" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("Units", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDInput,Value", get_Value_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_Value_handle(), "Value" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("Value", "double") );
	

}

void GridlabDInput::publish( RTI::RTIambassador *rti ) {
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

void GridlabDInput::unpublish( RTI::RTIambassador *rti ) {
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

void GridlabDInput::subscribe( RTI::RTIambassador *rti ) {
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
	
void GridlabDInput::unsubscribe( RTI::RTIambassador *rti ) {
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

bool GridlabDInput::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "GridlabDInput" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "GridlabDInput", &GridlabDInput::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "GridlabDInput", (PubsubFunctionPtr)( &GridlabDInput::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "GridlabDInput", (PubsubFunctionPtr)( &GridlabDInput::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "GridlabDInput", (PubsubFunctionPtr)( &GridlabDInput::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "GridlabDInput", (PubsubFunctionPtr)( &GridlabDInput::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "GridlabDInput", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "GridlabDInput", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "ModelName" );
	getDatamemberNames().push_back( "ObjectName" );
	getDatamemberNames().push_back( "Operation" );
	getDatamemberNames().push_back( "Parameter" );
	getDatamemberNames().push_back( "Units" );
	getDatamemberNames().push_back( "Value" );
	
	
	getAllDatamemberNames().push_back( "ModelName" );
	getAllDatamemberNames().push_back( "ObjectName" );
	getAllDatamemberNames().push_back( "Operation" );
	getAllDatamemberNames().push_back( "Parameter" );
	getAllDatamemberNames().push_back( "Units" );
	getAllDatamemberNames().push_back( "Value" );



	return true;
}

std::ostream &operator<<( std::ostream &os, GridlabDInput::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const GridlabDInput &entity ) {
	return os << "GridlabDInput("  << "ModelName:" << entity.get_ModelName() << ", " << "ObjectName:" << entity.get_ObjectName() << ", " << "Operation:" << entity.get_Operation() << ", " << "Parameter:" << entity.get_Parameter() << ", " << "Units:" << entity.get_Units() << ", " << "Value:" << entity.get_Value() << ", " << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "originFed:" << entity.get_originFed() << ", " << "sourceFed:" << entity.get_sourceFed()	<< ")";
}





GridlabDInput::ParameterHandleValuePairSetSP GridlabDInput::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 6 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_ModelName() )  );
	datamembers->add( get_ModelName_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_ObjectName() )  );
	datamembers->add( get_ObjectName_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_Operation() )  );
	datamembers->add( get_Operation_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_Parameter() )  );
	datamembers->add( get_Parameter_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_Units() )  );
	datamembers->add( get_Units_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_Value() )  );
	datamembers->add( get_Value_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

