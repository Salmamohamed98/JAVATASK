FROM eclipse-temurin:17-jammy
 
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
EXPOSE 9000
 
CMD ["./mvnw", "spring-boot:run"]
