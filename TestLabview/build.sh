#!/bin/bash
DIR=`pwd`

cd $DIR/src/metronome
mvn clean install -U

cd $DIR/src/weather
mvn clean install -U

cd $DIR/src/labview
mvn clean install -U

cd $DIR/src/controller
mvn clean install -U

cd $DIR/src/zone
mvn clean install -U

