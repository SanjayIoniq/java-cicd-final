FROM eclipse-temurin:17
WORKDIR /app
COPY target/java-cicd-final-1.0.jar app.jar
CMD ["java", "-jar", "app.jar"]