
DIR=`pwd`
 
cd $DIR/src/fedmanager
./build.sh

cd $DIR/src/metronome/MetronomeProject_generated
./build.sh
#cd $DIR/src/metronome/MetronomeProject_deployment
#./build.sh

cd $DIR/src/zone/Zone_generated
./build.sh
#cd $DIR/src/zone/Zone_deployment
#./build.sh

cd $DIR/src/weather/WeatherProject_generated
./build.sh
#cd $DIR/src/weather/WeatherProject_deployment
#./build.sh

cd $DIR/src/controller/Controller_generated
./build.sh
#cd $DIR/src/controller/Controller_deployment
#./build.sh


