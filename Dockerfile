# Usa una imagen base de Java
FROM openjdk:11-jre-slim

# Copia el archivo JAR de la aplicación a la imagen
COPY target/service-for-minikube-0.0.1-SNAPSHOT.jar /app/service-for-minikube.jar

# Define el comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/service-for-minikube.jar"]

# Expón el puerto en el que la aplicación escuchará
EXPOSE 8080

