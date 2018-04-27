#include "CppResponder.hpp"

void CppResponder::initialize( void ) {
    CppResponderATRCallback advanceTimeRequest(*this);

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

void CppResponder::execute( void ) {
    std::cout << "t=" << currentTime << std::endl;

    SynchronizedFederate::ObjectReflector objectReflector;
    while(!(objectReflector = getNextObjectReflector()).isNull()) {
        objectReflector.reflect();
        boost::shared_ptr<ObjectChallenge> challenge(boost::static_pointer_cast<ObjectChallenge>(objectReflector.getObjectRootSP()));
        respond(challenge->get_id(), challenge->get_stringValue(), challenge->get_beginIndex());
    }

    InteractionRoot::SP interactionRootSP;
    while((interactionRootSP = getNextInteraction()) != 0) {
        boost::shared_ptr<InteractionChallenge> challenge(boost::static_pointer_cast<InteractionChallenge>(interactionRootSP));
        respond(challenge->get_id(), challenge->get_stringValue(), challenge->get_beginIndex());
    }

    currentTime += 1;

    CppResponderATRCallback advanceTimeRequest( *this );
    putAdvanceTimeRequest(currentTime, advanceTimeRequest);
}

void CppResponder::respond(const std::string & id, const std::string & stringValue, int beginIndex) {
    Response::SP response = create_Response();
    response->set_id(id);
    response->set_substring(stringValue.substr(beginIndex));
    response->sendInteraction(getRTI(), currentTime + getLookAhead());
    std::cout << "sent response " << response << std::endl;
}

int main( int argc, char *argv[] ) {
    FederateConfigParser *parse_obj = new FederateConfigParser();
    FederateConfig *fedconfigObj = parse_obj->parseArgs(argc, argv);

    std::cout << "Starting CppResponder";
    CppResponder responder(fedconfigObj);
    responder.initialize();
    std::cout << "Initialized CppResponder";
    responder.run();

    return 0;
}

