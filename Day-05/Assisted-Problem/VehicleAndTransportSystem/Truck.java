package VehicleAndTransportSystem;
// subclass of Base class
public class Truck extends Vehicle{
    // Attribute
    private double loadCapacity;

    // Constructor
    public Truck(int maxSpeed, String fuelType, double loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Truck load capacity: " + loadCapacity + " tons");


    }

}
