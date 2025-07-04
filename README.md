
# 🎬 Netflix Clone - Movie Management REST API

A backend REST API built using **Spring Boot** that simulates core movie management functionality of a Netflix-like platform. It supports creating, retrieving, updating, and deleting movie records using clean, RESTful endpoints.

---

## 🚀 Features

- ✅ Create, Read, Update, Delete (CRUD) operations for movies
- ✅ RESTful API using Spring Boot and Spring MVC
- ✅ Data persistence with Spring Data JPA and H2 (in-memory DB)
- ✅ Modular layered architecture: Controller → Service → Repository
- ✅ Lightweight and easy to deploy

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/example/netflix/
│   │   ├── controller/        # REST controllers
│   │   ├── model/             # Movie entity
│   │   ├── repository/        # JPA repository
│   │   ├── service/           # Business logic
│   │   └── NetflixApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql (optional sample data)
```

---

## 📦 API Endpoints

| Method | Endpoint           | Description            |
|--------|--------------------|------------------------|
| `POST` | `/api/movies`      | Add a new movie        |
| `GET`  | `/api/movies`      | Get all movies         |
| `GET`  | `/api/movies/{id}` | Get movie by ID        |
| `PUT`  | `/api/movies/{id}` | Update movie by ID     |
| `DELETE` | `/api/movies/{id}` | Delete movie by ID  |

---

## 🔧 Setup & Run

### Prerequisites
- Java 17+
- Maven

### Clone and Run
```bash
git clone https://github.com/your-username/netflix-api.git
cd netflix-api
mvn spring-boot:run
```

### Access API
Once running, access the API at:
```
http://localhost:8080/api/movies
```

---

## 💡 Sample Request (JSON)

```json
POST /api/movies
{
  "title": "Stranger Things",
  "genre": "Sci-Fi",
  "year": 2016,
  "rating": "TV-14"
}
```

---

## 📄 application.properties

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
```

Access H2 DB console at: `http://localhost:8080/h2-console`  
JDBC URL: `jdbc:h2:mem:testdb`

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repo and open a PR.

---

## 📧 Contact

**Sachin Singh**  
📫 [sachinsinghgt@gmail.com](mailto:sachinsinghgt@gmail.com)  
🔗 [LinkedIn](https://www.linkedin.com/in/sachinsingh319/) | [GitHub](https://github.com/Sachin-singh-CS)

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).
