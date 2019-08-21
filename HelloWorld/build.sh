#!/bin/bash
rootdir=`pwd`

# Build sources
cd $rootdir/src/impl
mvn clean install deploy

# Install into deployment
cd $rootdir/deployment
mvn clean install

# Create deployment for C++ federates
if [ -d "${rootdir}/deployment-Source2" ]; then
	echo "Deleting existing directory ${rootdir}/deployment-Source2."
	rm -rf ${rootdir}/deployment-Source2
fi
cp -R $rootdir/deployment $rootdir/deployment-Source2
cd $rootdir/deployment-Source2
mvn package -P CppFed

if [ -d "${rootdir}/deployment-Sink2" ]; then
	echo "Deleting existing directory ${rootdir}/deployment-Sink2."
	rm -rf ${rootdir}/deployment-Sink2
fi
cp -R $rootdir/deployment $rootdir/deployment-Sink2
cd $rootdir/deployment-Sink2
mvn package -P CppFed

if [ -d "${rootdir}/deployment-PingCounter2" ]; then
	echo "Deleting existing directory ${rootdir}/deployment-PingCounter2."
	rm -rf ${rootdir}/deployment-PingCounter2
fi
cp -R $rootdir/deployment $rootdir/deployment-PingCounter2
cd $rootdir/deployment-PingCounter2
mvn package -P CppFed

