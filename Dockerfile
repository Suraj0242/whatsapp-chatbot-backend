# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy Maven build output (JAR file)
COPY target/whatsappChatbot-0.0.1-SNAPSHOT.jar app.jar

# Expose port (Render will override with PORT env variable)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java","-jar","app.jar"]
