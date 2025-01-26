package bankingsystem;

public interface Loanable {
    boolean applyForLoan(double loanAmount);

    double calculateLoanEligibility();
}
