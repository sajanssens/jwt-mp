FROM airhacks/glassfish
COPY ./target/jwt-mp.war ${DEPLOYMENT_DIR}
