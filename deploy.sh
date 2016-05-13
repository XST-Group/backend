#!/usr/bin/env bash
echo "deploy war"
scp ././target/XST-0.0.1-SNAPSHOT.war root@ECS:~
echo "move war to tomcat"
ssh root@ECS "cp ~/XST-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/xst.war"
echo "restart tomcat"
ssh root@ECS "/usr/local/tomcat/bin/shutdown.sh"
ssh root@ECS "/usr/local/tomcat/bin/startup.sh"