FROM openjdk:11.0.5-jre-slim
EXPOSE 8080
ENV TZ=Brazil/East
ENTRYPOINT java ${JVM_ARGS:- -Xms1024m -Xmx1024m} -Djava.security.egd=file:/dev/./urandom -Duser.language=pt -Duser.country=BR -jar app.jar
ADD target/ace-siscrim-1.0-SNAPSHOT.jar app.jar
