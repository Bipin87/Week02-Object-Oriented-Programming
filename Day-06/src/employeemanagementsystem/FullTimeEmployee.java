package employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department {
    private String departmentName;

    // Constructor
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Overriding calculateSalary
    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Full-time employees have a fixed salary
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