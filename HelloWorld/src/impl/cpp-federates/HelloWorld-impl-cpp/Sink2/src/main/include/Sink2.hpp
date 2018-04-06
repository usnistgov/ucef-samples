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
 */

#ifndef _Sink2_CLASS
#define _Sink2_CLASS

#include "Sink2Base.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"

class Sink2 : public Sink2Base {
private:
    double _currentTime;
//	PingCount _pingCount;
    
public:
    typedef Sink2Base Super;
//     Sink2( int argc, char *argv[] ) : Super( argc, argv ), _currentTime( 0 ) {
// //		_pingCount.set_SinkName( "Sink2" );
// //		_pingCount.set_RunningCount( 0 );
// 	}
	Sink2(FederateConfig *fedconfigObj): Super(fedconfigObj) {
       
	}

	virtual ~Sink2( void )
	 throw (RTI::FederateInternalError) { }

    class Sink2ATRCallback : public ATRCallback {
    private:
    	Sink2 &_Sink2;
    public:
    	Sink2ATRCallback( Sink2 &Sink2 ) : _Sink2( Sink2 ) { }
    	virtual void execute( void ) { _Sink2.execute(); }
		virtual SP clone( void ) { return SP(  new Sink2ATRCallback( *this )  ); }
    };

    void initialize( void );
    void execute( void );
};

#endif
