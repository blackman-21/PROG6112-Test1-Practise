public class Student {
    private int studentID;
    private CollegeCourse[] courses;

    // Constructor to initialize the CollegeCourse array
    public Student() {
        courses = new CollegeCourse[5];
    }

    // Getters and Setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    // Get one CollegeCourse object by its index
    public CollegeCourse getCollegeCourse(int index) {
        if (index >= 0 && index < courses.length) {
            return courses[index];
        } else {
            return null;
        }
    }

    // Set one CollegeCourse object by its index
    public void setCollegeCourse(CollegeCourse course, int index) {
        if (index >= 0 && index < courses.length) {
            courses[index] = course;
        }
    }

    // Display the student's courses
    public void displayCourses() {
        System.out.println("Student ID: " + studentID);
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course #" + (i + 1) + ": " + courses[i]);
        }
    }
}
