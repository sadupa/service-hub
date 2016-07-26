mvn clean install
sh $TOMCAT_PATH/bin/shutdown.sh
rm $TOMCAT_PATH/webapps/service-hub*
cp ./web/target/service-hub.war $TOMCAT_PATH/webapps
sh $TOMCAT_PATH/bin/startup.sh
tail -f $TOMCAT_PATH/logs/catalina.out

