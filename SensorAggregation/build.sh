#!/bin/bash
rootdir=`pwd`

cd $rootdir/src/Environment
mvn clean install

cd $rootdir/src/Aggregator
mvn clean install

cd $rootdir/src/Reporter
mvn clean install

