
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

#ifndef _StartDelayNodeAttack_CLASS
#define _StartDelayNodeAttack_CLASS

#include "OmnetCommand.hpp"
#include "C2WException.hpp"


class StartDelayNodeAttack : public OmnetCommand {

public:
	typedef OmnetCommand Super;
	typedef boost::shared_ptr< StartDelayNodeAttack > SP;

	static StringVector get_parameter_names() {
		return getDatamemberNames();
	}

	static StringVector get_all_parameter_names() {
		return getAllDatamemberNames();
	}

	StartDelayNodeAttack( void ) { }
	
	static SP create( void ) { return SP( new StartDelayNodeAttack ); }

private:
	
	
	static int &get_delayMean_handle_var( void ) {
		static int delayMean_handle;
		return delayMean_handle;
	}
	static int &get_delayStdDev_handle_var( void ) {
		static int delayStdDev_handle;
		return delayStdDev_handle;
	}
	static int &get_nodeFullPath_handle_var( void ) {
		static int nodeFullPath_handle;
		return nodeFullPath_handle;
	}
	
public:
	
	
	static int get_delayMean_handle( void ) { return get_delayMean_handle_var(); }
	static int get_delayStdDev_handle( void ) { return get_delayStdDev_handle_var(); }
	static int get_nodeFullPath_handle( void ) { return get_nodeFullPath_handle_var(); }
	


private:
	static int &getHandle( void ) {
		static int handle;
		return handle;
	}

public:
	static int get_handle( void ) { return getHandle(); }
	static std::string get_class_name( void ) { return "StartDelayNodeAttack"; }

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
		return InteractionRoot::SP( new StartDelayNodeAttack() );
	}


	static std::string &getInitErrorMessage( void ) {
		static std::string initErrorMessage( "Error:  StartDelayNodeAttack:  could not initialize:  " );
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
		static std::string publishErrorMessage = "Error:  StartDelayNodeAttack:  could not publish:  ";
		return publishErrorMessage;
	}
	
public:
	static void publish( RTI::RTIambassador *rti );
	
private:
	static std::string &getUnpublishErrorMessage( void ) {
		static std::string unpublishErrorMessage = "Error:  StartDelayNodeAttack:  could not unpublish:  ";
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
		static std::string subscribedErrorMessage = "Error:  StartDelayNodeAttack:  could not subscribe:  ";
		return subscribedErrorMessage;
	}

public:
	static void subscribe( RTI::RTIambassador *rti );
		
private:
	static std::string getUnsubscribeErrorMessage( void ) {
		static std::string unsubscribeErrorMessage = "Error:  StartDelayNodeAttack:  could not unsubscribe:  ";
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
		return InteractionRoot::SP(  new StartDelayNodeAttack( *this )  );
	}







private:
	
	
	double _delayMean;
	
	double _delayStdDev;
	
	std::string _nodeFullPath;
	
public:
		
	void set_delayMean( double delayMean ) { _delayMean = delayMean; }
	double get_delayMean( void ) const { return _delayMean; }
	
	void set_delayStdDev( double delayStdDev ) { _delayStdDev = delayStdDev; }
	double get_delayStdDev( void ) const { return _delayStdDev; }
	
	void set_nodeFullPath( const std::string & nodeFullPath ) { _nodeFullPath = nodeFullPath; }
	const std::string & get_nodeFullPath( void ) const { return _nodeFullPath; }
	


	StartDelayNodeAttack( const RTI::ParameterHandleValuePairSet &datamemberMap ) : Super( datamemberMap ) { }
	
	StartDelayNodeAttack( const RTI::ParameterHandleValuePairSet &datamemberMap, const RTIfedTime &logicalTime ) : Super( datamemberMap, logicalTime ) { }
	
	
public:
	TypeMedley getParameter( const std::string &datamemberName ) const {
		
		
		if ( "delayMean" == datamemberName ) {
			return TypeMedley( get_delayMean() );
		}
		else if ( "delayStdDev" == datamemberName ) {
			return TypeMedley( get_delayStdDev() );
		}
		else if ( "nodeFullPath" == datamemberName ) {
			return TypeMedley( get_nodeFullPath() );
		} else {
			return Super::getParameter( datamemberName );
		}
	}
	
	TypeMedley getParameter( int datamemberHandle ) const {
		
		
		if ( get_delayMean_handle() == datamemberHandle ) {
			return TypeMedley( get_delayMean() );
		}
		else if ( get_delayStdDev_handle() == datamemberHandle ) {
			return TypeMedley( get_delayStdDev() );
		}
		else if ( get_nodeFullPath_handle() == datamemberHandle ) {
			return TypeMedley( get_nodeFullPath() );
		} else {
			return Super::getParameter( datamemberHandle );
		}
	}

protected:
	virtual bool setParameterAux( int param_handle, const std::string &val ) {
		bool retval = true;		
		
		
		if ( param_handle == get_delayMean_handle() ) {
			set_delayMean(  TypeMedley( val )  );
		}
		else if ( param_handle == get_delayStdDev_handle() ) {
			set_delayStdDev(  TypeMedley( val )  );
		}
		else if ( param_handle == get_nodeFullPath_handle() ) {
			set_nodeFullPath(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( param_handle, val );
		}
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const std::string &val ) {
		bool retval = true;
		
		
		if ( "delayMean" == datamemberName ) {
			set_delayMean(  TypeMedley( val )  );
		}
		else if ( "delayStdDev" == datamemberName ) {
			set_delayStdDev(  TypeMedley( val )  );
		}
		else if ( "nodeFullPath" == datamemberName ) {
			set_nodeFullPath(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( datamemberName, val );
		}
		
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const TypeMedley &val ) {
		bool retval = true;
		
		
		if ( "delayMean" == datamemberName ) {\
			set_delayMean( val );
		}
		else if ( "delayStdDev" == datamemberName ) {\
			set_delayStdDev( val );
		}
		else if ( "nodeFullPath" == datamemberName ) {\
			set_nodeFullPath( val );
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

typedef StartDelayNodeAttack::SP StartDelayNodeAttackSP;

static bool call_StartDelayNodeAttack_static_init = StartDelayNodeAttack::static_init();

std::ostream &operator<<( std::ostream &os, StartDelayNodeAttack::SP entitySP );
std::ostream &operator<<( std::ostream &os, const StartDelayNodeAttack &entity );
#endif
