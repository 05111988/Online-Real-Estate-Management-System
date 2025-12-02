📌 Project Overview
The Online Real Estate Management System is a Java-based GUI application designed to streamline property listing, renting, and management processes. It provides a structured interface for property owners, customers, and administrators to interact efficiently. The project implements essential Java concepts such as OOP, collections, multithreading, and JDBC-based database connectivity.
🎯 Features
Add, update, delete, and view property listings
User authentication and role-based access
Search and filter properties using various criteria
GUI-based interactions for ease of use
Smooth concurrent tasks using multithreading
Real-time database operations through JDBC
Proper error-handling and input validation
📚 Marking Rubric Implementation 1️⃣ OOP Implementation
This project uses complete Object-Oriented Programming principles:
Inheritance: Common classes like User, Property, and Admin follow parent–child relationships.
Polymorphism: Overridden methods for displaying property details and user actions.
Interfaces: Interfaces for database operations and login modules.
Exception Handling: Custom exceptions for invalid input, connection failures, and empty fields.
2️⃣ Collections & Generics
Uses ArrayList, HashMap<String, User>, and generic classes for storing property and user data.
Ensures type safety and fast retrieval operations.
3️⃣ Multithreading & Synchronization
Implements background threads for loading data, refreshing GUI tables, and handling I/O tasks.
Synchronization ensures thread-safe updates when multiple operations occur simultaneously.
4️⃣ Classes for Database Operations
Dedicated DAO (Data Access Object) classes for:
User management
Property CRUD operations
Booking/Visit requests
Ensures modular, clean, readable database interaction code.
5️⃣ Database Connectivity (JDBC)
The project uses JDBC to connect Java GUI with MySQL/Oracle database.
Includes driver setup, connection handling, and secure query execution.
6️⃣ Implement JDBC for Database Connectivity
PreparedStatements used to prevent SQL injection
Transaction handling for update/insert operations
All modules (login, property, user) integrated with persistent database storage
🛠️ Tech Stack
Java
Swing / AWT GUI
MySQL / Oracle DB
JDBC
Collections Framework & OOP
