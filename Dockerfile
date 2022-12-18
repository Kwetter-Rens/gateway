FROM openjdk:17-alpine

ARG JAR_FILE=target/gateway.jar

COPY ${JAR_FILE} gateway.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "gateway.jar"]