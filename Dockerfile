FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /build/libs/doms-rest-service-0.1.0.jar app.jar
ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom","-jar","app.jar"]