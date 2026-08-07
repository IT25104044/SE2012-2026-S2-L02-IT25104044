package models;

/**
 * Represents a course with a code and a title.
 */
public class Course {
    private String code;
    private String title;

    /**
     * Constructs a new Course.
     * @param code The unique code for the course.
     * @param title The title of the course.
     */
    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    /**
     * Returns the course code.
     * @return the course code.
     */
    public String getCode() {
        return code;
    }

    /**
     * Returns the course title.
     * @return the course title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns a printable string representation of the course.
     * @return string with course details.
     */
    public String toString() {
        return "Course Code: " + code + " | Title: " + title;
    }
}