abstract class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public abstract void displayAccountDetails();

    public void deposit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account of " + accountHolder + " with balance ₹" + balance + " and interest rate " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Current Account of " + accountHolder + " with balance ₹" + balance + " and overdraft limit ₹" + overdraftLimit);
    }
}

public class Lab4 {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount("Alice", 5000, 5);
        Account a2 = new CurrentAccount("Bob", 10000, 2000);

        a1.deposit(1000);
        a2.deposit(500);

        a1.displayAccountDetails();
        a2.displayAccountDetails();
    }
}
