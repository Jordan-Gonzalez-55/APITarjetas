FROM openjdk:11
VOLUME /tmp
EXPOSE 8090
ADD ./target/GatewayServerM-1.0.jar gateway-server-tarjetas.jar
ENTRYPOINT ["java", "-jar", "/gateway-server-tarjetas.jar"]
