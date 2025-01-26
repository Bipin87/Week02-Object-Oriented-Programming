package onlinefooddeliverysystem;

public class Main {
    // Method to process different types of food items
    public static void processOrder(FoodItem foodItem) {
        System.out.println(foodItem.getItemDetails());
        System.out.println("Total Price: " + foodItem.calculateTotalPrice());

        // If the item is Discountable, apply the discount
        if (foodItem instanceof Discountable) {
            Discountable discountableItem = (Discountable) foodItem;
            System.out.println(discountableItem.getDiscountDetails());
            System.out.println("Discounted Price: " + (foodItem.calculateTotalPrice() - discountableItem.applyDiscount()));
        }
    }

    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Veg Pizza", 10.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Pizza", 12.0, 1);

        System.out.println("Processing Veg Item Order:");
        processOrder(vegItem);

        System.out.println("\nProcessing Non-Veg Item Order:");
        processOrder(nonVegItem);
    }
}
