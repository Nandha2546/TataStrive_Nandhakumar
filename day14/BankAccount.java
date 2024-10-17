package day14;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited "+ balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew "+ balance);
        } else {
            System.out.println("Insufficient balance" +" Current Balance: " + balance);
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
}
