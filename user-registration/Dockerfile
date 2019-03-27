FROM openjdk:11

ADD ./target/user-registration-1.0.0.jar /usr/src/user-registration-1.0.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "user-registration-1.0.0.jar"]