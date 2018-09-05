// This file was generated by the WebGME Federates Exporter plugin. Do not edit manually!

#include "OutcomeBase.hpp"

void OutcomeBase::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	C2WInteractionRoot::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.OutcomeBase" );
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

	getClassNameHandleMap().insert(  std::make_pair( "OutcomeBase", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "OutcomeBase" )  );

	isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			get_actualLogicalGenerationTime_handle_var() = rti->getParameterHandle( "actualLogicalGenerationTime", get_handle() );
			get_federateFilter_handle_var() = rti->getParameterHandle( "federateFilter", get_handle() );
			get_originFed_handle_var() = rti->getParameterHandle( "originFed", get_handle() );
			get_sourceFed_handle_var() = rti->getParameterHandle( "sourceFed", get_handle() );
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

	getDatamemberNameHandleMap().insert(  std::make_pair( "OutcomeBase.actualLogicalGenerationTime", get_actualLogicalGenerationTime_handle() )  );
	getDatamemberHandleNameMap().insert(  std::make_pair( get_actualLogicalGenerationTime_handle(), "actualLogicalGenerationTime" )  );
	getDatamemberTypeMap().insert( std::make_pair("actualLogicalGenerationTime", "double") );

	getDatamemberNameHandleMap().insert(  std::make_pair( "OutcomeBase.federateFilter", get_federateFilter_handle() )  );
	getDatamemberHandleNameMap().insert(  std::make_pair( get_federateFilter_handle(), "federateFilter" )  );
	getDatamemberTypeMap().insert( std::make_pair("federateFilter", "String") );

	getDatamemberNameHandleMap().insert(  std::make_pair( "OutcomeBase.originFed", get_originFed_handle() )  );
	getDatamemberHandleNameMap().insert(  std::make_pair( get_originFed_handle(), "originFed" )  );
	getDatamemberTypeMap().insert( std::make_pair("originFed", "String") );

	getDatamemberNameHandleMap().insert(  std::make_pair( "OutcomeBase.sourceFed", get_sourceFed_handle() )  );
	getDatamemberHandleNameMap().insert(  std::make_pair( get_sourceFed_handle(), "sourceFed" )  );
	getDatamemberTypeMap().insert( std::make_pair("sourceFed", "String") );
}

void OutcomeBase::publish( RTI::RTIambassador *rti ) {
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

void OutcomeBase::unpublish( RTI::RTIambassador *rti ) {
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

void OutcomeBase::subscribe( RTI::RTIambassador *rti ) {
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

void OutcomeBase::unsubscribe( RTI::RTIambassador *rti ) {
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

bool OutcomeBase::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;

	getClassNameSet().insert( "OutcomeBase" );

	getClassNameFactoryMap().insert(  std::make_pair( "OutcomeBase", &OutcomeBase::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "OutcomeBase", (PubsubFunctionPtr)( &OutcomeBase::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "OutcomeBase", (PubsubFunctionPtr)( &OutcomeBase::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "OutcomeBase", (PubsubFunctionPtr)( &OutcomeBase::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "OutcomeBase", (PubsubFunctionPtr)( &OutcomeBase::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "OutcomeBase", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "OutcomeBase", &getAllDatamemberNames() )  );

	getAllDatamemberNames().push_back( "actualLogicalGenerationTime" );
	getAllDatamemberNames().push_back( "federateFilter" );
	getAllDatamemberNames().push_back( "originFed" );
	getAllDatamemberNames().push_back( "sourceFed" );

	return true;
}

std::ostream &operator<<( std::ostream &os, OutcomeBase::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const OutcomeBase &entity ) {
	return os << "OutcomeBase("
			 << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime()
			<< ", " << "federateFilter:" << entity.get_federateFilter()
			<< ", " << "originFed:" << entity.get_originFed()
			<< ", " << "sourceFed:" << entity.get_sourceFed()
			<< ")";
}
