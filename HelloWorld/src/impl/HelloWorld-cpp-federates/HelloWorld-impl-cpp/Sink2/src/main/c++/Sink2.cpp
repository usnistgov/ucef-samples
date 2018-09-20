#include "Sink2.hpp"

void Sink2::initialize( void ) {
    m_currentTime = 0;
    
    if (this->get_IsLateJoiner()) {
        m_currentTime = getLBTS() - getLookAhead();
        disableTimeRegulation();
    }

    Sink2ATRCallback advanceTimeRequest(*this);
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

void Sink2::initObjectInstances() {
    // TODO register object instances and send initial values
    // vPingCount.registerObject(getRTI());
}

void Sink2::checkReceivedSubscriptions() {

    InteractionRoot::SP interactionRootSP;
    while((interactionRootSP = getNextInteraction()) != 0) {
        boost::shared_ptr<Ping> ping_ptr =
                boost::dynamic_pointer_cast<Ping>(interactionRootSP);
        if (ping_ptr != NULL) {
            handleInteractionClass(ping_ptr);
            continue;
        }
        std::cerr << "unhandled interaction " << interactionRootSP->getClassName() << std::endl;
    }
}

void Sink2::execute( void ) {
    checkReceivedSubscriptions();

    // TODO update registered object instances

    // vPingCount.set_RunningCount(YOUR_VALUE_HERE);
    // vPingCount.set_SinkName(YOUR_VALUE_HERE);
    // vPingCount.updateAttributeValues(getRTI(), m_currentTime + getLookAhead());
    
    m_currentTime += 1;
    Sink2ATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);
}

void Sink2::handleInteractionClass(boost::shared_ptr<Ping> interaction) {
    // TODO implement how to handle received interaction
}

int main(int argc, char *argv[]) {
    FederateConfigParser *configParser = new FederateConfigParser();
    FederateConfig *config = configParser->parseArgs(argc, argv);

    std::cout << "Creating Sink2 instance" << std::endl;
    Sink2 federateInstance(config);
    federateInstance.initialize();
    std::cout << "Running Sink2 instance" << std::endl;
    federateInstance.run();

    return 0;
}
