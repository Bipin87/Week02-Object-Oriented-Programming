package VehicleAndTransportSystem;
// Base class
public class Vehicle {
    // Attributes
    private int maxSpeed;
    private String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display the vehicle details
    public void displayInfo(){
        System.out.println("Vehicle maximum speed: " + maxSpeed + " km/h"+"\n Vehicle fuel type: " + fuelType);

    }
    
}
