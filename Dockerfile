FROM openjdk:8
ADD target/docker-example-kotlin-java2.jar docker-example-kotlin-java2.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "docker-example-kotlin-java2.jar"]