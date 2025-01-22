import java.util.ArrayList;
import java.util.List;

// Bank Class
class Bank {
	// Attributes
    private String bankName;
    private List<Customer> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(String customerName, String accountNumber, double initialBalance) {
        Customer customer = new Customer(customerName, accountNumber, initialBalance, this);
        customers.add(customer);
        System.out.println("Account opened for " + customerName + " with account number " + accountNumber);
    }

    // Method to list all customers
    public void listCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println(customer.getCustomerName() + " - Account Number: " + customer.getAccountNumber());
        }
    }

    public String getBankName() {
        return bankName;
    }
}

// Customer Class
class Customer {
    private String customerName;
    private String accountNumber;
    private double balance;
    private Bank bank;

    // Constructor
    public Customer(String customerName, String accountNumber, double balance, Bank bank) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    // Method to view balance
    public void viewBalance() {
        System.out.println("Balance for account " + accountNumber + ": " + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// Main Class
public class Association {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Indian Bank");

        // Open accounts for customers
        bank.openAccount("John Don", "123456", 1000.0);
        bank.openAccount("Stive Smith", "654321", 2000.0);

        // List customers
        bank.listCustomers();

        // Access a customer's functionality
        Customer john = new Customer("John Don", "123456", 1000.0, bank);
        john.viewBalance();
        john.deposit(500.0);
        john.withdraw(300.0);
    }
}
