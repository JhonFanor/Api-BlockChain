# Usamos una imagen oficial de OpenJDK como base
FROM openjdk:17-jdk-slim
COPY . /app
WORKDIR /app
RUN ./mvnw clean package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/api-0.0.1-SNAPSHOT.jar"]