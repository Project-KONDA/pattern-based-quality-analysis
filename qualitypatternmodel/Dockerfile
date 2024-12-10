# base image
FROM tomcat:10
LABEL image_name="qpm"

# install packages
RUN apt-get -y update \
    && apt-get -y autoremove \
    && apt-get clean \
    && apt-get install -y maven \
    apt-utils \
    && rm -rf /var/lib/apt/lists/*

# create directories
RUN mkdir -p /usr/src/app/src/main/java
RUN mkdir -p /usr/src/app/src/main/webapp

# copy files
COPY pom.xml /usr/src/app/pom.xml
COPY ./src /usr/src/app/src/main/java
COPY ./WebContent /usr/src/app/src/main/webapp

# change path to web.xml
RUN sed -i 's#WebContent/WEB-INF#src/main/webapp/WEB-INF#g' /usr/src/app/pom.xml

# append the attribute maxHttpHeaderSize="65536" in server.xml
RUN sed -i 's/<Connector port="8080" protocol="HTTP\/1.1"/<Connector port="8080" protocol="HTTP\/1.1" maxHttpHeaderSize="65536"/' /usr/local/tomcat/conf/server.xml

# compile maven to war file
WORKDIR /usr/src/app
RUN mvn clean compile install package -DskipTests

# deploy war
RUN cp target/*.war /usr/local/tomcat/webapps/ROOT.war
WORKDIR /usr

# clean src
RUN rm -rf src

# start application
EXPOSE 8080
CMD ["catalina.sh", "run"]