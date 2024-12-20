# Usa una imagen base de Java
FROM openjdk:17
#Para comprobar de que esto funciona debemos ejecutar
#docker pull openjdk:17

# Copia el archivo JAR de la aplicación a la imagen
COPY target/service-for-minikube-0.0.1-SNAPSHOT.jar /app/image-service-for-minikube.jar

# Define el comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/image-service-for-minikube.jar"]
# Para verificar construyamos la imagen y ejecutemosla, luego provemos nuestra app
#docker build -t image-service-for-minikube .
#docker run -p 8080:8080 image-service-for-minikube

# Expón el puerto en el que la aplicación escuchará
EXPOSE 8080

#Probado y funciona ok este archivo

