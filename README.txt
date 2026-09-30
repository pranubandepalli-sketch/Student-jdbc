JDBC + MVC + MySQL + Frontend (NO SQL FILE)

1. Install JDK 17+ and Maven.
2. Start MySQL in XAMPP.
3. In phpMyAdmin create database:
   student_db

4. Create table:
   students

   Columns:
   id       INT          PRIMARY KEY AUTO_INCREMENT
   name     VARCHAR(100) NOT NULL
   email    VARCHAR(150) NOT NULL
   age      INT          NOT NULL
   course   VARCHAR(100) NOT NULL

5. Open this folder in VS Code.
6. Run:
   mvn spring-boot:run

7. Open:
   http://localhost:8080/

IMPORTANT:
There is NO schema.sql file in this version.
The project still uses SQL statements inside the Java JDBC repository because
JDBC communicates with a relational database through SQL.

If your MySQL root password is not empty, edit:
src/main/resources/application.properties

spring.datasource.password=YOUR_PASSWORD

Libraries:
- spring-boot-starter-web
- spring-boot-starter-jdbc
- mysql-connector-j
