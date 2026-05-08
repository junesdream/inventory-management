# 📦 Inventory Management System (Backend)

A modern Java backend for warehouse management. Built to demonstrate clean **Layered Architecture** principles and automated testing best practices.

![CI Status](https://github.com/junesdream/inventory-management/actions/workflows/ci.yml/badge.svg?branch=main)
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Framework-Spring_Boot_3-green)
![License](https://img.shields.io/badge/license-MIT-green)

---

## ✨ Features

| Feature | Description |
|---|---|
| 🗂️ **CRUD Operations** | Full product management (Name, Quantity, Price) |
| 🧪 **Automated Testing** | Unit tests for business logic using JUnit 5 & Mockito |
| 🖥️ **H2 Console** | Live database monitoring via browser |
| 🏗️ **Layered Architecture** | Clean separation of Model, Repository, Service & Controller |

---

## 🛠️ Tech Stack

| Technology | Description |
|---|---|
| ☕ **Java 17** (LTS) | Core language |
| 🚀 **Spring Boot 3** | Application framework |
| 🗄️ **Spring Data JPA** | Database persistence layer |
| 💾 **H2 Database** | In-memory database for development |
| ✂️ **Lombok** | Boilerplate code reduction |
| 🧪 **JUnit 5 & Mockito** | Unit testing framework |

---

## 🏗️ Architecture

The project follows the standard enterprise layered architecture pattern:

| Layer | Description |
|---|---|
| **Model** | `Product` entity class for database structure |
| **Repository** | Interface for database access (CRUD operations) |
| **Service** | Business logic (e.g. stock validation) |
| **Controller** | REST interface (HTTP) for external access |

---

## 🚀 Getting Started

1. Import the project in **IntelliJ** as a Maven project.
2. Run `InventoryApplication`.
3. The API is available at:
   ```
   http://localhost:8080/api/products
   ```
4. H2 Console available at:
   ```
   http://localhost:8080/h2-console
   ```
   JDBC URL: `jdbc:h2:mem:inventorydb`

---

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-idea`)
3. Commit your changes (`git commit -m 'feat: add your idea'`)
4. Push to the branch (`git push origin feature/your-idea`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 👤 Author

**June** ([@junesdream](https://github.com/junesdream))
 Full-Stack Development • AI Systems • Electronic Music