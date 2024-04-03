FROM tomcat:latest

ENV MAVEN_HOME /usr/share/maven
ENV MAVEN_VERSION 3.8.4
ENV PATH ${MAVEN_HOME}/bin:${PATH}

RUN apt-get update && \
    apt-get install -y maven && \
    apt-get install -y apt-utils && \
    rm -rf /var/lib/apt/lists/*

COPY . /usr/src/app

WORKDIR /usr/src/app

RUN mvn clean package

# RUN cp target/*.war /usr/local/tomcat/webapps/
COPY target/*.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]