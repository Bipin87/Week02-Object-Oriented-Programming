package ridehailingapplication;

public class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Overriding calculateFare for Car
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    // Implementing getCurrentLocation from GPS interface
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Implementing updateLocation from GPS interface
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}