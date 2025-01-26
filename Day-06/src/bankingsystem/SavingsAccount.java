package bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public boolean applyForLoan(double loanAmount) {
        if (loanAmount <= getBalance() * 2) { // Loan limit is twice the balance
            System.out.println("Loan of " + loanAmount + " approved for Savings Account.");
            return true;
        }
        System.out.println("Loan of " + loanAmount + " denied for Savings Account.");
        return false;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Loan eligibility is twice the balance
    }
}