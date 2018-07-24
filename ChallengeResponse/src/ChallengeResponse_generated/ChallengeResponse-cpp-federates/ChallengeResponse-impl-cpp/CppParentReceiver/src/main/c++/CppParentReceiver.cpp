#include "CppParentReceiver.hpp"

void CppParentReceiver::initialize( void ) {
    m_currentTime = 0;
    
    if (this->get_IsLateJoiner()) {
        m_currentTime = getLBTS() - getLookAhead();
        disableTimeRegulation();
    }

    CppParentReceiverATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);

    if(!this->get_IsLateJoiner()){
        readyToPopulate();
        readyToRun();
    }
}

void CppParentReceiver::checkReceivedSubscriptions() {

    SynchronizedFederate::ObjectReflector objectReflector;
    while(!(objectReflector = getNextObjectReflector()).isNull()) {
        objectReflector.reflect();

        boost::shared_ptr<ParentObject> parentobject_ptr =
                boost::dynamic_pointer_cast<ParentObject>(objectReflector.getObjectRootSP());
        if (parentobject_ptr != NULL) {
            handleObjectClass(parentobject_ptr);
            continue;
        }
        std::cerr << "unhandled object reflection " << objectReflector.getObjectRootSP()->getClassName() << std::endl;
    }

    InteractionRoot::SP interactionRootSP;
    while((interactionRootSP = getNextInteraction()) != 0) {
        boost::shared_ptr<Response> response_ptr =
                boost::dynamic_pointer_cast<Response>(interactionRootSP);
        if (response_ptr != NULL) {
            handleInteractionClass(response_ptr);
            continue;
        }
        boost::shared_ptr<ParentInteraction> parentinteraction_ptr =
                boost::dynamic_pointer_cast<ParentInteraction>(interactionRootSP);
        if (parentinteraction_ptr != NULL) {
            handleInteractionClass(parentinteraction_ptr);
            continue;
        }
        std::cerr << "unhandled interaction " << interactionRootSP->getClassName() << std::endl;
    }
}

void CppParentReceiver::execute( void ) {
    checkReceivedSubscriptions();
    
    m_currentTime += 1;
    CppParentReceiverATRCallback advanceTimeRequest(*this);
    putAdvanceTimeRequest(m_currentTime, advanceTimeRequest);
}

void CppParentReceiver::handleObjectClass(boost::shared_ptr<ParentObject> object) {
    // TODO implement how to handle received object update
}

void CppParentReceiver::handleInteractionClass(boost::shared_ptr<Response> interaction) {
    // TODO implement how to handle received interaction
}

void CppParentReceiver::handleInteractionClass(boost::shared_ptr<ParentInteraction> interaction) {
    // TODO implement how to handle received interaction
}

int main(int argc, char *argv[]) {
    FederateConfigParser *configParser = new FederateConfigParser();
    FederateConfig *config = configParser->parseArgs(argc, argv);

    std::cout << "Creating CppParentReceiver instance" << std::endl;
    CppParentReceiver federateInstance(config);
    federateInstance.initialize();
    std::cout << "Running CppParentReceiver instance" << std::endl;
    federateInstance.run();

    return 0;
}
