#!/bin/sh
mvn clean package && docker build -t com.airhacks/jwt-mp .
docker rm -f jwt-mp || true && docker run -d -p 8080:8080 -p 4848:4848 --name jwt-mp com.airhacks/jwt-mp
