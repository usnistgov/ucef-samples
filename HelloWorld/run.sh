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
cd $root_directory/deployment
xterm -fg white -bg black -l -lf $logs_directory/federation-manager-${timestamp}.log -T "Federation Manager" -geometry 140x40+0+0 -e "export CPSWT_ROOT=`pwd` && mvn exec:java -P FederationManagerExecJava" &

printf "Waiting for the federation manager to come online.."
until $(curl -o /dev/null -s -f -X GET http://$fedmgr_host:$fedmgr_port/fedmgr); do
    printf "."
    sleep 5
done
printf "\n"

curl -o /dev/null -s -X POST http://$fedmgr_host:$fedmgr_port/fedmgr --data '{"action": "START"}' -H "Content-Type: application/json"

# run the other federates
cd $root_directory/deployment
xterm -fg green -bg black -l -lf $logs_directory/Source-${timestamp}.log -T "Source" -geometry 140x40+80+80 -e "mvn exec:java -P ExecJava,Source" &
waitUntilJoined Source 1
xterm -fg green -bg black -l -lf $logs_directory/Sink-${timestamp}.log -T "Sink" -geometry 140x40+100+100 -e "mvn exec:java -P ExecJava,Sink" &
waitUntilJoined Sink 1
xterm -fg green -bg black -l -lf $logs_directory/PingCounter-${timestamp}.log -T "PingCounter" -geometry 140x40+120+120 -e "mvn exec:java -P ExecJava,PingCounter" &
waitUntilJoined PingCounter 1

cd $root_directory/deployment-Source2
xterm -fg yellow -bg black -l -lf $logs_directory/Source2-${timestamp}.log -T "Source2" -geometry 140x40+160+160 -e "mvn exec:exec -P CppFed,Source2" &
waitUntilJoined Source2 1
cd $root_directory/deployment-Sink2
xterm -fg yellow -bg black -l -lf $logs_directory/Sink2-${timestamp}.log -T "Sink2" -geometry 140x40+180+180 -e "mvn exec:exec -P CppFed,Sink2" &
waitUntilJoined Sink2 1
cd $root_directory/deployment-PingCounter2
xterm -fg yellow -bg black -l -lf $logs_directory/PingCounter2-${timestamp}.log -T "PingCounter2" -geometry 140x40+200+200 -e "mvn exec:exec -P CppFed,PingCounter2" &
waitUntilJoined PingCounter2 1

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

PGID=$(ps -ae -o pgid,command | grep -i HelloWorld-cpp-Source2 | grep -v $0 | grep -v grep | sort -n | head -1)
if [ -n "$PGID" ]; then
	set $PGID
	kill -- -$1 > /dev/null 2>&1
fi
PGID=$(ps -ae -o pgid,command | grep -i HelloWorld-cpp-Sink2 | grep -v $0 | grep -v grep | sort -n | head -1)
if [ -n "$PGID" ]; then
	set $PGID
	kill -- -$1 > /dev/null 2>&1
fi
PGID=$(ps -ae -o pgid,command | grep -i HelloWorld-cpp-PingCounter2 | grep -v $0 | grep -v grep | sort -n | head -1)
if [ -n "$PGID" ]; then
	set $PGID
	kill -- -$1 > /dev/null 2>&1
fi


echo Listing the runtime errors...
cd $root_directory
grep --color=always -rn "ERROR" logs/*$timestamp.log
echo Done.

