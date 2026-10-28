# ---------- build stage ----------
FROM maven:3.9-eclipse-temurin-25 AS build
WORKDIR /usr/src/app

COPY pom.xml /usr/src/app/pom.xml
RUN sed -i 's#WebContent/WEB-INF#src/main/webapp/WEB-INF#g' /usr/src/app/pom.xml
RUN mvn -B -q package -DskipTests -Drevision=0 || true

COPY ./src /usr/src/app/src/main/java
COPY ./WebContent /usr/src/app/src/main/webapp
COPY ./model /usr/src/app/src/main/resources/model
COPY ./openapi.yaml /usr/src/app/openapi.yaml

ARG MAVEN_VERSION='LOCALBUILD'
RUN mvn -B clean package -DskipTests=true -Drevision=${MAVEN_VERSION}
RUN jar tf target/*.war | grep -q 'WEB-INF/web.xml'

# ---------- runtime stage ----------
FROM tomcat:10
LABEL image_name="abc"

RUN sed -i 's/protocol="HTTP\/1.1"/protocol="HTTP\/1.1" maxHttpHeaderSize="67108864"/' /usr/local/tomcat/conf/server.xml \
 && sed -i 's/maxParameterCount="[0-9]*"/maxParameterCount="10000"/' /usr/local/tomcat/conf/server.xml

COPY --from=build /usr/src/app /usr/src/app
COPY --from=build /usr/src/app/target/*.war /usr/local/tomcat/webapps/ROOT.war
COPY ./openapi.yaml /usr/openapi.yaml

ARG MAVEN_VERSION='LOCALBUILD'
ENV MAVEN_VERSION=${MAVEN_VERSION}
ENV JAVA_TOOL_OPTIONS="-Xms8g -Xmx8g"
ENV JAVA_OPTS="-Xms8g -Xmx8g"

WORKDIR /usr
EXPOSE 8080
CMD ["catalina.sh", "run"]