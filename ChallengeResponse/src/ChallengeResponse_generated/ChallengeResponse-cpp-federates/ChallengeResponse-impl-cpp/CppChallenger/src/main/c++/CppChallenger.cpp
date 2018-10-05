#include "CppChallenger.hpp"

void CppChallenger::initialize( void ) {
    m_randomGenerator.seed(time(NULL));
    m_challengeLength = CHALLENGE_LENGTH;
    m_sequenceNumber = 0;
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
    m_challengeObject.registerObject(getRTI());
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
    std::cout << "t=" << m_currentTime << std::endl;

    sendChallengeInteraction();
    sendChallengeObject();

    checkReceivedSubscriptions();
    handleExpiredChallenges();

    m_currentTime += 1;
    CppChallengerATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);
}

void CppChallenger::handleInteractionClass(boost::shared_ptr<Response> interaction) {
    const std::string &id = interaction->get_challengeId();
    const std::string &substring = interaction->get_substring();
    const std::string &responder = interaction->get_originFed();

    if (id.find(getFederateId()) == 0) {
        if (m_challenges.count(id) == 0) {
            std::cerr << "ERROR: response for a non-existent challenge " << id << std::endl;
            return;
        }
        Challenge &challenge = m_challenges.at(id);

        if (challenge.responders.count(responder) > 0) {
            std::cerr << "ERROR: multiple responses to " << id << " from " << responder << std::endl;
            return;
        }
        challenge.responders.insert(responder);

        std::cout << "received response to " << id << " from " << responder << std::endl;
        if (challenge.responders.size() > NUMBER_OF_RESPONDERS) {
            std::cerr << "ERROR: more responses to " << id << " than expected" << std::endl;
        }
        if (m_currentTime > challenge.expirationTime) {
            std::cerr << "ERROR: late response to " << id << " from " << responder << std::endl;
        }
        if (challenge.correctResponse != substring) {
            std::cerr << "ERROR: bad response to " << id << " from " << responder << std::endl;
        }
    }
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
    boost::random::uniform_int_distribution<> distribution(0, m_challengeLength-2);
    return distribution(m_randomGenerator) + 1;
}

Challenge CppChallenger::createChallenge() {
    Challenge challenge;

    challenge.id = getFederateId() + "#" + boost::lexical_cast<std::string>(m_sequenceNumber);
    challenge.stringValue = generateStringValue();
    challenge.beginIndex = generateBeginIndex();
    // this should be (m_currentTime + 2 * stepSize) but stepSize is private/not implemented
    challenge.expirationTime = m_currentTime + 2;
    challenge.correctResponse = challenge.stringValue.substr(challenge.beginIndex);
    challenge.responders.clear();

    m_challenges[challenge.id] = challenge;
    m_challengesNotExpired.insert(challenge.id);
    m_sequenceNumber = m_sequenceNumber + 1;

    return challenge;
}

void CppChallenger::sendChallengeInteraction() {
    Challenge challenge = createChallenge();

    ChallengeInteractionSP challengeInteraction = create_ChallengeInteraction();
    challengeInteraction->set_challengeId(challenge.id);
    challengeInteraction->set_beginIndex(challenge.beginIndex);
    challengeInteraction->set_stringValue(challenge.stringValue);
    challengeInteraction->sendInteraction(getRTI(), m_currentTime + getLookAhead());

    std::cout << "sent challenge interaction as " << challenge.id << std::endl;
}

void CppChallenger::sendChallengeObject() {
    Challenge challenge = createChallenge();

    m_challengeObject.set_challengeId(challenge.id);
    m_challengeObject.set_beginIndex(challenge.beginIndex);
    m_challengeObject.set_stringValue(challenge.stringValue);
    m_challengeObject.updateAttributeValues(getRTI(), m_currentTime + getLookAhead());

    std::cout << "sent challenge object as " << challenge.id << std::endl;
}

void CppChallenger::handleExpiredChallenges() {
    std::set<std::string> expiredChallenges;

    for (std::set<std::string>::iterator it = m_challengesNotExpired.begin(); it != m_challengesNotExpired.end(); it++) {
        const Challenge &challenge = m_challenges.at(*it);

        if (challenge.expirationTime <= m_currentTime) {
            expiredChallenges.insert(*it);
            if (challenge.responders.size() < NUMBER_OF_RESPONDERS) {
                std::cerr << "ERROR: fewer responses to " << challenge.id << " than expected" << std::endl;
            }
        }
    }

    for (std::set<std::string>::iterator it = expiredChallenges.begin(); it != expiredChallenges.end(); it++) {
        m_challengesNotExpired.erase(*it);
    }
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
