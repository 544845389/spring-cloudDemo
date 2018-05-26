FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD service_one-1.0.0.jar app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]