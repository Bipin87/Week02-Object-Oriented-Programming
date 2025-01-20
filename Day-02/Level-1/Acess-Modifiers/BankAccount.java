
class BankAccountManagement{
    // Declare the attributes
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Parameterized constructor to initialize the attributes
    public BankAccountManagement(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access the balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
// Subclass SavingsAccount
class SavingsAccount extends BankAccountManagement {
    // Constructor to initialize the attributes
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    // Method to access accountNumber and accountHolder
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}
public class BankAccount{
    public static void main(String[] args) {

        // Create an object of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("1234567890", "John Doe",1000.0);
        savingsAccount.displayAccountInfo();
        System.out.println("Current Balance after deposit: " + savingsAccount.getBalance());
        System.out.println();


        // Access and modify balance using public methods
        savingsAccount.setBalance(2000.0);
        System.out.println("Current Balance after modification: " + savingsAccount.getBalance());
    
    }
}