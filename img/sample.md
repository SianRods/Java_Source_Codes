Excellent — since you’ve fully tested your APIs in Postman, you can now create professional documentation for your **Internship Management API**. Below is a **complete Markdown-formatted documentation** you can directly add to your **Postman Collection documentation** or README file (e.g., `README.md`).

---

# 🧾 Internship Management API Documentation

> **Version:** 1.0
> **Base URL:** `http://localhost:8080/`
> **Framework:** Spring Boot (Spring MVC + JPA)
> **Description:**
> This API manages **Internships**, **Students**, **TPCs (Training & Placement Coordinators)**, and **Applications** within an Internship Management System.
> The system supports role-based operations for students and TPCs, including CRUD operations and status updates for internship applications.

---

## 📁 API Collection Overview

| Module                     | Base Endpoint  | Description                                         |
| -------------------------- | -------------- | --------------------------------------------------- |
| **Student Controller**     | `/student`     | Manage student registration, updates, and retrieval |
| **TPC Controller**         | `/tpc`         | Manage TPCs, internships, and applications          |
| **Internship Controller**  | `/internships` | Retrieve internship listings                        |
| **Application Controller** | `/application` | Manage student internship applications              |

---

## 👨‍🎓 Student APIs

### ➕ Create Student

**POST** `/student`

**Description:**
Register a new student into the system.

**Request Body (JSON):**

```json
{
  "sapId": 500111222,
  "name": "John Doe",
  "email": "john.doe@example.com",
  "branch": "Computer Engineering",
  "cgpa": 8.7
}
```

**Response:**
`201 Created`

```json
{
  "sapId": 500111222,
  "name": "John Doe",
  "email": "john.doe@example.com",
  "branch": "Computer Engineering",
  "cgpa": 8.7
}
```

---

### 📄 Get Student by ID

**GET** `/student/{id}`

**Description:**
Retrieve a student’s profile using their SAP ID.

**Path Variable:**

* `id` — Integer (Student SAP ID)

**Response:**
`200 OK`

```json
{
  "sapId": 500111222,
  "name": "John Doe",
  "email": "john.doe@example.com",
  "branch": "Computer Engineering",
  "cgpa": 8.7
}
```

---

### 📋 Get All Students

**GET** `/student/students`

**Description:**
Fetch all registered students.

**Response:**
`200 OK`

```json
[
  {
    "sapId": 500111222,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "branch": "Computer Engineering",
    "cgpa": 8.7
  },
  {
    "sapId": 500111333,
    "name": "Jane Smith",
    "email": "jane.smith@example.com",
    "branch": "IT",
    "cgpa": 8.9
  }
]
```

---

### ✏️ Update Student

**PUT** `/student`

**Description:**
Update an existing student record.

**Request Body:**

```json
{
  "sapId": 500111222,
  "name": "John Doe",
  "email": "john.updated@example.com",
  "branch": "Computer Engineering",
  "cgpa": 9.1
}
```

**Response:**
`200 OK` – Updated student details.

---

## 🧑‍💼 TPC APIs

### ➕ Create TPC

**POST** `/tpc`

**Request Body:**

```json
{
  "name": "Mr. Alex",
  "email": "alex.tpc@example.com",
  "department": "Computer Engineering"
}
```

**Response:**
`201 Created`
TPC created successfully.

---

### 📋 Get All TPCs

**GET** `/tpc`

**Response:**
`200 OK`

```json
[
  {
    "officer_id": 1,
    "name": "Mr. Alex",
    "email": "alex.tpc@example.com",
    "department": "Computer Engineering"
  }
]
```

---

### ✏️ Update TPC

**PUT** `/tpc/{mail}`

**Request Body:**

```json
{
  "name": "Mr. Alex Updated",
  "department": "IT"
}
```

**Response:**
`201 Created`
Updated TPC object.

---

### ⚙️ Manage Applications (TPC Side)

#### ✅ Update Application Status

**PUT** `/tpc/application/{id}`

**Description:**
Update the status of a student’s internship application.

**Request Body:**

```json
{
  "status": "APPROVED"
}
```

**Response:**
`200 OK`

```json
{
  "applicationId": 5,
  "status": "APPROVED"
}
```

---

#### ❌ Delete Application

**DELETE** `/tpc/application/{id}`

**Response:**
`200 OK`

```
"Deleted"
```

---

### 🧾 Manage Internships (TPC Side)

#### ➕ Create Internship

**POST** `/tpc/internship`

**Request Body:**

```json
{
  "companyName": "Google",
  "position": "Software Intern",
  "stipend": 30000,
  "startDate": "2025-12-01",
  "endDate": "2026-06-01"
}
```

**Response:**
`201 Created`

```
"Created New Internship"
```

---

#### ✏️ Update Internship

**PUT** `/tpc/internship/{id}`

**Request Body:**

```json
{
  "companyName": "Google",
  "position": "Software Engineering Intern",
  "stipend": 35000,
  "status": "ACTIVE"
}
```

**Response:**
`200 OK`

```json
{
  "companyName": "Google",
  "position": "Software Engineering Intern",
  "stipend": 35000,
  "status": "ACTIVE"
}
```

---

## 💼 Internship APIs

### 📋 Get All Internships

**GET** `/internships`

**Response:**
`200 OK`

```json
[
  {
    "internshipId": 1,
    "companyName": "Google",
    "position": "Software Intern",
    "stipend": 30000,
    "status": "OPEN"
  },
  {
    "internshipId": 2,
    "companyName": "Microsoft",
    "position": "Data Analyst Intern",
    "stipend": 25000,
    "status": "CLOSED"
  }
]
```

---

## 📝 Application APIs

### ➕ Create Application

**POST** `/application`

**Description:**
Submit a new internship application by a student.

**Request Body:**

```json
{
  "studentId": 500111222,
  "internshipId": 1,
  "status": "PENDING"
}
```

**Response:**
`201 Created`

```json
{
  "applicationId": 10,
  "studentId": 500111222,
  "internshipId": 1,
  "status": "PENDING"
}
```

---

### 📋 Get All Applications

**GET** `/application`

**Response:**
`200 OK`

```json
[
  {
    "applicationId": 10,
    "studentId": 500111222,
    "internshipId": 1,
    "status": "PENDING"
  },
  {
    "applicationId": 11,
    "studentId": 500111333,
    "internshipId": 2,
    "status": "APPROVED"
  }
]
```

---

## ⚙️ Technologies Used

| Layer                 | Technology                  |
| --------------------- | --------------------------- |
| **Backend Framework** | Spring Boot / Spring MVC    |
| **Database ORM**      | Spring Data JPA (Hibernate) |
| **API Testing**       | Postman                     |
| **DTOs**              | For clean data transfer     |
| **Architecture**      | MVC Pattern                 |
| **Response Format**   | JSON                        |

---

## 🧠 Notes

* All APIs support **CORS** using `@CrossOrigin`.
* HTTP Status codes follow standard conventions (`200 OK`, `201 CREATED`, `404 NOT FOUND`, `500 INTERNAL SERVER ERROR`).
* All entities use **DTOs** to manage request and response data cleanly.
* TPCs can manage both **internships** and **applications**.
* Students can apply to internships and update their profiles.

---

Would you like me to format this specifically for **Postman’s “Documentation View” (with examples, grouped folders, and short descriptions)** — so that it looks professional when you publish your collection? That version includes collapsible examples and Postman-style sections.
