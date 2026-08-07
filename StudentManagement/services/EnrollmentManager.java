package services;

import models.Student;

/**
 * Provides utility methods for managing student data, such as searching and sorting.
 */
public class EnrollmentManager {

    /**
     * Finds a student by ID from the array using linear search.
     * @param list The array of students to search through.
     * @param count The current number of students in the array.
     * @param id The student ID to search for.
     * @return The Student object if found, or null if not found.
     */
    public static Student searchStudentById(Student[] list, int count, String id) {
        for (int i = 0; i < count; i++) {
            if (list[i].getId().equalsIgnoreCase(id)) {
                return list[i];
            }
        }
        return null; 
    }

    /**
     * Sorts students alphabetically by name using bubble sort.
     * @param list The array of students to sort.
     * @param count The current number of students in the array.
     */
    public static void sortStudentsByName(Student[] list, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (list[j].getName().compareToIgnoreCase(list[j + 1].getName()) > 0) {
                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}