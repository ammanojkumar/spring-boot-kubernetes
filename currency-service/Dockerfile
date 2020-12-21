FROM openjdk:11.0.2-jdk

WORKDIR /app

COPY ./target/currency-service-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java -jar currency-service-0.0.1-SNAPSHOT.jar"]