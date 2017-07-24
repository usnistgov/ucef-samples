DIR=`pwd`
DIR=$DIR/..

#use this selection to produce log files of all terminal content
logtofile="-l "
#logtofile=""

LOG4J=$DIR/log4j2.xml
RTI_FILE=$DIR/RTI-tcp.rid
JGROUPS=$DIR/jgroups-udp.xml

cp $DIR/tmy3.csv $DIR/src/weather/WeatherProject_generated/WeatherProject-java-federates/WeatherProject-impl-java/Weather/target

cd $DIR/src/fedmanager
mkdir etc/
cp $RTI_FILE ./RTI.rid
cp $JGROUPS ./etc/jgroups-udp.xml
xterm -hold $logtofile -e "mvn exec:java -X -P FederationManagerExecJava -Dlog4j.configurationFile='`pwd`/conf/log4j2.xml'" &

sleep 25 

cd $DIR/src/metronome/MetronomeProject_generated/MetronomeProject-java-federates/MetronomeProject-impl-java/Metronome/target
mkdir etc/
cp $RTI_FILE ./RTI.rid
cp $JGROUPS ./etc/jgroups-udp.xml
xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar Metronome-0.1.0-SNAPSHOT.jar -configFile=conf/MetronomeConfig.json" &

cd $DIR/src/weather/WeatherProject_generated/WeatherProject-java-federates/WeatherProject-impl-java/Weather/target
mkdir etc/
cp $RTI_FILE ./RTI.rid
cp $JGROUPS ./etc/jgroups-udp.xml
xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J  -jar Weather-0.1.0-SNAPSHOT.jar -configFile=conf/WeatherConfig.json" &

cd $DIR/src/utility/UtilityProject_generated/UtilityProject-java-federates/UtilityProject-impl-java/Utility/target
mkdir etc/
cp $RTI_FILE ./RTI.rid
cp $JGROUPS ./etc/jgroups-udp.xml
xterm -hold $logtofile -e "java -Dlog4j.configurationFile=$LOG4J -jar Utility-0.1.0-SNAPSHOT.jar -configFile=conf/UtilityConfig.json" &

