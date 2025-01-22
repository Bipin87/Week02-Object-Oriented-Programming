import java.util.ArrayList;

class Product {
    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
}

class Customer {
    String name;
    int id;
    ArrayList<Product> products;  // Using ArrayList instead of fixed-size array

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.products = new ArrayList<>();  // Initialize the product list
    }

    public void addProduct(Product product) {
        products.add(product);  // Adding product to the customer's product list
    }

    public void removeProduct(Product product) {
        products.remove(product);  // Removing product from the list
    }
}

class BillGenerator {
    public double computeTotal(Customer customer) {
        double total = 0;
        for (Product product : customer.products) {
            total += product.price * product.quantity;  // Calculate total cost for each product
        }
        return total;
    }
}

public class Grocery {
    public static void main(String[] args) {
        // Creating products
        Product p1 = new Product("Apples", 100.00, 11);
        Product p2 = new Product("Mango", 500.00, 20);

        // Creating customer and adding products
        Customer customer = new Customer("Arun", 101);
        customer.addProduct(p1);
        customer.addProduct(p2);

        // Generating bill
        BillGenerator billGenerator = new BillGenerator();
        double total = billGenerator.computeTotal(customer);
        System.out.println("Total Bill: $" + total);
    }
}
