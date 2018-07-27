
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

#ifndef _USMoneyGram_CLASS
#define _USMoneyGram_CLASS

#include "C2WInteractionRoot.hpp"
#include "C2WException.hpp"


class USMoneyGram : public C2WInteractionRoot {

public:
	typedef C2WInteractionRoot Super;
	typedef boost::shared_ptr< USMoneyGram > SP;

	static StringVector get_parameter_names() {
		return getDatamemberNames();
	}

	static StringVector get_all_parameter_names() {
		return getAllDatamemberNames();
	}

	USMoneyGram( void ) { }
	
	static SP create( void ) { return SP( new USMoneyGram ); }

private:
	
	
	static int &get_dollars_handle_var( void ) {
		static int dollars_handle;
		return dollars_handle;
	}
	static int &get_id_handle_var( void ) {
		static int id_handle;
		return id_handle;
	}
	static int &get_receiver_handle_var( void ) {
		static int receiver_handle;
		return receiver_handle;
	}
	static int &get_sender_handle_var( void ) {
		static int sender_handle;
		return sender_handle;
	}
	
public:
	
	
	static int get_dollars_handle( void ) { return get_dollars_handle_var(); }
	static int get_id_handle( void ) { return get_id_handle_var(); }
	static int get_receiver_handle( void ) { return get_receiver_handle_var(); }
	static int get_sender_handle( void ) { return get_sender_handle_var(); }
	


private:
	static int &getHandle( void ) {
		static int handle;
		return handle;
	}

public:
	static int get_handle( void ) { return getHandle(); }
	static std::string get_class_name( void ) { return "USMoneyGram"; }

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
		return InteractionRoot::SP( new USMoneyGram() );
	}


	static std::string &getInitErrorMessage( void ) {
		static std::string initErrorMessage( "Error:  USMoneyGram:  could not initialize:  " );
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
		static std::string publishErrorMessage = "Error:  USMoneyGram:  could not publish:  ";
		return publishErrorMessage;
	}
	
public:
	static void publish( RTI::RTIambassador *rti );
	
private:
	static std::string &getUnpublishErrorMessage( void ) {
		static std::string unpublishErrorMessage = "Error:  USMoneyGram:  could not unpublish:  ";
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
		static std::string subscribedErrorMessage = "Error:  USMoneyGram:  could not subscribe:  ";
		return subscribedErrorMessage;
	}

public:
	static void subscribe( RTI::RTIambassador *rti );
		
private:
	static std::string getUnsubscribeErrorMessage( void ) {
		static std::string unsubscribeErrorMessage = "Error:  USMoneyGram:  could not unsubscribe:  ";
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
		return InteractionRoot::SP(  new USMoneyGram( *this )  );
	}







private:
	
	
	double _dollars;
	
	int _id;
	
	std::string _receiver;
	
	std::string _sender;
	
public:
		
	void set_dollars( double dollars ) { _dollars = dollars; }
	double get_dollars( void ) const { return _dollars; }
	
	void set_id( int id ) { _id = id; }
	int get_id( void ) const { return _id; }
	
	void set_receiver( const std::string & receiver ) { _receiver = receiver; }
	const std::string & get_receiver( void ) const { return _receiver; }
	
	void set_sender( const std::string & sender ) { _sender = sender; }
	const std::string & get_sender( void ) const { return _sender; }
	


	USMoneyGram( const RTI::ParameterHandleValuePairSet &datamemberMap ) : Super( datamemberMap ) { }
	
	USMoneyGram( const RTI::ParameterHandleValuePairSet &datamemberMap, const RTIfedTime &logicalTime ) : Super( datamemberMap, logicalTime ) { }
	
	
public:
	TypeMedley getParameter( const std::string &datamemberName ) const {
		
		
		if ( "dollars" == datamemberName ) {
			return TypeMedley( get_dollars() );
		}
		else if ( "id" == datamemberName ) {
			return TypeMedley( get_id() );
		}
		else if ( "receiver" == datamemberName ) {
			return TypeMedley( get_receiver() );
		}
		else if ( "sender" == datamemberName ) {
			return TypeMedley( get_sender() );
		} else {
			return Super::getParameter( datamemberName );
		}
	}
	
	TypeMedley getParameter( int datamemberHandle ) const {
		
		
		if ( get_dollars_handle() == datamemberHandle ) {
			return TypeMedley( get_dollars() );
		}
		else if ( get_id_handle() == datamemberHandle ) {
			return TypeMedley( get_id() );
		}
		else if ( get_receiver_handle() == datamemberHandle ) {
			return TypeMedley( get_receiver() );
		}
		else if ( get_sender_handle() == datamemberHandle ) {
			return TypeMedley( get_sender() );
		} else {
			return Super::getParameter( datamemberHandle );
		}
	}

protected:
	virtual bool setParameterAux( int param_handle, const std::string &val ) {
		bool retval = true;		
		
		
		if ( param_handle == get_dollars_handle() ) {
			set_dollars(  TypeMedley( val )  );
		}
		else if ( param_handle == get_id_handle() ) {
			set_id(  TypeMedley( val )  );
		}
		else if ( param_handle == get_receiver_handle() ) {
			set_receiver(  TypeMedley( val )  );
		}
		else if ( param_handle == get_sender_handle() ) {
			set_sender(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( param_handle, val );
		}
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const std::string &val ) {
		bool retval = true;
		
		
		if ( "dollars" == datamemberName ) {
			set_dollars(  TypeMedley( val )  );
		}
		else if ( "id" == datamemberName ) {
			set_id(  TypeMedley( val )  );
		}
		else if ( "receiver" == datamemberName ) {
			set_receiver(  TypeMedley( val )  );
		}
		else if ( "sender" == datamemberName ) {
			set_sender(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( datamemberName, val );
		}
		
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const TypeMedley &val ) {
		bool retval = true;
		
		
		if ( "dollars" == datamemberName ) {\
			set_dollars( val );
		}
		else if ( "id" == datamemberName ) {\
			set_id( val );
		}
		else if ( "receiver" == datamemberName ) {\
			set_receiver( val );
		}
		else if ( "sender" == datamemberName ) {\
			set_sender( val );
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

typedef USMoneyGram::SP USMoneyGramSP;

static bool call_USMoneyGram_static_init = USMoneyGram::static_init();

std::ostream &operator<<( std::ostream &os, USMoneyGram::SP entitySP );
std::ostream &operator<<( std::ostream &os, const USMoneyGram &entity );
#endif
