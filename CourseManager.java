import java.util.*;

class CourseManager {
    Map<String, Course> courses = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    void addCourse() {
        System.out.print("Enter course code: ");
        String code = sc.nextLine();
        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        courses.put(code, new Course(code, name));
        System.out.println("Course added successfully.");
    }

    Course getCourse(String code) {
        return courses.get(code);
    }

    void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses to show.");
            return;
        }
        for (Course c : courses.values()) {
            c.viewInfo();
        }
    }
}
