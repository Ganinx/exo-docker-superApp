FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

COPY target/super-app-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-cp", "app.jar", "org.example.App"]