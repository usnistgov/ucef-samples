#ifndef _SOURCE2_CLASS
#define _SOURCE2_CLASS

#include "Source2Base.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"


class Source2 : public Source2Base {
    private:
        double m_currentTime;

    public:
        typedef Source2Base Super;

        Source2(FederateConfig *configuration): Super(configuration) {}

        virtual ~Source2( void ) throw (RTI::FederateInternalError) {}

        class Source2ATRCallback : public ATRCallback {
            private:
                Source2 &m_federateInstance;
            public:
                Source2ATRCallback(Source2 &federateInstance): m_federateInstance(federateInstance) {}
                
                virtual void execute( void ) {
                    m_federateInstance.execute();
                }

                virtual SP clone( void ) {
                    return SP(new Source2ATRCallback(*this));
                }
        };

        void initialize( void );
        void execute( void );
};

#endif
