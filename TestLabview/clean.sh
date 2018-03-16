
DIR=`pwd`
 
cd $DIR/src/fedmanager
./build.sh

cd $DIR/src/metronome/MetronomeProject_generated
mvn clean
#cd $DIR/src/metronome/MetronomeProject_deployment
#mvn clean

cd $DIR/src/weather/WeatherProject_generated
mvn clean
#cd $DIR/src/weather/WeatherProject_deployment
#mvn clean

cd $DIR/src/labview/TestLabVIEW_generated
mvn clean
#cd $DIR/src/labview/TestLabVIEW_deployment
#mvn clean

cd $DIR/src/controller/Controller_generated
mvn clean
#cd $DIR/src/controller/Controller_deployment
#mvn clean

cd $DIR/src/zone/Zone_generated
mvn clean
#cd $DIR/src/zone/Zone_deployment
#mvn clean

cd $DIR

