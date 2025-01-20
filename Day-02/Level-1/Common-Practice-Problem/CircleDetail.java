import java.util.Scanner;
class Circle {
    // Declare the attribute
    double radius;
    // Default constructor
    Circle(){
        this.radius=4.25;
    }
    // Parameterized constructor
    Circle(double radius){
        this.radius=radius;

    }
    // Method to get the radius of the circle
    double getRadius(){
        return this.radius;
    }
    // Method to set the radius of the circle
    void setRadius(double radius){
        this.radius=radius;
    }
    // Method to calculate the area of the circle
    double getArea(double radius){
        return 3.14*radius*radius;
    }


    // Method to display the area
    void displayDetails(){
        System.out.println("The radius of the circle is: "+radius);
        System.out.println("The area of the circle is: "+getArea(radius));
    }


}
// Main class
public class CircleDetail{
    // Main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Get the radius from the user
        System.out.println("Enter the radius of the circle");
        double radius=sc.nextDouble();
        // Create an object of the Circle class
        Circle c1=new Circle();
        Circle c2=new Circle(radius);
        c1.displayDetails();
        c2.displayDetails();


        sc.close();


    }
}