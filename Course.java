class Course {
    String courseCode, courseName;

    Course(String code, String name) {
        this.courseCode = code;
        this.courseName = name;
    }

    void viewInfo() {
        System.out.println("Code: " + courseCode + ", Name: " + courseName);
    }
}