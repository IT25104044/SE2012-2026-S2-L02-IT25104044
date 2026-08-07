package mainapp;

import models.Student;
import services.EnrollmentManager;
import java.util.Scanner;

/**
 * The main entry point for the Student Management System.
 * Handles the user menu and stores student data.
 */
public class Main {
    
    /**
     * The main execution method of the application.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student[] students = new Student[100];
        int studentCount = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Enroll Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Sort Students by Name");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    if (studentCount < students.length) {
                        System.out.print("Enter Student ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();
                        
                        students[studentCount] = new Student(id, name);
                        studentCount++;
                        System.out.println("Student enrolled successfully!");
                    } else {
                        System.out.println("System is full.");
                    }
                    break;
                case 2:
                    if (studentCount == 0) {
                        System.out.println("No students enrolled.");
                    } else {
                        System.out.println("\n--- Enrolled Students ---");
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println(students[i].toString());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    Student foundStudent = EnrollmentManager.searchStudentById(students, studentCount, searchId);
                    
                    if (foundStudent != null) {
                        System.out.println("Found: " + foundStudent.toString());
                    } else {
                        System.out.println("Student with ID " + searchId + " not found.");
                    }
                    break;
                case 4:
                    if (studentCount > 0) {
                        EnrollmentManager.sortStudentsByName(students, studentCount);
                        System.out.println("Students sorted alphabetically.");
                    } else {
                        System.out.println("No students to sort.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}