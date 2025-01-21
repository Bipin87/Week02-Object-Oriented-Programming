class Student {
    // Static variable for university name (shared across all students)
    static String universityName = "Global University";

    // Static variable to track the total number of students
    static int totalStudents = 0;

    // Final variable for unique roll number
    final String rollNumber;

    // Instance variables
    String name;
    String grade;

    // Constructor to initialize instance variables using `this`
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        // Increment total students
        totalStudents++;
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated for " + name + " to: " + grade);
    }

    // Static method to validate if an object is an instance of the Student class
    public static void validateObject(Object obj) {
        if (obj instanceof Student) {
            System.out.println("The object is a valid Student instance.");
        } else {
            System.out.println("The object is not a Student instance.");
        }
    }
}

// Test class
public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Display the university name
        System.out.println("University Name: " + Student.universityName);

        // Create student instances
        Student student1 = new Student("Alice", "S101", "A");
        Student student2 = new Student("Bob", "S102", "B");

        // Display total students
        Student.displayTotalStudents();

        // Display student details
        System.out.println("\nStudent 1 Details:");
        student1.displayStudentDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayStudentDetails();

        // Update student grade
        student1.updateGrade("A+");

        // Validate object instances
        System.out.println("\nValidation:");
        Student.validateObject(student1); // Should be valid
        Student.validateObject("Not a Student"); // Should not be valid
    }
}
