import java.util.*;
class Employee{
   //create three variable name, id and salary
    String name;
    int id;
    double salary;
   //make default constructor Employee
    Employee(String name,int id ,double salary){
      this.name=name;
      this.id=id;
      this.salary=salary;
   }
  //Method to display the detail of employee
   void displayDetail(){
    System.out.println("Employee name :"+name);
    System.out.println("Employee id :"+id);
    System.out.println("Employee salary :"+salary);
 }
  public static void main(String[] args){
  //create an instance or object of the Employee
    Employee employee=new Employee( "Bipin", 39, 100000.0);
    employee.displayDetail();
  }
}