package onlinefooddeliverysystem;
public class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge = 2.0; // Additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding calculateTotalPrice for NonVegItems (additional charges included)
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity();
    }

    // Implementing applyDiscount from Discountable interface
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // Applying a 10% discount
    }

    // Implementing getDiscountDetails from Discountable interface
    @Override
    public String getDiscountDetails() {
        return "10% discount applied to Non-Veg Item";
    }

}