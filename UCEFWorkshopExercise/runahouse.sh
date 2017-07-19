#!/usr/bin/env bash

# Run the house federate with either a random name or command line provided name
# this script must be run from the workshopexercise folder

DIR=`pwd`

#use this selection to produce log files of all terminal content
logtofile="-l "
#logtofile=""

num=$((1 + RANDOM % 1000))

if [ -z "$1" ]
then
	name=house$num
else
	name=$1
fi

echo "running house federate name: $name" 
cd $DIR/src/house/HouseProject_generated/java-federates/HouseProject-impl-java/House/target
xterm -hold $logtofile -e "java -jar House-0.0.1-SNAPSHOT.jar FedManager $name INFO" &

cd $DIR

