package EmployeeManagementSystem;
// subclass of Base class
public class Developer extends Employee {
    private String programmingLanguage;
    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
        super(name, id, salary);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);

    }

    
}
