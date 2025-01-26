package vehiclerentalsystem;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car("C101", 1500));
        vehicleList.add(new Bike("B202", 500));
        vehicleList.add(new Truck("T303", 3000));

        int rentalDays = 5;

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0.0;

            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
                System.out.println("Insurance Cost: " + insuranceCost);
            }
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println();
        }
    }
}
