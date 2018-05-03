
/*
 * Copyright (c) 2008, Institute for Software Integrated Systems, Vanderbilt University
 * All rights reserved.
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation for any purpose, without fee, and without written agreement is
 * hereby granted, provided that the above copyright notice, the following
 * two paragraphs and the author appear in all copies of this software.
 *
 * IN NO EVENT SHALL THE VANDERBILT UNIVERSITY BE LIABLE TO ANY PARTY FOR
 * DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES ARISING OUT
 * OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF THE VANDERBILT
 * UNIVERSITY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * THE VANDERBILT UNIVERSITY SPECIFICALLY DISCLAIMS ANY WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS FOR A PARTICULAR PURPOSE.  THE SOFTWARE PROVIDED HEREUNDER IS
 * ON AN "AS IS" BASIS, AND THE VANDERBILT UNIVERSITY HAS NO OBLIGATION TO
 * PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 *
 */

/*
 * 	NOTE:  ALL "if" STATEMENTS IN THIS CODE THAT HAD THE FORM:
 *
 *  if (condition) statement;
 *
 *	OR
 *
 *  if (condition) statement1;
 *  else           statement2;
 *
 *  HAVE BEEN CONVERTED TO THE FORMS:
 *
 *  if (condition) {
 *		statement;
 *	}
 *
 *	AND
 *
 *  if (condition) {
 *		statement1;
 *	} else {
 *		statement2;
 *	}
 *
 *	RESPECTIVELY.  THIS IS BECAUSE THE OMNET DEBUGGER APPEARS TO HAVE A PROBLEM
 *  WITH THE NON-BRACED FORMS OF THE IF STATEMENT.  *PLEASE* DO NOT CHANGE IT BACK.
 *  -- H.S.N.
 *
 */

#ifndef _NetworkPacket_CLASS
#define _NetworkPacket_CLASS

#include "ActionBase.hpp"
#include "C2WException.hpp"


class NetworkPacket : public ActionBase {

public:
	typedef ActionBase Super;
	typedef boost::shared_ptr< NetworkPacket > SP;

	static StringVector get_parameter_names() {
		return getDatamemberNames();
	}

	static StringVector get_all_parameter_names() {
		return getAllDatamemberNames();
	}

	NetworkPacket( void ) { }
	
	static SP create( void ) { return SP( new NetworkPacket ); }

private:
	
	
	static int &get_data_handle_var( void ) {
		static int data_handle;
		return data_handle;
	}
	static int &get_numBytes_handle_var( void ) {
		static int numBytes_handle;
		return numBytes_handle;
	}
	static int &get_packetType_handle_var( void ) {
		static int packetType_handle;
		return packetType_handle;
	}
	static int &get_receiverAppIndex_handle_var( void ) {
		static int receiverAppIndex_handle;
		return receiverAppIndex_handle;
	}
	static int &get_receiverAppInterface_handle_var( void ) {
		static int receiverAppInterface_handle;
		return receiverAppInterface_handle;
	}
	static int &get_receiverHost_handle_var( void ) {
		static int receiverHost_handle;
		return receiverHost_handle;
	}
	static int &get_receiverHostApp_handle_var( void ) {
		static int receiverHostApp_handle;
		return receiverHostApp_handle;
	}
	static int &get_senderAppIndex_handle_var( void ) {
		static int senderAppIndex_handle;
		return senderAppIndex_handle;
	}
	static int &get_senderHost_handle_var( void ) {
		static int senderHost_handle;
		return senderHost_handle;
	}
	static int &get_senderHostApp_handle_var( void ) {
		static int senderHostApp_handle;
		return senderHostApp_handle;
	}
	
public:
	
	
	static int get_data_handle( void ) { return get_data_handle_var(); }
	static int get_numBytes_handle( void ) { return get_numBytes_handle_var(); }
	static int get_packetType_handle( void ) { return get_packetType_handle_var(); }
	static int get_receiverAppIndex_handle( void ) { return get_receiverAppIndex_handle_var(); }
	static int get_receiverAppInterface_handle( void ) { return get_receiverAppInterface_handle_var(); }
	static int get_receiverHost_handle( void ) { return get_receiverHost_handle_var(); }
	static int get_receiverHostApp_handle( void ) { return get_receiverHostApp_handle_var(); }
	static int get_senderAppIndex_handle( void ) { return get_senderAppIndex_handle_var(); }
	static int get_senderHost_handle( void ) { return get_senderHost_handle_var(); }
	static int get_senderHostApp_handle( void ) { return get_senderHostApp_handle_var(); }
	


private:
	static int &getHandle( void ) {
		static int handle;
		return handle;
	}

public:
	static int get_handle( void ) { return getHandle(); }
	static std::string get_class_name( void ) { return "NetworkPacket"; }

private:
	static StringVector &getDatamemberNames( void ) {
		static StringVector datamemberNames;
		return datamemberNames;
	}

