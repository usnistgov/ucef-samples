#!/bin/bash

##### GLOBAL VARIABLES ######

root_directory=`pwd`
logs_directory=$root_directory/logs

fedmgr_host=127.0.0.1
fedmgr_port=8083

timestamp=`date +"%F_%T"`

##### FUNCTION DEFINITIONS ######

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

    printf "Waiting for $expectedNumber instances of $federateType to join.."
    while (( $(getNumberJoined $federateType) != $expectedNumber))
    do
        printf "."
        sleep 5
    done
    printf "\n"
}

##### SCRIPT START #####

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
cd $root_directory/src/FederationManager
xterm -fg white -bg black -l -lf $logs_directory/federation-manager-${timestamp}.log -T "Federation Manager" -geometry 140x40+0+0 -e "export CPSWT_ROOT=`pwd` && mvn exec:java -P FederationManagerExecJava" &

printf "Waiting for the federation manager to come online.."
until $(curl -o /dev/null -s -f -X GET http://$fedmgr_host:$fedmgr_port/fedmgr); do
    printf "."
    sleep 5
done
printf "\n"

curl -o /dev/null -s -X POST http://$fedmgr_host:$fedmgr_port/fedmgr --data '{"action": "START"}' -H "Content-Type: application/json"

# run the other federates
cd $root_directory/src/Environment/target
cp $root_directory/src/Environment/RTI.rid .
cp -r $root_directory/src/Environment/conf/ .
xterm -fg green -bg black -l -lf $logs_directory/environment-${timestamp}.log -T "Environment" -geometry 140x40+180+60 -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Environment-0.0.1-SNAPSHOT.jar conf/Environment.json" &
waitUntilJoined Environment 1

cd $root_directory/src/Aggregator/target
cp $root_directory/src/Aggregator/RTI.rid .
cp -r $root_directory/src/Aggregator/conf/ .
xterm -fg orange -bg black -l -lf $logs_directory/aggregator-${timestamp}.log -T "Aggregator" -geometry 140x40+360+120 -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Aggregator-0.0.1-SNAPSHOT.jar conf/Aggregator.json" &
waitUntilJoined Aggregator 1

cd $root_directory/src/Reporter/target
cp $root_directory/src/Reporter/RTI.rid .
cp -r $root_directory/src/Reporter/conf/ .
xterm -fg cyan -bg black -l -lf $logs_directory/reporter-${timestamp}.log -T "Reporter" -geometry 140x40+540+180 -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Reporter-0.0.1-SNAPSHOT.jar conf/Reporter.json" &

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

