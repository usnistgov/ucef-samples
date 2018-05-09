
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

#ifndef _ObjectChallenge_CLASS
#define _ObjectChallenge_CLASS

#include "ObjectBase.hpp"
#include "C2WException.hpp"


class ObjectChallenge : public ObjectBase {

public:
	typedef ObjectBase Super;
	typedef boost::shared_ptr< ObjectChallenge > SP;

	static StringVector get_attribute_names() {
		return getDatamemberNames();
	}

	static StringVector get_all_attribute_names() {
		return getAllDatamemberNames();
	}

	ObjectChallenge( void ) { }
	
	static SP create( void ) { return SP( new ObjectChallenge ); }

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
	static std::string get_class_name( void ) { return "ObjectChallenge"; }

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
	static RTI::AttributeHandleSet &getPublishedAttributeHandleSet_var( void ) {
		static RTI::AttributeHandleSet *publishedAttributeHandleSetPtr = RTI::AttributeHandleSetFactory::create( 3 );
		return *publishedAttributeHandleSetPtr;
	}
	static StringVector &getPublishAttributeNameVector( void ) {
		static StringVector publishAttributeNameVector;
		return publishAttributeNameVector;
	}	
	
	static RTI::AttributeHandleSet &getSubscribedAttributeHandleSet_var( void ) {
		static RTI::AttributeHandleSet *subscribedAttributeHandleSet = RTI::AttributeHandleSetFactory::create( 3 );
		return *subscribedAttributeHandleSet;
	}
	static StringVector &getSubscribeAttributeNameVector( void ) {
		static StringVector subscribeAttributeNameVector;
		return subscribeAttributeNameVector;
	}	


private:

	static ObjectRoot::SP factory( void ) {
		return ObjectRoot::SP( new ObjectChallenge() );
	}


	static std::string &getInitErrorMessage( void ) {
		static std::string initErrorMessage( "Error:  ObjectChallenge:  could not initialize:  " );
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
		static std::string publishErrorMessage = "Error:  ObjectChallenge:  could not publish:  ";
		return publishErrorMessage;
	}
	
public:
	static void publish( boost::shared_ptr< RTI::RTIambassador > rti );
	
private:
	static std::string &getUnpublishErrorMessage( void ) {
		static std::string unpublishErrorMessage = "Error:  ObjectChallenge:  could not unpublish:  ";
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
		static std::string subscribedErrorMessage = "Error:  ObjectChallenge:  could not subscribe:  ";
		return subscribedErrorMessage;
	}

public:
	static void subscribe( boost::shared_ptr< RTI::RTIambassador > rti );
		
private:
	static std::string getUnsubscribeErrorMessage( void ) {
		static std::string unsubscribeErrorMessage = "Error:  ObjectChallenge:  could not unsubscribe:  ";
		return unsubscribeErrorMessage;
	}
	
public:
	static void unsubscribe( boost::shared_ptr< RTI::RTIambassador > rti );
	
	static bool static_init( void );
	
	static bool match( int handle ) { return handle == get_handle(); }

	virtual int getClassHandle( void ) const { return get_handle(); }
	virtual std::string getClassName( void ) const { return get_class_name(); }
	virtual StringVector getAttributeNames( void ) const { return get_attribute_names(); }
	virtual StringVector getAllAttributeNames( void ) const { return get_all_attribute_names(); }

	virtual void publishObject( boost::shared_ptr< RTI::RTIambassador > rti ) { publish( rti ); }
	virtual void subscribeObject( boost::shared_ptr< RTI::RTIambassador > rti ) { subscribe( rti ); }

	virtual ObjectRoot::SP clone( void ) {
		return ObjectRoot::SP(  new ObjectChallenge( *this )  );
	}


	virtual const RTI::AttributeHandleSet &getSubscribedAttributeHandleSet( void ) { return getSubscribedAttributeHandleSet_var(); }






public:
	
	
	static void publish_beginIndex( void ) {
		getPublishAttributeNameVector().push_back( "beginIndex" );
	}
	static void unpublish_beginIndex( void ) {
		getPublishAttributeNameVector().erase( std::remove( getPublishAttributeNameVector().begin(), getPublishAttributeNameVector().end(), "beginIndex" ), getPublishAttributeNameVector().end() );
	}
	
	static void subscribe_beginIndex( void ) {
		getSubscribeAttributeNameVector().push_back( "beginIndex" );
	}
	static void unsubscribe_beginIndex(void ) {
		getSubscribeAttributeNameVector().erase( std::remove( getSubscribeAttributeNameVector().begin(), getSubscribeAttributeNameVector().end(), "beginIndex" ), getSubscribeAttributeNameVector().end() );
	}
	
	
	static void publish_id( void ) {
		getPublishAttributeNameVector().push_back( "id" );
	}
	static void unpublish_id( void ) {
		getPublishAttributeNameVector().erase( std::remove( getPublishAttributeNameVector().begin(), getPublishAttributeNameVector().end(), "id" ), getPublishAttributeNameVector().end() );
	}
	
