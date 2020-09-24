FROM adoptopenjdk/openjdk11:alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
EXPOSE 8080
ARG OUTPUT_FOLDER=build/libs/
COPY ${OUTPUT_FOLDER} /app/lib
WORKDIR /app/lib
RUN ls
ENTRYPOINT ["java","-jar","TaskPlannerApp.jar"]