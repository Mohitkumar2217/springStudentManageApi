# Student Management REST API

A production-style **Student Management REST API** built with **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL**. The application follows a clean layered architecture and demonstrates industry-standard backend development practices, including DTO mapping, exception handling, and RESTful API design.

## Overview

This project provides a complete CRUD API for managing student records. It serves as a practical reference for learning Spring Boot fundamentals and building scalable Java backend applications.

## Features

- RESTful CRUD operations
- Layered architecture (Controller → Service → Repository)
- DTO-based request and response handling
- Spring Data JPA with Hibernate
- MySQL database integration
- Centralized exception handling
- Clean and maintainable codebase
- Maven-based project structure

---

## Technology Stack

| Technology | Version |
|------------|----------|
| Java | 21 *(or your installed version)* |
| Spring Boot | 3.x |
| Spring Data JPA | Latest |
| Hibernate | ORM |
| MySQL | 8+ |
| Maven | Build Tool |
| Lombok | Boilerplate Reduction |

---

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.mohit.goat.springMaster
│   │       ├── controller
│   │       ├── dto
│   │       ├── entity
│   │       ├── exception
│   │       ├── repository
│   │       ├── service
│   │       └── SpringMasterApplication.java
│   │
│   └── resources
│       └── application.properties
│
└── test
```

---

## Architecture

```
                HTTP Request
                     │
                     ▼
             Student Controller
                     │
                     ▼
              Student Service
                     │
                     ▼
           Spring Data Repository
                     │
                     ▼
              MySQL Database
```

---

## Getting Started

### Prerequisites

- Java 21 or later
- Maven
- MySQL Server
- IntelliJ IDEA / Eclipse / VS Code

---

### Clone the Repository

```bash
git clone https://github.com/Mohitkumar2217/springStudentManageApi.git

cd springStudentManageApi
```

---

### Configure Database

Create a MySQL database:

```sql
CREATE DATABASE student_management;
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

### Build the Project

```bash
mvn clean install
```

---

### Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

---

# API Endpoints

| Method | Endpoint | Description |
|:-------:|----------|-------------|
| GET | `/students` | Retrieve all students |
| GET | `/students/{id}` | Retrieve a student by ID |
| POST | `/students` | Create a new student |
| PUT | `/students/{id}` | Update an existing student |
| DELETE | `/students/{id}` | Delete a student |

---

## Example Request

### Create Student

```http
POST /students
Content-Type: application/json
```

```json
{
  "name": "Mohit Kumawat",
  "email": "mohit@example.com"
}
```

---

## Example Response

```json
{
  "id": 1,
  "name": "Mohit Kumawat",
  "email": "mohit@example.com"
}
```

---

## Design Principles

- Separation of Concerns
- Layered Architecture
- DTO Pattern
- Repository Pattern
- Dependency Injection
- RESTful API Design
- Exception-Driven Error Handling

---

## Future Enhancements

- JWT Authentication
- Spring Security
- Request Validation
- Pagination & Sorting
- Search and Filtering
- Swagger/OpenAPI Documentation
- Docker Support
- Unit & Integration Testing
- CI/CD Pipeline
- PostgreSQL Support

---

## Learning Outcomes

This project demonstrates practical experience with:

- Spring Boot Fundamentals
- REST API Development
- Spring Data JPA
- Hibernate ORM
- MySQL Integration
- CRUD Operations
- DTO Mapping
- Exception Handling
- Maven Project Management
- Backend Application Architecture

---

## Author

**Mohit Kumawat** 

---

<div align="center">

### ⭐ If you found this project useful, consider giving it a Star!

**Contributions, suggestions, and feedback are always welcome.**

</div>
