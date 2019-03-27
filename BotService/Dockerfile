FROM openjdk:11
ADD ./target/BotService-0.0.1-SNAPSHOT.jar /usr/src/BotService-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "BotService-0.0.1-SNAPSHOT.jar"]