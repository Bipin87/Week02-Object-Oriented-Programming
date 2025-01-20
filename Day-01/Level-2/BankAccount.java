import java.util.*;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory; // To store transaction details

    // Constructor to initialize the account details
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with initial balance: $" + initialBalance);
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + String.format("%.2f", amount));
            transactionHistory.add("Deposited: $" + String.format("%.2f", amount));
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + String.format("%.2f", amount));
            transactionHistory.add("Withdrew: $" + String.format("%.2f", amount));
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
    }

    // Method to display transaction history
    public void displayTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a new bank account
        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine().trim();
        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine().trim();
        System.out.print("Enter initial balance: ");
        double initialBalance;

        // Validate initial balance input
        while (true) {
            try {
                initialBalance = Double.parseDouble(sc.nextLine());
                if (initialBalance < 0) {
                    System.out.println("Initial balance cannot be negative. Please try again:");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a valid number for initial balance:");
            }
        }

        BankAccount account = new BankAccount(accountHolder, accountNumber, initialBalance);

        while (true) {
            // Display menu options
            System.out.println("\nBank Account Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Validate menu choice input
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                continue;
            }

            switch (choice) {
                case 1:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    sc.nextLine(); // Clear newline
                    account.deposit(depositAmount);
                    break;
                case 2:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    sc.nextLine(); // Clear newline
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    // Display balance
                    account.displayBalance();
                    break;
                case 4:
                    // Display transaction history
                    account.displayTransactionHistory();
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close();
                    return;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
