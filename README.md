# 🛒 Order Management System

> A REST API-based order processing and tracking system built with Java and Spring Boot, featuring user management, menu handling, booking, and delivery tracking.

---

## 📌 Overview

A backend application that manages the full lifecycle of a customer order — from user registration and menu browsing to order booking and delivery tracking — with Spring Security for authentication.

---

## ✨ Features

- 👤 User registration & authentication (Spring Security)
- 🍽️ Menu management (create, update, browse items)
- 📦 Order booking & management
- 🚚 Delivery tracking
- 🔐 Secured REST API endpoints

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 3.x |
| Security | Spring Security |
| Database | JPA / Hibernate |
| Build Tool | Maven |

---

## 📁 Project Structure

```
src/main/java/com/projects/orderSystem/
├── Controller/
│   ├── OrderController.java       # Order CRUD endpoints
│   ├── UsersController.java       # User management endpoints
│   └── PullRequestController.java
├── Service/
│   ├── UserService.java           # User business logic
│   ├── Booking.java               # Order booking logic
│   ├── MenuController.java        # Menu service
│   └── Delivery.java              # Delivery tracking
├── Entity/
│   ├── Orders.java                # Order entity
│   ├── Menu.java                  # Menu item entity
│   └── Users.java                 # User entity
├── Repository/
│   └── UsersRepository.java       # JPA repository
└── Config/
    └── SecurityConfig.java        # Spring Security configuration
```

---

## ⚙️ Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+

### Run the Application

```bash
# Clone the repo
git clone https://github.com/Raghavaaverineni11/orderSystem.git
cd orderSystem

# Build & run
mvn spring-boot:run
```

API will be available at `http://localhost:8080`

---

## 👨‍💻 Author

**Raghava Averineni** — [GitHub](https://github.com/Raghavaaverineni11) · [Email](mailto:raghavaoffc@gmail.com)