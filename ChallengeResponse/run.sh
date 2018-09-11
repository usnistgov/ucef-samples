#!/bin/bash
root_directory=`pwd`
logs_directory=$root_directory/logs

fedmgr_host=127.0.0.1
fedmgr_port=8083

timestamp=`date +"%F_%T"`

# set to true to skip the wait period between launching federates
#   WARNING - will break logical time sychronization between federates
skip_wait_until_join=false

function getNumberJoined {
    if (( $# != 1 ))
    then
        echo bad syntax: getNumberJoined federateType
        exit 1
    fi
    federateList=$(curl -s -X GET http://$fedmgr_host:$fedmgr_port/federates -H "Content-Type: application/json")
    # JSON Query:
    #   .[] = process all values in the input object
    #   select(...) = exclude entries for resigned federates (resignTime defined) and federates that are not the desired TYPE
    #   enclosing [ ] = combine the result from the above queries into a single JSON array
    #   length = count the number of elements in the combined array
    echo $federateList | jq --arg TYPE "$1" '[.[] | select(.resignTime == null and .federateType == $TYPE)] | length'
}

function waitUntilJoined {
    if (( $# != 2 ))
    then
        echo bad syntax: waitUntilJoined federateType expectedNumber
        exit 1
    fi
    federateType=$1
    expectedNumber=$2

    if (( $expectedNumber < 1 ))
    then
        echo "illegal argument: expectedNumber of federates cannot be $expectedNumber"
        exit 1
    fi

    if [ "$skip_wait_until_join" = true ] ; then
        return
    fi

    printf "Waiting for $expectedNumber instances of $federateType to join.."
    while (( $(getNumberJoined $federateType) != $expectedNumber))
    do
        printf "."
        sleep 5
    done
    printf "\n"
}

# script starts here
echo Using timestamp $timestamp

if [ "$skip_wait_until_join" = true ] ; then
    echo !!! WARNING !!! skipped waitUntilJoined - expect issues with logical time progression
fi

nc -z $fedmgr_host $fedmgr_port
if [ $? -eq 0 ]; then
    echo Cannot start the federation manager on port $fedmgr_port
    exit 1
fi

if [ ! -d $logs_directory ]; then
    echo Creating the $logs_directory directory
    mkdir $logs_directory
fi

# run the federation manager
cd $root_directory/src/ChallengeResponse_deployment
xterm -fg white -bg black -l -lf $logs_directory/federation-manager-${timestamp}.log -T "Federation Manager" -geometry 140x40+0+0 -e "export CPSWT_ROOT=`pwd` && mvn exec:java -P FederationManagerExecJava" &

printf "Waiting for the federation manager to come online.."
until $(curl -o /dev/null -s -f -X GET http://$fedmgr_host:$fedmgr_port/fedmgr); do
    printf "."
    sleep 5
done
printf "\n"

curl -o /dev/null -s -X POST http://$fedmgr_host:$fedmgr_port/fedmgr --data '{"action": "START"}' -H "Content-Type: application/json"

# run the other federates
cd $root_directory/src/ChallengeResponse_deployment
xterm -fg yellow -bg black -l -lf $logs_directory/cpp-challenger-${timestamp}.log -T "C++ Challenger" -geometry 140x40+160+60 -e "mvn exec:exec -P CppFed,CppChallenger" &
waitUntilJoined CppChallenger 1

cd $root_directory/src/ChallengeResponse_deployment
xterm -fg yellow -bg black -l -lf $logs_directory/java-challenger-${timestamp}.log -T "Java Challenger" -geometry 140x40+240+90 -e "mvn exec:java -P ExecJava,JavaChallenger" &
waitUntilJoined JavaChallenger 1

cd $root_directory/src/GatewayChallenger/target
cp -r $root_directory/src/GatewayChallenger/conf/ .
xterm -fg yellow -bg black -l -lf $logs_directory/gateway-challenger-${timestamp}.log -T "Gateway Challenger" -geometry 140x40+320+120 -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar gateway-challenger-0.0.1-SNAPSHOT.jar conf/GatewayChallenger.json" &
waitUntilJoined GatewayChallenger 1

cd $root_directory/src/ChallengeResponse_deployment
xterm -fg green -bg black -l -lf $logs_directory/cpp-responder-${timestamp}.log -T "C++ Responder" -geometry 140x40+400+150 -e "mvn exec:exec -P CppFed,CppResponder" &
waitUntilJoined CppResponder 1

cd $root_directory/src/ChallengeResponse_deployment
xterm -fg green -bg black -l -lf $logs_directory/java-responder-${timestamp}.log -T "Java Responder" -geometry 140x40+480+180 -e "mvn exec:java -P ExecJava,JavaResponder" &
waitUntilJoined JavaResponder 1

cd $root_directory/src/GatewayResponder/target
cp -r $root_directory/src/GatewayResponder/conf/ .
xterm -fg green -bg black -l -lf $logs_directory/gateway-responder-${timestamp}.log -T "Gateway Responder" -geometry 140x40+560+210 -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar gateway-responder-0.0.1-SNAPSHOT.jar conf/GatewayResponder.json" &
waitUntilJoined GatewayResponder 1

cd $root_directory/src/ChallengeResponse_deployment
xterm -fg cyan -bg black -l -lf $logs_directory/cpp-parent-receiver-${timestamp}.log -T "C++ Parent Receiver" -geometry 140x40+640+240 -e "mvn exec:exec -P CppFed,CppParentReceiver" &
waitUntilJoined CppParentReceiver 1

cd $root_directory/src/ChallengeResponse_deployment
xterm -fg cyan -bg black -l -lf $logs_directory/java-parent-receiver-${timestamp}.log -T "Java Parent Receiver" -geometry 140x40+720+270 -e "mvn exec:java -P ExecJava,JavaParentReceiver" &
waitUntilJoined JavaParentReceiver 1

cd $root_directory/src/GatewayParentReceiver/target
cp -r $root_directory/src/GatewayParentReceiver/conf/ .
xterm -fg cyan -bg black -l -lf $logs_directory/gateway-parent-receiver-${timestamp}.log -T "Gateway Parent Receiver" -geometry 140x40+800+300 -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar gateway-parent-receiver-0.0.1-SNAPSHOT.jar conf/GatewayParentReceiver.json" &

# terminate the simulation
read -n 1 -r -s -p "Press any key to terminate the federation execution..."
printf "\n"

curl -o /dev/null -s -X POST http://$fedmgr_host:$fedmgr_port/fedmgr --data '{"action": "TERMINATE"}' -H "Content-Type: application/json"

printf "Waiting for the federation manager to terminate.."
while $(curl -o /dev/null -s -f -X GET http://$fedmgr_host:$fedmgr_port/fedmgr); do
    printf "."
    sleep 5
done
printf "\n"

echo Listing the runtime errors...
cd $root_directory
grep --color=always -rn "ERROR" logs/*$timestamp.log
echo Done.

