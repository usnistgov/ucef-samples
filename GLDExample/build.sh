#!/bin/bash
rootdir=`pwd`

cd $rootdir/src/GLDExample_generated
mvn clean install

cd $rootdir/src/GLDExample_deployment
mvn clean install

