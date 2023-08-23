## Spring boot with RabbitMQ

Repository of crash course from [Ramesh Fadatare](https://github.com/RameshMF) about RabbitMQ.

The course covers both fundamentals and advanced concepts of RabbitMQ, along with how to interact with RabbitMQ using Spring Boot.

---
## How to run this app:

1. First of all, ensure you have the following tools installed:
   - Java 17
   - Maven 3.9.4 or higher
   - Docker-compose 2.19.1 or higher
   - Git
2. Clone this project using the following command: `git clone https://github.com/pedrohnk/rabbitmq-spring`
3. Install the project dependencies with Maven using this command below:
   - `mvn clean install`
4. In the root directory of the project, start the RabbitMQ server using Docker Compose:
    - `docker-compose up -d`. **(RabbitMQ will be available on port 15672 by default)**
5. Launch the application on the default port 8080 by executing:
   - `mvn spring-boot:run`
6. To send a message, make a POST request to: `http://localhost:8080/api/v1/publish
   Use the following request body:
   - `{
     "id": 1,
     "firstName": "John",
     "lastName": "Doe"
     }`
7. After completing the above steps, check your terminal to view sent and received messages.
---
## References
- [RabbitMQ](https://www.rabbitmq.com/)
- [Install Docker compose](https://docs.docker.com/compose/install/linux/)
- [Install Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
- [Install Maven](https://maven.apache.org/download.cgi)
- [Java installation with SDK Man](https://sdkman.io/)
