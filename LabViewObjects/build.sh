#!/bin/bash
DIR=`pwd`

cd $DIR/src/LabViewObjects_generated
mvn clean install -U

cd $DIR/src/FederationManager
mvn clean install -U

cd $DIR/src/Controller
mvn clean install -U

