#!/bin/bash
DIR=`pwd`

cd $DIR/src/fedmanager
rm RTI.rid
mvn clean

cd $DIR/src/metronome
mvn clean

cd $DIR/src/weather
mvn clean

cd $DIR/src/controller
mvn clean

cd $DIR/src/zone
mvn clean

cd $DIR/src/labview
mvn clean

