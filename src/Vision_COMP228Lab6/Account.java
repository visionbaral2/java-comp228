package Vision_COMP228Lab6;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        }
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.printf("%s deposited: %.2f | New Balance: %.2f%n",
                Thread.currentThread().getName(), amount, balance);
    }

    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("%s withdrew: %.2f | New Balance: %.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        } else {
            System.out.printf("%s tried to withdraw: %.2f | Insufficient Funds! Balance: %.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
