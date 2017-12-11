#!/bin/bash
rootdir=`pwd`

cd $rootdir/Environment
mvn clean install

cd $rootdir/Aggregator
mvn clean install

cd $rootdir/Reporter
mvn clean install

