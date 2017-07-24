#!/usr/bin/env bash

# Run the house federate with either a random name or command line provided name
# this script must be run from the workshopexercise folder

DIR=`pwd`

#use this selection to produce log files of all terminal content
logtofile="-l "
#logtofile=""

LOG4J=$DIR/log4j2.xml
RTI_RID_FILE=$DIR/RTI.rid

num=$((1 + RANDOM % 1000))

if [ -z "$1" ]
then
	name=house$num
else
	name=$1
fi

echo "running house federate name: $name" 
cd $DIR/src/house/HouseProject_generated/HouseProject-java-federates/HouseProject-impl-java/House/target
xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=$name" &

cd $DIR

