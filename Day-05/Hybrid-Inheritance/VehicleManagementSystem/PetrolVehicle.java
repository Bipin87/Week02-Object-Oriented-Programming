package VehicleManagementSystem;
// subclass
public class PetrolVehicle extends Vehicle implements Refuelable{
    // Attribute
    private int fuelCapacity;

    // Constructor
    public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model); 
        this.fuelCapacity = fuelCapacity;
    }

    // Implementation of interface method
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
