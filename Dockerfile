FROM eclipse-temurin:17
VOLUME /tmp
COPY target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]