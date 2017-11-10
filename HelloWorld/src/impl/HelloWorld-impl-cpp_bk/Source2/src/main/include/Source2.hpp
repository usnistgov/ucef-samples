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

#ifndef _SOURCE_CLASS
#define _SOURCE_CLASS

#include "Source2Base.hpp"

class Source2 : public Source2Base {
private:
    double _currentTime;
    int _ix;
    
public:
    typedef Source2Base Super;
	Source2( int argc, char *argv[] ) : Super( argc, argv ), _currentTime( 0 ), _ix( 0 ) { }

	virtual ~Source2( void )
	 throw (RTI::FederateInternalError) { }

    class Source2ATRCallback : public ATRCallback {
    private:
    	Source2 &_source2;
    public:
    	Source2ATRCallback( Source2 &source2 ) : _source2( source2 ) { }
    	virtual void execute( void ) { _source2.execute(); }
		virtual SP clone( void ) { return SP(  new Source2ATRCallback( *this )  ); }
    };
    
    void initialize( void );
    void execute( void );
};

#endif
