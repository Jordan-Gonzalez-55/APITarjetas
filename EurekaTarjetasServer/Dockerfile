FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/eurekatarjetasserver-1.0.jar eureka-server-tarjetas.jar
ENTRYPOINT ["java", "-jar", "/eureka-server-tarjetas.jar"]