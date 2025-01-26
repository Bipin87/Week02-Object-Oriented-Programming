package ridehailingapplication;

public class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Overriding calculateFare for Auto
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