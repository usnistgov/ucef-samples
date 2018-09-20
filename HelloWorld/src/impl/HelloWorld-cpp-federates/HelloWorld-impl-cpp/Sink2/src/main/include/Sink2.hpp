#ifndef _SINK2_CLASS
#define _SINK2_CLASS

#include "Sink2Base.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"


class Sink2 : public Sink2Base {
    private:
        double m_currentTime;

        // TODO declare all the published object instances
        // PingCount vPingCount;

        void initObjectInstances();

        void handleInteractionClass(boost::shared_ptr<Ping> interaction);

        void checkReceivedSubscriptions();

    public:
        typedef Sink2Base Super;

        Sink2(FederateConfig *configuration): Super(configuration) {}

        virtual ~Sink2( void ) throw (RTI::FederateInternalError) {}

        class Sink2ATRCallback : public ATRCallback {
            private:
                Sink2 &m_federateInstance;
            public:
                Sink2ATRCallback(Sink2 &federateInstance): m_federateInstance(federateInstance) {}
                
                virtual void execute( void ) {
                    m_federateInstance.execute();
                }

                virtual SP clone( void ) {
                    return SP(new Sink2ATRCallback(*this));
                }
        };

        void initialize( void );
        void execute( void );
};

#endif
