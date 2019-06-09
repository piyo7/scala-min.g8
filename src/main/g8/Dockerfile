FROM adoptopenjdk/openjdk11:jdk-11.0.2.9-alpine-slim
COPY target/scala-2.13/temp.jar temp.jar
ENTRYPOINT ["java", "-jar", "temp.jar"]
