package bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA101", "Aarav", 20000);
        BankAccount current = new CurrentAccount("CA202", "Jayveer", 50000);

        BankAccount[] accounts = {savings, current};

        for (BankAccount account : accounts) {
            System.out.println(account);
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
                loanableAccount.applyForLoan(30000); // Sample loan application
            }

            System.out.println();
        }
    }
}
