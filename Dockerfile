FROM adoptopenjdk/openjdk17:alpine-jre

COPY target/gateway.jar app.jar

CMD ["java", "-jar", "app.jar"]