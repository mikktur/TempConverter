
FROM maven:latest
WORKDIR /TempConverter
COPY pom.xml /TempConverter/
COPY . /TempConverter/
RUN mvn package
CMD ["java", "-jar", "target/TempConverter.jar"]
