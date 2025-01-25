package RestaurantManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create object and display Chef
        Chef chef = new Chef("Aliya", 101, "Red sauce Pasta");
        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        // Create instance and display Waiter
        Waiter waiter = new Waiter("Balveer", 102, "White sauce Pasta");
        waiter.displayInfo();
        waiter.performDuties();
    }
    
}
