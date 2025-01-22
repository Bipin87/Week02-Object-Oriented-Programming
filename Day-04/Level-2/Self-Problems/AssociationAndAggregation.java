import java.util.ArrayList;
import java.util.Arrays;

class School{
    // School class Attributes
    private String schoolName;
    private ArrayList<Student>students;

    // Constructor
    public School(String schoolName){
        this.schoolName=schoolName;
        this.students=new ArrayList<>();
    }

    // Add student in Students arrayList
    public void addStudent(Student newStudent){
        students.add(newStudent);
    }
    
    // Display details of all students in School
    public void displayStudentsDetails(){
        System.out.println("School name: " + schoolName);
        for(Student student : students){
            System.out.println("Student name: " + student.getStudentName());
        }
    }
}
class Student{
    // Student class Attributes
    private String studentName;
    private int studentId;
    private ArrayList<Course>studentEnrollCourses;

    // Constructor 
    public Student(String studentName, int studentId){
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentEnrollCourses = new ArrayList<>();
    }
    // Method to return the student name
    public String getStudentName(){
        return studentName;
    }
    // Enroll the student in a course
    public void studentEnrollCourse(Course course) {
        if (!studentEnrollCourses.contains(course)) {
            studentEnrollCourses.add(course);
            course.addStudent(this); 
        }
    }

    // View the courses the student is enrolled in
    public void viewEnrolledCourses() {
        System.out.println("Student: " + studentName + " (ID: " + studentId + ")");
        System.out.println("  Enrolled Courses:");
        for (Course course : studentEnrollCourses) {
            System.out.println("    - " + course.getCourseName());
        }
    }

}
class Course{
    // Course class Attributes
    private String courseName;
    private ArrayList<Student> studentEnrolledCourse;
    
    // Constructor
    public Course(String courseName){
        this.courseName = courseName;
        this.studentEnrolledCourse = new ArrayList<>();
    }
    // Method to return the course name
    public String getCourseName(){
        return courseName;
    }
    // Add a student to the course
    public void addStudent(Student student) {
        if (!studentEnrolledCourse.contains(student)) {
            studentEnrolledCourse.add(student);
        }
    }

    // Show all students enrolled in the course
    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        System.out.println("  Enrolled Students:");
        for (Student student : studentEnrolledCourse) {
            System.out.println("    - " + student.getStudentName());
        }
    }

    

}
public class AssociationAndAggregation{
    public static void main(String[] args) {
        // Create a school
        School school = new School("Saraswati High School");

        // Create students
        Student student1 = new Student("DK", 101);
        Student student2 = new Student("K.K. Patel", 102);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        // Enroll students in courses
        student1.studentEnrollCourse(course1);
        student1.studentEnrollCourse(course2);
        student2.studentEnrollCourse(course2);
        student2.studentEnrollCourse(course3);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Display school details
        school.displayStudentsDetails();

        // Display student courses
        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        // Display course details
        course1.showEnrolledStudents();
        course2.showEnrolledStudents();
        course3.showEnrolledStudents();
    }
}