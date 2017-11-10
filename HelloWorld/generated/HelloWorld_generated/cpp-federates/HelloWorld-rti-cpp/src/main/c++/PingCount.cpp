

#include "PingCount.hpp"




void PingCount::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	ObjectRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getObjectClassHandle( "ObjectRoot.PingCount" );
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

	getClassNameHandleMap().insert(  std::make_pair( "PingCount", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "PingCount" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_RunningCount_handle_var() = rti->getAttributeHandle( "RunningCount", get_handle() );
			get_SinkName_handle_var() = rti->getAttributeHandle( "SinkName", get_handle() );
			isNotInitialized = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getInitErrorMessage() << "Federate Not Execution Member" << std::endl;
			return;				
		} catch ( RTI::ObjectClassNotDefined & ) {
			std::cerr << getInitErrorMessage() << "Object Class Not Defined" << std::endl;
			return;				
		} catch ( RTI::NameNotFound & ) {
			std::cerr << getInitErrorMessage() << "Name Not Found" << std::endl;
			return;				
		} catch ( ... ) {
			std::cerr << getInitErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "PingCount,RunningCount", get_RunningCount_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_RunningCount_handle(), "RunningCount" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("RunningCount", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "PingCount,SinkName", get_SinkName_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_SinkName_handle(), "SinkName" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("SinkName", "String") );
	

}

void PingCount::publish( RTI::RTIambassador *rti ) {
	if ( getIsPublished() ) {
		return;
	}

	init( rti );

	
	getPublishedAttributeHandleSet_var().empty();
	for( StringVector::iterator stsItr = getPublishAttributeNameVector().begin() ; stsItr != getPublishAttributeNameVector().end() ; (void)++stsItr ) {
		try {
			getPublishedAttributeHandleSet_var().add(  getDatamemberNameHandleMap().find( "PingCount," + *stsItr )->second  );
		} catch ( ... ) {
			std::cerr << getPublishErrorMessage() << "Could not publish \"" << *stsItr + "\" attribute." << std::endl;
		}
	}


	bool isNotPublished = true;
	while( isNotPublished ) {
		try {
			rti->publishObjectClass( get_handle(), getPublishedAttributeHandleSet_var() );
			isNotPublished = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getPublishErrorMessage() << "Federate Not Execution Member" << std::endl;
			return;
		} catch ( RTI::ObjectClassNotDefined & ) {
			std::cerr << getPublishErrorMessage() << "Object Class Not Defined" << std::endl;
			return;
		} catch ( ... ) {
			std::cerr << getPublishErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}

	getIsPublished() = true;
}

void PingCount::unpublish( RTI::RTIambassador *rti ) {
	if ( !getIsPublished() ) {
		return;
	}

	init( rti );

	bool isNotUnpublished = true;
	while( isNotUnpublished ) {
		try {
			rti->unpublishObjectClass( get_handle() );
			isNotUnpublished = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getUnpublishErrorMessage() + "Federate Not Execution Member" << std::endl;
			return;
		} catch ( RTI::ObjectClassNotDefined & ) {
			std::cerr << getUnpublishErrorMessage() + "Object Class Not Defined" << std::endl;
			return;
		} catch ( RTI::ObjectClassNotPublished & ) {
			std::cerr << getUnpublishErrorMessage() + "Object Class Not Published" << std::endl;
			return;
		} catch ( ... ) {
			std::cerr << getUnpublishErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}

	getIsPublished() = false;
}

void PingCount::subscribe( RTI::RTIambassador *rti ) {
	if ( getIsSubscribed() ) {
		return;
	}

	init( rti );
	
	getSubscribedAttributeHandleSet_var().empty();
	for(  StringVector::iterator sstItr = getSubscribeAttributeNameVector().begin() ; sstItr != getSubscribeAttributeNameVector().end() ; (void)++sstItr  ) {
		try {
			getSubscribedAttributeHandleSet_var().add(  getDatamemberNameHandleMap().find( "PingCount," + *sstItr )->second  );
		} catch ( ... ) {
			std::cerr << getSubscribeErrorMessage() << "Could not subscribe to \"" << *sstItr << "\" attribute." << std::endl;
		}
	}

	
	bool isNotSubscribed = true;
	while( isNotSubscribed ) {
		try {
			rti->subscribeObjectClassAttributes( get_handle(), getSubscribedAttributeHandleSet_var() );
			isNotSubscribed = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getSubscribeErrorMessage() << "Federate Not Execution Member" << std::endl;
			return;
		} catch ( RTI::ObjectClassNotDefined & ) {
			std::cerr << getSubscribeErrorMessage() << "Object Class Not Defined" << std::endl;
			return;
		} catch ( ... ) {
			std::cerr << getSubscribeErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}

	getIsSubscribed() = true;
}
	
void PingCount::unsubscribe( RTI::RTIambassador *rti ) {
	if ( !getIsSubscribed() ) {
		return;
	}

	init( rti );
	
	bool isNotUnsubscribed = true;
	while( isNotUnsubscribed ) {
		try {
			rti->unsubscribeObjectClass( get_handle() );
			isNotUnsubscribed = false;
		} catch ( RTI::FederateNotExecutionMember & ) {
			std::cerr << getUnsubscribeErrorMessage() << "Federate Not Execution Member" << std::endl;
			return;
		} catch ( RTI::ObjectClassNotDefined & ) {
			std::cerr << getUnsubscribeErrorMessage() << "Object Class Not Defined" << std::endl;
			return;
		} catch ( RTI::ObjectClassNotSubscribed & ) {
			std::cerr << getUnsubscribeErrorMessage() << "Object Class Not Subscribed" << std::endl;
			return;
		} catch ( ... ) {
			std::cerr << getUnsubscribeErrorMessage() << "Exception caught ... retry" << std::endl;
		}
	}

	getIsSubscribed() = false;
}

bool PingCount::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "PingCount" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "PingCount", &PingCount::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "PingCount", (PubsubFunctionPtr)( &PingCount::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "PingCount", (PubsubFunctionPtr)( &PingCount::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "PingCount", (PubsubFunctionPtr)( &PingCount::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "PingCount", (PubsubFunctionPtr)( &PingCount::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "PingCount", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "PingCount", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "RunningCount" );
	getDatamemberNames().push_back( "SinkName" );
	
	
	getAllDatamemberNames().push_back( "RunningCount" );
	getAllDatamemberNames().push_back( "SinkName" );


	getClassNamePublishAttributeNameVectorPtrMap().insert(  std::make_pair( "PingCount", &getPublishAttributeNameVector() )  );
	getClassNameSubscribeAttributeNameVectorPtrMap().insert(  std::make_pair( "PingCount", &getSubscribeAttributeNameVector() )  );
	
	getClassNamePublishedAttributesPtrMap().insert(  std::make_pair( "PingCount", &getPublishedAttributeHandleSet_var() )  );
	getClassNameSubscribedAttributesPtrMap().insert( std::make_pair( "PingCount", &getSubscribedAttributeHandleSet_var() )  );


	return true;
}

std::ostream &operator<<( std::ostream &os, PingCount::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const PingCount &entity ) {
	return os << "PingCount("  << "RunningCount:" << entity.get_RunningCount() << ", " << "SinkName:" << entity.get_SinkName()	<< ")";
}





PingCount::AttributeHandleValuePairSetSP PingCount::createDatamemberHandleValuePairSet( RTI::ULong count, bool force  ) {
	AttributeHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 2, force );

	std::string stringConversion;
		

	bool isPublished = false;
	
	
	try {
		isPublished = getPublishedAttributeHandleSet_var().isMember( get_RunningCount_handle() );
	} catch ( ... ) {
		std::cerr << "ERROR:  PingCount.createSuppliedAttributes:  could not determine if RunningCount is published." << std::endl;
		isPublished = false;
	}
	if (  isPublished && _RunningCount.shouldBeUpdated( force )  ) {
		stringConversion = static_cast< std::string >(  TypeMedley( get_RunningCount() )  );
		datamembers->add( get_RunningCount_handle(), stringConversion.c_str(), stringConversion.size() );
		_RunningCount.setHasBeenUpdated();
	}

	
	try {
		isPublished = getPublishedAttributeHandleSet_var().isMember( get_SinkName_handle() );
	} catch ( ... ) {
		std::cerr << "ERROR:  PingCount.createSuppliedAttributes:  could not determine if SinkName is published." << std::endl;
		isPublished = false;
	}
	if (  isPublished && _SinkName.shouldBeUpdated( force )  ) {
		stringConversion = static_cast< std::string >(  TypeMedley( get_SinkName() )  );
		datamembers->add( get_SinkName_handle(), stringConversion.c_str(), stringConversion.size() );
		_SinkName.setHasBeenUpdated();
	}

	

	return datamembers;
}

