package VehicleAndTransportSystem;
// subclass of MotorCycle
public class MotorCycle extends Vehicle{
    // Attribute
    private int minSpeed;

    // Constructor
    public MotorCycle(int maxSpeed, String fuelType, int minSpeed){
        super(maxSpeed, fuelType);
        this.minSpeed = minSpeed;
    } 

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("MotorCycle minimum speed: " + minSpeed + " km/h");

    }

}
