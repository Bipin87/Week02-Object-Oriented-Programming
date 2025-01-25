package VehicleManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create object and display ElectricVehicle
        ElectricVehicle ev = new ElectricVehicle(200, "Ola", 100);
        ev.displayInfo();
        ev.charge();
        System.out.println();

        // Create object and display PetrolVehicle
        PetrolVehicle pv = new PetrolVehicle(180, "TATA CURVE", 60);
        pv.displayInfo();
        pv.refuel();
    }
    
}
