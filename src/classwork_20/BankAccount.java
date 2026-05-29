package classwork_20;

public class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in base account");
        }
    }

    public double getBalance() {
        return balance;
    }
}
