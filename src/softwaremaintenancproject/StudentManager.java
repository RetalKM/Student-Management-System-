/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaremaintenancproject;

import java.util.ArrayList;

/**
 * @class StudentManager
 * @brief Handles student operations (add, remove, search, display).
 */
public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * @brief Checks if a student ID already exists.
     * @param id The student ID to check.
     * @return True if the ID exists, false otherwise.
     */
    public boolean isDuplicateID(int id) {
        return students.stream().anyMatch(student -> student.id == id);
    }

    /**
     * @brief Adds a new student to the system.
     * @details Ensures unique ID validation before adding the student.
     * @param student Student object to be added.
     * @return True if added successfully, false if ID is exists.
     */
    public boolean addNewStudent(Student student) { // 🔹 Name Changed to addNewStudent()
        if (isDuplicateID(student.id)) {
            return false;
        }
        students.add(student);
        return true;
    }

    /**
     * @brief Displays the list of students in a formatted table.
     */
    public void showStudentList() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n--- Student List ---");
        System.out.printf("%-10s %-20s %-5s%n", "ID", "Name", "Age");
        System.out.println("--------------------------------");
        students.forEach(Student::displayStudent); // used to ensure the format is consistent
    }

    /**
     * @brief Searches for a student by ID.
     * @param id The student ID to search.
     * @return The Student object if found, otherwise null.
     */
    public Student findStudentById(int id) {
        return students.stream().filter(student -> student.id == id).findFirst().orElse(null);
    }

    /**
     * @brief Removes a student from the system by ID.
     * @param id The student ID to remove.
     * @return True if removed successfully, false if not found.
     */
    public boolean deleteStudentById(int id) {
        return students.removeIf(student -> student.id == id);
    }
}
