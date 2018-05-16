#!/bin/bash
rootdir=`pwd`

cd $rootdir/ChallengeResponse_generated
mvn clean install

cd $rootdir/ChallengeResponse_deployment
mvn clean install

cd $rootdir/GatewayChallenger
mvn clean install

cd $rootdir/GatewayResponder
mvn clean install

cd $rootdir/GatewayBaseReceiver
mvn clean install

