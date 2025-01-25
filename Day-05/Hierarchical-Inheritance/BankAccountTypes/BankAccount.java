package BankAccountTypes;

// Base class
public class BankAccount {
    // Attributes
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + "\n New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + "\n Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Display basic account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + "\n Balance: $" + balance);
    }   
    
}