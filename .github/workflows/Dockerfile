FROM maven:3-openjdk-17 AS builder
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests
WORKDIR /target
RUN dir -s
ARG JAR_FILE=banco*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
