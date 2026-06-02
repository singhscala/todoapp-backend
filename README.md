# 📝 To-Do App Backend (Spring Boot)

This is a simple **To-Do List backend** built using **Spring Boot**.
It provides **RESTful APIs** to create, read, update, and delete (CRUD) tasks.

---

## 🚀 Features

* Create, view, update, and delete tasks
* RESTful API endpoints
* UUID-based task IDs
* Ready for front-end integration (React, Angular, etc.)

---

## 🧩 Tech Stack

* Spring Boot 3
* Java 17
* Maven

---

## 🛠️ Setup Instructions

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/singhscala/todoapp-backend.git
cd todoapp-backend
```

### 2️⃣ Configure application.properties

Make sure your `src/main/resources/application.properties` looks like this:

```properties
spring.application.name=todoapp
server.port=8080
```

### 3️⃣ Run the Spring Boot App

```bash
mvn spring-boot:run
```

✅ The backend will start on:

```text
http://localhost:8080
```

---

## 🔗 API Endpoints

| Method | Endpoint        | Description             |
| ------ | --------------- | ----------------------- |
| GET    | /api/tasks      | Get all tasks           |
| GET    | /api/tasks/{id} | Get task by ID          |
| POST   | /api/tasks      | Create a new task       |
| PUT    | /api/tasks/{id} | Update an existing task |
| DELETE | /api/tasks/{id} | Delete a task           |

---

## 👩‍💻 Author

Prachi Singh

💼 GitHub: @singhscala
