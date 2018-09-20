#include "PingCounter2.hpp"

void PingCounter2::initialize( void ) {
    m_currentTime = 0;
    
    if (this->get_IsLateJoiner()) {
        m_currentTime = getLBTS() - getLookAhead();
        disableTimeRegulation();
    }

    PingCounter2ATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);

    if(!this->get_IsLateJoiner()){
        readyToPopulate();
        readyToRun();
    }
}

void PingCounter2::checkReceivedSubscriptions() {

    SynchronizedFederate::ObjectReflector objectReflector;
    while(!(objectReflector = getNextObjectReflector()).isNull()) {
        objectReflector.reflect();

        boost::shared_ptr<PingCount> pingcount_ptr =
                boost::dynamic_pointer_cast<PingCount>(objectReflector.getObjectRootSP());
        if (pingcount_ptr != NULL) {
            handleObjectClass(pingcount_ptr);
            continue;
        }
        std::cerr << "unhandled object reflection " << objectReflector.getObjectRootSP()->getClassName() << std::endl;
    }
}

void PingCounter2::execute( void ) {
    checkReceivedSubscriptions();
    
    m_currentTime += 1;
    PingCounter2ATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);
}

void PingCounter2::handleObjectClass(boost::shared_ptr<PingCount> object) {
    // TODO implement how to handle received object update
}

int main(int argc, char *argv[]) {
    FederateConfigParser *configParser = new FederateConfigParser();
    FederateConfig *config = configParser->parseArgs(argc, argv);

    std::cout << "Creating PingCounter2 instance" << std::endl;
    PingCounter2 federateInstance(config);
    federateInstance.initialize();
    std::cout << "Running PingCounter2 instance" << std::endl;
    federateInstance.run();

    return 0;
}
