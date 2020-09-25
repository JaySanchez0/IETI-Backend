FROM openjdk:8
WORKDIR /app
COPY build/libs/TaskPlannerApp.jar .
ENTRYPOINT ["java","-Dserver.port=${PORT}","-jar","TaskPlannerApp.jar"]