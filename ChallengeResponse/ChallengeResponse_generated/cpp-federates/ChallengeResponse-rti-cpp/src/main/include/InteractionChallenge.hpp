
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

#ifndef _InteractionChallenge_CLASS
#define _InteractionChallenge_CLASS

#include "InteractionBase.hpp"
#include "C2WException.hpp"


class InteractionChallenge : public InteractionBase {

public:
	typedef InteractionBase Super;
	typedef boost::shared_ptr< InteractionChallenge > SP;

	static StringVector get_parameter_names() {
		return getDatamemberNames();
	}

	static StringVector get_all_parameter_names() {
		return getAllDatamemberNames();
	}

	InteractionChallenge( void ) { }
	
	static SP create( void ) { return SP( new InteractionChallenge ); }

private:
	
	
	static int &get_beginIndex_handle_var( void ) {
		static int beginIndex_handle;
		return beginIndex_handle;
	}
	static int &get_stringValue_handle_var( void ) {
		static int stringValue_handle;
		return stringValue_handle;
	}
	
public:
	
	
	static int get_beginIndex_handle( void ) { return get_beginIndex_handle_var(); }
	static int get_stringValue_handle( void ) { return get_stringValue_handle_var(); }
	


private:
	static int &getHandle( void ) {
		static int handle;
		return handle;
	}

public:
	static int get_handle( void ) { return getHandle(); }
	static std::string get_class_name( void ) { return "InteractionChallenge"; }

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
		return InteractionRoot::SP( new InteractionChallenge() );
	}


	static std::string &getInitErrorMessage( void ) {
		static std::string initErrorMessage( "Error:  InteractionChallenge:  could not initialize:  " );
		return initErrorMessage;
	}

protected:
	static void init( boost::shared_ptr< RTI::RTIambassador > rti );
	
private:
	static bool &getIsPublished( void ) {
		static bool isPublished = false;
		return isPublished;
	}
	
	static std::string &getPublishErrorMessage( void ) {
		static std::string publishErrorMessage = "Error:  InteractionChallenge:  could not publish:  ";
		return publishErrorMessage;
	}
	
public:
	static void publish( boost::shared_ptr< RTI::RTIambassador > rti );
	
private:
	static std::string &getUnpublishErrorMessage( void ) {
		static std::string unpublishErrorMessage = "Error:  InteractionChallenge:  could not unpublish:  ";
		return unpublishErrorMessage;
	}

public:
	static void unpublish( boost::shared_ptr< RTI::RTIambassador > rti );

private:
	static bool &getIsSubscribed( void ) {
		static bool isSubscribed = false;
		return isSubscribed;
	}
	static std::string &getSubscribeErrorMessage( void ) {
		static std::string subscribedErrorMessage = "Error:  InteractionChallenge:  could not subscribe:  ";
		return subscribedErrorMessage;
	}

public:
	static void subscribe( boost::shared_ptr< RTI::RTIambassador > rti );
		
private:
	static std::string getUnsubscribeErrorMessage( void ) {
		static std::string unsubscribeErrorMessage = "Error:  InteractionChallenge:  could not unsubscribe:  ";
		return unsubscribeErrorMessage;
	}
	
public:
	static void unsubscribe( boost::shared_ptr< RTI::RTIambassador > rti );
	
	static bool static_init( void );
	
	static bool match( int handle ) { return handle == get_handle(); }

	virtual int getClassHandle( void ) const { return get_handle(); }
	virtual std::string getClassName( void ) const { return get_class_name(); }
	virtual StringVector getParameterNames( void ) const { return get_parameter_names(); }
	virtual StringVector getAllParameterNames( void ) const { return get_all_parameter_names(); }

	virtual void publishInteraction( boost::shared_ptr< RTI::RTIambassador > rti ) { publish( rti ); }
	virtual void subscribeInteraction( boost::shared_ptr< RTI::RTIambassador > rti ) { subscribe( rti ); }

	virtual InteractionRoot::SP clone( void ) {
		return InteractionRoot::SP(  new InteractionChallenge( *this )  );
	}







private:
	
	
	int _beginIndex;
	
	std::string _stringValue;
	
public:
		
	void set_beginIndex( int beginIndex ) { _beginIndex = beginIndex; }
	int get_beginIndex( void ) const { return _beginIndex; }
	
	void set_stringValue( const std::string & stringValue ) { _stringValue = stringValue; }
	const std::string & get_stringValue( void ) const { return _stringValue; }
	


	InteractionChallenge( const RTI::ParameterHandleValuePairSet &datamemberMap ) : Super( datamemberMap ) { }
	
	InteractionChallenge( const RTI::ParameterHandleValuePairSet &datamemberMap, const RTIfedTime &logicalTime ) : Super( datamemberMap, logicalTime ) { }
	
	
public:
	TypeMedley getParameter( const std::string &datamemberName ) const {
		
		
		if ( "beginIndex" == datamemberName ) {
			return TypeMedley( get_beginIndex() );
		}
		else if ( "stringValue" == datamemberName ) {
			return TypeMedley( get_stringValue() );
		} else {
			return Super::getParameter( datamemberName );
		}
	}
	
	TypeMedley getParameter( int datamemberHandle ) const {
		
		
		if ( get_beginIndex_handle() == datamemberHandle ) {
			return TypeMedley( get_beginIndex() );
		}
		else if ( get_stringValue_handle() == datamemberHandle ) {
			return TypeMedley( get_stringValue() );
		} else {
			return Super::getParameter( datamemberHandle );
		}
	}

protected:
	virtual bool setParameterAux( int param_handle, const std::string &val ) {
		bool retval = true;		
		
		
		if ( param_handle == get_beginIndex_handle() ) {
			set_beginIndex(  TypeMedley( val )  );
		}
		else if ( param_handle == get_stringValue_handle() ) {
			set_stringValue(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( param_handle, val );
		}
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const std::string &val ) {
		bool retval = true;
		
		
		if ( "beginIndex" == datamemberName ) {
			set_beginIndex(  TypeMedley( val )  );
		}
		else if ( "stringValue" == datamemberName ) {
			set_stringValue(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( datamemberName, val );
		}
		
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const TypeMedley &val ) {
		bool retval = true;
		
		
		if ( "beginIndex" == datamemberName ) {\
			set_beginIndex( val );
		}
		else if ( "stringValue" == datamemberName ) {\
			set_stringValue( val );
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

typedef InteractionChallenge::SP InteractionChallengeSP;

static bool call_InteractionChallenge_static_init = InteractionChallenge::static_init();

std::ostream &operator<<( std::ostream &os, InteractionChallenge::SP entitySP );
std::ostream &operator<<( std::ostream &os, const InteractionChallenge &entity );
#endif
