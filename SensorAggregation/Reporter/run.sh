#!/bin/bash
cp -r conf/ target/
cp RTI.rid target/
cd target/
java -Dlog4j.configurationFile=conf/log4j2.xml -Djava.net.preferIPv4Stack=true -jar Reporter-0.0.1-SNAPSHOT.jar conf/Reporter.json
