package classwork_19;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: +" + amount + " руб.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма снятия должна быть больше нуля.");
            return;
        }
        
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Снятие: -" + amount + " руб.");
        } else {
            System.out.println("Ошибка: недостаточно средств для снятия " + amount + " руб.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}