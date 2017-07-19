#!/usr/bin/env bash

cp -R fom/ target/
DIR=`pwd`
cd target
java -jar \
-Djava.library.path=nar/processid-0.3.0-SNAPSHOT-amd64-Linux-gpp-jni/lib/amd64-Linux-gpp/jni/ \
-Djava.net.preferIPv4Stack=true \
interaction-injection-example-0.0.1-SNAPSHOT.jar \

cd $DIR
