---

# Student Management System

This project is a **Java-based Student Management System**, designed to facilitate the management of student records. Users can add new students, search for existing students by ID, view all student records, and save/load data to and from a file.

---

## Table of Contents

1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Technologies and Libraries](#technologies-and-libraries)
4. [Code Structure and Modules](#code-structure-and-modules)
5. [User Interface and Design](#user-interface-and-design)
6. [Student Management Workflow](#student-management-workflow)
7. [How to Run the Project](#how-to-run-the-project)

---

## Project Overview

The goal of this project is to provide a simple and interactive console-based system for managing student data. Users can:

- Add new student records with a unique ID, name, and grade.
- Search for students using their unique ID.
- View a list of all students in the system.
- Save the student data to a file for persistence.
- Load student data from a file.

---

## Features

- **Add Student**: Add a new student record by entering the ID, name, and grade.
- **Search Student by ID**: Search for a student using their unique ID.
- **View All Students**: Display all students currently stored in the system.
- **Save to File**: Save the list of students to a file named `students.txt`.
- **Load from File**: Load student records from `students.txt` to restore previous data.
- **Interactive Menu**: Easy-to-use text-based menu for navigating features.
- **Logging**: Comprehensive logging for tracking actions and errors.

---

## Technologies and Libraries

### Core Technologies

- **Java 21**: Built using Java 21 for its modern features and performance improvements.

### Key Libraries

- **`java.util`**: Used for collections like `ArrayList` and input handling with `Scanner`.
- **`java.io`**: Provides functionality to read from and write to files.
- **`java.time`**: Implements timestamp logging.

---

## Code Structure and Modules

The project is structured as follows:

```
student-management/
├── src/
│   ├── main/
│   │   
│   ├── service/
│   │       │   ── StudentService.java
│   ├── model/
│   │       │   └── Student.java
│   ├── util/
│   │       │   ├── FileHandler.java
│   │       │   └── LoggerUtil.java
│   └── main/
│          └── StudentManagementSystem.java
└── resources/
    └── students.txt              // Stores student data
```

### Module Descriptions

- **`model`**:
    - Contains the `Student` class representing a student's data (ID, name, and grade).

- **`service`**:
    - Includes `StudentService` for handling business logic such as adding, searching, and displaying students.

- **`util`**:
    - Contains utility classes:
        - `FileHandler` for reading from and writing to the `students.txt` file.
        - `LoggerUtil` for logging actions and errors.

- **`main`**:
    - Includes `StudentManagementSystem`, the main application class that starts the program and displays the interactive menu.

- **`resources`**:
    - A directory for external files, such as `students.txt`.

---

## User Interface and Design

The application runs entirely in the console with a simple menu-driven interface.

### Menu Structure

**Main Menu**:
1. Add a new student
2. Search for a student by ID
3. Display all students
4. Save students to file
5. Load students from file
6. Exit

### User Input

- Input validation ensures that invalid choices or data are not accepted.
- Detailed prompts guide users through each operation.

---

## Student Management Workflow

1. **Adding Students**:
    - Users select the "Add a new student" option and provide the student's ID, name, and grade.
    - The student is added to the system and logged.

2. **Searching for a Student**:
    - Users select "Search for a student by ID" and provide the student’s unique ID.
    - The system returns the student's details if found or notifies the user if no match is found.

3. **Viewing All Students**:
    - Users select "Display all students" to see a list of all records in the system.

4. **Saving to File**:
    - Users select "Save students to file" to persist all records to `students.txt`.

5. **Loading from File**:
    - Users select "Load students from file" to restore records from `students.txt`.

---

## How to Run the Project

### Prerequisites

- **Java 21 or Later**: Ensure Java is installed and configured on your system.
- **IDE (Optional)**: IntelliJ IDEA is recommended for development and debugging.

### Steps to Run

1. **Clone or Download**:
    - Clone the repository or download the ZIP file and extract it.

2. **Compile the Project**:
    - Navigate to the project directory.
    - Use `javac` to compile all `.java` files in the `src/main/java` folder.

3. **Run the Application**:
    - Execute the main class: `main.StudentManagementSystem`.
    - The interactive menu will appear in the console.

4. **Using the Menu**:
    - Follow the on-screen prompts to add, search, view, save, and load student records.

---

