package RestaurantManagementSystem;
// subclass
public class Waiter extends Person implements Worker{
    // Attribute
    private String section;

    // Constructor
    public Waiter(String name, int id, String section) {
        super(name, id); 
        this.section = section;
    }

    // Implementation of interface method
    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        System.out.println("Section: " + section);
        System.out.println("Duties: Serving meals for customers and taking orders.");
    }
    
}
