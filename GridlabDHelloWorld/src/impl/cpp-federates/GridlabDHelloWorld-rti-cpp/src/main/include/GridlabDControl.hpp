
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

#ifndef _GridlabDControl_CLASS
#define _GridlabDControl_CLASS

#include "C2WInteractionRoot.hpp"
#include "C2WException.hpp"


class GridlabDControl : public C2WInteractionRoot {

public:
	typedef C2WInteractionRoot Super;
	typedef boost::shared_ptr< GridlabDControl > SP;

	static StringVector get_parameter_names() {
		return getDatamemberNames();
	}

	static StringVector get_all_parameter_names() {
		return getAllDatamemberNames();
	}

	GridlabDControl( void ) { }
	
	static SP create( void ) { return SP( new GridlabDControl ); }

private:
	
	
	static int &get_IsControl_handle_var( void ) {
		static int IsControl_handle;
		return IsControl_handle;
	}
	static int &get_ModelName_handle_var( void ) {
		static int ModelName_handle;
		return ModelName_handle;
	}
	static int &get_ObjectName_handle_var( void ) {
		static int ObjectName_handle;
		return ObjectName_handle;
	}
	static int &get_Operation_handle_var( void ) {
		static int Operation_handle;
		return Operation_handle;
	}
	static int &get_Parameter_handle_var( void ) {
		static int Parameter_handle;
		return Parameter_handle;
	}
	static int &get_Period_handle_var( void ) {
		static int Period_handle;
		return Period_handle;
	}
	static int &get_Units_handle_var( void ) {
		static int Units_handle;
		return Units_handle;
	}
	static int &get_Value_handle_var( void ) {
		static int Value_handle;
		return Value_handle;
	}
	
public:
	
	
	static int get_IsControl_handle( void ) { return get_IsControl_handle_var(); }
	static int get_ModelName_handle( void ) { return get_ModelName_handle_var(); }
	static int get_ObjectName_handle( void ) { return get_ObjectName_handle_var(); }
	static int get_Operation_handle( void ) { return get_Operation_handle_var(); }
	static int get_Parameter_handle( void ) { return get_Parameter_handle_var(); }
	static int get_Period_handle( void ) { return get_Period_handle_var(); }
	static int get_Units_handle( void ) { return get_Units_handle_var(); }
	static int get_Value_handle( void ) { return get_Value_handle_var(); }
	


private:
	static int &getHandle( void ) {
		static int handle;
		return handle;
	}

public:
	static int get_handle( void ) { return getHandle(); }
	static std::string get_class_name( void ) { return "GridlabDControl"; }

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
		return InteractionRoot::SP( new GridlabDControl() );
	}


	static std::string &getInitErrorMessage( void ) {
		static std::string initErrorMessage( "Error:  GridlabDControl:  could not initialize:  " );
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
		static std::string publishErrorMessage = "Error:  GridlabDControl:  could not publish:  ";
		return publishErrorMessage;
	}
	
public:
	static void publish( RTI::RTIambassador *rti );
	
private:
	static std::string &getUnpublishErrorMessage( void ) {
		static std::string unpublishErrorMessage = "Error:  GridlabDControl:  could not unpublish:  ";
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
		static std::string subscribedErrorMessage = "Error:  GridlabDControl:  could not subscribe:  ";
		return subscribedErrorMessage;
	}

public:
	static void subscribe( RTI::RTIambassador *rti );
		
private:
	static std::string getUnsubscribeErrorMessage( void ) {
		static std::string unsubscribeErrorMessage = "Error:  GridlabDControl:  could not unsubscribe:  ";
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
		return InteractionRoot::SP(  new GridlabDControl( *this )  );
	}







private:
	
	
	bool _IsControl;
	
	std::string _ModelName;
	
	std::string _ObjectName;
	
	int _Operation;
	
	std::string _Parameter;
	
	double _Period;
	
	std::string _Units;
	
	double _Value;
	
public:
		
	void set_IsControl( bool IsControl ) { _IsControl = IsControl; }
	bool get_IsControl( void ) const { return _IsControl; }
	
	void set_ModelName( const std::string & ModelName ) { _ModelName = ModelName; }
	const std::string & get_ModelName( void ) const { return _ModelName; }
	
	void set_ObjectName( const std::string & ObjectName ) { _ObjectName = ObjectName; }
	const std::string & get_ObjectName( void ) const { return _ObjectName; }
	
	void set_Operation( int Operation ) { _Operation = Operation; }
	int get_Operation( void ) const { return _Operation; }
	
	void set_Parameter( const std::string & Parameter ) { _Parameter = Parameter; }
	const std::string & get_Parameter( void ) const { return _Parameter; }
	
	void set_Period( double Period ) { _Period = Period; }
	double get_Period( void ) const { return _Period; }
	
	void set_Units( const std::string & Units ) { _Units = Units; }
	const std::string & get_Units( void ) const { return _Units; }
	
	void set_Value( double Value ) { _Value = Value; }
	double get_Value( void ) const { return _Value; }
	


	GridlabDControl( const RTI::ParameterHandleValuePairSet &datamemberMap ) : Super( datamemberMap ) { }
	
	GridlabDControl( const RTI::ParameterHandleValuePairSet &datamemberMap, const RTIfedTime &logicalTime ) : Super( datamemberMap, logicalTime ) { }
	
	
