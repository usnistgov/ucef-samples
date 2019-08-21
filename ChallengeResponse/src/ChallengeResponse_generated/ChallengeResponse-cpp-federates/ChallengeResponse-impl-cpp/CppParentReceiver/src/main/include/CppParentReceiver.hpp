#ifndef _CPPPARENTRECEIVER_CLASS
#define _CPPPARENTRECEIVER_CLASS

#include "CppParentReceiverBase.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"

#include <set>

/*
 * This passive federate monitors the federation traffic to test HLA's automatic upcasting of interaction classes and
 * object classes.
 * 
 * The challenge-response object model has the challenge interaction class and the challenge object class derive from
 * parent classes. No federate directly publishes the parent classes, but this federate subscribes to both rather than
 * the child classes published at runtime. If the HLA automatic upcasting feature works, this federate should receive
 * one instance of the parent class for each challenge issued during the federation execution.
 * 
 * To verify that each challenge sent is upcasted and received, this class also subscribes to the response interaction.
 * Each time a parent class is received, the challenge id is stored. Each time a response is received, its associated
 * challenge is checked against the stored challenge ids. If this federate receives a response for a challenge that has
 * never been stored, then either the response is corrupt or the challenge was never upcasted to its parent class.
 */
class CppParentReceiver : public CppParentReceiverBase {
    private:
        double m_currentTime;

        /*
         * A set of challenge ids received from the parent interaction and object classes.
         */
        std::set<std::string> m_knownId;

        /*
         * Handle a parent object by storing its challenge id.
         */
        void handleObjectClass(boost::shared_ptr<ParentObject> object);

        /*
         * Handle the response interaction. If the challenge id in the response has not been stored, then either the
         * response is corrupt or a previous challenge failed to get upcasted into a class subscribed to by this federate.
         * Both cases are treated the same and output as a simple error message. To distinguish between the two cases, the
         * output of the challenger federates would have to be inspected to see if the response was considered corrupt.
         */
        void handleInteractionClass(boost::shared_ptr<Response> interaction);

        /*
         * Handle a parent interaction by storing its challenge id.
         */
        void handleInteractionClass(boost::shared_ptr<ParentInteraction> interaction);

        void checkReceivedSubscriptions();

        /*
         * Store a new challenge id. If this id has already been stored, output an error message.
         */
        void addId(const std::string &id);

    public:
        typedef CppParentReceiverBase Super;

        CppParentReceiver(FederateConfig *configuration): Super(configuration) {}

        virtual ~CppParentReceiver( void ) throw (RTI::FederateInternalError) {}

        class CppParentReceiverATRCallback : public ATRCallback {
            private:
                CppParentReceiver &m_federateInstance;
            public:
                CppParentReceiverATRCallback(CppParentReceiver &federateInstance): m_federateInstance(federateInstance) {}
                
                virtual void execute( void ) {
                    m_federateInstance.execute();
                }

                virtual SP clone( void ) {
                    return SP(new CppParentReceiverATRCallback(*this));
                }
        };

        void initialize( void );
        void execute( void );
};

#endif
