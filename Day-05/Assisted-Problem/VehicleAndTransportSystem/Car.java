package VehicleAndTransportSystem;
// subclass of Base class
public class Car extends Vehicle{
    // Attribute
    private int seatCapacity;
    
    // Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Car seat capacity: " + seatCapacity);

    }
}
