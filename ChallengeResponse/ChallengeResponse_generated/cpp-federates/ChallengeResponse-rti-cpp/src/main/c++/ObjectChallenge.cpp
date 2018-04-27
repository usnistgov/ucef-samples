

#include "ObjectChallenge.hpp"




void ObjectChallenge::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	ObjectBase::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getObjectClassHandle( "ObjectRoot.ObjectBase.ObjectChallenge" );
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

	getClassNameHandleMap().insert(  std::make_pair( "ObjectChallenge", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "ObjectChallenge" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_beginIndex_handle_var() = rti->getAttributeHandle( "beginIndex", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "ObjectChallenge,beginIndex", get_beginIndex_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_beginIndex_handle(), "beginIndex" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("beginIndex", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "ObjectChallenge,stringValue", get_stringValue_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_stringValue_handle(), "stringValue" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("stringValue", "String") );
	

}

void ObjectChallenge::publish( RTI::RTIambassador *rti ) {
	if ( getIsPublished() ) {
		return;
	}

	init( rti );

	
	getPublishedAttributeHandleSet_var().empty();
	for( StringVector::iterator stsItr = getPublishAttributeNameVector().begin() ; stsItr != getPublishAttributeNameVector().end() ; (void)++stsItr ) {
		try {
			getPublishedAttributeHandleSet_var().add(  getDatamemberNameHandleMap().find( "ObjectChallenge," + *stsItr )->second  );
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

void ObjectChallenge::unpublish( RTI::RTIambassador *rti ) {
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

void ObjectChallenge::subscribe( RTI::RTIambassador *rti ) {
	if ( getIsSubscribed() ) {
		return;
	}

	init( rti );
	
	getSubscribedAttributeHandleSet_var().empty();
	for(  StringVector::iterator sstItr = getSubscribeAttributeNameVector().begin() ; sstItr != getSubscribeAttributeNameVector().end() ; (void)++sstItr  ) {
		try {
			getSubscribedAttributeHandleSet_var().add(  getDatamemberNameHandleMap().find( "ObjectChallenge," + *sstItr )->second  );
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
	
void ObjectChallenge::unsubscribe( RTI::RTIambassador *rti ) {
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

bool ObjectChallenge::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "ObjectChallenge" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "ObjectChallenge", &ObjectChallenge::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "ObjectChallenge", (PubsubFunctionPtr)( &ObjectChallenge::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "ObjectChallenge", (PubsubFunctionPtr)( &ObjectChallenge::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "ObjectChallenge", (PubsubFunctionPtr)( &ObjectChallenge::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "ObjectChallenge", (PubsubFunctionPtr)( &ObjectChallenge::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "ObjectChallenge", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "ObjectChallenge", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "beginIndex" );
	getDatamemberNames().push_back( "stringValue" );
	
	
	getAllDatamemberNames().push_back( "beginIndex" );
	getAllDatamemberNames().push_back( "stringValue" );


	getClassNamePublishAttributeNameVectorPtrMap().insert(  std::make_pair( "ObjectChallenge", &getPublishAttributeNameVector() )  );
	getClassNameSubscribeAttributeNameVectorPtrMap().insert(  std::make_pair( "ObjectChallenge", &getSubscribeAttributeNameVector() )  );
	
	getClassNamePublishedAttributesPtrMap().insert(  std::make_pair( "ObjectChallenge", &getPublishedAttributeHandleSet_var() )  );
	getClassNameSubscribedAttributesPtrMap().insert( std::make_pair( "ObjectChallenge", &getSubscribedAttributeHandleSet_var() )  );


	return true;
}

std::ostream &operator<<( std::ostream &os, ObjectChallenge::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const ObjectChallenge &entity ) {
	return os << "ObjectChallenge("  << "beginIndex:" << entity.get_beginIndex() << ", " << "id:" << entity.get_id() << ", " << "stringValue:" << entity.get_stringValue()	<< ")";
}





ObjectChallenge::AttributeHandleValuePairSetSP ObjectChallenge::createDatamemberHandleValuePairSet( RTI::ULong count, bool force  ) {
	AttributeHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 2, force );

	std::string stringConversion;
		

	bool isPublished = false;
	
	
	try {
		isPublished = getPublishedAttributeHandleSet_var().isMember( get_beginIndex_handle() );
	} catch ( ... ) {
		std::cerr << "ERROR:  ObjectChallenge.createSuppliedAttributes:  could not determine if beginIndex is published." << std::endl;
		isPublished = false;
	}
	if (  isPublished && _beginIndex.shouldBeUpdated( force )  ) {
		stringConversion = static_cast< std::string >(  TypeMedley( get_beginIndex() )  );
		datamembers->add( get_beginIndex_handle(), stringConversion.c_str(), stringConversion.size() );
		_beginIndex.setHasBeenUpdated();
	}

	
	try {
		isPublished = getPublishedAttributeHandleSet_var().isMember( get_stringValue_handle() );
	} catch ( ... ) {
		std::cerr << "ERROR:  ObjectChallenge.createSuppliedAttributes:  could not determine if stringValue is published." << std::endl;
		isPublished = false;
	}
	if (  isPublished && _stringValue.shouldBeUpdated( force )  ) {
		stringConversion = static_cast< std::string >(  TypeMedley( get_stringValue() )  );
		datamembers->add( get_stringValue_handle(), stringConversion.c_str(), stringConversion.size() );
		_stringValue.setHasBeenUpdated();
	}

	

	return datamembers;
}

