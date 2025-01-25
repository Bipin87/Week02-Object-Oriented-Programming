package VehicleManagementSystem;
// superclass
public class Vehicle {
    // Attributes
    private int maxSpeed;
    private String model;

    // Constructor
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Display vehicle information
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

}