FROM openjdk:17
EXPOSE 8091
ADD target/spring-docker-1.jar spring-docker-1.jar
ENTRYPOINT ["java","-jar","/spring-docker-1.jar"]