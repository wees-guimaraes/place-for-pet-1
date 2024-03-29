FROM openjdk:11
ARG JAR_FILE=target/place-for-pet.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
EXPOSE 8080/tcp
CMD ["java", "-jar", "app.jar"]