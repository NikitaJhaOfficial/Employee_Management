# Employee_Management
# Employee Management System

A Spring Boot application for managing employee records, performing **CRUD (Create, Read, Update, Delete)** operations via RESTful APIs. This project is a simple Employee Management System to demonstrate how to use Spring Boot, Spring Data JPA, and a relational database to handle backend operations.

## Features
- Add new employees
- View details of all employees
- Update employee information
- Delete employee records

## Technologies Used
- **Spring Boot** - Framework to build Java-based web applications
- **Spring Data JPA** - Provides abstraction over the database for easy CRUD operations
- **MySQL** - Relational database to store employee information
- **Hibernate** - ORM framework for mapping Java objects to database tables
- **Lombok** - Simplifies Java class creation by reducing boilerplate code
- **Maven** - Project build tool
- **Postman** - API testing tool

## Project Structure
```plaintext
src/
├── main/
│   ├── java/com/example/employeemanagement/
│   │   ├── controller/       # Handles HTTP requests
│   │   ├── service/          # Business logic
│   │   ├── repository/       # Database interactions
│   │   ├── model/            # Entity classes
│   └── resources/
│       ├── application.properties  # Database configuration
│       └── schema.sql       # SQL scripts for table creation
└── test/                    # Unit tests

