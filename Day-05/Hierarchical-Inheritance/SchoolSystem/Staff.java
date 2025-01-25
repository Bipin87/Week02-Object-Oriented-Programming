package SchoolSystem;
// subclass 3
public class Staff extends Person{
    // Attribute
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age); 
        this.department = department;
    }

    // Method to display details
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
    
}
