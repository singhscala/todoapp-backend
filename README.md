# 📝 To-Do App Backend (Spring Boot + DynamoDB)

This is a simple **To-Do List backend** built using **Spring Boot** and **AWS DynamoDB Local**.  
It provides **RESTful APIs** to create, **read, update, and delete (CRUD)** tasks.

---

## 🚀 Features

- Create, view, update, and delete tasks  
- DynamoDB Local integration (no AWS account required)  
- RESTful API endpoints  
- UUID-based task IDs  
- Ready for front-end integration (React, Angular, etc.)

---

## 🧩 Tech Stack

- **Spring Boot 3**
- **Java 17**
- **AWS DynamoDB Local**
- **AWS SDK v2 (DynamoDB Enhanced Client)**
- **Maven**

---

## 🛠️ Setup Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/singhscala/todoapp-backend.git
cd todoapp-backend
```

### 2️⃣ Run DynamoDB Local

Download DynamoDB Local from the official AWS documentation: <https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DynamoDBLocal.html>

After downloading and extracting, open the folder in your terminal and run:

```bash
cd DynamoDBLocal
java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
```

DynamoDB Local will start on: <http://localhost:8000>


### 3️⃣ Configure application.properties
Make sure your src/main/resources/application.properties looks like this:

```properties
spring.application.name=todoapp
aws.dynamodb.endpoint=http://localhost:8000
aws.region=us-west-2
aws.accessKey=dummy
aws.secretKey=dummy
server.port=8080
```

### 4️⃣ Run the Spring Boot App
```bash
mvn spring-boot:run
```

✅ Now your backend runs on: <http://localhost:8080>


### 🔗 API Endpoints 

| Method  | Endpoint       | Description             |
|:-------:|:--------------:|:-------------:          |
|GET      |/api/tasks      | Get all tasks           |
|GET      |/api/tasks/{id} | Get task by ID          |
|POST     | /api/tasks     | Create a new task       |
|PUT      | /api/task/{id} | Update an existing task |
|DELETE   | /api/task/{id} | Delete a task           |


### 👩‍💻 Author
Prachi Singh

💼 GitHub: @singhscala
