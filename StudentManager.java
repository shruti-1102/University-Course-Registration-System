import java.util.*;

class StudentManager {
    Map<String, Student> students = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    void addStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        students.put(id, new Student(id, name));
        System.out.println("Student added successfully.");
    }

    Student getStudent(String id) {
        return students.get(id);
    }

    void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to show.");
            return;
        }
        for (Student s : students.values()) {
            s.viewInfo();
        }
    }
}
