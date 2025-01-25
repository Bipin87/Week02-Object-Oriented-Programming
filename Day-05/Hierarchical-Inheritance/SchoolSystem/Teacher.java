package SchoolSystem;
// subclass 1
public class Teacher extends Person{
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age); 
        this.subject = subject;
    }

    // Method to display details
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }

}
