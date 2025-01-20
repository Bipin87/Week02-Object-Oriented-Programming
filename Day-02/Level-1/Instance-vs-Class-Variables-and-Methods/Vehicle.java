
class VehicleRegistration{
    // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variable
    static double registrationFee = 100.0;

    //Parameterize Constructor
    VehicleRegistration(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method to display vehicle details
    void displayVehicleDetails(){
        System.out.println();
        System.out.println("Registration fee: " + registrationFee);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }

    // Class Method to update registration fee
    static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
    }

}
public class Vehicle{
    public static void main(String[] args) {
        // Create an instance of VehicleRegistration
        VehicleRegistration vehicle1 = new VehicleRegistration("John Doe", "Car");
        vehicle1.displayVehicleDetails();

        // Update the registration fee
        VehicleRegistration.updateRegistrationFee(200.0);
        System.out.println("Updated registration fee: ");
        vehicle1.displayVehicleDetails();
    }
}