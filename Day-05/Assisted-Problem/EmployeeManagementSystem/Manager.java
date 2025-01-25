package EmployeeManagementSystem;
// subclass of Base class
public class Manager extends Employee{
    private int teamSize;

    public Manager(int teamSize, String name, int id,double salary){
        this.teamSize = teamSize;
        super(name,id,salary);
    }
    @Override
    // Method to display team details
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team size is " + teamSize);
    }
    
}
