
FROM openjdk:11

COPY target/DemoDoc-0.0.1-SNAPSHOT.jar DemoDoc.jar

ENTRYPOINT ["java","-jar","DemoDoc.jar"]


