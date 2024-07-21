FROM maven:3-openjdk-17 AS builder
COPY pom.xml .
COPY src ./src
RUN mvn clean package

FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/banco-0.0.1-SNAPSHOT.jar
COPY --from=builder /app/${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
