package models;

/**
 * Represents a student with an ID and a name.
 */
public class Student {
    private String id;
    private String name;

    /**
     * Constructs a new Student.
     * @param id The unique ID of the student.
     * @param name The full name of the student.
     */
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the student ID.
     * @return the student ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the student name.
     * @return the student name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a printable string representation of the student.
     * @return string with student details.
     */
    public String toString() {
        return "Student ID: " + id + " | Name: " + name;
    }
}