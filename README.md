# Springboot_Microservices Repository

This repository contains all the Spring Boot microservices code I developed while learning about the **microservices architecture** and its functionalities in Spring Boot. Each project demonstrates key concepts and practices for building microservices, including service communication, scalability, and modularization.

## Key Features
- **Microservices Architecture**: Decoupled services for modular development.
- **Service Communication**: Examples of synchronous and asynchronous communication using REST APIs, RabbitMQ, Kafka, etc.
- **API Gateway**: Centralized entry point for managing and routing requests to microservices.
- **Service Discovery**: Dynamic discovery of services using tools like Eureka.
- **Load Balancing**: Implemented with Ribbon or Spring Cloud Load Balancer.
- **Database Integration**: Microservices with independent databases.
- **Security**: Integration of OAuth2/JWT for secured communication between services.

## Repository Structure
```
Springboot_Microservices/
├── Service1/
│   ├── src/
│   ├── pom.xml
├── Service2/
│   ├── src/
│   ├── pom.xml
├── Service3/
│   ├── src/
│   ├── pom.xml
└── README.md
```

Each folder represents a separate microservice project with its own source code and dependencies.

## Prerequisites
- **Java**: Version 17 or later.
- **Spring Boot**: Version 3.x or later.
- **Maven**: To build and manage dependencies.
- **PostgreSQL/MySQL**: For database connectivity.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Springboot_Microservices.git
   ```
2. Navigate to a specific service directory:
   ```bash
   cd Service1
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the service:
   ```bash
   mvn spring-boot:run
   ```
5. Repeat steps for other services.

## Learning Highlights
- Effective implementation of **Spring Boot features** in microservices.
- Hands-on experience with **distributed systems**.
- Using **Spring Cloud** for creating resilient and scalable microservices.
- Handling **fault tolerance** with Circuit Breakers like Resilience4j.

## Feedback and Contributions
Feel free to provide suggestions, report issues, or contribute to this repository by creating pull requests.

---

**Happy Coding!** 🎉
``` 
