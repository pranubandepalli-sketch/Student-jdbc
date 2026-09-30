FULL STACK VERSION WITH NODE.JS

Architecture:

Browser
  ↓
Node.js + Express frontend (port 3000)
  ↓
REST API proxy
  ↓
Spring Boot MVC backend (port 8080)
  ↓
JDBC / JdbcTemplate
  ↓
MySQL

Requirements:
- JDK 17+
- Maven
- Node.js + npm
- XAMPP/MySQL

DATABASE:
Create database `student_db` and table `students` in phpMyAdmin:

id       INT PRIMARY KEY AUTO_INCREMENT
name     VARCHAR(100) NOT NULL
email    VARCHAR(150) NOT NULL
age      INT NOT NULL
course   VARCHAR(100) NOT NULL

There is NO SQL FILE in this project.

STEP 1 - Start MySQL:
Start MySQL in XAMPP.

STEP 2 - Start Java backend:
Open a terminal in the project root and run:

mvn spring-boot:run

Java backend:
http://localhost:8080

STEP 3 - Start Node frontend:
Open another terminal:

cd frontend
npm install
npm start

Node frontend:
http://localhost:3000

IMPORTANT:
Keep BOTH terminals running.

Node.js is being used for the frontend server and API proxy.
JDBC remains inside the Java backend and connects Java to MySQL.

Libraries:
Java:
- spring-boot-starter-web
- spring-boot-starter-jdbc
- mysql-connector-j

Node:
- express
- http-proxy-middleware
