# Task Management System

## Description
The Task Management System is a web-based application designed to help users manage tasks effectively by organizing them based on priority, status, and progress. 
The system enables users to add, search, edit, and delete tasks.

## Technologies Used
Backend: Java, Spring Boot, MyBatis
Frontend: Thymeleaf, HTML, SCSS, JavaScript
Database: Microsoft SQL Server
Dependency Management: Maven

## Getting Started
This project can be set up and run in two ways:

Way (1): Run from Source Code
* Clone the Repository
	Clone this repository from GitHub using the following command:
	git clone https://github.com/Poeei-San/task-management-system

* Database Setup
	Create a new database named TASK_MANAGEMENT.
	Run the database script file (provided in the repository) to set up the necessary tables and initial data.

* Configure Database Properties
	Ensure the application.properties file contains the following database configuration:
	properties
	spring.datasource.url=jdbc:sqlserver://localhost;instance=SQLEXPRESS;databaseName=TASK_MANAGEMENT
	spring.datasource.username=sa
	spring.datasource.password=checker019
	spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver

* Build and Run the Application
	Navigate to the project directory and use Maven to build and run the application: mvn spring-boot:run

* Access the Application
	Open a web browser and navigate to http://localhost:8080 to access the Task Management System.

Way (2): Run from JAR File
* Download the JAR File
	Ensure you have the latest JAR file for the Task Management System (from the repository or your build).

* Database Setup
	Create a new database named TASK_MANAGEMENT.Run the database script file to initialize tables and data.

* Run the Application
	Use the following command to run the JAR file: java -jar task-management-system.jar

* Access the Application
	Navigate to http://localhost:8080 to use the system.

* Database Configuration
	The following database properties are required for connecting to Microsoft SQL Server:
	properties
	spring.datasource.url=jdbc:sqlserver://localhost;instance=SQLEXPRESS;databaseName=TASK_MANAGEMENT
	spring.datasource.username=sa
	spring.datasource.password=checker019
	spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver

## Usage
Once the application is running, you can access the Task Management System dashboard at http://localhost:8080. 
The main features include:

* Add Task: Create a new task with details such as title, priority, status, and progress.
* Search Task: Search tasks based on title.
* Edit Task: Update details of an existing task.
* Delete Task: Remove a task from the system.