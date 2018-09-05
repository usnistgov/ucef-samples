#!/bin/bash
# Author: Yogesh Barve

#export RTI_HOME=/home/vagrant/c2wt-dev/dependency/portico/portico-2.1.0
export RTI_HOME=/usr/local/portico/portico-2.1.0

mvn_install_deploy() {
	echo "Maven Compiling...."
	mvn clean install
	echo "Maven Deploying to the Archiva....."
	mvn deploy
	echo "Deployment Completed...."

}

traverse_dir(){
	echo ${1}
	cd ${1} 
	mvn_install_deploy
	cd ..
}

mvn_install_deploy

echo "=================================================================================="
echo "Completed the compilation, installation, deployment of the C2W foundation packages"
echo "=================================================================================="
