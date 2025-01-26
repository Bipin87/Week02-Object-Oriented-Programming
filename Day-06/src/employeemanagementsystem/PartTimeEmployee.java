package employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department {
    // Attributes
    private String departmentName;
    private int hoursWorked;
    private double hourlyRate;

    // Constructor
    public PartTimeEmployee(int employeeId, String name, double hourlyRate) {
        super(employeeId, name, 0); // Base salary is irrelevant for part-time
        this.hourlyRate = hourlyRate;
    }

    // Set hours worked
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Overriding calculateSalary
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // Implementing Department Methods
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return departmentName;
    }
}