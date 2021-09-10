#FROM is the base image for which we will run our application
##FROM java:8

# Copy files and directories from the application
##COPY target/pizza_service*.jar /opt/

#set workdir
##WORKDIR /opt 
 
#Tell Docker what command to start
##CMD touch nohup.out; nohup java -jar pizza_service-*.jar & tail -f nohup.out

# Tell Docker we are going to use this port
##EXPOSE 8081

FROM openjdk:8-jre-alpine3.9
COPY target/*.jar /demo.jar
COPY application.properties /application.properties
CMD ["java", "-jar", "/demo.jar"]
ARG carg1=htpp://localhost:8080
ARG carg2=htpp://localhost:8080
ARG carg3=codeobe
ARG carg4=x
ENV cenv1=${carg1}
ENV cenv2=${carg2}
ENV cenv3=${carg3}
ENV cenv4=${carg4}
