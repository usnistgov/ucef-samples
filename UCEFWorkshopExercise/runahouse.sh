#!/usr/bin/env bash
DIR=`pwd`

#use this selection to produce log files of all terminal content
logtofile="-l "
#logtofile=""

LOG4J=$DIR/log4j2.xml
RTI_FILE=$DIR/RTI.rid

# delete exercise TCP settings
find $DIR/src -name "jgroups-udp.xml" -delete

cd $DIR/src/house/HouseProject_generated/HouseProject-java-federates/HouseProject-impl-java/House/target
cp $RTI_FILE ./RTI.rid
if [ -z "$1" ]
then
    echo "Running house with randomly generated name..."
    xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json" &
else
    echo "Running house with the name $1..."
    xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=$1" &
fi

