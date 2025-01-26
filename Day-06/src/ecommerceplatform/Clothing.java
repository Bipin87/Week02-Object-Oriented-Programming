package ecommerceplatform;

public class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.12;

    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}