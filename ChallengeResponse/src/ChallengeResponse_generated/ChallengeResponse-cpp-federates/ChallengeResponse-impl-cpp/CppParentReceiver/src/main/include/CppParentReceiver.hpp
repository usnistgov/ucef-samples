#ifndef _CPPPARENTRECEIVER_CLASS
#define _CPPPARENTRECEIVER_CLASS

#include "CppParentReceiverBase.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"

#include <set>

class CppParentReceiver : public CppParentReceiverBase {
    private:
        double m_currentTime;

        std::set<std::string> m_knownId;

        void handleObjectClass(boost::shared_ptr<ParentObject> object);

        void handleInteractionClass(boost::shared_ptr<Response> interaction);

        void handleInteractionClass(boost::shared_ptr<ParentInteraction> interaction);

        void checkReceivedSubscriptions();

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
