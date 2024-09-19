import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[10];

        // Loop through each student
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            // Prompt for Student ID
            System.out.print("Enter ID for student #" + (i + 1) + ": ");
            students[i].setStudentID(input.nextInt());

            // Loop through each of the 5 courses
            for (int j = 0; j < 5; j++) {
                CollegeCourse course = new CollegeCourse();

                // Prompt for Course ID
                System.out.print("Enter course ID #" + (j + 1) + " for student #" + (i + 1) + ": ");
                course.setCourseID(input.next());

                // Prompt for credit hours
                System.out.print("Enter credit hours for course #" + (j + 1) + ": ");
                course.setCreditHours(input.nextInt());

                // Prompt for grade and validate input
                String grade;
                do {
                    System.out.print("Enter letter grade (A, B, C, D, or F) for course #" + (j + 1) + ": ");
                    grade = input.next().toUpperCase();
                } while (!grade.matches("[ABCDF]"));

                course.setLetterGrade(grade);
                students[i].setCollegeCourse(course, j);
            }

            System.out.println();
        }

        // Display the entered data
        for (Student student : students) {
            student.displayCourses();
        }
    }
}
