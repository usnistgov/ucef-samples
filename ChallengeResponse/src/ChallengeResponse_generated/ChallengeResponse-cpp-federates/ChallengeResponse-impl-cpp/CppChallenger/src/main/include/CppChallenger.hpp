#ifndef _CPPCHALLENGER_CLASS
#define _CPPCHALLENGER_CLASS

#include "CppChallengerBase.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"


class CppChallenger : public CppChallengerBase {
    private:
        double m_currentTime;

        // TODO declare all the published object instances
        // ChallengeObject vChallengeObject;

        void initObjectInstances();

        void handleInteractionClass(boost::shared_ptr<Response> interaction);

        void checkReceivedSubscriptions();

    public:
        typedef CppChallengerBase Super;

        CppChallenger(FederateConfig *configuration): Super(configuration) {}

        virtual ~CppChallenger( void ) throw (RTI::FederateInternalError) {}

        class CppChallengerATRCallback : public ATRCallback {
            private:
                CppChallenger &m_federateInstance;
            public:
                CppChallengerATRCallback(CppChallenger &federateInstance): m_federateInstance(federateInstance) {}
                
                virtual void execute( void ) {
                    m_federateInstance.execute();
                }

                virtual SP clone( void ) {
                    return SP(new CppChallengerATRCallback(*this));
                }
        };

        void initialize( void );
        void execute( void );
};

#endif
