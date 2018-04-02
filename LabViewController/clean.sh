#!/bin/bash
DIR=`pwd`

cd $DIR/src/FederationManager
mvn clean

cd $DIR/src/LabViewController_generated
mvn clean

cd $DIR/src/Controller
mvn clean

