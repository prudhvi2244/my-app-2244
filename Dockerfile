# Use Java 17 base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

RUN chmod +x mvnw

# Build the application (skip tests to make it faster)
RUN ./mvnw clean package -DskipTests

# Expose port (Render will override with PORT)
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "target/*.jar"]
