package onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();  // No additional charge for veg items
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;  // 10% discount for veg items
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied to VegItem.";
    }
}


