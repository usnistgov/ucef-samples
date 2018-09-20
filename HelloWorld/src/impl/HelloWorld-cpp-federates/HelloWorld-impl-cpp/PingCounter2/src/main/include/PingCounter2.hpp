#ifndef _PINGCOUNTER2_CLASS
#define _PINGCOUNTER2_CLASS

#include "PingCounter2Base.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"


class PingCounter2 : public PingCounter2Base {
    private:
        double m_currentTime;

        void handleObjectClass(boost::shared_ptr<PingCount> object);

        void checkReceivedSubscriptions();

    public:
        typedef PingCounter2Base Super;

        PingCounter2(FederateConfig *configuration): Super(configuration) {}

        virtual ~PingCounter2( void ) throw (RTI::FederateInternalError) {}

        class PingCounter2ATRCallback : public ATRCallback {
            private:
                PingCounter2 &m_federateInstance;
            public:
                PingCounter2ATRCallback(PingCounter2 &federateInstance): m_federateInstance(federateInstance) {}
                
                virtual void execute( void ) {
                    m_federateInstance.execute();
                }

                virtual SP clone( void ) {
                    return SP(new PingCounter2ATRCallback(*this));
                }
        };

        void initialize( void );
        void execute( void );
};

#endif
