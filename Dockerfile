FROM eclipse-temurin:17
COPY target/docdb.jar docdb.jar
CMD ["java","-jar","docdb.jar"]