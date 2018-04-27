#ifndef _CPP_RESPONDER_CLASS
#define _CPP_RESPONDER_CLASS

#include "CppResponderBase.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"

class CppResponder : public CppResponderBase {
    private:
        double currentTime;

    public:
        CppResponder(FederateConfig *fedconfigObj): CppResponderBase(fedconfigObj) {}

        virtual ~CppResponder( void ) throw (RTI::FederateInternalError) {}

        class CppResponderATRCallback : public ATRCallback {
            private:
                CppResponder &responder;
            public:
                CppResponderATRCallback(CppResponder &responder) : responder(responder) {}
                virtual void execute( void ) { responder.execute(); }
                virtual SP clone( void ) { return SP(new CppResponderATRCallback(*this)); }
        };

        void initialize( void );
        void execute( void );
        void respond(const std::string & id, const std::string & stringValue, int beginIndex);
};

#endif

