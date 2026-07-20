# Maven Lab 05 — Part 02 Spring Boot CRUD Application

## Student Details

- **Full Name:** Tharinsa Batagoda
- **Student Registration Number:** 245014C
- **Module:** Maven Session — Lab 05

## Project Overview

This project is a Spring Boot CRUD REST API built and managed using Apache Maven.

The application manages student records and supports Create, Read, Update, and Delete operations.

## Technologies Used

- Java 17
- Spring Boot
- Apache Maven
- Spring Web
- Spring Data JPA
- H2 Database

## Layered Project Structure

- `controller` — Handles HTTP requests and responses.
- `service` — Contains application logic.
- `repository` — Provides database access.
- `model` — Defines the Student entity.
- `configuration` — Loads sample student data.

## REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/students` | Create a student |
| GET | `/api/students` | Retrieve all students |
| GET | `/api/students/{id}` | Retrieve one student |
| PUT | `/api/students/{id}` | Update a student |
| DELETE | `/api/students/{id}` | Delete a student |

## Example Student Request

```json
{
  "name": "Saman Kumara",
  "email": "saman@example.com",
  "course": "Computer Science"
}