	static StringVector &getAllDatamemberNames( void ) {
		static StringVector allDatamemberNames;
		return allDatamemberNames;
	}



private:

	static InteractionRoot::SP factory( void ) {
		return InteractionRoot::SP( new NetworkPacket() );
	}


	static std::string &getInitErrorMessage( void ) {
		static std::string initErrorMessage( "Error:  NetworkPacket:  could not initialize:  " );
		return initErrorMessage;
	}

protected:
	static void init( RTI::RTIambassador *rti );
	
private:
	static bool &getIsPublished( void ) {
		static bool isPublished = false;
		return isPublished;
	}
	
	static std::string &getPublishErrorMessage( void ) {
		static std::string publishErrorMessage = "Error:  NetworkPacket:  could not publish:  ";
		return publishErrorMessage;
	}
	
public:
	static void publish( RTI::RTIambassador *rti );
	
private:
	static std::string &getUnpublishErrorMessage( void ) {
		static std::string unpublishErrorMessage = "Error:  NetworkPacket:  could not unpublish:  ";
		return unpublishErrorMessage;
	}

public:
	static void unpublish( RTI::RTIambassador *rti );

private:
	static bool &getIsSubscribed( void ) {
		static bool isSubscribed = false;
		return isSubscribed;
	}
	static std::string &getSubscribeErrorMessage( void ) {
		static std::string subscribedErrorMessage = "Error:  NetworkPacket:  could not subscribe:  ";
		return subscribedErrorMessage;
	}

public:
	static void subscribe( RTI::RTIambassador *rti );
		
private:
	static std::string getUnsubscribeErrorMessage( void ) {
		static std::string unsubscribeErrorMessage = "Error:  NetworkPacket:  could not unsubscribe:  ";
		return unsubscribeErrorMessage;
	}
	
public:
	static void unsubscribe( RTI::RTIambassador *rti );
	
	static bool static_init( void );
	
	static bool match( int handle ) { return handle == get_handle(); }

	virtual int getClassHandle( void ) const { return get_handle(); }
	virtual std::string getClassName( void ) const { return get_class_name(); }
	virtual StringVector getParameterNames( void ) const { return get_parameter_names(); }
	virtual StringVector getAllParameterNames( void ) const { return get_all_parameter_names(); }

	virtual void publishInteraction( RTI::RTIambassador *rti ) { publish( rti ); }
	virtual void subscribeInteraction( RTI::RTIambassador *rti ) { subscribe( rti ); }

	virtual InteractionRoot::SP clone( void ) {
		return InteractionRoot::SP(  new NetworkPacket( *this )  );
	}







private:
	
	
	std::string _data;
	
	int _numBytes;
	
	std::string _packetType;
	
	int _receiverAppIndex;
	
	std::string _receiverAppInterface;
	
	std::string _receiverHost;
	
	std::string _receiverHostApp;
	
	int _senderAppIndex;
	
	std::string _senderHost;
	
	std::string _senderHostApp;
	
public:
		
	void set_data( const std::string & data ) { _data = data; }
	const std::string & get_data( void ) const { return _data; }
	
	void set_numBytes( int numBytes ) { _numBytes = numBytes; }
	int get_numBytes( void ) const { return _numBytes; }
	
	void set_packetType( const std::string & packetType ) { _packetType = packetType; }
	const std::string & get_packetType( void ) const { return _packetType; }
	
	void set_receiverAppIndex( int receiverAppIndex ) { _receiverAppIndex = receiverAppIndex; }
	int get_receiverAppIndex( void ) const { return _receiverAppIndex; }
	
