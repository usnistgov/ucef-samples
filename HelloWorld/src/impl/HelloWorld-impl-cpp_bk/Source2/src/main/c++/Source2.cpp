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

#include "Source2.hpp"

void Source2::initialize( void ) {

    Source2ATRCallback src2ATRCb( *this );
    putAdvanceTimeRequest(  _currentTime, src2ATRCb );

    readyToPopulate();
    readyToRun();
}

void Source2::execute( void ) {
    PingSP pingSP = create_Ping();
    pingSP->set_Count( -_ix );
    
    std::cout << "Source2: Sending Ping interaction #-" << _ix << std::endl;
    pingSP->sendInteraction( getRTI(), _currentTime + getLookAhead() );
    
    _currentTime += 1;

    Source2ATRCallback src2ATRCb( *this );
    putAdvanceTimeRequest(  _currentTime, src2ATRCb );
    
    ++_ix;
}


int main( int argc, char *argv[] ) {

	std::cout << "Creating Source2 object" << std::endl;
	Source2 source2( argc, argv );
	std::cout << "Source2 created" << std::endl;

	std::cout << "Initializing Source2" << std::endl;
	source2.initialize();
	std::cout << "Source2 initialized" << std::endl;

	std::cout << "Running Source2" << std::endl;
	source2.run();

	return 0;
}
