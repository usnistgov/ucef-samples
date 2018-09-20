#include "Source2.hpp"

void Source2::initialize( void ) {
    m_currentTime = 0;
    
    if (this->get_IsLateJoiner()) {
        m_currentTime = getLBTS() - getLookAhead();
        disableTimeRegulation();
    }

    Source2ATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);

    if(!this->get_IsLateJoiner()){
        readyToPopulate();
        readyToRun();
    }
}

void Source2::execute( void ) {

    // TODO send interactions

    // PingSP vPing = create_Ping();
    // vPing->set_Count(YOUR_VALUE_HERE);
    // vPing->set_actualLogicalGenerationTime(YOUR_VALUE_HERE);
    // vPing->set_federateFilter(YOUR_VALUE_HERE);
    // vPing->set_originFed(YOUR_VALUE_HERE);
    // vPing->set_sourceFed(YOUR_VALUE_HERE);
    // vPing->sendInteraction(getRTI(), m_currentTime + getLookAhead());
    
    m_currentTime += 1;
    Source2ATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);
}

int main(int argc, char *argv[]) {
    FederateConfigParser *configParser = new FederateConfigParser();
    FederateConfig *config = configParser->parseArgs(argc, argv);

    std::cout << "Creating Source2 instance" << std::endl;
    Source2 federateInstance(config);
    federateInstance.initialize();
    std::cout << "Running Source2 instance" << std::endl;
    federateInstance.run();

    return 0;
}
