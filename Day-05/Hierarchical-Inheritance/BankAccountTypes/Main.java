package BankAccountTypes;

public class Main {
    public static void main(String[] args) {
        // Creating objects for each account type
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA12345", 2000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD12345", 10000.0, 12, 11000.0);

        // Display account types 
        savings.displayAccountInfo();
        savings.displayAccountType();
        savings.calculateAnnualInterest();

        System.out.println();

        checking.displayAccountInfo();
        checking.displayAccountType();
        checking.withdraw(1200.0); 
        checking.withdraw(500.0); 
         System.out.println();

        fixedDeposit.displayAccountInfo();
        fixedDeposit.displayAccountType();
        fixedDeposit.displayMaturityDetails();
    }
    
}
