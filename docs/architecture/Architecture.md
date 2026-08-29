# System Architecture

The application follows a standard three-layer architecture utilizing React on the frontend, Spring Boot for the backend API, and PostgreSQL for the database.

## High Level Flow
```mermaid
flowchart TB
    U[Boarding Members]

    subgraph Frontend["Frontend - React + TypeScript"]
        UI[Web Interface]
        AUTH[Authentication]
        DASH[Member Dashboard]
        ADMIN[Admin Dashboard]
    end

    subgraph Backend["Backend - Spring Boot"]
        API[REST API]
        SEC[Spring Security + JWT]
        USER[User Service]
        TASK[Task Service]
        SCHEDULE[Schedule Service]
        NOTIFY[Notification Service]
        REMINDER[Reminder Scheduler]
    end

    subgraph Database["PostgreSQL"]
        DB[(PostgreSQL Database)]
    end

    subgraph External["External Services"]
        EMAIL[Email Service]
    end

    U --> UI
    UI --> AUTH
    UI --> DASH
    UI --> ADMIN

    AUTH --> API
    DASH --> API
    ADMIN --> API

    API --> SEC
    SEC --> USER
    API --> TASK
    API --> SCHEDULE

    TASK --> DB
    USER --> DB
    SCHEDULE --> DB

    REMINDER --> DB
    REMINDER --> NOTIFY
    NOTIFY --> EMAIL
```

## Tech Stack
### Frontend
- React, TypeScript, Vite, Tailwind CSS, Lucide React, React Router, Axios, React Hook Form

### Backend
- Java, Spring Boot, Spring Security, Spring Data JPA, Hibernate, REST API

### Database
- PostgreSQL

### Other
- JWT Authentication, BCrypt for password hashing
