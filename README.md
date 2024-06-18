# 🚀 API Gateway, Service Registry e Simple Service API

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.0-brightgreen.svg)
![Maven](https://img.shields.io/badge/Maven-3.6.3-yellow.svg)

Um projeto de exemplo que demonstra a integração de um API Gateway, um Service Registry (Eureka) e um serviço simples usando Spring Boot e Spring Cloud.
POC para conectar um api simples em uma api-gateway e se registrarem num service-registry

## Estrutura do Projeto

api-gateway-service-registry-simple-service-api

```bash
│
├── pom.xml
├── api-gateway
│ └── pom.xml
├── service-registry-api
│ └── pom.xml
└── simple-service-api
└── pom.xml
```

## Pré-requisitos

- [Java 17](https://adoptopenjdk.net/)
- [Maven 3.6.3+](https://maven.apache.org/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)

### Clonando o Repositório:

```bash
git clone https://github.com/pauloruszel/api-gateway-service-registry-simple-service-api.git
```

## 🛠️ Construindo o Projeto

```bash
cd api-gateway-service-registry-simple-service-api
mvn clean install
```

1. Service Registry (Eureka)

```bash
mvn -pl service-registry-api spring-boot:run
```

✨ Acesse o Eureka Dashboard em http://localhost:8761

2. Simple Service API
```bash
mvn -pl simple-service-api spring-boot:run
```

3. API Gateway
```bash
   mvn -pl api-gateway spring-boot:run
```

✨ Acesse o serviço através do Gateway em http://localhost:8080/simple-service-api/hello

## 📁 Estrutura de Pastas

```bash
api-gateway-service-registry-simple-service-api
├── api-gateway
│   ├── src/main/java/com/br/api/gateway/ApiGatewayApplication.java
│   ├── src/main/resources/application.yml
│   └── pom.xml
├── service-registry-api
│   ├── src/main/java/com/br/service/registry/ServiceRegistryApplication.java
│   ├── src/main/resources/application.yml
│   └── pom.xml
└── simple-service-api
├── src/main/java/com/br/simple/service/SimpleServiceApplication.java
├── src/main/java/com/br/simple/service/HelloWorldController.java
├── src/main/resources/application.yml
└── pom.xml
```

## ✔️ Tecnologias e bibliotecas usadas
- `Java 17`
- `Spring Boot 3.3`
- `Spring Cloud 2023.0.2`
- `Maven 3.6.3`






