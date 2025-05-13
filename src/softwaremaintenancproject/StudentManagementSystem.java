/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaremaintenancproject;

import java.util.Scanner;

/**
 * @class StudentManagementSystem
 * @brief Manages the UI and user input for the student system.
 */
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Remove Student by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: { // 🔹 Calls addNewStudent() Instead of addStudent()
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();

                    if (studentManager.addNewStudent(new Student(id, name, age))) // 🔹 Updated Method Call
                        System.out.println("Student added successfully!");
                    else 
                        System.out.println("Error: Student ID already exists.");
                    
                }
                break ;
                case 2:
                    studentManager.showStudentList();
                    break ;
                case 3: {
                    System.out.print("Enter Student ID to search: ");
                    int id = scanner.nextInt();
                    Student student = studentManager.findStudentById(id);
                    if (student != null) 
                        System.out.println("ID: " + student.id + ", Name: " + student.name + ", Age: " + student.age);
                    else 
                        System.out.println("Student not found.");
                    break ;
                }
                case 4: {
                    System.out.print("Enter Student ID to remove: ");
                    int id = scanner.nextInt();
                    if (studentManager.deleteStudentById(id))
                        System.out.println("Student removed successfully.");
                    else 
                        System.out.println("Error: Student not found.");
                    break ;
                    }
                
                case 5: {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
