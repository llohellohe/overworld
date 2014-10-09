#!/bin/bash
echo "START TO BUILD"
mvn clean package
rm -rf wildfly8/deploy/o2-web.war.*
cp target/o2-web.war wildfly8/deploy
sh wildfly8/start.sh
echo "DONE"
