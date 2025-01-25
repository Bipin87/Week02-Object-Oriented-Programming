package EmployeeManagementSystem;
// subclass of Base class
public class Intern extends Employee {
    private String schoolName;

    // Constructor
    public Intern( String schoolName, String name, int id, double salary){
        this.schoolName = schoolName;
        super(name, id, salary);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Intern School name: " + schoolName);

    }

    
}
