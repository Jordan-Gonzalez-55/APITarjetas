FROM openjdk:11
VOLUME /tmp
EXPOSE 8002
ADD ./target/solicitanterest-1.0.jar rest-solicitante.jar
ENTRYPOINT ["java", "-jar", "/rest-solicitante.jar"]
