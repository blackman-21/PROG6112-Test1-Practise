public class CollegeCourse {
    private String courseID;
    private int creditHours;
    private String letterGrade;

    // Getters and Setters
    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    // toString method for displaying the course details
    @Override
    public String toString() {
        return "CourseID: " + courseID + ", Credit Hours: " + creditHours + ", Grade: " + letterGrade;
    }
}
