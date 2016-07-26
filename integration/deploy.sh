#!/usr/bin/env bash
# This script can be used to automatically build and deploy this project
# Add following lines to your ~/.bash_profile
# export TOMCAT_PATH=path to tomcat without ending slash
# export SERVICES_HUB_PATH=path to project without ending slash

sh $TOMCAT_PATH/bin/catalina.sh stop
cd $SERVICES_HUB_PATH
mvn clean install -DskipTests -o

rm -r $TOMCAT_PATH/webapps/sevices-hub
cp web/target/sevices-hub.war $TOMCAT_PATH/webapps

export JPDA_ADDRESS=5005
export JPDA_TRANSPORT=dt_socket
sh $TOMCAT_PATH/bin/catalina.sh jpda run
