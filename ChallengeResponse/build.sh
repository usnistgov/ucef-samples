#!/bin/bash
rootdir=`pwd`

cd $rootdir/src/ChallengeResponse_generated
mvn clean install

cd $rootdir/src/ChallengeResponse_deployment
mvn clean install
mvn package -P CppFed

cd $rootdir/src/GatewayChallenger
mvn clean install

cd $rootdir/src/GatewayResponder
mvn clean install

cd $rootdir/src/GatewayParentReceiver
mvn clean install

