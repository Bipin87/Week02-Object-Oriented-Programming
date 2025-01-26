package employeemanagementsystem;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Create employees
        FullTimeEmployee ftEmployee = new FullTimeEmployee(101, "Bipul", 50000);
        ftEmployee.assignDepartment("Developer");

        PartTimeEmployee ptEmployee = new PartTimeEmployee(102, "Aryan", 200);
        ptEmployee.assignDepartment("IT");
        ptEmployee.setHoursWorked(120);

        // Store employees in a list
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(ftEmployee);
        employees.add(ptEmployee);

        // Display details for each employee
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Salary: " + employee.calculateSalary());

            // Check if the employee implements the Department interface
            if (employee instanceof Department) {
                System.out.println("Department: " + ((Department) employee).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
