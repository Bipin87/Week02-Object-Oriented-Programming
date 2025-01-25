package EmployeeManagementSystem;
// Base class
public class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display the employee details
    public void displayDetails(){
        System.out.println("Employee Name: " + name + "\nEmployee id: " + id + "\nEmployee salary: " + salary);
    }
    
}
