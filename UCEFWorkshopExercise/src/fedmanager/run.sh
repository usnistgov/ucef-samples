#!/usr/bin/env bash

RTI_RID_FILE=RTI.rid
federate_name=FedManager
DIR=`pwd`
cp fedmgrconfig.yml script.xml FedManager.fed target/
cd target
java \
-Djava.library.path=nar/processid-0.3.0-SNAPSHOT-amd64-Linux-gpp-jni/lib/amd64-Linux-gpp/jni/ \
-Djava.net.preferIPv4Stack=true \
-jar fedmanager-inject-0.0.1-SNAPSHOT.jar \
server \
fedmgrconfig.yml

echo "DIR=$DIR pwd="`pwd`  
#cd $DIR
