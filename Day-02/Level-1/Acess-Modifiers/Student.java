
class UniversityManagementSystem{
    // Declare the attributes
    public String rollNumber;
    protected String name;
    private double CGPA;

    // Parameterized constructor to initialize the attributes
    public UniversityManagementSystem(String rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    
    // Getter and setter methods
    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }
    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    
}
// Subclass PostgraduateStudent
class PostgraduateStudent extends UniversityManagementSystem {
    // Parameterized constructor to initialize the attributes
    public PostgraduateStudent(String rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    // Public method to display postgraduate student details
    public void displayPostgraduateStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}
// Main class
public class Student{
    public static void main(String[] args) {
        // Create an instance of PostgraduateStudent
        PostgraduateStudent postgraduateStudent = new PostgraduateStudent("PG001", "John Doe",3.5);

        // Call the displayPostgraduateStudentDetails method
        postgraduateStudent.displayPostgraduateStudentDetails();
    }
}