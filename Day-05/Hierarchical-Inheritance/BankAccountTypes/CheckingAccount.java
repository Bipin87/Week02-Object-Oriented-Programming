package BankAccountTypes;
// subclass 2 for Bank Account
public class CheckingAccount extends BankAccount{
    // Attribute
    private double withdrawalLimit; 

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds daily limit of $" + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }
}
