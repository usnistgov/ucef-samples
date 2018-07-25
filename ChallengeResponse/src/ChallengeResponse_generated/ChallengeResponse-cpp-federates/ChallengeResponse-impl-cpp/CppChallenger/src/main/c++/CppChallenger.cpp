#include "CppChallenger.hpp"

void CppChallenger::initialize( void ) {
    m_randomGenerator.seed(time(NULL));
    m_currentTime = 0;

    if (this->get_IsLateJoiner()) {
        m_currentTime = getLBTS() - getLookAhead();
        disableTimeRegulation();
    }

    CppChallengerATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);

    if(!this->get_IsLateJoiner()){
        readyToPopulate();
        initObjectInstances();
        readyToRun();
    }
    else {
        initObjectInstances();
    }
}

void CppChallenger::initObjectInstances() {
    // TODO register object instances and send initial values
    // vChallengeObject.registerObject(getRTI());
}

void CppChallenger::checkReceivedSubscriptions() {

    InteractionRoot::SP interactionRootSP;
    while((interactionRootSP = getNextInteraction()) != 0) {
        boost::shared_ptr<Response> response_ptr =
                boost::dynamic_pointer_cast<Response>(interactionRootSP);
        if (response_ptr != NULL) {
            handleInteractionClass(response_ptr);
            continue;
        }
        std::cerr << "unhandled interaction " << interactionRootSP->getClassName() << std::endl;
    }
}

void CppChallenger::execute( void ) {
    checkReceivedSubscriptions();

    std::cout << "random index:  " << generateBeginIndex() << std::endl;
    std::cout << "random string: " << generateStringValue() << std::endl;

    // TODO update registered object instances

    // vChallengeObject.set_beginIndex(YOUR_VALUE_HERE);
    // vChallengeObject.set_challengeId(YOUR_VALUE_HERE);
    // vChallengeObject.set_stringValue(YOUR_VALUE_HERE);
    // vChallengeObject.updateAttributeValues(getRTI(), m_currentTime + getLookAhead());

    // TODO send interactions

    // ChallengeInteractionSP vChallengeInteraction = create_ChallengeInteraction();
    // vChallengeInteraction->set_actualLogicalGenerationTime(YOUR_VALUE_HERE);
    // vChallengeInteraction->set_beginIndex(YOUR_VALUE_HERE);
    // vChallengeInteraction->set_challengeId(YOUR_VALUE_HERE);
    // vChallengeInteraction->set_federateFilter(YOUR_VALUE_HERE);
    // vChallengeInteraction->set_originFed(YOUR_VALUE_HERE);
    // vChallengeInteraction->set_sourceFed(YOUR_VALUE_HERE);
    // vChallengeInteraction->set_stringValue(YOUR_VALUE_HERE);
    // vChallengeInteraction->sendInteraction(getRTI(), m_currentTime + getLookAhead());
    
    m_currentTime += 1;
    CppChallengerATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);
}

void CppChallenger::handleInteractionClass(boost::shared_ptr<Response> interaction) {
    // TODO implement how to handle received interaction
}

std::string CppChallenger::generateStringValue() {
    // VALID_CHARACTERS ends with NULL which, fun enough, is not a valid character
    static const char VALID_CHARACTERS[] = "abcdefghijklmnopqrstuvwxyz0123456789";
    boost::random::uniform_int_distribution<> distribution(0, sizeof(VALID_CHARACTERS)-2);

    std::string buffer(m_challengeLength, NULL);
    for (int i = 0; i < m_challengeLength; i++) {
        buffer[i] = VALID_CHARACTERS[distribution(m_randomGenerator)];
    }
    return buffer;
}

int CppChallenger::generateBeginIndex() {
    // the challenge must contain at least 1 character, so beginIndex cannot be the last index
    boost::random::uniform_int_distribution<> distribution(0, m_challengeLength-2);
    return distribution(m_randomGenerator);
}

int main(int argc, char *argv[]) {
    FederateConfigParser *configParser = new FederateConfigParser();
    FederateConfig *config = configParser->parseArgs(argc, argv);

    std::cout << "Creating CppChallenger instance" << std::endl;
    CppChallenger federateInstance(config);
    federateInstance.initialize();
    std::cout << "Running CppChallenger instance" << std::endl;
    federateInstance.run();

    return 0;
}
