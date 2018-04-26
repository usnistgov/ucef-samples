#include "CppChallenger.hpp"

void CppChallenger::initialize( void ) {
    CppChallengerATRCallback advanceTimeRequest(*this);

    currentTime = 0;
    
    if (this->get_IsLateJoiner()) {
        currentTime = getLBTS() - getLookAhead();
        disableTimeRegulation();
    }

    putAdvanceTimeRequest(currentTime, advanceTimeRequest);

    if(!this->get_IsLateJoiner()){
        readyToPopulate();
        readyToRun();
    }
}

void CppChallenger::execute( void ) {
    SynchronizedFederate::ObjectReflector objectReflector;
    while(!(objectReflector = getNextObjectReflector()).isNull()) {
        objectReflector.reflect();
//       boost::shared_ptr< PingCount > pingCountSP(   boost::static_pointer_cast< PingCount >( objectReflector.getObjectRootSP() )  );
//       std::cout << "Message from PingCounter2:  " << pingCountSP->get_SinkName() << " has received " <<
//       pingCountSP->get_RunningCount() << " \"Ping\" interactions at time " << pingCountSP->getTime() << std::endl;
    }

    InteractionRoot::SP interactionRootSP;
    while((interactionRootSP = getNextInteraction()) != 0) {
//      boost::shared_ptr< Ping > pingSP(   boost::static_pointer_cast< Ping >( interactionRootSP )  );
//      std::cout << "Sink2: Received Ping interaction #" << pingSP->get_Count() << std::endl;
//      _pingCount.set_RunningCount( _pingCount.get_RunningCount() + 1 );
//      _pingCount.updateAttributeValues( getRTI(), _currentTime + getLookAhead() + timeOrderOffset );
    }

//  PingSP pingSP = create_Ping();
//  pingSP->set_Count( -_ix );
//  std::cout << "Source2: Sending Ping interaction #-" << _ix << std::endl;
//  pingSP->sendInteraction( getRTI(), _currentTime + getLookAhead() );

//  PingCount _pingCount;
//  _pingCount.registerObject( getRTI() );
//  _pingCount.set_RunningCount( _pingCount.get_RunningCount() + 1 );
//  _pingCount.updateAttributeValues( getRTI(), _currentTime + getLookAhead());    

    currentTime += 1;

    CppChallengerATRCallback advanceTimeRequest( *this );
    putAdvanceTimeRequest(currentTime, advanceTimeRequest);
}

int main( int argc, char *argv[] ) {
    FederateConfigParser *parse_obj = new FederateConfigParser();
    FederateConfig *fedconfigObj = parse_obj->parseArgs(argc, argv);

    std::cout << "Starting CppChallenger";
    CppChallenger challenger(fedconfigObj);
    challenger.initialize();
    std::cout << "Initialized CppChallenger";
    challenger.run();

    return 0;
}

