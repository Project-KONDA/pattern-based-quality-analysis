
FROM tomcat:10
    
RUN apt-get -y update \
    && apt-get -y autoremove \
    && apt-get clean \
    && apt-get install -y maven \
    apt-utils \
    unzip \
    && rm -rf /var/lib/apt/lists/*

COPY project_docker.zip /usr/src/app/
RUN unzip /usr/src/app/project_docker.zip -d /usr/src/app
RUN rm /usr/src/app/project_docker.zip
COPY ./src /usr/src/app/src/main/java

WORKDIR /usr/src/app

RUN mvn clean compile install package -DskipTests

RUN cp target/*.war /usr/local/tomcat/webapps/qualitypatternmodel.war
WORKDIR /usr
RUN rm -rf src

EXPOSE 8080

CMD ["catalina.sh", "run"]