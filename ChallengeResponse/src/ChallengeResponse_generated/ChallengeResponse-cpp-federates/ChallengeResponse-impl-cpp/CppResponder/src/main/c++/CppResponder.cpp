#include "CppResponder.hpp"

void CppResponder::initialize( void ) {
    m_currentTime = 0;
    
    if (this->get_IsLateJoiner()) {
        m_currentTime = getLBTS() - getLookAhead();
        disableTimeRegulation();
    }

    CppResponderATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);

    if(!this->get_IsLateJoiner()){
        readyToPopulate();
        readyToRun();
    }
}

void CppResponder::checkReceivedSubscriptions() {

    SynchronizedFederate::ObjectReflector objectReflector;
    while(!(objectReflector = getNextObjectReflector()).isNull()) {
        objectReflector.reflect();

        boost::shared_ptr<ChallengeObject> challengeobject_ptr =
                boost::dynamic_pointer_cast<ChallengeObject>(objectReflector.getObjectRootSP());
        if (challengeobject_ptr != NULL) {
            handleObjectClass(challengeobject_ptr);
            continue;
        }
        std::cerr << "unhandled object reflection " << objectReflector.getObjectRootSP()->getClassName() << std::endl;
    }

    InteractionRoot::SP interactionRootSP;
    while((interactionRootSP = getNextInteraction()) != 0) {
        boost::shared_ptr<ChallengeInteraction> challengeinteraction_ptr =
                boost::dynamic_pointer_cast<ChallengeInteraction>(interactionRootSP);
        if (challengeinteraction_ptr != NULL) {
            handleInteractionClass(challengeinteraction_ptr);
            continue;
        }
        std::cerr << "unhandled interaction " << interactionRootSP->getClassName() << std::endl;
    }
}

void CppResponder::execute( void ) {
    std::cout << "t=" << m_currentTime << std::endl;

    checkReceivedSubscriptions();
    
    m_currentTime += 1;
    CppResponderATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);
}

void CppResponder::handleObjectClass(boost::shared_ptr<ChallengeObject> object) {
    respond(object->get_challengeId(), object->get_stringValue(), object->get_beginIndex());
}

void CppResponder::handleInteractionClass(boost::shared_ptr<ChallengeInteraction> interaction) {
    respond(interaction->get_challengeId(), interaction->get_stringValue(), interaction->get_beginIndex());
}

void CppResponder::respond(const std::string &id, const std::string &stringValue, int beginIndex) {
    ResponseSP vResponse = create_Response();
    vResponse->set_challengeId(id);
    vResponse->set_substring(stringValue.substr(beginIndex));
    vResponse->sendInteraction(getRTI(), m_currentTime + getLookAhead());
    std::cout << "sent response " << vResponse << std::endl;
}

int main(int argc, char *argv[]) {
    FederateConfigParser *configParser = new FederateConfigParser();
    FederateConfig *config = configParser->parseArgs(argc, argv);

    std::cout << "Creating CppResponder instance" << std::endl;
    CppResponder federateInstance(config);
    federateInstance.initialize();
    std::cout << "Running CppResponder instance" << std::endl;
    federateInstance.run();

    return 0;
}
