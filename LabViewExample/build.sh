#!/bin/bash
DIR=`pwd`

cd $DIR/src/MetronomeProject_generated
mvn clean install

cd $DIR/src/WeatherProject_generated
mvn clean install

cd $DIR/src/ControllerProject_generated
mvn clean install

cd $DIR/src/ZoneProject_generated
mvn clean install

cd $DIR/src/LabViewProject_generated
mvn clean install

cd $DIR/src/LabViewExample_deployment
mvn clean install

