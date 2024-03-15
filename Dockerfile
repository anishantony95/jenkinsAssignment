FROM eclipse-temurin:17
COPY target/test.jar test.jar
CMD ["java","-jar","test.jar"]
