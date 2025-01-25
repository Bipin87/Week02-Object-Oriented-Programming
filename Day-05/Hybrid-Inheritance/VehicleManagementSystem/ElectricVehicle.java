package VehicleManagementSystem;
// subclass
public class ElectricVehicle extends Vehicle{
    // Attribute
    private int batteryCapacity;

    // Constructor
    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model); 
        this.batteryCapacity = batteryCapacity;
    }

    // Charge method specific to electric vehicles
    public void charge() {
        System.out.println("Charging the electric vehicle...");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
