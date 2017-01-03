FROM openjdk:jre-alpine
MAINTAINER "Thomas Hasler"

ADD cheesecakefactory_swarm-swarm.jar /opt/cheesecakefactory_swarm.jar

EXPOSE 8181
ENTRYPOINT ["java", "-jar", "/opt/cheesecakefactory_swarm.jar"]