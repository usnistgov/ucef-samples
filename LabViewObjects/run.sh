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
    federateList=$(curl -s X GET http://$fedmgr_host:$fedmgr_port/federates -H "Content-Type: application/json")
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

    printf "Waiting for $expectedNumber instance(s) of $federateType to join.."
    while (( $(getNumberJoined $federateType) != $expectedNumber))
    do
        printf "."
        sleep 5
    done
    printf "\n"
}

# script starts here
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
cd $root_directory/src/FederationManager
xterm -fg white -bg black -l -lf $logs_directory/federation-manager-${timestamp}.log -T "Federation Manager" -geometry 140x40+100+50 \
    -e "export CPSWT_ROOT=`pwd` && mvn exec:java" &

printf "Waiting for the federation manager to come online.."
until $(curl -o /dev/null -s -f -X GET http://$fedmgr_host:$fedmgr_port/fedmgr); do
    printf "."
    sleep 5
done
printf "\n"

curl -o /dev/null -s -X POST http://$fedmgr_host:$fedmgr_port/fedmgr --data '{"action": "START"}' -H "Content-Type: application/json"

# run the other federates
cd $root_directory/src/LabViewObjects_generated/LabViewObjects-java-federates/LabViewObjects-impl-java/Thermostat/target
cp -r ../conf/ .
xterm -fg yellow -bg black -l -lf $logs_directory/thermostat-zone1-${timestamp}.log -T "Thermostat 1" -geometry 140x40+200+100 \
    -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Thermostat-0.1.0-SNAPSHOT.jar -configFile=conf/ThermostatZone1.json" &
waitUntilJoined Thermostat 1

xterm -fg yellow -bg black -l -lf $logs_directory/thermostat-zone2-${timestamp}.log -T "Thermostat 2" -geometry 140x40+300+150 \
    -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Thermostat-0.1.0-SNAPSHOT.jar -configFile=conf/ThermostatZone2.json" &
waitUntilJoined Thermostat 2

cd $root_directory/src/LabViewObjects_generated/LabViewObjects-java-federates/LabViewObjects-impl-java/Damper/target
cp -r ../conf/ .
xterm -fg green -bg black -l -lf $logs_directory/damper-zone1-${timestamp}.log -T "Damper 1" -geometry 140x40+400+200 \
    -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Damper-0.1.0-SNAPSHOT.jar -configFile=conf/DamperZone1.json" &
waitUntilJoined Damper 1

xterm -fg green -bg black -l -lf $logs_directory/damper-zone2-${timestamp}.log -T "Damper 2" -geometry 140x40+500+250 \
    -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Damper-0.1.0-SNAPSHOT.jar -configFile=conf/DamperZone2.json" &
waitUntilJoined Damper 2

cd $root_directory/src/Controller/target
cp -r ../conf/ .
xterm -fg cyan -bg black -l -lf $logs_directory/controller-${timestamp}.log -T "Controller" -geometry 140x40+600+300 \
    -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Controller-0.1.0-SNAPSHOT.jar conf/Controller.json" &

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

