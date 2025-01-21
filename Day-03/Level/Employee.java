package Level;

class EmployeeManagementSystem {
    //Attributes of the class
    public static String companyName = "Capgemini";
    public static int totalCounts=0;
    final int employeeID;
    private String employeeName;   
    private String employeeDesignation;

    // Parameterized constructor to initialize attributes
    public EmployeeManagementSystem(int employeeID, String employeeName, String employeeDesignation) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        totalCounts++;
    }

    static void displayTotalEmployees(){
        System.out.println("Total employees: " + totalCounts);
    }

    void displayEmployeesDetails(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Designation: " + employeeDesignation);
        System.out.println();
    }

}

public class Employee {
    public static void main(String[] args) {

        // Create an instance of Manager
        EmployeeManagementSystem employee1 = new EmployeeManagementSystem(01, "K.K. Patel", "Prof");
        EmployeeManagementSystem employee2 = new EmployeeManagementSystem(02, "K.S. Bharat", "Assist.Prof");

        // Use the instenceOf method to check if the object is an instance of the class

        if(employee1 instanceof EmployeeManagementSystem){
            employee1.displayEmployeesDetails();

        }
        if (employee2 instanceof EmployeeManagementSystem){
            employee2.displayEmployeesDetails();
        }
        
        // Method to display total number of employees
        EmployeeManagementSystem.displayTotalEmployees();

        
        
    }
}