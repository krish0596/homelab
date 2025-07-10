FROM container-registry.oracle.com/graalvm/jdk:17-ol8
WORKDIR /app
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]