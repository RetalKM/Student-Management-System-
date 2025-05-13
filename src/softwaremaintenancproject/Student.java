/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaremaintenancproject;

/**
 * @class Student
 * @brief Represents a student with ID, name, and age.
 */
public class Student {
    int id; /// < Student's unique ID
    String name; /// < Student's name
    int age; /// < Student's age

    /**
     * @brief Constructs a new Student object.
     * @param id   The student's unique ID.
     * @param name The student's name.
     * @param age  The student's age.
     */
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * @brief Displays student details.
     */
    public void displayStudent() {
        System.out.printf("%-10d %-20s %-5d%n", id, name, age);
    }
}
