DIR=`pwd`

#use this selection to produce log files of all terminal content
logtofile="-l "
#logtofile=""

LOG4J=$DIR/log4j2.xml
RTI_FILE=$DIR/RTI.rid

# delete exercise TCP settings
find $DIR/src -name "jgroups-udp.xml" -delete

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

cd $DIR/src/utility/UtilityProject_generated/UtilityProject-java-federates/UtilityProject-impl-java/Utility/target
cp $RTI_FILE ./RTI.rid
xterm -hold -T "Utility" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar Utility-0.1.0-SNAPSHOT.jar -configFile=conf/UtilityConfig.json" &

cd $DIR/src/house/HouseProject_generated/HouseProject-java-federates/HouseProject-impl-java/House/target
cp $RTI_FILE ./RTI.rid
xterm -hold -T "House 1" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=House1" &
xterm -hold -T "House 2" $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=House2" &

sleep 15

curl -i -X POST http://127.0.0.1:8083/fedmgr --data '{"action": "START"}' -H "Content-Type: application/json" 

sleep 90

curl -i -X POST http://127.0.1.0:8083/fedmgr --data '{"action": "TERMINATE"}' -H "Content-Type: application/json"

