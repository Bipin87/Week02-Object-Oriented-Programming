package ecommerceplatform;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Electronics("E101", "Laptop", 50000));
        productList.add(new Clothing("C202", "Jacket", 3000));
        productList.add(new Groceries("G303", "Rice", 1200));

        for (Product product : productList) {
            System.out.println(product);
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}
