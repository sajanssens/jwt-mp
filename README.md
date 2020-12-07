# Build
mvn clean package && docker build -t com.airhacks/jwt-mp .

# RUN

docker rm -f jwt-mp || true && docker run -d -p 8080:8080 -p 4848:4848 --name jwt-mp com.airhacks/jwt-mp 

# System Test

Switch to the "-st" module and perform:

mvn compile failsafe:integration-test
