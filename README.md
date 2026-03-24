# 🎓 Student Management System (Spring JDBC)

## 📌 Description

A backend-based Java application built using **Spring Core and JDBC** to perform CRUD (Create, Read, Update, Delete) operations on student data.

---

## 🚀 Features

* ➕ Add new student
* ✏️ Update student details
* ❌ Delete student
* 🔍 Fetch single student
* 📋 Fetch all students

---

## 🛠️ Tech Stack

* Java
* Spring Core
* Spring JDBC
* Maven

---

## 🧠 Concepts Used

* Dependency Injection (Spring)
* JDBC Template
* DAO Design Pattern
* RowMapper

---

## 📂 Project Structure (Explanation)

### 🔹 `App.java`

* Entry point of the application
* Loads Spring configuration (`config.xml`)
* Calls methods like insert, update, delete
* Used to test the application

---

### 🔹 `StudentDao`

* Interface that defines database operations
* Contains methods like:

  * `insert(Student s)`
  * `update(Student s)`
  * `delete(int id)`
  * `getStudent(int id)`
  * `getAllStudents()`

👉 Helps in separating **logic from implementation**

---

### 🔹 `StudentDaoImpl`

* Implements `StudentDao`
* Uses **JdbcTemplate** to interact with database
* Contains actual SQL queries

---

### 🔹 `RowMapperImpl`

* Converts database rows into Java objects
* Maps each row to a `Student` object

👉 Example:
Database row → Student object

---

### 🔹 `config.xml`

* Spring configuration file
* Defines beans and database connection
* Configures `JdbcTemplate`

---

## ▶️ How to Run

1. Clone the repository
2. Open in Eclipse / IntelliJ
3. Configure database in `config.xml`
4. Run `App.java`

---

## 📌 Future Improvements

* Convert to Spring Boot
* Add REST API
* Add frontend UI
* Connect with MySQL (if not already)

---

## 💡 Why This Project?

This project demonstrates real-world backend development using Spring and JDBC, making it a strong foundation for building enterprise applications.

---

⭐ If you like this project, give it a star!

