#!/bin/bash
timestamp=`date +"%F_%T"`

nc -z 127.0.0.1 8083
if [ $? -eq 0 ]; then
    echo Cannot start the federation manager on port 8083
    exit 1
fi

if [ ! -d log ]; then
    echo Creating the log directory
    mkdir log
fi

xterm -l -lf log/federation-manager-${timestamp}.log -T "Federation Manager" -e "mvn exec:java -P FederationManagerExecJava" &

printf "Waiting for the federation manager to come online.."
until $(curl -o /dev/null -s -f -X GET http://127.0.0.1:8083/fedmgr); do
    printf "."
    sleep 5
done
printf "\n"

curl -o /dev/null -s -X POST http://127.0.0.1:8083/fedmgr --data '{"action": "START"}' -H "Content-Type: application/json"

# run other federates

read -n 1 -r -s -p "Press any key to terminate the federation execution..."
printf "\n"

curl -o /dev/null -s -X POST http://127.0.0.1:8083/fedmgr --data '{"action": "TERMINATE"}' -H "Content-Type: application/json"

printf "Waiting for the federation manager to terminate.."
while $(curl -o /dev/null -s -f -X GET http://127.0.0.1:8083/fedmgr); do
    printf "."
    sleep 5
done
printf "\n"

