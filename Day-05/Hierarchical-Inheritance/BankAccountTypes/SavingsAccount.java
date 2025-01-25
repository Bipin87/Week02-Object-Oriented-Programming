package BankAccountTypes;

// Subclass 1 for Bank Account
public class SavingsAccount extends BankAccount{
    // Attribute
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }

    // Method to calculate annual interest
    public void calculateAnnualInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Annual Interest: $" + interest);
    }

}
