FROM adoptopenjdk/openjdk11
MAINTAINER philani.dlamini@gmail.cm
COPY build/libs/coffeeshop-service-0.0.1-SNAPSHOT.jar coffeeshop-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/coffeeshop-service-0.0.1-SNAPSHOT.jar"]