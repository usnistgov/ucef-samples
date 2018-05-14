#!/bin/bash
rootdir=`pwd`

cd $rootdir/SimpleAdder_generated
mvn clean install

cd $rootdir/SimpleAdder_deployment
mvn clean install

