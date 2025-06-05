📝 MyBlog - A Modern Blogging REST API
A full-featured Spring Boot-based blogging application that enables users to create posts, write comments, make payments, and more. The project is secured with Spring Security + JWT, supports pagination, and follows clean coding principles like layered architecture, DTOs, and global exception handling.

---

## 🚀 Features

- 🔐 JWT Authentication & Spring Security
- - 🧑‍💻 Signup & Login API
- 📝 CRUD operations for Posts and Comments
- 🔄 One-to-Many and Many-to-One relationship between Post & Comment
- 🧾 ModelMapper for DTO conversion
- ❌ Global Exception Handling
- 📄 Pagination & Sorting
- 💳 Payment Gateway Integration (Stripe)
- 🛠️ Hibernate + MySQL for persistence
- 📦 Maven project structure

---

## ⚙️ Tech Stack


- Java 17
- Spring Boot 3.4.5
- Spring Data JPA (Hibernate)
- Spring Security + JWT
- MySQL
- Maven
- ModelMapper
- Validation (jakarta.validation)
- Pagination & Sorting
- Lombok
- Payment Gateway (Stripe)
- IntelliJ IDEA

---

## 📁 Project Structure

```plaintext
src/  
├── main/  
│   ├── java/  
│   │   └── com.myblog7/  
│   │       ├── controller/  # REST Controllers  
│   │       ├── entity/      # JPA Entities  
│   │       ├── repository/  # JPA Repositories  
│   │       ├── service/     # Interfaces and Implementations  
│   │       ├── payload/     # DTOs and Response Models  
│   │       ├── exception/   # Global & Custom Exceptions  
│   │       ├── security/    # JWT Provider, Filter, EntryPoint  
│   │       ├── config/      # Security Configuration Classes  
│   │       └── utils/       # Helper or Utility Classes  
│   └── resources/  
│       └── application.properties  # MySQL DB, port, JWT secret, etc.  

---

## 🔐 Authentication Flow

1. Register user using `/api/auth/signup`
2. Login with `/api/auth/login`
3. Receive JWT token in response
4. Use token in `Authorization: Bearer <token>` header for protected APIs

---

## 🧪 Sample API Endpoints

| Method | Endpoint                                | Description                      |
|--------|------------------------------------------|----------------------------------|
| POST   | `/api/auth/signup`                      | User Registration                |
| POST   | `/api/auth/login`                       | Login & JWT Token Generation     |
| POST   | `/api/posts`                            | Create a Blog Post               |
| GET    | `/api/posts?page=0&size=5`              | Paginated List of Posts          |
| GET    | `/api/posts/{id}`                       | Get Post by ID                   |
| POST   | `/api/posts/{postId}/comments`          | Add Comment to Post              |
| GET    | `/api/posts/{postId}/comments`          | Get All Comments for a Post      |

---

## 💳 Stripe Payment Integration

Payment gateway setup is included using **Stripe**, with API endpoints for initiating and verifying transactions (extendable).

---

## 🛠️ How to Run This Project

1. **Clone the repository**  
   ```bash
   git clone https://github.com/shivendra9340/myblog7.git
2.Open in IntelliJ IDEA (or any IDE).

3.Configure MySQL in application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/myblogdb
spring.datasource.username=root
spring.datasource.password=yourpassword
jwt.secret=yourSecretKey

4.Run the app:
mvn spring-boot:run

##👨‍💻 Author
Shivendra Ojha
Java Developer | Spring Boot | Full Stack Enthusiast
📧 shivendraojha370@gmail.com
🌐 Visit my GitHub: [shivendra9340](https://github.com/shivendra9340)
📍 Based in Bhopal, Madhya Pradesh — Land of Lakes and White Tigers


