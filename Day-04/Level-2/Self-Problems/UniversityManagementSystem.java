import java.util.List;
import java.util.ArrayList;
import java.util.*;

// Course class
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.professor = null;  // Initially, no professor assigned
        this.students = new ArrayList<>();
    }

    // Assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        students.add(student);
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Student> getStudents() {
        return students;
    }
    public String toString() {
        StringBuilder courseDetails = new StringBuilder();
        courseDetails.append("Course: ").append(courseName).append("\n")
                     .append("Professor: ").append(professor != null ? professor.getName() : "Not Assigned").append("\n")
                     .append("Enrolled Students: \n");

        if (students.isEmpty()) {
            courseDetails.append("  No students enrolled.\n");
        } else {
            for (Student student : students) {
                courseDetails.append("  - ").append(student.getName()).append("\n");
            }
        }
        return courseDetails.toString();
    }
}

// Professor class
class Professor {
    private String name;
    private String department;

    // Constructor
    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    public String toString() {
        return name + " (" + department + ")";
    }
}

// Student class
class Student {
    private String name;
    private int rollNumber;

    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Enroll the student in a course
    public void enrollCourse(Course course) {
        course.enrollStudent(this);
    }
    public String toString() {
        return name + " (Roll Number: " + rollNumber + ")";
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating professors
        Professor professor1 = new Professor("Dr. Ramesh Kumar", "Computer Science");
        Professor professor2 = new Professor("Dr. Sunita Gupta", "Mathematics");

        // Creating courses
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Discrete Mathematics");

        // Assigning professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Creating students
        Student student1 = new Student("Amit Singh", 101);
        Student student2 = new Student("Priya Sharma", 102);
        Student student3 = new Student("Karan Verma", 103);

        // Enrolling students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student3.enrollCourse(course2);

        // Display course details
        System.out.println(course1);
        System.out.println(course2);
    }
}
