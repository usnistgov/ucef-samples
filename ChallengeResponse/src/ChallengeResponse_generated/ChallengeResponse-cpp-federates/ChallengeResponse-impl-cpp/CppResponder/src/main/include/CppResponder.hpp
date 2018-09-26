#ifndef _CPPRESPONDER_CLASS
#define _CPPRESPONDER_CLASS

#include "CppResponderBase.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"

/*
 * This class broadcasts response interactions to the federation each time it receives a challenge.
 *
 * A challenge is a randomly generated string paired with an integer index of one of the elements. A correct response
 * for a given challenge is the substring that starts from the challenge index. To generate the correct response, a
 * federate must understand both the string and numeric data in the challenge.
 *
 * This class generates and sends a response to challenges received as either as an interaction or an object update. It
 * is stateless, and will generate one response per received challenge.
 */
class CppResponder : public CppResponderBase {
    private:
        double m_currentTime;

        /*
         * Handle and respond to challenges sent as object updates.
         */
        void handleObjectClass(boost::shared_ptr<ChallengeObject> object);

        /*
         * Handle and respond to challenges sent as interactions.
         */
        void handleInteractionClass(boost::shared_ptr<ChallengeInteraction> interaction);

        void checkReceivedSubscriptions();

        /*
         * Send a response interaction for the given challenge. The response content will be set to the substring of the
         * given string starting from the given index.
         */
        void respond(const std::string &id, const std::string &stringValue, int beginIndex);

    public:
        typedef CppResponderBase Super;

        CppResponder(FederateConfig *configuration): Super(configuration) {}

        virtual ~CppResponder( void ) throw (RTI::FederateInternalError) {}

        class CppResponderATRCallback : public ATRCallback {
            private:
                CppResponder &m_federateInstance;
            public:
                CppResponderATRCallback(CppResponder &federateInstance): m_federateInstance(federateInstance) {}
                
                virtual void execute( void ) {
                    m_federateInstance.execute();
                }

                virtual SP clone( void ) {
                    return SP(new CppResponderATRCallback(*this));
                }
        };

        void initialize( void );
        void execute( void );
};

#endif
