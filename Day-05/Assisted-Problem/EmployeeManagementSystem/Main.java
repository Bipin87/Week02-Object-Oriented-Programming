package EmployeeManagementSystem;
// Main class
public class Main{
    public static void main(String[] args) {
        // Create intance object of subclasses
        Employee manager = new Manager(5, "Ajay Shah", 001, 200000);
        Employee developer = new Developer("Abhinav Kumar", 002, 60000, "Java");
        Employee intern = new Intern("Govt School", "Vipul", 234, 20000);
    
        // store employee details in array
        Employee [] employees = {manager, developer, intern};

        // Display details of each employee
        for(Employee emp : employees){
            emp.displayDetails();
            System.out.println();

        }
    }

    
}
