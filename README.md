#  CRM Dashboard - Java Fullstack Assessment

##  Overview
This project is a simple Customer Relationship Management (CRM) Dashboard. It includes:

- Hardcoded Admin Login
- User Management (CRUD)
- Contact Management (CRUD)
- Reports: 
  - Number of contacts per user
  - 5 Most recently added contacts

---

## Tech Stack


 Frontend   - HTML, CSS, JavaScript, Bootstrap 
 
 Backend    - Java, Spring Boot, Spring Data JPA 
 
 Database   - MySQL 

---

##  Architecture & Design

- Backend : Built using Spring Boot and Exposes REST APIs for users, contacts, and reports. Uses Spring Data JPA for ORM and auto-generates database tables.
- Frontend : Built HTML/CSS/JS pages. Each module (login, dashboard, contacts, reports) is a separate HTML file.
- Communication : Frontend fetches data from backend using fetch() and JSON.

---

##  Setup Instructions

###  Backend (Spring Boot)
1. Install Java 17+ and Maven
2. Create Database in MySQL:
   
