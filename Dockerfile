# Use official base image of Java Runtim
FROM openjdk:8-jdk-alpine

# Set volume point to /tmp
VOLUME /tmp

# Make port 8086 available to the world outside container
EXPOSE 8086

# Set application's JAR file
ARG JAR_FILE=target/mapplaces-services-0.0.1-SNAPSHOT.jar

# Add the application's JAR file to the container
ADD ${JAR_FILE} app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "D:\Deployment\app.jar"]