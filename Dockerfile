FROM openjdk:8u111-jdk-alpine

#Dir set
WORKDIR /home/tmax

#환경변수
ENV SCRIPT_HOME /home/tmax/script

RUN mkdir -p ${SCRIPT_HOME}

#Setting
COPY config/start.sh ${SCRIPT_HOME}/start.sh
COPY config/env.sh ${SCRIPT_HOME}/env.sh
COPY config/example.properties /home/tmax/example.properties

RUN chmod -R 755 /home/tmax/script

ADD /example/build/libs/*.jar /home/tmax/app.jar

#ENTRYPOINT ["/bin/sh", "--"]
ENTRYPOINT ["./script/start.sh"]