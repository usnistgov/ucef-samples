#ifndef _CPP_CHALLENGER_CLASS
#define _CPP_CHALLENGER_CLASS

#include "CppChallengerBase.hpp"
#include "FederateConfigParser.h"
#include "FederateConfig.h"

class CppChallenger : public CppChallengerBase {
    private:
        double currentTime;

    public:
        CppChallenger(FederateConfig *fedconfigObj): CppChallengerBase(fedconfigObj) {}

        virtual ~CppChallenger( void ) throw (RTI::FederateInternalError) {}

        class CppChallengerATRCallback : public ATRCallback {
            private:
                CppChallenger &challenger;
            public:
                CppChallengerATRCallback(CppChallenger &challenger) : challenger(challenger) {}
                virtual void execute( void ) { challenger.execute(); }
                virtual SP clone( void ) { return SP(new CppChallengerATRCallback(*this)); }
        };

    void initialize( void );
    void execute( void );
};

#endif

