/**
 * The main entry point for the Student Management System.
 */
public class Main {
    public static void main(String[] args) {
        // Simple test to ensure classes work for Part 1
        Student testStudent = new Student("S001", "Alice");
        Course testCourse = new Course("SE2012", "Java Programming");

        System.out.println("--- Part 1 Initialization ---");
        System.out.println(testStudent.toString());
        System.out.println(testCourse.toString());
    }
}