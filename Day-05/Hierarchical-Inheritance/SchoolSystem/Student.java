package SchoolSystem;
// subclass 2
public class Student extends Person{
    // Attribute
    private int grade;

    // Constructor
    public Student(String name, int age, int grade) {
        super(name, age); 
        this.grade = grade;
    }

    // Method to display details
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
    
}
