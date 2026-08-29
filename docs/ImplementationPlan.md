# BoardingMate Implementation Plan

## Proposed Implementation Phases

### Phase 1: Documentation & Initialization
- Create a new branch `feature/initial-docs`.
- Create `docs/PRD.md` based on requirements.
- Create `docs/architecture/Architecture.md` detailing the 3-layer architecture.
- Create `docs/UserStories.md` covering Member and Admin roles.
- Create `README.md` with the proposed structure.
- Commit and push to GitHub.

### Phase 2: Backend Foundation (Spring Boot)
- Initialize Spring Boot project (Java, Spring Web, Data JPA, Security, PostgreSQL).
- Set up database models and relationships (User, Task, Schedule, Assignment, Notification).
- Implement User Authentication (JWT + Spring Security).
- Create basic CRUD APIs for Users and Tasks.

### Phase 3: Core Logic & Workflows
- Implement Schedule generation and assignment logic.
- Implement Task completion workflow (`PENDING` -> `COMPLETED_BY_MEMBER` -> `VERIFIED`).
- Setup Scheduled Jobs (Cron) for email reminders.

### Phase 4: Frontend Foundation (React)
- Initialize Vite + React + TypeScript + Tailwind CSS project.
- Setup routing (React Router) and state management/context.
- Create UI shell (Navbar, Sidebar) using the Brown/Warm White palette.
- Implement Login Screen and authentication flow.

### Phase 5: Dashboards & Integration
- Implement Member Dashboard (Next Duty, Upcoming Schedule).
- Implement Admin Dashboard (Weekly overview, verify tasks, manage users).
- Connect Frontend to Backend APIs (Axios).

### Phase 6: Polish, Testing & Deployment
- Dockerize the application.
- Setup GitHub Actions CI/CD.
- Final testing and bug fixes.
- Update documentation with screenshots and deployment instructions.
