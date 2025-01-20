
class ProductInventory{
    // Instance Variables
    private String ProductName;
    private double Price;

    // Class Variable
    public static int totalProducts;

    ProductInventory(String name, double price){
        this.ProductName = name;
        this.Price = price;
        totalProducts++;
    }

    // Instance Method
    public void displayProductDetails(){
        
        System.out.println("Product Name: " + ProductName);
        System.out.println("Price: $" + Price);
        System.out.println();
        
    }

    // Class Method
    public static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
        System.out.println();
    }



}

public class Product{
    public static void main(String[] args) {
        // Create instances of ProductInventory
        
        ProductInventory product1 = new ProductInventory("Laptop", 1000.0);
        ProductInventory product2 = new ProductInventory("Mobile", 500.0);
        ProductInventory product3 = new ProductInventory("Tablet", 800.0);
        ProductInventory.displayTotalProducts();

        // Display product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

    }
}