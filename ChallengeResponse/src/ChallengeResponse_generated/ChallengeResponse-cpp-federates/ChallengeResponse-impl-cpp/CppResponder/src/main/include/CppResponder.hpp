#ifndef _CPPRESPONDER_CLASS
#define _CPPRESPONDER_CLASS

#include "CppResponderBase.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"


class CppResponder : public CppResponderBase {
    private:
        double m_currentTime;

        void handleObjectClass(boost::shared_ptr<ChallengeObject> object);

        void handleInteractionClass(boost::shared_ptr<ChallengeInteraction> interaction);

        void checkReceivedSubscriptions();

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
