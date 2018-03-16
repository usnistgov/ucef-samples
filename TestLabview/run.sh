DIR=`pwd`

#use this selection to produce log files of all terminal content
logtofile="-l "
#logtofile=""

LOG4J=$DIR/log4j2.xml
RTI_FILE=$DIR/RTI.rid

cp tmy3.csv $DIR/src/weather/WeatherProject_generated/WeatherProject-java-federates/WeatherProject-impl-java/Weather/target

cd $DIR/src/fedmanager
cp $RTI_FILE ./RTI.rid
xterm -hold -T "Federation Manager" $logtofile -e "mvn exec:java -X -P FederationManagerExecJava -Dlog4j.configurationFile='`pwd`/conf/log4j2.xml'" &

sleep 25 

cd $DIR/src/metronome/MetronomeProject_generated/MetronomeProject-java-federates/MetronomeProject-impl-java/Metronome/target
cp $RTI_FILE ./RTI.rid
xterm -hold -T "Metronome" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar Metronome-0.1.0-SNAPSHOT.jar -configFile=conf/MetronomeConfig.json" &

cd $DIR/src/weather/WeatherProject_generated/WeatherProject-java-federates/WeatherProject-impl-java/Weather/target
cp $RTI_FILE ./RTI.rid
xterm -hold -T "Weather" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar Weather-0.1.0-SNAPSHOT.jar -configFile=conf/WeatherConfig.json" &

cd $DIR/src/labview/TestLabview_generated/TestLabview-java-federates/TestLabview-impl-java/TestLabVIEW/target
cp $RTI_FILE ./RTI.rid
xterm -hold -T "TestLabVIEW" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar TestLabVIEW-0.1.0-SNAPSHOT.jar -configFile=conf/TestLabVIEWConfig.json" &

cd $DIR/src/zone/Zone_generated/Zone-java-federates/Zone-impl-java/Zone/target
cp $RTI_FILE ./RTI.rid
xterm -hold -T "Zone1" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar Zone-0.1.0-SNAPSHOT.jar -configFile=conf/ZoneConfig.json  -name=Zone1" &
#xterm -hold -T "Zone2" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar Zone-0.1.0-SNAPSHOT.jar -configFile=conf/ZoneConfig.json  -name=Zone2" &
#xterm -hold -T "Zone3" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar Zone-0.1.0-SNAPSHOT.jar -configFile=conf/ZoneConfig.json  -name=Zone3" &
#xterm -hold -T "Zone4" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar Zone-0.1.0-SNAPSHOT.jar -configFile=conf/ZoneConfig.json  -name=Zone4" &


cd $DIR/src/controller/Controller_generated/Controller-java-federates/Controller-impl-java/Controller/target
cp $RTI_FILE ./RTI.rid
xterm -hold -T "Controller1" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar Controller-0.1.0-SNAPSHOT.jar -configFile=conf/ControllerConfig.json -name=Controller1" &
#xterm -hold -T "Controller2" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar Controller-0.1.0-SNAPSHOT.jar -configFile=conf/ControllerConfig.json -name=Controller2" &
#xterm -hold -T "Controller3" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar Controller-0.1.0-SNAPSHOT.jar -configFile=conf/ControllerConfig.json -name=Controller3" &
#xterm -hold -T "Controller4" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar Controller-0.1.0-SNAPSHOT.jar -configFile=conf/ControllerConfig.json -name=Controller4" &

#sleep 20

#curl -i -X POST http://127.0.0.1:8083/fedmgr --data '{"action": "START"}' -H "Content-Type: application/json" 

#sleep 90

#curl -i -X POST http://127.0.0.1:8083/fedmgr --data '{"action": "TERMINATE"}' -H "Content-Type: application/json"

