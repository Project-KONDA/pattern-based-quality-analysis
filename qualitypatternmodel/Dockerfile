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
RUN mkdir -p /usr/src/app/src/main/resources/model

# copy pom first and cache dependencies
COPY pom.xml /usr/src/app/pom.xml
RUN sed -i 's#WebContent/WEB-INF#src/main/webapp/WEB-INF#g' /usr/src/app/pom.xml
WORKDIR /usr/src/app
RUN mvn -B -q package -DskipTests -Drevision=0 || true

# copy files
COPY ./src /usr/src/app/src/main/java
COPY ./WebContent /usr/src/app/src/main/webapp
COPY ./model /usr/src/app/src/main/resources/model

# copy resource files
COPY ./openapi.yaml /usr/openapi.yaml
COPY ./openapi.yaml /usr/src/app/openapi.yaml

# append the attribute maxHttpHeaderSize="65536" in server.xml
RUN sed -i 's/protocol="HTTP\/1.1"/protocol="HTTP\/1.1" maxHttpHeaderSize="67108864"/' /usr/local/tomcat/conf/server.xml
RUN sed -i 's/maxParameterCount="[0-9]*"/maxParameterCount="10000"/' /usr/local/tomcat/conf/server.xml

# compile maven to war file
ARG MAVEN_VERSION='LOCALBUILD'
ENV MAVEN_VERSION=${MAVEN_VERSION}
RUN mvn -B clean package -DskipTests=true -Drevision=${MAVEN_VERSION}

# deploy war
RUN cp target/*.war /usr/local/tomcat/webapps/ROOT.war
WORKDIR /usr
ENV JAVA_TOOL_OPTIONS="-Xms8g -Xmx8g"
ENV JAVA_OPTS="-Xms8g -Xmx8g"

# clean src
# RUN rm -rf src

# start application
EXPOSE 8080
CMD ["catalina.sh", "run"]