FROM openjdk:11
WORKDIR /usr/app
COPY build/libs/trip-pricer-service-1.0.0.jar trip-pricer-service.jar
CMD  java -jar trip-pricer-service.jar
