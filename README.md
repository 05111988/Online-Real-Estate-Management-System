📌 Project Overview

The Online Real Estate Management System is a Java-based GUI application designed to streamline property listing, renting, and management. It offers a clean interface for property owners, customers, and administrators to interact efficiently.
The project demonstrates key Java concepts such as OOP, Collections, Multithreading, and JDBC-based database connectivity.

🎯 Features

Add, update, delete, and view property listings

User authentication with role-based access

Search and filter properties using multiple criteria

GUI-based interactions for improved usability

Smooth concurrent tasks using multithreading

Real-time database operations via JDBC

Proper error handling and input validation mechanisms

📚 Marking Rubric Implementation
1️⃣ OOP Implementation

The project fully applies Object-Oriented Programming concepts:

Inheritance: Classes like User, Admin, and Property follow hierarchical relationships.

Polymorphism: Method overriding for displaying property/user details and actions.

Interfaces: Implemented for database operations and authentication modules.

Exception Handling: Custom exceptions for invalid inputs, connection errors, and empty fields.

2️⃣ Collections & Generics

Uses ArrayList, HashMap<String, User>, and generic classes to store property and user data.

Ensures type safety, efficient retrieval, and structured data organization.

3️⃣ Multithreading & Synchronization

Background threads handle data loading, GUI table refreshing, and I/O tasks.

Synchronization ensures safe updates when multiple operations occur simultaneously.

4️⃣ Classes for Database Operations

Dedicated DAO (Data Access Object) classes manage:

User management

Property CRUD operations

Booking / visit requests

This ensures modular, readable, and maintainable database interaction code.

5️⃣ Database Connectivity (JDBC)

The system uses JDBC to connect the Java GUI with MySQL/Oracle database:

Driver loading and connection management

Secure query execution

Error-free database communication

6️⃣ JDBC Implementation Details

PreparedStatements used to prevent SQL injection

Transaction handling for insert/update operations

All modules (login, property, user) connected with a persistent database

🛠️ Tech Stack

Java

Swing / AWT

MySQL / Oracle Database

JDBC

Collections Framework & OOP Concepts
