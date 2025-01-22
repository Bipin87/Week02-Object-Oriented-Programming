import java.util.ArrayList;

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    // Constructor
    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        this.departments.add(department);
    }
    public ArrayList<Department> getDepartments() {
        return departments;
    }
    

    // Method to remove a department
    public void removeDepartment(String departmentName) {
        departments.removeIf(department -> department.getDepartmentName().equals(departmentName));
    }

    // Method to display all departments and employees
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            System.out.println("  Department: " + department.getDepartmentName());
            department.displayEmployees();
        }
    }

    // Delete all departments and employees
    public void deleteCompany() {
        departments.clear();
        System.out.println("Company and departments are deleted.");
    }
}

class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor
    Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Get department name
    public String getDepartmentName() {
        return departmentName;
    }

    // Add an employee to the department
    public void addEmployee(String employeeName, String employeeId) {
        Employee employee = new Employee(employeeName, employeeId);
        this.employees.add(employee);
    }

    // Display detail of all employees in the department
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("    Employee: " + employee.getEmployeeName() + " (ID: " + employee.getEmployeeId() + ")");
        }
    }
}

class Employee {
    private String employeeName;
    private String employeeId;

    // Constructor
    Employee(String employeeName, String employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    // Get employee name
    public String getEmployeeName() {
        return employeeName;
    }

    // Get employee ID
    public String getEmployeeId() {
        return employeeId;
    }
}

// Main class
public class Composition {
    public static void main(String[] args) {
        Company company = new Company("Capgemini");

        // Add departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Add employees to departments
        Department itDepartment = company.getDepartments().get(0);
        itDepartment.addEmployee("BK Sahu", "E001");
        itDepartment.addEmployee("DK Jaat", "E002");

        Department hrDepartment = company.getDepartments().get(1);
        hrDepartment.addEmployee("Chandra", "E003");

        // Display company details
        company.displayCompanyDetails();

        // Delete company
        company.deleteCompany();
    }
}
