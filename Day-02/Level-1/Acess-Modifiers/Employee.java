
class EmployeeRecords {
    // Declare attributes
    public int employeeID;
    protected String department;
    private double salary;

    // Parameterized constructor to initialize attributes
    public EmployeeRecords(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }
    // Public method to get salary
    public double getSalary() {
        return salary;
    }

}
// Subclass Manager to access employeeID and department
class Manager extends EmployeeRecords {
    // Access employeeID and department using public and protected access specifiers
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Public method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println();
    }
}

public class Employee{
    public static void main(String[] args) {
        // Create an instance of Manager
        Manager manager = new Manager(123, "IT", 12345.67);
        manager.displayDetails();
        manager.modifySalary(15000.00);
        System.out.println("After salary modification: ");
        manager.displayDetails();
    }
}