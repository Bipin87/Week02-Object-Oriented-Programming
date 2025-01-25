package RestaurantManagementSystem;
// subclass
public class Chef extends Person implements Worker{
    // Attribute
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implementation of interface method
    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Preparing meals and manage the kitchen.");
    }
    
}
