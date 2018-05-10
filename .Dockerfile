FROM nimmis/java-centos:oracle-8-jre

LABEL maintainer="Elad Wertzberger <eladw@liveperson.com>"
LABEL com.elad.version="0.1"

# Install Deps
RUN yum install net-tools -y

EXPOSE 8081
# Setup Config
COPY src/main/resources/application.yml /tmp/application.yml
COPY src/main/resources/logback.xml /tmp/logback.xml

#Copy Jar
COPY target/appforstream.jar /tmp/appforstream.jar

ENTRYPOINT java -Dspring.config.location=/tmp/application.yml  -Dlogging.config=/tmp/logback.xml -jar /tmp/appforstream.jar