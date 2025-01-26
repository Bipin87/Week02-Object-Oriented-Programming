package vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.03; // 3% of rental rate

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Rate: " + (INSURANCE_RATE * 100) + "% of rental rate.";
    }
}