	void set_receiverAppInterface( const std::string & receiverAppInterface ) { _receiverAppInterface = receiverAppInterface; }
	const std::string & get_receiverAppInterface( void ) const { return _receiverAppInterface; }
	
	void set_receiverHost( const std::string & receiverHost ) { _receiverHost = receiverHost; }
	const std::string & get_receiverHost( void ) const { return _receiverHost; }
	
	void set_receiverHostApp( const std::string & receiverHostApp ) { _receiverHostApp = receiverHostApp; }
	const std::string & get_receiverHostApp( void ) const { return _receiverHostApp; }
	
	void set_senderAppIndex( int senderAppIndex ) { _senderAppIndex = senderAppIndex; }
	int get_senderAppIndex( void ) const { return _senderAppIndex; }
	
	void set_senderHost( const std::string & senderHost ) { _senderHost = senderHost; }
	const std::string & get_senderHost( void ) const { return _senderHost; }
	
	void set_senderHostApp( const std::string & senderHostApp ) { _senderHostApp = senderHostApp; }
	const std::string & get_senderHostApp( void ) const { return _senderHostApp; }
	


	NetworkPacket( const RTI::ParameterHandleValuePairSet &datamemberMap ) : Super( datamemberMap ) { }
	
	NetworkPacket( const RTI::ParameterHandleValuePairSet &datamemberMap, const RTIfedTime &logicalTime ) : Super( datamemberMap, logicalTime ) { }
	
	
public:
	TypeMedley getParameter( const std::string &datamemberName ) const {
		
		
		if ( "data" == datamemberName ) {
			return TypeMedley( get_data() );
		}
		else if ( "numBytes" == datamemberName ) {
			return TypeMedley( get_numBytes() );
		}
		else if ( "packetType" == datamemberName ) {
			return TypeMedley( get_packetType() );
		}
		else if ( "receiverAppIndex" == datamemberName ) {
			return TypeMedley( get_receiverAppIndex() );
		}
		else if ( "receiverAppInterface" == datamemberName ) {
			return TypeMedley( get_receiverAppInterface() );
		}
		else if ( "receiverHost" == datamemberName ) {
			return TypeMedley( get_receiverHost() );
		}
		else if ( "receiverHostApp" == datamemberName ) {
			return TypeMedley( get_receiverHostApp() );
		}
		else if ( "senderAppIndex" == datamemberName ) {
			return TypeMedley( get_senderAppIndex() );
		}
		else if ( "senderHost" == datamemberName ) {
			return TypeMedley( get_senderHost() );
		}
		else if ( "senderHostApp" == datamemberName ) {
			return TypeMedley( get_senderHostApp() );
		} else {
			return Super::getParameter( datamemberName );
		}
	}
	
