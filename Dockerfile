FROM openjdk:16
ADD  target/docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 8989
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]