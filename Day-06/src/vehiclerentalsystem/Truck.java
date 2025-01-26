package vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.10; // 10% of rental rate

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // Additional 20% for heavy load
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Rate: " + (INSURANCE_RATE * 100) + "% of rental rate.";
    }
}