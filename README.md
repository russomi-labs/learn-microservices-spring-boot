# Learn Microservices with Spring Boot Labs

Monolith-first to microservices with Spring Boot, test-driven development, event-driven systems, common architecture patterns, nonfunctional requirements, and end-to-end testing with Cucumber.

## A Basic Spring Boot Application

User Story 1

As a user of the application,
I want to solve a random multiplication problem using mental calculation
so I exercise my brain.

Tasks

1. Create a basic service with business logic.
2. Create a basic API to access this service (REST API).
3. Create a basic web page to ask the users to solve that calculation.

Generate the project skeleton with Lombok, Spring Web, and Validation:
[Spring Initializr with Java 8, Gradle, Spring Boot 2.4.5](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.4.5.RELEASE&packaging=jar&jvmVersion=1.8&groupId=microservices.book&artifactId=multiplication&name=multiplication&description=Multiplication%20Application&packageName=microservices.book.multiplication&dependencies=lombok,web,validation)
