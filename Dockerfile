FROM openjdk:jdk-alpine
VOLUME /tmp
RUN mkdir /morning-code-admin
WORKDIR /morning-code-admin

ENV JAVA_OPTS=""
ENV MORNING_CODE_ADMIN_VERSION=0.0.1-SNAPSHOT
COPY ./build/libs/admin-$MORNING_CODE_ADMIN_VERSION.jar /morning-code-admin
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar ./build/libs/admin-$MORNING_CODE_ADMIN_VERSION.jar" ]
