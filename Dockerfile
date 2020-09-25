FROM openjdk:8
WORKDIR /app
COPY build/libs/TaskPlannerApp.jar .
ENTRYPOINT ["java","-jar","TaskPlannerApp.jar"]