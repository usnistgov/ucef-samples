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

#include "PingCounter2.hpp"

void PingCounter2::initialize( void ) {

	PingCounter2ATRCallback pc2ATRCb( *this );
	putAdvanceTimeRequest(  _currentTime, pc2ATRCb );

    readyToPopulate();
    readyToRun();
}

void PingCounter2::execute( void ) {
	SynchronizedFederate::ObjectReflector objectReflector;

	while(  !( objectReflector = getNextObjectReflector() ).isNull()  ) {
		objectReflector.reflect();
		boost::shared_ptr< PingCount > pingCountSP(   boost::static_pointer_cast< PingCount >( objectReflector.getObjectRootSP() )  );
		std::cout << "Message from PingCounter2:  " << pingCountSP->get_SinkName() << " has received " <<
		 pingCountSP->get_RunningCount() << " \"Ping\" interactions at time " << pingCountSP->getTime() << std::endl;
    }
    
    _currentTime += 1;

	PingCounter2ATRCallback pc2ATRCb( *this );
	putAdvanceTimeRequest(  _currentTime, pc2ATRCb );
}

int main( int argc, char *argv[] ) {

	std::cout << "Statring PingCounter2";
	PingCounter2 pingCounter2( argc, argv );
	std::cout << "Created PingCounter2";
	pingCounter2.initialize();
	std::cout << "Initialized PingCounter2";
	pingCounter2.run();

	return 0;
}
