FROM openjdk:8-jdk
VOLUME /tmp
ADD ./build/libs/gradle-webapp.war app.war
ENV JAVA_OPTS=""