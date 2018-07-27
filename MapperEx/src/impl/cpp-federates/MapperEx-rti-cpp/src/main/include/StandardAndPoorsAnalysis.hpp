
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

#ifndef _StandardAndPoorsAnalysis_CLASS
#define _StandardAndPoorsAnalysis_CLASS

#include "C2WInteractionRoot.hpp"
#include "C2WException.hpp"


class StandardAndPoorsAnalysis : public C2WInteractionRoot {

public:
	typedef C2WInteractionRoot Super;
	typedef boost::shared_ptr< StandardAndPoorsAnalysis > SP;

	static StringVector get_parameter_names() {
		return getDatamemberNames();
	}

	static StringVector get_all_parameter_names() {
		return getAllDatamemberNames();
	}

	StandardAndPoorsAnalysis( void ) { }
	
	static SP create( void ) { return SP( new StandardAndPoorsAnalysis ); }

private:
	
	
	static int &get_bank_handle_var( void ) {
		static int bank_handle;
		return bank_handle;
	}
	static int &get_debtRating_handle_var( void ) {
		static int debtRating_handle;
		return debtRating_handle;
	}
	
public:
	
	
	static int get_bank_handle( void ) { return get_bank_handle_var(); }
	static int get_debtRating_handle( void ) { return get_debtRating_handle_var(); }
	


private:
	static int &getHandle( void ) {
		static int handle;
		return handle;
	}

public:
	static int get_handle( void ) { return getHandle(); }
	static std::string get_class_name( void ) { return "StandardAndPoorsAnalysis"; }

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
		return InteractionRoot::SP( new StandardAndPoorsAnalysis() );
	}


	static std::string &getInitErrorMessage( void ) {
		static std::string initErrorMessage( "Error:  StandardAndPoorsAnalysis:  could not initialize:  " );
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
		static std::string publishErrorMessage = "Error:  StandardAndPoorsAnalysis:  could not publish:  ";
		return publishErrorMessage;
	}
	
public:
	static void publish( RTI::RTIambassador *rti );
	
private:
	static std::string &getUnpublishErrorMessage( void ) {
		static std::string unpublishErrorMessage = "Error:  StandardAndPoorsAnalysis:  could not unpublish:  ";
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
		static std::string subscribedErrorMessage = "Error:  StandardAndPoorsAnalysis:  could not subscribe:  ";
		return subscribedErrorMessage;
	}

public:
	static void subscribe( RTI::RTIambassador *rti );
		
private:
	static std::string getUnsubscribeErrorMessage( void ) {
		static std::string unsubscribeErrorMessage = "Error:  StandardAndPoorsAnalysis:  could not unsubscribe:  ";
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
		return InteractionRoot::SP(  new StandardAndPoorsAnalysis( *this )  );
	}







private:
	
	
	std::string _bank;
	
	std::string _debtRating;
	
public:
		
	void set_bank( const std::string & bank ) { _bank = bank; }
	const std::string & get_bank( void ) const { return _bank; }
	
	void set_debtRating( const std::string & debtRating ) { _debtRating = debtRating; }
	const std::string & get_debtRating( void ) const { return _debtRating; }
	


	StandardAndPoorsAnalysis( const RTI::ParameterHandleValuePairSet &datamemberMap ) : Super( datamemberMap ) { }
	
	StandardAndPoorsAnalysis( const RTI::ParameterHandleValuePairSet &datamemberMap, const RTIfedTime &logicalTime ) : Super( datamemberMap, logicalTime ) { }
	
	
public:
	TypeMedley getParameter( const std::string &datamemberName ) const {
		
		
		if ( "bank" == datamemberName ) {
			return TypeMedley( get_bank() );
		}
		else if ( "debtRating" == datamemberName ) {
			return TypeMedley( get_debtRating() );
		} else {
			return Super::getParameter( datamemberName );
		}
	}
	
	TypeMedley getParameter( int datamemberHandle ) const {
		
		
		if ( get_bank_handle() == datamemberHandle ) {
			return TypeMedley( get_bank() );
		}
		else if ( get_debtRating_handle() == datamemberHandle ) {
			return TypeMedley( get_debtRating() );
		} else {
			return Super::getParameter( datamemberHandle );
		}
	}

protected:
	virtual bool setParameterAux( int param_handle, const std::string &val ) {
		bool retval = true;		
		
		
		if ( param_handle == get_bank_handle() ) {
			set_bank(  TypeMedley( val )  );
		}
		else if ( param_handle == get_debtRating_handle() ) {
			set_debtRating(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( param_handle, val );
		}
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const std::string &val ) {
		bool retval = true;
		
		
		if ( "bank" == datamemberName ) {
			set_bank(  TypeMedley( val )  );
		}
		else if ( "debtRating" == datamemberName ) {
			set_debtRating(  TypeMedley( val )  );
		} else {
			retval = Super::setParameterAux( datamemberName, val );
		}
		
		return retval;
	}
	
	virtual bool setParameterAux( const std::string &datamemberName, const TypeMedley &val ) {
		bool retval = true;
		
		
		if ( "bank" == datamemberName ) {\
			set_bank( val );
		}
		else if ( "debtRating" == datamemberName ) {\
			set_debtRating( val );
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

typedef StandardAndPoorsAnalysis::SP StandardAndPoorsAnalysisSP;

static bool call_StandardAndPoorsAnalysis_static_init = StandardAndPoorsAnalysis::static_init();

std::ostream &operator<<( std::ostream &os, StandardAndPoorsAnalysis::SP entitySP );
std::ostream &operator<<( std::ostream &os, const StandardAndPoorsAnalysis &entity );
#endif
