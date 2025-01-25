package BankAccountTypes;
// subclass 3 for Bank Account
public class FixedDepositAccount extends BankAccount {
    // Attributes
    private int depositTerm;
    private double maturityAmount;

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm, double maturityAmount) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
        this.maturityAmount = maturityAmount;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }

    // Method to display maturity details
    public void displayMaturityDetails() {
        System.out.println("Deposit Term: " + depositTerm + " months\n  Maturity Amount: $" + maturityAmount);
    }
    
}
