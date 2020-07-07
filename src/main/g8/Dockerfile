FROM adoptopenjdk/openjdk14:jdk-14.0.1_7-ubuntu-slim
COPY target/scala-2.13/temp.jar temp.jar
ENTRYPOINT ["java", "-jar", "temp.jar"]
