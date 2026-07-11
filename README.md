## Employee Management System

## Project Overview

The Employee Management System is a Java-based console application developed using JDBC to interact with a MariaDB/MySQL database on a Linux environment. The project demonstrates how Java applications connect to databases and perform CRUD (Create, Read, Update, Delete) operations efficiently.

## Technologies Used

- Java (JDK 17)
- JDBC (Java Database Connectivity)
- MariaDB/MySQL
- Linux (Ubuntu)
- SQL
- VS Code / Terminal

## Features

- Create Employee Table
- Insert Employee Records
- Display Employee Records
- Update Employee Details
- Delete Employee Records
- JDBC Database Connectivity
- Menu-Driven Console Application
- Exception Handling

## Project Structure

```text
EmployeeManagementSystem/
│
├── lib/
│   └── mariadb-java-client.jar
│
├── src/
│   ├── DBConnection.java
│   ├── CreateTable.java
│   ├── InsertEmployee.java
│   ├── DisplayEmployee.java
│   ├── UpdateEmployee.java
│   ├── DeleteEmployee.java
│
└── bin/
```

## Database Details

Database Name: **employeedb**

Table Name: **employee**

Columns:

- employee_id
- employee_name
- department
- salary

## Prerequisites

- Java JDK 17 or later
- MariaDB/MySQL Server
- Linux (Ubuntu)
- JDBC Driver (MariaDB Java Client)

## How to Run

### Clone the Repository

```bash
git clone <repository-url>
cd EmployeeManagementSystem
```

### Compile the Project

```bash
javac -cp "lib/*" -d bin src/*.java
```

### Run the Application

```bash
java -cp "bin:lib/*" InsertEmployee
```

## JDBC Workflow

```text
Java Application
        │
        ▼
 JDBC Driver
        │
        ▼
 Database Connection
        │
        ▼
 SQL Queries
        │
        ▼
 MariaDB Database
        │
        ▼
 Console Output
```

## Learning Outcomes

- Understanding JDBC Architecture
- Establishing Database Connections
- Executing SQL Queries
- Performing CRUD Operations
- Working with Linux Commands
- Exception Handling in Java
- Organizing Java Projects

## Future Enhancements

- Employee Search by ID
- Employee Login System
- Salary Report Generation
- Java Swing GUI
- Web Version using Servlets & JSP
- Spring Boot REST API Integration

## Author

Developed as a Java JDBC project on Linux to demonstrate database connectivity and CRUD operations using Java.
