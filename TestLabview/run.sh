#!/bin/bash
root_directory=`pwd`
logs_directory=$root_directory/logs

fedmgr_host=127.0.0.1
fedmgr_port=8083

timestamp=`date +"%F_%T"`

# set to true to skip the wait period between launching federates
#   WARNING - will break logical time sychronization between federates
skip_wait_until_join=true

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

    printf "Waiting for $expectedNumber instances of $federateType to join.."
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
cd $root_directory/src/fedmanager
cp $root_directory/conf/RTI.rid ./RTI.rid
xterm -fg white -bg black -l -lf $logs_directory/federation-manager-${timestamp}.log -T "Federation Manager" -geometry 140x40+0+0 \
    -e "mvn exec:java -P FederationManagerExecJava -Dlog4j.configurationFile=/conf/log4j2.xml" &
#    -e "export CPSWT_ROOT=`pwd` && mvn exec:java -P FederationManagerExecJava" &

printf "Waiting for the federation manager to come online.."
until $(curl -o /dev/null -s -f -X GET http://$fedmgr_host:$fedmgr_port/fedmgr); do
    printf "."
    sleep 5
done
printf "\n"

curl -o /dev/null -s -X POST http://$fedmgr_host:$fedmgr_port/fedmgr --data '{"action": "START"}' -H "Content-Type: application/json"

# run the other federates
cd $root_directory/src/weather/WeatherProject-java-federates/WeatherProject-impl-java/Weather/target
cp $root_directory/conf/tmy3.csv ./tmy3.csv
cp $root_directory/conf/RTI.rid ./RTI.rid
xterm -fg red -bg black -l -lf $logs_directory/weather-${timestamp}.log -T "Weather" -geometry 140x40+180+60 \
    -e "java -Dlog4j.configurationFile=$root_directory/conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Weather-0.1.0-SNAPSHOT.jar -configFile=conf/WeatherConfig.json" &
waitUntilJoined Weather 1

cd $root_directory/src/metronome/MetronomeProject-java-federates/MetronomeProject-impl-java/Metronome/target
cp $root_directory/conf/RTI.rid ./RTI.rid
xterm -fg magenta -bg black -l -lf $logs_directory/metronome-${timestamp}.log -T "Metronome" -geometry 140x40+360+120 \
    -e "java -Dlog4j.configurationFile=$root_directory/conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Metronome-0.1.0-SNAPSHOT.jar -configFile=conf/MetronomeConfig.json" &
waitUntilJoined Metronome 1

cd $root_directory/src/zone/Zone-java-federates/Zone-impl-java/Zone/target
cp $root_directory/conf/RTI.rid ./RTI.rid
xterm -fg cyan -bg black -l -lf $logs_directory/zone1-${timestamp}.log -T "Zone 1" -geometry 140x40+540+180 \
    -e "java -Dlog4j.configurationFile=$root_directory/conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Zone-0.1.0-SNAPSHOT.jar -configFile=conf/ZoneConfig.json -name=Zone1" &
waitUntilJoined Zone 1

cd $root_directory/src/controller/Controller-java-federates/Controller-impl-java/Controller/target
cp $root_directory/conf/RTI.rid ./RTI.rid
xterm -fg green -bg black -l -lf $logs_directory/controller1-${timestamp}.log -T "Controller 1" -geometry 140x40+720+240 \
    -e "java -Dlog4j.configurationFile=$root_directory/conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Controller-0.1.0-SNAPSHOT.jar -configFile=conf/ControllerConfig.json -name=Controller1" &
waitUntilJoined Controller 1

cd $root_directory/src/labview/TestLabview-java-federates/TestLabview-impl-java/TestLabVIEW/target
cp $root_directory/conf/RTI.rid ./RTI.rid
xterm -fg yellow -bg black -l -lf $logs_directory/labview-${timestamp}.log -T "LabVIEW" -geometry 140x40+900+300 \
    -e "java -Dlog4j.configurationFile=$root_directory/conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar TestLabVIEW-0.1.0-SNAPSHOT.jar -configFile=conf/TestLabVIEWConfig.json" &

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

