# Learn Microservices with Spring Boot Labs

Monolith-first to microservices with Spring Boot, test-driven development, event-driven systems, common architecture patterns, nonfunctional requirements, and end-to-end testing with Cucumber.

## 01 - A Basic Spring Boot Application

### User Story 1

As a user of the application,
I want to solve a random multiplication problem using mental calculation
so I exercise my brain.

### Tasks

1. Create a basic service with business logic.
2. Create a basic API to access this service (REST API).
3. Create a basic web page to ask the users to solve that calculation.

Generate the project skeleton with Lombok, Spring Web, and Validation:
[Spring Initializr with Java 8, Gradle, Spring Boot 2.4.5](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.4.5.RELEASE&packaging=jar&jvmVersion=1.8&groupId=microservices.book&artifactId=multiplication&name=multiplication&description=Multiplication%20Application&packageName=microservices.book.multiplication&dependencies=lombok, web, validation)

### Three-Tier Three-Layer Architecture

- Client tier: user interface
- Application tier: business logic, interfaces, and the data interfaces for persistence.
- Data store tier: persists the application's data (e.g. Database, file system, etc.)

### Application Tier

The application tier is made up of the following layers:

- Business Layer - Classes that model the domain
- Presentation Layer - Controller classes that implement the REST API
- Data Layer - Persists entities with Data Access Objects (DAO) or Repoistories (Domain)
- Domain Layer - Domain is isolated and independent of everything else

### Spring Annotations

Three stereotype annotations that map to each of layers:

- `@Controller` - Presentation Layer, used for the REST API
- `@Service` - Business Layer for business logic
- `@Repository` - Data Layer, classes that interact with the Database

When we annotate classes with these variants, they become Spring-managed components.

- When initializing the web context, Spring scans your packages and loads them as beans
- We can use dependency injection to wire (or inject) these beans and use services from our presentation layer (controllers)

### Domain Modeling

Start by modeling the business domain to structure the project:

- Challenge - The math problem
- User - The user
- Challenge Attempt - The attempt by the user to solve the math problem

### Relationships

- Challenge and User are independent
- Challenge Attempts reference a User and a Challenge

### Bounded Contexts

- User
- Challenge

### Domain Layer

- microservices.book.multiplication.user.User
- microservices.book.multiplication.Challenge
- microservices.book.multiplication.challenge.ChallengeAttempt

### Business Layer

- Functionality to generate a multiplication problem
- Functionality to check whether an attempt is correct

### Presentation Layer
