package bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01; // 1% annual interest
    private static final double OVERDRAFT_LIMIT = 50000; // Overdraft limit

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public boolean applyForLoan(double loanAmount) {
        if (loanAmount <= getBalance() + OVERDRAFT_LIMIT) { // Loan eligibility includes overdraft limit
            System.out.println("Loan of " + loanAmount + " approved for Current Account.");
            return true;
        }
        System.out.println("Loan of " + loanAmount + " denied for Current Account.");
        return false;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + OVERDRAFT_LIMIT; // Loan eligibility includes overdraft limit
    }
}
