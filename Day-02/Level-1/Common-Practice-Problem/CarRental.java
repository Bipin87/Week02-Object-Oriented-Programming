
class CarRentalSystem{
    // Declare the attributes
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Parameterized constructor to initialize the attributes
    public CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total cost based on the rental days and car model
    public double calculateTotalCost() {
        // Define the cost per day for each car model
        double costPerDay = 0;
        if (carModel.equals("Toyota")) {
            costPerDay = 50;
            } 
        else if (carModel.equals("Honda")) {
            costPerDay = 40;
        }

        // Calculate the total cost based on the rental days and cost per day
        double totalCost = costPerDay * rentalDays;
        return totalCost;
    }

}
public class CarRental{
    public static void main(String[] args) {
        CarRentalSystem carRental = new CarRentalSystem("John Doe", "Toyota", 5);
        System.out.println("Total Cost: $" + carRental.calculateTotalCost());
    }
        

}