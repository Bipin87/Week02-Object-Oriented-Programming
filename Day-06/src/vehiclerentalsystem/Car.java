package vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.05; // 5% of rental rate

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
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
        return "Car Insurance Rate: " + (INSURANCE_RATE * 100) + "% of rental rate.";
    }
}

