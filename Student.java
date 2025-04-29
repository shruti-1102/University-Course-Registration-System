import java.util.*;

class Student {
    String id, name;
    List<Course> registeredCourses = new ArrayList<>();

    Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    void registerCourse(Course course) {
        if (!registeredCourses.contains(course)) {
            registeredCourses.add(course);
            System.out.println("Registered for course: " + course.courseCode);
        } else {
            System.out.println("Already registered for this course.");
        }
    }

    void viewInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Courses: ");
        for (Course c : registeredCourses) {
            System.out.println("- " + c.courseCode + ": " + c.courseName);
        }
    }
}