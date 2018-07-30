#ifndef _CPPCHALLENGER_CLASS
#define _CPPCHALLENGER_CLASS

#include "CppChallengerBase.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"

#include <boost/lexical_cast.hpp>
#include <boost/random/mersenne_twister.hpp>
#include <boost/random/uniform_int_distribution.hpp>

#include <ctime>
#include <map>
#include <set>

struct Challenge {
    std::string id;
    std::string stringValue;
    int beginIndex;
    double expirationTime;
    std::string correctResponse;
    std::set<std::string> responders;
};

class CppChallenger : public CppChallengerBase {
    private:
        // these should be moved to a JSON file after cpswt-cpp supports custom configuration files
        static const int NUMBER_OF_RESPONDERS = 3;
        static const int CHALLENGE_LENGTH = 32;

        boost::random::mt19937 m_randomGenerator;

        std::map< std::string, Challenge > m_challenges;

        std::set<std::string> m_challengesNotExpired;

        ChallengeObject m_challengeObject;

        double m_currentTime;

        int m_challengeLength;

        int m_sequenceNumber;

        void initObjectInstances();

        void handleInteractionClass(boost::shared_ptr<Response> interaction);

        void checkReceivedSubscriptions();

        std::string generateStringValue();

        int generateBeginIndex();

        Challenge createChallenge();

        void sendChallengeInteraction();

        void sendChallengeObject();

        void handleExpiredChallenges();

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
