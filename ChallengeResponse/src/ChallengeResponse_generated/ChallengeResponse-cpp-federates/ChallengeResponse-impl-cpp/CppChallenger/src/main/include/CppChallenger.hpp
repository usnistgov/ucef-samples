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

/*
 * A simple data structure that stores variables associated with a single challenge. A challenge is a (string,index)
 * pair where the index refers to an element in the string. The expected response to a challenge is the substring of
 * the string that starts from the index.
 */
struct Challenge {
    std::string id; // A unique identifier for the challenge.
    std::string stringValue; // The string content of the challenge.
    int beginIndex; // An index of the string value.
    double expirationTime; // The logical time after which the challenge is no longer relevant.
    std::string correctResponse; // The expected substring that should be provided as a response to the challenge.
    std::set<std::string> responders; // A set of federate names that have responded to the challenge.
};

/*
 * This class broadcasts challenges to the federation, and tests if the responses to those challenges are correct.
 *
 * A challenge is a randomly generated string paired with an integer index of one of the elements. A correct response
 * for a given challenge is the substring that starts from the challenge index. To generate the correct response, a
 * federate must understand both the string and numeric data in the challenge.
 *
 * This class generates two challenges each logical time step. One challenge is sent as an interaction, and the other
 * challenge is sent as an update to one registered object instance. The content of the two challenges are different.
 *
 * A response to a challenge is not immediate as both the challenge and its response are TSO messages. Each challenge
 * has an associated timeout, and failure to receive a correct response before the timeout expires is flagged as an
 * error. All failed challenges are output to the logger ERROR channel.
 *
 * When this federate terminates, there will be several outstanding challenges due to the delay before each response.
 * All of these challenges are discarded, and none of them are flagged as errors.
 */
class CppChallenger : public CppChallengerBase {
    private:
        // these should be moved to a JSON file after cpswt-cpp supports custom configuration files
        static const int NUMBER_OF_RESPONDERS = 3;
        static const int CHALLENGE_LENGTH = 32;

        boost::random::mt19937 m_randomGenerator;

        /*
         * An association from challenge identifier to the details of a challenge.
         */
        std::map< std::string, Challenge > m_challenges;

        /*
         * The set of challenges that have not expired, and still expect to receive responses.
         */
        std::set<std::string> m_challengesNotExpired;

        /*
         * The object instance used for the challenge sent via object updates.
         */
        ChallengeObject m_challengeObject;

        /*
         * The current logical time managed by the WebGME generated code.
         */
        double m_currentTime;

        /*
         * The number of characters in the challenge string.
         */
        int m_challengeLength;

        /*
         * An increasing integer used to generate an id for each challenge.
         */
        int m_sequenceNumber;

        /*
         * This method registers the object instance that will be used to send challenges.
         */
        void initObjectInstances();

        /*
         * This method handles responses to the challenges. A response can be for challenges sent using either interactions
         * or registered object instances. If there are multiple federates that send challenges, the responses for all the
         * federates will pass through this method.
         */
        void handleInteractionClass(boost::shared_ptr<Response> interaction);

        void checkReceivedSubscriptions();

        /*
         * Generate and return a random challenge string.
         */
        std::string generateStringValue();

        /*
         * Generate and return an index into the challenge string. This index will be in the range [1,challengeLength-1].
         * The first element is excluded so that the correct response is never equivalent to the challenge string.
         */
        int generateBeginIndex();

        /*
         * This method returns a new random challenge. As part of the creation process, the challenge sequence number will
         * be incremented and the new challenge will be registered with the response tracker. The returned challenge must
         * be sent to the federation during the same time step as this method call. Otherwise, the response tracker will
         * report multiple errors when no responses are received before its internal timeout.
         */
        Challenge createChallenge();

        /*
         * This method creates and sends an interaction that contains a new challenge.
         */
        void sendChallengeInteraction();

        /*
         * This method updates the registered object instance for the next challenge.
         */
        void sendChallengeObject();

        /*
         * This method expires all challenges with an expiration time less than or equal to the current logical time. When a
         * challenge is expired, all future responses to that challenge will be considered as incorrect and logged as errors.
         * In addition, a challenge that expires prior to receiving its expected number of responses will be logged as an error.
         */
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
