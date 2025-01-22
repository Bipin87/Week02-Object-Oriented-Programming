import java.util.List;
import java.util.ArrayList;

// Product class
class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // toString method
    
    public String toString() {
        return name + " - $" + price;
    }
}

// Customer class
class Customer {
    private String name;
    private String email;

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // toString method
    public String toString() {
        return name + " (" + email + ")";
    }
}

// Order class
class Order {
    private Customer customer;
    private List<Product> products;
    private static int orderCount = 0;
    private int orderId;

    // Constructor
    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.orderId = ++orderCount; // Unique order ID
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Get total price of the order
    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    // toString method for order details
    public String toString() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Order ID: ").append(orderId).append("\n")
                    .append("Customer: ").append(customer).append("\n")
                    .append("Products: \n");
        for (Product product : products) {
            orderDetails.append("- ").append(product).append("\n");
        }
        orderDetails.append("Total Price: $").append(getTotalPrice()).append("\n");
        return orderDetails.toString();
    }
}

// Main class to simulate the e-commerce platform
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 799.99);
        Product product3 = new Product("Headphones", 199.99);

        // Create a customer
        Customer customer = new Customer("Arun Shah", "arunshah345@gmail.com");

        // Create an order for the customer
        Order order = new Order(customer);

        // Add products to the order
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        // Display the order details
        System.out.println(order);
    }
}
