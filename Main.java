import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StudentManager studentManager = new StudentManager();
    static CourseManager courseManager = new CourseManager();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- University Course Registration System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Register Student for Course");
            System.out.println("4. View Student Info");
            System.out.println("5. View Course Info");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> studentManager.addStudent();
                case 2 -> courseManager.addCourse();
                case 3 -> {
                    System.out.print("Enter student ID: ");
                    String studentId = sc.nextLine();
                    System.out.print("Enter course code: ");
                    String courseCode = sc.nextLine();
                    Student student = studentManager.getStudent(studentId);
                    Course course = courseManager.getCourse(courseCode);
                    if (student != null && course != null) {
                        student.registerCourse(course);
                    } else {
                        System.out.println("Student or course not found.");
                    }
                }
                case 4 -> studentManager.viewStudents();
                case 5 -> courseManager.viewCourses();
                case 6 -> System.out.println("Exiting system.");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
    }
}
