# Product Requirements Document (PRD)

## Project Overview
BoardingMate (Boarding Task Manager) is a web application designed to manage weekly cleaning responsibilities among seven boarding members. Every Monday, three members are assigned to three cleaning tasks:
1. Sweeping
2. Cleaning inside washrooms
3. Cleaning outside washrooms

The system allows members to view their assigned tasks, receive reminders, and allows authorized administrators to update task completion status.

## Problem Statement
The boarding currently lacks a centralized system to manage weekly cleaning responsibilities, monitor task completion, and remind members about upcoming cleaning duties. Manual management leads to forgotten duties, lack of accountability, and difficult schedule modifications.

## Proposed Solution
A role-based web application with the following core functionalities:
- **Member Dashboard**: View upcoming tasks, receive reminders, and view task history.
- **Admin Dashboard**: Create weekly schedules, assign members, update task status (Pending -> Completed By Member -> Verified).
- **Notifications**: Email reminders 3 days before, 1 day before, and on the day of the task.

## Key Rules & Constraints
- Exactly three assignments per weekly schedule.
- One person = one task per week.
- No duplicate assignments for a user in the same week.

## Out of Scope (For MVP)
- Automatic rotation algorithms (manual assignment by admins for MVP).
- Member unavailability/leave management.
- Photo evidence upload for task completion.
