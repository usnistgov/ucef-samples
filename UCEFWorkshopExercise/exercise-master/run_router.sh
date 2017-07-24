#!/bin/bash
JGROUPS=/home/vagrant/JGroups
ADDRESS=127.0.0.1
PORT=12001

if [ "$#" -gt 0 ]; then
    ADDRESS=$1
fi

if [ "$#" -gt 1 ]; then
    PORT=$2
fi

cd $JGROUPS
java -Dlog4j.configuration=file:/home/vagrant/JGroups/conf/log4j.properties -cp classes/:conf/:lib/log4j.jar org.jgroups.stack.GossipRouter -bind_addr $ADDRESS -port $PORT

