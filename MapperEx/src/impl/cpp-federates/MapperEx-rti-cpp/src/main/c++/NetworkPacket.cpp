

#include "NetworkPacket.hpp"




void NetworkPacket::init( RTI::RTIambassador *rti ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return;
	}
	isInitialized = true;

	ActionBase::init( rti );

	bool isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			getHandle() = rti->getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket" );
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

	getClassNameHandleMap().insert(  std::make_pair( "NetworkPacket", get_handle() )  );
	getClassHandleNameMap().insert(  std::make_pair( get_handle(), "NetworkPacket" )  );


	isNotInitialized = true;
	while( isNotInitialized ) {
		try {		
			
			
			get_data_handle_var() = rti->getParameterHandle( "data", get_handle() );
			get_numBytes_handle_var() = rti->getParameterHandle( "numBytes", get_handle() );
			get_packetType_handle_var() = rti->getParameterHandle( "packetType", get_handle() );
			get_receiverAppIndex_handle_var() = rti->getParameterHandle( "receiverAppIndex", get_handle() );
			get_receiverAppInterface_handle_var() = rti->getParameterHandle( "receiverAppInterface", get_handle() );
			get_receiverHost_handle_var() = rti->getParameterHandle( "receiverHost", get_handle() );
			get_receiverHostApp_handle_var() = rti->getParameterHandle( "receiverHostApp", get_handle() );
			get_senderAppIndex_handle_var() = rti->getParameterHandle( "senderAppIndex", get_handle() );
			get_senderHost_handle_var() = rti->getParameterHandle( "senderHost", get_handle() );
			get_senderHostApp_handle_var() = rti->getParameterHandle( "senderHostApp", get_handle() );
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
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "NetworkPacket,data", get_data_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_data_handle(), "data" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("data", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "NetworkPacket,numBytes", get_numBytes_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_numBytes_handle(), "numBytes" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("numBytes", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "NetworkPacket,packetType", get_packetType_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_packetType_handle(), "packetType" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("packetType", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "NetworkPacket,receiverAppIndex", get_receiverAppIndex_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_receiverAppIndex_handle(), "receiverAppIndex" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("receiverAppIndex", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "NetworkPacket,receiverAppInterface", get_receiverAppInterface_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_receiverAppInterface_handle(), "receiverAppInterface" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("receiverAppInterface", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "NetworkPacket,receiverHost", get_receiverHost_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_receiverHost_handle(), "receiverHost" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("receiverHost", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "NetworkPacket,receiverHostApp", get_receiverHostApp_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_receiverHostApp_handle(), "receiverHostApp" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("receiverHostApp", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "NetworkPacket,senderAppIndex", get_senderAppIndex_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_senderAppIndex_handle(), "senderAppIndex" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("senderAppIndex", "int") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "NetworkPacket,senderHost", get_senderHost_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_senderHost_handle(), "senderHost" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("senderHost", "String") );
	
	
	getDatamemberNameHandleMap().insert(  std::make_pair( "NetworkPacket,senderHostApp", get_senderHostApp_handle() )  );
	
	getDatamemberHandleNameMap().insert(  std::make_pair( get_senderHostApp_handle(), "senderHostApp" )  );
	
	getDatamemberTypeMap().insert( std::make_pair("senderHostApp", "String") );
	

}

void NetworkPacket::publish( RTI::RTIambassador *rti ) {
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

void NetworkPacket::unpublish( RTI::RTIambassador *rti ) {
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

void NetworkPacket::subscribe( RTI::RTIambassador *rti ) {
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
	
void NetworkPacket::unsubscribe( RTI::RTIambassador *rti ) {
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

bool NetworkPacket::static_init( void ) {
	static bool isInitialized = false;
	if ( isInitialized ) {
		return true;
	}
	isInitialized = true;
	
	getClassNameSet().insert( "NetworkPacket" );
	
	getClassNameFactoryMap().insert(  std::make_pair( "NetworkPacket", &NetworkPacket::factory )  );
	getClassNamePublishMap().insert(   std::make_pair(  "NetworkPacket", (PubsubFunctionPtr)( &NetworkPacket::publish )  )   );
	getClassNameUnpublishMap().insert(   std::make_pair(  "NetworkPacket", (PubsubFunctionPtr)( &NetworkPacket::unpublish )  )   );
	getClassNameSubscribeMap().insert(   std::make_pair(  "NetworkPacket", (PubsubFunctionPtr)( &NetworkPacket::subscribe )  )   );
	getClassNameUnsubscribeMap().insert(   std::make_pair(  "NetworkPacket", (PubsubFunctionPtr)( &NetworkPacket::unsubscribe )  )   );

	getDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "NetworkPacket", &getDatamemberNames() )  );
	getAllDatamemberClassNameVectorPtrMap().insert(  std::make_pair( "NetworkPacket", &getAllDatamemberNames() )  );
	
	
	
	getDatamemberNames().push_back( "data" );
	getDatamemberNames().push_back( "numBytes" );
	getDatamemberNames().push_back( "packetType" );
	getDatamemberNames().push_back( "receiverAppIndex" );
	getDatamemberNames().push_back( "receiverAppInterface" );
	getDatamemberNames().push_back( "receiverHost" );
	getDatamemberNames().push_back( "receiverHostApp" );
	getDatamemberNames().push_back( "senderAppIndex" );
	getDatamemberNames().push_back( "senderHost" );
	getDatamemberNames().push_back( "senderHostApp" );
	
	
	getAllDatamemberNames().push_back( "data" );
	getAllDatamemberNames().push_back( "numBytes" );
	getAllDatamemberNames().push_back( "packetType" );
	getAllDatamemberNames().push_back( "receiverAppIndex" );
	getAllDatamemberNames().push_back( "receiverAppInterface" );
	getAllDatamemberNames().push_back( "receiverHost" );
	getAllDatamemberNames().push_back( "receiverHostApp" );
	getAllDatamemberNames().push_back( "senderAppIndex" );
	getAllDatamemberNames().push_back( "senderHost" );
	getAllDatamemberNames().push_back( "senderHostApp" );



	return true;
}

std::ostream &operator<<( std::ostream &os, NetworkPacket::SP entitySP ) {
	return os << *entitySP;
}
std::ostream &operator<<( std::ostream &os, const NetworkPacket &entity ) {
	return os << "NetworkPacket("  << "actualLogicalGenerationTime:" << entity.get_actualLogicalGenerationTime() << ", " << "data:" << entity.get_data() << ", " << "federateFilter:" << entity.get_federateFilter() << ", " << "numBytes:" << entity.get_numBytes() << ", " << "originFed:" << entity.get_originFed() << ", " << "packetType:" << entity.get_packetType() << ", " << "receiverAppIndex:" << entity.get_receiverAppIndex() << ", " << "receiverAppInterface:" << entity.get_receiverAppInterface() << ", " << "receiverHost:" << entity.get_receiverHost() << ", " << "receiverHostApp:" << entity.get_receiverHostApp() << ", " << "senderAppIndex:" << entity.get_senderAppIndex() << ", " << "senderHost:" << entity.get_senderHost() << ", " << "senderHostApp:" << entity.get_senderHostApp() << ", " << "sourceFed:" << entity.get_sourceFed()	<< ")";
}





NetworkPacket::ParameterHandleValuePairSetSP NetworkPacket::createDatamemberHandleValuePairSet( RTI::ULong count ) {
	ParameterHandleValuePairSetSP datamembers = Super::createDatamemberHandleValuePairSet( count + 10 );

	std::string stringConversion;
		

	
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_data() )  );
	datamembers->add( get_data_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_numBytes() )  );
	datamembers->add( get_numBytes_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_packetType() )  );
	datamembers->add( get_packetType_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_receiverAppIndex() )  );
	datamembers->add( get_receiverAppIndex_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_receiverAppInterface() )  );
	datamembers->add( get_receiverAppInterface_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_receiverHost() )  );
	datamembers->add( get_receiverHost_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_receiverHostApp() )  );
	datamembers->add( get_receiverHostApp_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_senderAppIndex() )  );
	datamembers->add( get_senderAppIndex_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_senderHost() )  );
	datamembers->add( get_senderHost_handle(), stringConversion.c_str(), stringConversion.size() );
	
	stringConversion = static_cast< std::string >(  TypeMedley( get_senderHostApp() )  );
	datamembers->add( get_senderHostApp_handle(), stringConversion.c_str(), stringConversion.size() );
	

	return datamembers;
}

