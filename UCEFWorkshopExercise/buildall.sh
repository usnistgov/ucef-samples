
DIR=`pwd`
 
cd $DIR/src/fedmanager
./build.sh

cd $DIR/src/pubsub
./build.sh

cd $DIR/src/interaction-injection-example
./build.sh

cd $DIR/src/house/HouseProject_generated
./build.sh
cd $DIR/src/house/HouseProject_deployment
./build.sh

cd $DIR/src/weather/WeatherProject_generated
./build.sh
cd $DIR/src/weather/WeatherProject_deployment
./build.sh

cd $DIR/src/utility/UtilityProject_generated
./build.sh
cd $DIR/src/utility/UtilityProject_deployment
./build.sh


