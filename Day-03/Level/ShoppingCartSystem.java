import java.util.UUID;

class Product {
    // Static variable for discount (shared by all products)
    static double discount = 0.0;

    // Final variable for unique product ID
    final String productID;

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Constructor to initialize instance variables using `this`
    public Product(String productName, double price, int quantity) {
        this.productID = UUID.randomUUID().toString(); // Generate a unique ID
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        if (newDiscount < 0 || newDiscount > 100) {
            System.out.println("Invalid discount value. It should be between 0 and 100.");
            return;
        }
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%.");
    }

    // Method to calculate the final price after applying the discount
    public double calculateFinalPrice() {
        double finalPrice = price * quantity * (1 - discount / 100);
        return finalPrice;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + calculateFinalPrice());
    }

    // Static method to validate if an object is an instance of the Product class
    public static void validateObject(Object obj) {
        if (obj instanceof Product) {
            System.out.println("The object is a valid Product instance.");
        } else {
            System.out.println("The object is not a Product instance.");
        }
    }
}

// Test class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Update the discount percentage
        Product.updateDiscount(10.0);

        // Create product instances
        Product product1 = new Product("Laptop", 1000.0, 1);
        Product product2 = new Product("Smartphone", 800.0, 2);

        // Display product details
        product1.displayDetails();
        System.out.println();
        product2.displayDetails();

        // Validate object instances
        Product.validateObject(product1); 
        Product.validateObject("Not a Product"); 
    }
}
