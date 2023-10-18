#
# Build stage
#
FROM amazoncorretto:17 AS build
COPY ./ /home/app
RUN cd /home/app && ./mvn install

#
# Package stage
#
FROM amazoncorretto:17-alpine
COPY --from=build /home/app/build/libs/itopenTown-0.0.1-SNAPSHOT.jar /usr/local/lib/itopenTown.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dfile.encoding=UTF-8","/usr/local/lib/itopenTown.jar"]
