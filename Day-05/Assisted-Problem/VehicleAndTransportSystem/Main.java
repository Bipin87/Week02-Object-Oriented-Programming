package VehicleAndTransportSystem;
// Main class
public class Main {
    public static void main(String[] args) {
        // Create instance object of each subclass
        Vehicle car = new Car(135,"Petrol", 7);
        Vehicle truck = new Truck(115, "Diesel", 12);
        Vehicle motorcycle = new MotorCycle(163, "Petrol", 60);

        // Details store in vehicles
        Vehicle [] vehicles = { car, truck, motorcycle};

        // Display details of all vehicles
        for(Vehicle vehi : vehicles){
            vehi.displayInfo();
            System.out.println();
        }
    }
}
