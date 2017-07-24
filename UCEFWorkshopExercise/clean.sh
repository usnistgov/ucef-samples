
DIR=`pwd`
 
cd $DIR/src/fedmanager
./build.sh

cd $DIR/src/metronome/MetronomeProject_generated
mvn clean
cd $DIR/src/metronome/MetronomeProject_deployment
mvn clean

cd $DIR/src/house/HouseProject_generated
mvn clean
cd $DIR/src/house/HouseProject_deployment
mvn clean

cd $DIR/src/weather/WeatherProject_generated
mvn clean
cd $DIR/src/weather/WeatherProject_deployment
mvn clean

cd $DIR/src/utility/UtilityProject_generated
mvn clean
cd $DIR/src/utility/UtilityProject_deployment
mvn clean

cd $DIR

