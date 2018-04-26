

#include "ChallengeObject.hpp"




void ChallengeObject::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	BaseObject::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getObjectClassHandle( "ObjectRoot.BaseObject.ChallengeObject" );
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

	getClassNameHandleMap().insert(  std::make_pair( "ChallengeObject", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "ChallengeObject" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_integerValue_handle_var() = rti->getAttributeHandle( "integerValue", get_handle() );
			get_stringValue_handle_var() = rti->getAttributeHandle( "stringValue", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "ChallengeObject,integerValue", get_integerValue_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_integerValue_handle(), "integerValue" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("integerValue", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "ChallengeObject,stringValue", get_stringValue_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_stringValue_handle(), "stringValue" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("stringValue", "String") );
	

}

void ChallengeObject::publish( RTI::RTIambassador *rti ) {
	if ( getIsPublished() ) {
		return;
	}

	init( rti );

	
	getPublishedAttributeHandleSet_var().empty();
	for( StringVector::iterator stsItr = getPublishAttributeNameVector().begin() ; stsItr != getPublishAttributeNameVector().end() ; (void)++stsItr ) {
		try {
			getPublishedAttributeHandleSet_var().add(  getDatamemberNameHandleMap().find( "ChallengeObject," + *stsItr )->second  );
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

void ChallengeObject::unpublish( RTI::RTIambassador *rti ) {
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

void ChallengeObject::subscribe( RTI::RTIambassador *rti ) {
	if ( getIsSubscribed() ) {
		return;
	}

	init( rti );
	
	getSubscribedAttributeHandleSet_var().empty();
	for(  StringVector::iterator sstItr = getSubscribeAttributeNameVector().begin() ; sstItr != getSubscribeAttributeNameVector().end() ; (void)++sstItr  ) {
		try {
			getSubscribedAttributeHandleSet_var().add(  getDatamemberNameHandleMap().find( "ChallengeObject," + *sstItr )->second  );
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
	
void ChallengeObject::unsubscribe( RTI::RTIambassador *rti ) {
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

bool ChallengeObject::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "ChallengeObject" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "ChallengeObject", &ChallengeObject::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "ChallengeObject", (PubsubFunctionPtr)( &ChallengeObject::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "ChallengeObject", (PubsubFunctionPtr)( &ChallengeObject::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "ChallengeObject", (PubsubFunctionPtr)( &ChallengeObject::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "ChallengeObject", (PubsubFunctionPtr)( &ChallengeObject::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "ChallengeObject", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "ChallengeObject", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "integerValue" );
	getDatamemberNames().push_back( "stringValue" );
	
	
	getAllDatamemberNames().push_back( "integerValue" );
	getAllDatamemberNames().push_back( "stringValue" );


	getClassNamePublishAttributeNameVectorPtrMap().insert(  std::make_pair( "ChallengeObject", &getPublishAttributeNameVector() )  );
	getClassNameSubscribeAttributeNameVectorPtrMap().insert(  std::make_pair( "ChallengeObject", &getSubscribeAttributeNameVector() )  );
	
	getClassNamePublishedAttributesPtrMap().insert(  std::make_pair( "ChallengeObject", &getPublishedAttributeHandleSet_var() )  );
	getClassNameSubscribedAttributesPtrMap().insert( std::make_pair( "ChallengeObject", &getSubscribedAttributeHandleSet_var() )  );


	return true;
}

std::ostream &operator<<( std::ostream &os, ChallengeObject::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const ChallengeObject &entity ) {
	return os << "ChallengeObject("  << "id:" << entity.get_id() << ", " << "integerValue:" << entity.get_integerValue() << ", " << "stringValue:" << entity.get_stringValue()	<< ")";
}





ChallengeObject::AttributeHandleValuePairSetSP ChallengeObject::createDatamemberHandleValuePairSet( RTI::ULong count, bool force  ) {
	AttributeHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 2, force );

	std::string stringConversion;
		

	bool isPublished = false;
	
	
	try {
		isPublished = getPublishedAttributeHandleSet_var().isMember( get_integerValue_handle() );
	} catch ( ... ) {
		std::cerr << "ERROR:  ChallengeObject.createSuppliedAttributes:  could not determine if integerValue is published." << std::endl;
		isPublished = false;
	}
	if (  isPublished && _integerValue.shouldBeUpdated( force )  ) {
		stringConversion = static_cast< std::string >(  TypeMedley( get_integerValue() )  );
		datamembers->add( get_integerValue_handle(), stringConversion.c_str(), stringConversion.size() );
		_integerValue.setHasBeenUpdated();
	}

	
	try {
		isPublished = getPublishedAttributeHandleSet_var().isMember( get_stringValue_handle() );
	} catch ( ... ) {
		std::cerr << "ERROR:  ChallengeObject.createSuppliedAttributes:  could not determine if stringValue is published." << std::endl;
		isPublished = false;
	}
	if (  isPublished && _stringValue.shouldBeUpdated( force )  ) {
		stringConversion = static_cast< std::string >(  TypeMedley( get_stringValue() )  );
		datamembers->add( get_stringValue_handle(), stringConversion.c_str(), stringConversion.size() );
		_stringValue.setHasBeenUpdated();
	}

	

	return datamembers;
}

