import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
            System.out.println(amount + " deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount);
            System.out.println(amount + " withdrawn successfully!");
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void showHistory() {
        System.out.println("\nTransaction History:");
        for (String entry : transactionHistory) {
            System.out.println(entry);
        }
    }
}
