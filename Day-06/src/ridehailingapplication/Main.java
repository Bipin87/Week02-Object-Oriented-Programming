package ridehailingapplication;

public class Main {
    // Method to calculate fare for different vehicle types dynamically
    public static void calculateFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Calculated Fare for " + vehicle.getClass().getSimpleName() + ": " + vehicle.calculateFare(distance));

        // If the vehicle implements GPS interface, display current location
        if (vehicle instanceof GPS) {
            GPS gpsVehicle = (GPS) vehicle;
            System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
        }
    }

    public static void main(String[] args) {
        // Create instances of Car, Bike, and Auto
        Vehicle car = new Car("V123", "Abhinav", 15.0, "Downtown");
        Vehicle bike = new Bike("V124", "Pranav", 10.0, "City Center");
        Vehicle auto = new Auto("V125", "Abhilash", 12.0, "Airport");

        // Calculate fare for each vehicle type
        System.out.println("Fare Calculation for Car:");
        calculateFare(car, 10.0);  // 10 km
        System.out.println();

        System.out.println("Fare Calculation for Bike:");
        calculateFare(bike, 5.0);  // 5 km
        System.out.println();

        System.out.println("Fare Calculation for Auto:");
        calculateFare(auto, 8.0);  // 8 km
        System.out.println();
    }
}
