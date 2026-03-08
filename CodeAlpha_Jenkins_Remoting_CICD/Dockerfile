# -------- Stage 1: Build the application --------
FROM maven:3.9.9-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy project files
COPY . .

# Build the jar file
RUN mvn clean package -DskipTests


# -------- Stage 2: Runtime image --------
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy jar from builder stage
COPY --from=builder /app/target/codealpha-jenkins-demo-1.0.0.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]