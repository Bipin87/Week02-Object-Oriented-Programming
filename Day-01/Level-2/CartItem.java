import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize item details
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the total cost for this item
    double getTotalCost() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return itemName + " - Price: $" + price + ", Quantity: " + quantity + ", Total: $" + String.format("%.2f", getTotalCost());
    }

    // Method to simulate the shopping cart functionality
    static class ShoppingCart {
        private List<CartItem> cartItems;

        // Constructor to initialize the cart
        ShoppingCart() {
            cartItems = new ArrayList<>();
        }

        // Method to add an item to the cart
        void addItem(String itemName, double price, int quantity) {
            if (price <= 0 || quantity <= 0) {
                System.out.println("Invalid price or quantity. Item not added.");
                return;
            }

            // Check if the item already exists in the cart, then update quantity
            for (CartItem item : cartItems) {
                if (item.itemName.equalsIgnoreCase(itemName)) {
                    item.quantity += quantity;
                    System.out.println(itemName + " quantity updated in the cart.");
                    return;
                }
            }

            // Add new item if not already in cart
            CartItem newItem = new CartItem(itemName, price, quantity);
            cartItems.add(newItem);
            System.out.println(itemName + " added to the cart.");
        }

        // Method to remove an item from the cart by its name
        void removeItem(String itemName) {
            if (cartItems.isEmpty()) {
                System.out.println("The cart is empty. Nothing to remove.");
                return;
            }

            boolean itemFound = false;
            Iterator<CartItem> iterator = cartItems.iterator();

            while (iterator.hasNext()) {
                CartItem item = iterator.next();
                if (item.itemName.equalsIgnoreCase(itemName)) {
                    iterator.remove();
                    itemFound = true;
                    System.out.println(itemName + " removed from the cart.");
                    break;
                }
            }

            if (!itemFound) {
                System.out.println(itemName + " not found in the cart.");
            }
        }

        // Method to display the total cost of all items in the cart
        void displayTotalCost() {
            double totalCost = 0;

            for (CartItem item : cartItems) {
                totalCost += item.getTotalCost();
            }

            System.out.println("Total Cost: $" + String.format("%.2f", totalCost));
        }

        // Method to display all items in the cart
        void displayCart() {
            if (cartItems.isEmpty()) {
                System.out.println("The cart is empty.");
            } else {
                System.out.println("Items in the cart:");
                for (CartItem item : cartItems) {
                    System.out.println(item);
                }
            }
        }
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter the name of the item to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    cart.displayTotalCost();
                    break;
                case 5:
                    System.out.println("Exiting the shopping cart. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
