#!/bin/bash
root_directory=`pwd`
logs_directory=$root_directory/logs

timestamp=`date +"%F_%T"`

nc -z 127.0.0.1 8083
if [ $? -eq 0 ]; then
    echo Cannot start the federation manager on port 8083
    exit 1
fi

if [ ! -d $logs_directory ]; then
    echo Creating the $logs_directory directory
    mkdir $logs_directory
fi

# run the federation manager
cd $root_directory/FederationManager
xterm -fg white -bg black -l -lf $logs_directory/federation-manager-${timestamp}.log -T "Federation Manager" -geometry 140x40+0+0 -e "export CPSWT_ROOT=`pwd` && mvn exec:java -P FederationManagerExecJava" &

printf "Waiting for the federation manager to come online.."
until $(curl -o /dev/null -s -f -X GET http://127.0.0.1:8083/fedmgr); do
    printf "."
    sleep 5
done
printf "\n"

curl -o /dev/null -s -X POST http://127.0.0.1:8083/fedmgr --data '{"action": "START"}' -H "Content-Type: application/json"

# run the other federates
cd $root_directory/Environment/target
cp $root_directory/Environment/RTI.rid .
cp -r $root_directory/Environment/conf/ .
xterm -fg green -bg black -l -lf $logs_directory/environment-${timestamp}.log -T "Environment" -geometry 140x40+180+60 -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Environment-0.0.1-SNAPSHOT.jar conf/Environment.json" &

cd $root_directory/Aggregator/target
cp $root_directory/Aggregator/RTI.rid .
cp -r $root_directory/Aggregator/conf/ .
xterm -fg orange -bg black -l -lf $logs_directory/aggregator-${timestamp}.log -T "Aggregator" -geometry 140x40+360+120 -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Aggregator-0.0.1-SNAPSHOT.jar conf/Aggregator.json" &

cd $root_directory/Reporter/target
cp $root_directory/Reporter/RTI.rid .
cp -r $root_directory/Reporter/conf/ .
xterm -fg cyan -bg black -l -lf $logs_directory/reporter-${timestamp}.log -T "Reporter" -geometry 140x40+540+180 -e "java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Reporter-0.0.1-SNAPSHOT.jar conf/Reporter.json" &

# terminate the simulation
read -n 1 -r -s -p "Press any key to terminate the federation execution..."
printf "\n"

curl -o /dev/null -s -X POST http://127.0.0.1:8083/fedmgr --data '{"action": "TERMINATE"}' -H "Content-Type: application/json"

printf "Waiting for the federation manager to terminate.."
while $(curl -o /dev/null -s -f -X GET http://127.0.0.1:8083/fedmgr); do
    printf "."
    sleep 5
done
printf "\n"

