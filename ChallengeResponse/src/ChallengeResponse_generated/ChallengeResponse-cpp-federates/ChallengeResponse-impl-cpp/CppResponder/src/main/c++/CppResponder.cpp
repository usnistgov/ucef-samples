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
    checkReceivedSubscriptions();

    // TODO send interactions

    // ResponseSP vResponse = create_Response();
    // vResponse->set_actualLogicalGenerationTime(YOUR_VALUE_HERE);
    // vResponse->set_challengeId(YOUR_VALUE_HERE);
    // vResponse->set_federateFilter(YOUR_VALUE_HERE);
    // vResponse->set_originFed(YOUR_VALUE_HERE);
    // vResponse->set_sourceFed(YOUR_VALUE_HERE);
    // vResponse->set_substring(YOUR_VALUE_HERE);
    // vResponse->sendInteraction(getRTI(), m_currentTime + getLookAhead());
    
    m_currentTime += 1;
    CppResponderATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);
}

void CppResponder::handleObjectClass(boost::shared_ptr<ChallengeObject> object) {
    // TODO implement how to handle received object update
}

void CppResponder::handleInteractionClass(boost::shared_ptr<ChallengeInteraction> interaction) {
    // TODO implement how to handle received interaction
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
