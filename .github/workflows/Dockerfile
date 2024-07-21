FROM maven:3-openjdk-17 AS builder
COPY pom.xml .
COPY src ./src
RUN mvn clean package
RUN cd target
RUN dir -s
ARG JAR_FILE=target/banco-*.jar
COPY  app/${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
