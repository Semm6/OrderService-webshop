FROM openjdk:11
EXPOSE 8082
ADD target/OrderService-webshop.jar OrderService-webshop.jar
ENTRYPOINT ["java", "-jar", "/OrderService-webshop.jar"]