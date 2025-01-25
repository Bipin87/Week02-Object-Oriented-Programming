package OnlineRetailOrderManagement;

public class Main {
    public static void main(String[] args) {
        // Creating the instance of class
        Order order = new Order("ORD123", "10-01-2025");
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "16-01-2025", "TRK456");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "18-01-2025", "TRK789", "23-01-2025");

        // Display details and status for each order
        System.out.println("   Base Order    ");
        order.displayOrderDetails();
        System.out.println(order.getOrderStatus());
        System.out.println();

        System.out.println("    Shipped Order    ");
        shippedOrder.displayOrderDetails();
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println();

        System.out.println("    Delivered Order    ");
        deliveredOrder.displayOrderDetails();
        System.out.println(deliveredOrder.getOrderStatus());
    }
    
}
