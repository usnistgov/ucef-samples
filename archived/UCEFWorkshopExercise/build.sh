#!/bin/bash
DIR=`pwd`
 
cd $DIR/src/Metronome
mvn clean install

cd $DIR/src/Weather
mvn clean install

cd $DIR/src/Utility
mvn clean install

cd $DIR/src/House
mvn clean install

cd $DIR/src/WorkshopExercise_generated
mvn clean install

cd $DIR/src/WorkshopExercise_deployment
mvn clean install

