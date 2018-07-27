

#include "GridlabDControl.hpp"




void GridlabDControl::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	C2WInteractionRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.GridlabDControl" );
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

	getClassNameHandleMap().insert(  std::make_pair( "GridlabDControl", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "GridlabDControl" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_IsControl_handle_var() = rti->getParameterHandle( "IsControl", get_handle() );
			get_ModelName_handle_var() = rti->getParameterHandle( "ModelName", get_handle() );
			get_ObjectName_handle_var() = rti->getParameterHandle( "ObjectName", get_handle() );
			get_Operation_handle_var() = rti->getParameterHandle( "Operation", get_handle() );
			get_Parameter_handle_var() = rti->getParameterHandle( "Parameter", get_handle() );
			get_Period_handle_var() = rti->getParameterHandle( "Period", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDControl,IsControl", get_IsControl_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_IsControl_handle(), "IsControl" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("IsControl", "boolean") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDControl,ModelName", get_ModelName_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_ModelName_handle(), "ModelName" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("ModelName", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDControl,ObjectName", get_ObjectName_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_ObjectName_handle(), "ObjectName" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("ObjectName", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDControl,Operation", get_Operation_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_Operation_handle(), "Operation" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("Operation", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDControl,Parameter", get_Parameter_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_Parameter_handle(), "Parameter" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("Parameter", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDControl,Period", get_Period_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_Period_handle(), "Period" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("Period", "double") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDControl,Units", get_Units_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_Units_handle(), "Units" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("Units", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "GridlabDControl,Value", get_Value_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_Value_handle(), "Value" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("Value", "double") );
	

}

void GridlabDControl::publish( RTI::RTIambassador *rti ) {
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

void GridlabDControl::unpublish( RTI::RTIambassador *rti ) {
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

void GridlabDControl::subscribe( RTI::RTIambassador *rti ) {
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
	
void GridlabDControl::unsubscribe( RTI::RTIambassador *rti ) {
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

bool GridlabDControl::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "GridlabDControl" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "GridlabDControl", &GridlabDControl::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "GridlabDControl", (PubsubFunctionPtr)( &GridlabDControl::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "GridlabDControl", (PubsubFunctionPtr)( &GridlabDControl::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "GridlabDControl", (PubsubFunctionPtr)( &GridlabDControl::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "GridlabDControl", (PubsubFunctionPtr)( &GridlabDControl::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "GridlabDControl", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "GridlabDControl", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "IsControl" );
	getDatamemberNames().push_back( "ModelName" );
	getDatamemberNames().push_back( "ObjectName" );
	getDatamemberNames().push_back( "Operation" );
	getDatamemberNames().push_back( "Parameter" );
	getDatamemberNames().push_back( "Period" );
	getDatamemberNames().push_back( "Units" );
	getDatamemberNames().push_back( "Value" );
	
	
	getAllDatamemberNames().push_back( "IsControl" );
	getAllDatamemberNames().push_back( "ModelName" );
	getAllDatamemberNames().push_back( "ObjectName" );
	getAllDatamemberNames().push_back( "Operation" );
	getAllDatamemberNames().push_back( "Parameter" );
	getAllDatamemberNames().push_back( "Period" );
	getAllDatamemberNames().push_back( "Units" );
	getAllDatamemberNames().push_back( "Value" );



	return true;
}

std::ostream &operator<<( std::ostream &os, GridlabDControl::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const GridlabDControl &entity ) {
	return os << "GridlabDControl("  << "IsControl:" << entity.get_IsControl() << ", " << "ModelName:" << entity.get_ModelName() << ", " << "ObjectName:" << entity.get_ObjectName() << ", " << "Operation:" << entity.get_Operation() << ", " << "Parameter:" << entity.get_Parameter() << ", " << "Period:" << entity.get_Period() << ", " << "Units:" << entity.get_Units() << ", " << "Value:" << entity.get_Value() << ", " << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "originFed:" << entity.get_originFed() << ", " << "sourceFed:" << entity.get_sourceFed()	<< ")";
}





GridlabDControl::ParameterHandleValuePairSetSP GridlabDControl::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 8 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_IsControl() )  );
	datamembers->add( get_IsControl_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_ModelName() )  );
	datamembers->add( get_ModelName_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_ObjectName() )  );
	datamembers->add( get_ObjectName_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_Operation() )  );
	datamembers->add( get_Operation_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_Parameter() )  );
	datamembers->add( get_Parameter_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_Period() )  );
	datamembers->add( get_Period_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_Units() )  );
	datamembers->add( get_Units_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_Value() )  );
	datamembers->add( get_Value_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

