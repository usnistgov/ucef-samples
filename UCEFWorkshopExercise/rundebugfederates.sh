DIR=`pwd`

#use this selection to produce log files of all terminal content
logtofile="-l "
#logtofile=""

LOG4J=$DIR/log4j2.xml
RTI_RID_FILE=$DIR/RTI.rid

cp tmy3.csv $DIR/src/weather/WeatherProject_generated/WeatherProject-java-federates/WeatherProject-impl-java/Weather/target

cd $DIR/src/fedmanager
xterm -hold $logtofile -e "mvn exec:java -X -P FederationManagerExecJava -Dlog4j.configurationFile='`pwd`/conf/log4j2.xml'" &

sleep 25 


cd $DIR/src/metronome/MetronomeProject_generated/MetronomeProject-java-federates/MetronomeProject-impl-java/Metronome/target
xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar Metronome-0.1.0-SNAPSHOT.jar -configFile=conf/MetronomeConfig.json" &

cd $DIR/src/weather/WeatherProject_generated/WeatherProject-java-federates/WeatherProject-impl-java/Weather/target
xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar Weather-0.1.0-SNAPSHOT.jar -configFile=conf/WeatherConfig.json" &

cd $DIR/src/utility/UtilityProject_generated/UtilityProject-java-federates/UtilityProject-impl-java/Utility/target
xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar Utility-0.1.0-SNAPSHOT.jar -configFile=conf/UtilityConfig.json" &


cd $DIR/src/house/HouseProject_generated/HouseProject-java-federates/HouseProject-impl-java/House/target
xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=House1" &
xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=House2" &

#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house1" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house2" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house3" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house4" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house5" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house6" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house7" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house8" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house9" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house10" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house11" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house12" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house13" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house14" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house15" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house16" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house17" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house18" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house19" &
#xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar House-0.1.0-SNAPSHOT.jar -configFile=conf/HouseConfig.json -name=house20" &

sleep 15

curl -i -X POST http://127.0.0.1:8083/fedmgr --data '{"action": "START"}' -H "Content-Type: application/json" 

sleep 90




 
#sleep 30
#curl -i -X POST http://127.0.0.1:8083/fedmgr --data '{"action": "TERMINATE"}' -H "Content-Type: application/json"