	TypeMedley getParameter( int datamemberHandle ) const {
		
		
		if ( get_data_handle() == datamemberHandle ) {
			return TypeMedley( get_data() );
		}
		else if ( get_numBytes_handle() == datamemberHandle ) {
			return TypeMedley( get_numBytes() );
		}
		else if ( get_packetType_handle() == datamemberHandle ) {
			return TypeMedley( get_packetType() );
		}
		else if ( get_receiverAppIndex_handle() == datamemberHandle ) {
			return TypeMedley( get_receiverAppIndex() );
		}
		else if ( get_receiverAppInterface_handle() == datamemberHandle ) {
			return TypeMedley( get_receiverAppInterface() );
		}
		else if ( get_receiverHost_handle() == datamemberHandle ) {
			return TypeMedley( get_receiverHost() );
		}
		else if ( get_receiverHostApp_handle() == datamemberHandle ) {
			return TypeMedley( get_receiverHostApp() );
		}
		else if ( get_senderAppIndex_handle() == datamemberHandle ) {
			return TypeMedley( get_senderAppIndex() );
		}
		else if ( get_senderHost_handle() == datamemberHandle ) {
			return TypeMedley( get_senderHost() );
		}
		else if ( get_senderHostApp_handle() == datamemberHandle ) {
			return TypeMedley( get_senderHostApp() );
		} else {
			return Super::getParameter( datamemberHandle );
		}
	}

protected:
	virtual bool setParameterAux( int param_handle, const std::string &val ) {
		bool retval = true;		
		
		
		if ( param_handle == get_data_handle() ) {
			set_data(  TypeMedley( val )  );
		}
		else if ( param_handle == get_numBytes_handle() ) {
			set_numBytes(  TypeMedley( val )  );
		}
		else if ( param_handle == get_packetType_handle() ) {
			set_packetType(  TypeMedley( val )  );
		}
		else if ( param_handle == get_receiverAppIndex_handle() ) {
			set_receiverAppIndex(  TypeMedley( val )  );
		}
		else if ( param_handle == get_receiverAppInterface_handle() ) {
			set_receiverAppInterface(  TypeMedley( val )  );
		}
		else if ( param_handle == get_receiverHost_handle() ) {
			set_receiverHost(  TypeMedley( val )  );
		}
		else if ( param_handle == get_receiverHostApp_handle() ) {
			set_receiverHostApp(  TypeMedley( val )  );
		}
		else if ( param_handle == get_senderAppIndex_handle() ) {
			set_senderAppIndex(  TypeMedley( val )  );
		}
		else if ( param_handle == get_senderHost_handle() ) {
			set_senderHost(  TypeMedley( val )  );
		}
		else if ( param_handle == get_senderHostApp_handle() ) {
			set_senderHostApp(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( param_handle, val );
		}
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const std::string &val ) {
		bool retval = true;
		
		
		if ( "data" == datamemberName ) {
			set_data(  TypeMedley( val )  );
		}
		else if ( "numBytes" == datamemberName ) {
			set_numBytes(  TypeMedley( val )  );
		}
		else if ( "packetType" == datamemberName ) {
			set_packetType(  TypeMedley( val )  );
		}
		else if ( "receiverAppIndex" == datamemberName ) {
			set_receiverAppIndex(  TypeMedley( val )  );
		}
		else if ( "receiverAppInterface" == datamemberName ) {
			set_receiverAppInterface(  TypeMedley( val )  );
		}
		else if ( "receiverHost" == datamemberName ) {
			set_receiverHost(  TypeMedley( val )  );
		}
		else if ( "receiverHostApp" == datamemberName ) {
			set_receiverHostApp(  TypeMedley( val )  );
		}
		else if ( "senderAppIndex" == datamemberName ) {
			set_senderAppIndex(  TypeMedley( val )  );
		}
		else if ( "senderHost" == datamemberName ) {
			set_senderHost(  TypeMedley( val )  );
		}
		else if ( "senderHostApp" == datamemberName ) {
			set_senderHostApp(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( datamemberName, val );
		}
		
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const TypeMedley &val ) {
		bool retval = true;
		
		
		if ( "data" == datamemberName ) {\
			set_data( val );
		}
		else if ( "numBytes" == datamemberName ) {\
			set_numBytes( val );
		}
		else if ( "packetType" == datamemberName ) {\
			set_packetType( val );
		}
		else if ( "receiverAppIndex" == datamemberName ) {\
			set_receiverAppIndex( val );
		}
		else if ( "receiverAppInterface" == datamemberName ) {\
			set_receiverAppInterface( val );
		}
		else if ( "receiverHost" == datamemberName ) {\
			set_receiverHost( val );
		}
		else if ( "receiverHostApp" == datamemberName ) {\
			set_receiverHostApp( val );
		}
		else if ( "senderAppIndex" == datamemberName ) {\
			set_senderAppIndex( val );
		}
		else if ( "senderHost" == datamemberName ) {\
			set_senderHost( val );
		}
		else if ( "senderHostApp" == datamemberName ) {\
			set_senderHostApp( val );
		} else {
			retval = Super::setParameterAux( datamemberName, val );
		}
		
		return retval;
	}

	virtual ParameterHandleValuePairSetSP createDatamemberHandleValuePairSet( RTI::ULong count );

	virtual ParameterHandleValuePairSetSP createDatamemberHandleValuePairSet( ) {
		return createDatamemberHandleValuePairSet( 0 );
	}
	
	
};

typedef NetworkPacket::SP NetworkPacketSP;

static bool call_NetworkPacket_static_init = NetworkPacket::static_init();

std::ostream &operator<<( std::ostream &os, NetworkPacket::SP entitySP );
std::ostream &operator<<( std::ostream &os, const NetworkPacket &entity );
#endif
