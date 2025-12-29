# 📚 Universal Resource Manager API

A high-quality Spring Boot project designed to showcase **production-ready RESTful API patterns** and deep understanding of **Java Object-Oriented Programming (OOP)**.

## 🛠️ Tech Stack
* **Framework:** Spring Boot 4.0.1
* **Language:** Java v25
* **Testing Tool:** Postman
* **Build Tool:** Maven

## 📂 Project Structure
```text
src/main/java/com/example/demo/
├── annotation/      # Custom TrackActivity annotation
├── controller/      # ResourceController (REST Endpoints)
├── model/           # Resource, Book, Movie, and ApiResponse (OOP & Generics)
└── DemoApplication.java
```
## 🎯 What This Project Demonstrates

### 1. Advanced API Design (The "REST" way)
* **Generic Response Wrapper:** Instead of returning raw data, I implemented a `ApiResponse<T>` generic class. This ensures every response follows a strict, predictable JSON structure: `{ statusCode, message, data }`.
* **API Versioning:** Used `/api/v1/` prefixing to demonstrate best practices in maintaining backward compatibility.

### 2. The 4 Pillars of OOP
* **Abstraction:** Defined an `abstract class Resource` to enforce a blueprint for all library items.
* **Inheritance:** Implemented `Book` and `Movie` classes that extend `Resource`, reusing code for ID and Title handling.
* **Encapsulation:** Used private fields with public getters/setters to ensure data integrity and security.
* **Polymorphism:** Created a polymorphic `calculateLateFee()` method. The API dynamically chooses the correct fee logic (Books: $0.50 vs. Movies: $2.00) based on the object type at runtime.

### 3. Custom Metadata (Annotations)
* Implemented a custom annotation `@TrackActivity`. This demonstrates my ability to work with Java Reflection and handle cross-cutting concerns (like logging or auditing) in a clean, decoupled way.

## 🚦 How to Test (Postman)
1. Clone the repo and run the Spring Boot application.
2. Use Postman to hit the following endpoints:
   * `GET /api/v1/movie` - Returns a generic movie response.
   * `GET /api/v1/fee/book/5` - Calculates a 5-day late fee for a book using polymorphism.