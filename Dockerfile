FROM openjdk:8-alpine

COPY target/uberjar/decrypto.jar /decrypto/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/decrypto/app.jar"]