public:
	TypeMedley getParameter( const std::string &datamemberName ) const {
		
		
		if ( "IsControl" == datamemberName ) {
			return TypeMedley( get_IsControl() );
		}
		else if ( "ModelName" == datamemberName ) {
			return TypeMedley( get_ModelName() );
		}
		else if ( "ObjectName" == datamemberName ) {
			return TypeMedley( get_ObjectName() );
		}
		else if ( "Operation" == datamemberName ) {
			return TypeMedley( get_Operation() );
		}
		else if ( "Parameter" == datamemberName ) {
			return TypeMedley( get_Parameter() );
		}
		else if ( "Period" == datamemberName ) {
			return TypeMedley( get_Period() );
		}
		else if ( "Units" == datamemberName ) {
			return TypeMedley( get_Units() );
		}
		else if ( "Value" == datamemberName ) {
			return TypeMedley( get_Value() );
		} else {
			return Super::getParameter( datamemberName );
		}
	}
	
	TypeMedley getParameter( int datamemberHandle ) const {
		
		
		if ( get_IsControl_handle() == datamemberHandle ) {
			return TypeMedley( get_IsControl() );
		}
		else if ( get_ModelName_handle() == datamemberHandle ) {
			return TypeMedley( get_ModelName() );
		}
		else if ( get_ObjectName_handle() == datamemberHandle ) {
			return TypeMedley( get_ObjectName() );
		}
		else if ( get_Operation_handle() == datamemberHandle ) {
			return TypeMedley( get_Operation() );
		}
		else if ( get_Parameter_handle() == datamemberHandle ) {
			return TypeMedley( get_Parameter() );
		}
		else if ( get_Period_handle() == datamemberHandle ) {
			return TypeMedley( get_Period() );
		}
		else if ( get_Units_handle() == datamemberHandle ) {
			return TypeMedley( get_Units() );
		}
		else if ( get_Value_handle() == datamemberHandle ) {
			return TypeMedley( get_Value() );
		} else {
			return Super::getParameter( datamemberHandle );
		}
	}

protected:
	virtual bool setParameterAux( int param_handle, const std::string &val ) {
		bool retval = true;		
		
		
		if ( param_handle == get_IsControl_handle() ) {
			set_IsControl(  TypeMedley( val )  );
		}
		else if ( param_handle == get_ModelName_handle() ) {
			set_ModelName(  TypeMedley( val )  );
		}
		else if ( param_handle == get_ObjectName_handle() ) {
			set_ObjectName(  TypeMedley( val )  );
		}
		else if ( param_handle == get_Operation_handle() ) {
			set_Operation(  TypeMedley( val )  );
		}
		else if ( param_handle == get_Parameter_handle() ) {
			set_Parameter(  TypeMedley( val )  );
		}
		else if ( param_handle == get_Period_handle() ) {
			set_Period(  TypeMedley( val )  );
		}
		else if ( param_handle == get_Units_handle() ) {
			set_Units(  TypeMedley( val )  );
		}
		else if ( param_handle == get_Value_handle() ) {
			set_Value(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( param_handle, val );
		}
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const std::string &val ) {
		bool retval = true;
		
		
		if ( "IsControl" == datamemberName ) {
			set_IsControl(  TypeMedley( val )  );
		}
		else if ( "ModelName" == datamemberName ) {
			set_ModelName(  TypeMedley( val )  );
		}
		else if ( "ObjectName" == datamemberName ) {
			set_ObjectName(  TypeMedley( val )  );
		}
		else if ( "Operation" == datamemberName ) {
			set_Operation(  TypeMedley( val )  );
		}
		else if ( "Parameter" == datamemberName ) {
			set_Parameter(  TypeMedley( val )  );
		}
		else if ( "Period" == datamemberName ) {
			set_Period(  TypeMedley( val )  );
		}
		else if ( "Units" == datamemberName ) {
			set_Units(  TypeMedley( val )  );
		}
		else if ( "Value" == datamemberName ) {
			set_Value(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( datamemberName, val );
		}
		
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const TypeMedley &val ) {
		bool retval = true;
		
		
		if ( "IsControl" == datamemberName ) {\
			set_IsControl( val );
		}
		else if ( "ModelName" == datamemberName ) {\
			set_ModelName( val );
		}
		else if ( "ObjectName" == datamemberName ) {\
			set_ObjectName( val );
		}
		else if ( "Operation" == datamemberName ) {\
			set_Operation( val );
		}
		else if ( "Parameter" == datamemberName ) {\
			set_Parameter( val );
		}
		else if ( "Period" == datamemberName ) {\
			set_Period( val );
		}
		else if ( "Units" == datamemberName ) {\
			set_Units( val );
		}
		else if ( "Value" == datamemberName ) {\
			set_Value( val );
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

typedef GridlabDControl::SP GridlabDControlSP;

static bool call_GridlabDControl_static_init = GridlabDControl::static_init();

std::ostream &operator<<( std::ostream &os, GridlabDControl::SP entitySP );
std::ostream &operator<<( std::ostream &os, const GridlabDControl &entity );
#endif
