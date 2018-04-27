

#include "ObjectBase.hpp"




void ObjectBase::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	ObjectRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getObjectClassHandle( "ObjectRoot.ObjectBase" );
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

	getClassNameHandleMap().insert(  std::make_pair( "ObjectBase", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "ObjectBase" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_id_handle_var() = rti->getAttributeHandle( "id", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "ObjectBase,id", get_id_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_id_handle(), "id" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("id", "String") );
	

}

void ObjectBase::publish( RTI::RTIambassador *rti ) {
	if ( getIsPublished() ) {
		return;
	}

	init( rti );

	
	getPublishedAttributeHandleSet_var().empty();
	for( StringVector::iterator stsItr = getPublishAttributeNameVector().begin() ; stsItr != getPublishAttributeNameVector().end() ; (void)++stsItr ) {
		try {
			getPublishedAttributeHandleSet_var().add(  getDatamemberNameHandleMap().find( "ObjectBase," + *stsItr )->second  );
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

void ObjectBase::unpublish( RTI::RTIambassador *rti ) {
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

void ObjectBase::subscribe( RTI::RTIambassador *rti ) {
	if ( getIsSubscribed() ) {
		return;
	}

	init( rti );
	
	getSubscribedAttributeHandleSet_var().empty();
	for(  StringVector::iterator sstItr = getSubscribeAttributeNameVector().begin() ; sstItr != getSubscribeAttributeNameVector().end() ; (void)++sstItr  ) {
		try {
			getSubscribedAttributeHandleSet_var().add(  getDatamemberNameHandleMap().find( "ObjectBase," + *sstItr )->second  );
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
	
void ObjectBase::unsubscribe( RTI::RTIambassador *rti ) {
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

bool ObjectBase::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "ObjectBase" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "ObjectBase", &ObjectBase::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "ObjectBase", (PubsubFunctionPtr)( &ObjectBase::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "ObjectBase", (PubsubFunctionPtr)( &ObjectBase::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "ObjectBase", (PubsubFunctionPtr)( &ObjectBase::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "ObjectBase", (PubsubFunctionPtr)( &ObjectBase::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "ObjectBase", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "ObjectBase", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "id" );
	
	
	getAllDatamemberNames().push_back( "id" );


	getClassNamePublishAttributeNameVectorPtrMap().insert(  std::make_pair( "ObjectBase", &getPublishAttributeNameVector() )  );
	getClassNameSubscribeAttributeNameVectorPtrMap().insert(  std::make_pair( "ObjectBase", &getSubscribeAttributeNameVector() )  );
	
	getClassNamePublishedAttributesPtrMap().insert(  std::make_pair( "ObjectBase", &getPublishedAttributeHandleSet_var() )  );
	getClassNameSubscribedAttributesPtrMap().insert( std::make_pair( "ObjectBase", &getSubscribedAttributeHandleSet_var() )  );


	return true;
}

std::ostream &operator<<( std::ostream &os, ObjectBase::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const ObjectBase &entity ) {
	return os << "ObjectBase("  << "id:" << entity.get_id()	<< ")";
}





ObjectBase::AttributeHandleValuePairSetSP ObjectBase::createDatamemberHandleValuePairSet( RTI::ULong count, bool force  ) {
	AttributeHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 1, force );

	std::string stringConversion;
		

	bool isPublished = false;
	
	
	try {
		isPublished = getPublishedAttributeHandleSet_var().isMember( get_id_handle() );
	} catch ( ... ) {
		std::cerr << "ERROR:  ObjectBase.createSuppliedAttributes:  could not determine if id is published." << std::endl;
		isPublished = false;
	}
	if (  isPublished && _id.shouldBeUpdated( force )  ) {
		stringConversion = static_cast< std::string >(  TypeMedley( get_id() )  );
		datamembers->add( get_id_handle(), stringConversion.c_str(), stringConversion.size() );
		_id.setHasBeenUpdated();
	}

	

	return datamembers;
}

