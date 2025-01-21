package Level;

class BankAccountSystem{
    // Attributes to store the values
    static String bankName;
    static int totalAccounts = 0;
    static String accountHolderName;
    private final int accountNumber;

    // Constructor to initialize the values and increment the total accounts
    BankAccountSystem(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Method to display the total accounts
    static void getTotalAccounts(){
        System.out.println("Total number of Accounts: "+ totalAccounts);
    }
    
    // Method to display the details
    void displayDetails(){
        System.out.println("Account Holder Name: "+ accountHolderName);
        System.out.println("Account Number: "+ accountNumber);
    }

}

public class BankAccount {
    public static void main(String[] args) {
        // Constructor calling
        BankAccountSystem account1 = new BankAccountSystem("Jethalal Gadda", 7709232);
        BankAccountSystem account2 = new BankAccountSystem("Jane Doe", 4375732);

        // Use the instenceOf method to check if the object is an instance of the class
        if (account1 instanceof BankAccountSystem) {
            account1.displayDetails();
        }
        if (account2 instanceof BankAccountSystem) {
            account2.displayDetails();
        }

        // Call the static method to display the total accounts
        BankAccountSystem.getTotalAccounts();
        
    }
    
}