	static void subscribe_id( void ) {
		getSubscribeAttributeNameVector().push_back( "id" );
	}
	static void unsubscribe_id(void ) {
		getSubscribeAttributeNameVector().erase( std::remove( getSubscribeAttributeNameVector().begin(), getSubscribeAttributeNameVector().end(), "id" ), getSubscribeAttributeNameVector().end() );
	}
	
	
	static void publish_stringValue( void ) {
		getPublishAttributeNameVector().push_back( "stringValue" );
	}
	static void unpublish_stringValue( void ) {
		getPublishAttributeNameVector().erase( std::remove( getPublishAttributeNameVector().begin(), getPublishAttributeNameVector().end(), "stringValue" ), getPublishAttributeNameVector().end() );
	}
	
	static void subscribe_stringValue( void ) {
		getSubscribeAttributeNameVector().push_back( "stringValue" );
	}
	static void unsubscribe_stringValue(void ) {
		getSubscribeAttributeNameVector().erase( std::remove( getSubscribeAttributeNameVector().begin(), getSubscribeAttributeNameVector().end(), "stringValue" ), getSubscribeAttributeNameVector().end() );
	}
	
private:
	
	
	Attribute< int, int > _beginIndex;
	
	Attribute< int, std::string > _stringValue;
	
public:
	
	
	void set_beginIndex( int beginIndex ) {
		_beginIndex.setValue( beginIndex );
		_beginIndex.setTime( getTime() );
	}
	
	int get_beginIndex( void ) const {
		return _beginIndex.getValue();
	}
	
	double get_beginIndex_time( void ) {
		return _beginIndex.getTime();
	}
	
	
	void set_stringValue( const std::string & stringValue ) {
		_stringValue.setValue( stringValue );
		_stringValue.setTime( getTime() );
	}
	
	const std::string & get_stringValue( void ) const {
		return _stringValue.getValue();
	}
	
	double get_stringValue_time( void ) {
		return _stringValue.getTime();
	}
	


	ObjectChallenge( const RTI::AttributeHandleValuePairSet &datamemberMap ) : Super( datamemberMap ) { }
	
	ObjectChallenge( const RTI::AttributeHandleValuePairSet &datamemberMap, const RTIfedTime &logicalTime ) : Super( datamemberMap, logicalTime ) { }
	
	
public:
	TypeMedley getAttribute( const std::string &datamemberName ) const {
		
		
		if ( "beginIndex" == datamemberName ) {
			return TypeMedley( get_beginIndex() );
		}
		else if ( "stringValue" == datamemberName ) {
			return TypeMedley( get_stringValue() );
		} else {
			return Super::getAttribute( datamemberName );
		}
	}
	
	TypeMedley getAttribute( int datamemberHandle ) const {
		
		
		if ( get_beginIndex_handle() == datamemberHandle ) {
			return TypeMedley( get_beginIndex() );
		}
		else if ( get_stringValue_handle() == datamemberHandle ) {
			return TypeMedley( get_stringValue() );
		} else {
			return Super::getAttribute( datamemberHandle );
		}
	}

protected:
	virtual bool setAttributeAux( int param_handle, const std::string &val ) {
		bool retval = true;		
		
		
		if ( param_handle == get_beginIndex_handle() ) {
			set_beginIndex(  TypeMedley( val )  );
		}
		else if ( param_handle == get_stringValue_handle() ) {
			set_stringValue(  TypeMedley( val )  );
		} else {
			retval = Super::setAttributeAux( param_handle, val );
		}
		return retval;
	}
	
	virtual bool setAttributeAux( const std::string &datamemberName, const std::string &val ) {
		bool retval = true;
		
		
		if ( "beginIndex" == datamemberName ) {
			set_beginIndex(  TypeMedley( val )  );
		}
		else if ( "stringValue" == datamemberName ) {
			set_stringValue(  TypeMedley( val )  );
		} else {
			retval = Super::setAttributeAux( datamemberName, val );
		}
		
		return retval;
	}
	
	virtual bool setAttributeAux( const std::string &datamemberName, const TypeMedley &val ) {
		bool retval = true;
		
		
		if ( "beginIndex" == datamemberName ) {\
			set_beginIndex( val );
		}
		else if ( "stringValue" == datamemberName ) {\
			set_stringValue( val );
		} else {
			retval = Super::setAttributeAux( datamemberName, val );
		}
		
		return retval;
	}

	virtual AttributeHandleValuePairSetSP createDatamemberHandleValuePairSet( RTI::ULong count, bool force  );

	virtual AttributeHandleValuePairSetSP createDatamemberHandleValuePairSet(  bool force ) {
		return createDatamemberHandleValuePairSet( 0, force );
	}
	
	
};

typedef ObjectChallenge::SP ObjectChallengeSP;

static bool call_ObjectChallenge_static_init = ObjectChallenge::static_init();

std::ostream &operator<<( std::ostream &os, ObjectChallenge::SP entitySP );
std::ostream &operator<<( std::ostream &os, const ObjectChallenge &entity );
#endif
