FROM eclipse-temurin:17
COPY target/given.jar given.jar
CMD [ "java", "-jar", "given.jar" ]