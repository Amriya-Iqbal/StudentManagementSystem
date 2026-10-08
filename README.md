# Student Management System

A desktop application built with **Java Swing** for managing student records. It includes a login screen and a dashboard for adding, viewing, updating and deleting students. Data is stored in simple text files, so no database setup is needed.

## Features

- Login authentication for administrators
- Add new students
- View all students in a table
- Update existing student details
- Delete students
- File-based storage (no database required)

## Technologies Used

- Java (JDK 8 or later)
- Java Swing (GUI)
- NetBeans (Ant-based project)
- Plain text files for data storage


## Data Format

**students.txt** — one student per line:

```
id,name,course,year,email
```

**users.txt** — one user per line:

```
username,password
```

## Getting Started

### Prerequisites

- JDK 8 or higher
- NetBeans IDE (recommended)

### Run with NetBeans

1. Clone the repository:
   ```bash
   git clone https://github.com/Amriya-Iqbal/StudentManagementSystem.git
   ```
2. Open NetBeans and choose **File → Open Project**, then select the cloned folder.
3. Right-click the project and choose **Run**, or run `MainApp.java` located in `src/sms/main`.
4. Log in with the credentials stored in `data/users.txt`.

### Run from the command line

```bash
javac -d build -sourcepath src src/sms/main/MainApp.java
java -cp build;src sms.main.MainApp
```

On macOS/Linux, use `:` instead of `;` in the classpath.

> Run the application from the project root so it can find the `data/` folder.

## Usage

1. Log in with your admin username and password.
2. Use the dashboard to choose an action: add, view, update or delete a student.
3. Changes are saved automatically to `data/students.txt`.

## Future Improvements

- Hash passwords instead of storing them in plain text
- Switch to a database such as MySQL or SQLite
- Add search and filter options
- Add input validation for emails and years

## Author

Developed by Amriya Iqbal.