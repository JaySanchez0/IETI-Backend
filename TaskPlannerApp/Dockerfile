FROM openjdk:8
WORKDIR /app
COPY build/libs/TaskPlannerApp-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-Dserver.port=${PORT}","-jar","TaskPlannerApp-0.0.1-SNAPSHOT.jar"]