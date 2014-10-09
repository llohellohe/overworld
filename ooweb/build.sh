#!/bin/bash
echo "START TO BUILD"

/usr/alibaba/taobao-tomcat-7.0.54.1/bin/shutdown.sh
rm -rf /usr/alibaba/taobao-tomcat-7.0.54.1/deploy/o2-web*

mvn clean package
cp target/o2-web.war /usr/alibaba/taobao-tomcat-7.0.54.1/deploy

/usr/alibaba/taobao-tomcat-7.0.54.1/bin/startup.sh
echo "DONE"
