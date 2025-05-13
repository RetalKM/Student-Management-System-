# Student Management System 

A refactored and enhanced version of a simple Java-based student management system, focused on applying software maintenance principles to improve functionality, modularity, and user interaction.

# Project Overview

This project was developed as part of the Software Maintenance and Configuration course. We received a basic Java-based Student Management System and applied maintenance tasks, including:

	• Fixing logic bugs
	• Adding missing features
	• Refactoring code for better structure and naming
	• Separating logic across multiple classes
	• Adding Doxygen-style documentation

 # Fixed Issues

1. Duplicate Student ID Bug
   
	• Problem: The system allowed multiple students with the same ID
	• Fix:
	• Added isDuplicateID() method to check uniqueness
	• Integrated it into addStudent() to prevent duplicates
	• User gets a message if the ID already exists

# New Features

1. Remove Student by ID
   
	• Added a new option to delete a student by entering their ID
	• Implemented using deleteStudentById()
	• Includes helper method studentExists()
	• Updated menu and user feedback system

# Refactoring Summary

# a. Method Renaming for Clarity

Old Name------------ > New Name

addStudent()------> addNewStudent()
displayStudents()-----> showStudentList()------> searchStudentById()
searchStudentById()-------> findStudentById()
removeStudentById()-----> deleteStudentById()


 # Technologies Used
	• Java 8+
	• Doxygen for documentation
	• Understand for UML modeling
	• Command-line Interface (CLI)

 # How to Run
	1. Clone the repository :
 git clone https://github.com/YOUR_USERNAME/StudentManagementSystem.git
cd StudentManagementSystem

	2. Compile the code
 javac *.java

 	3. Run the application
  java StudentManagementSystem


 




