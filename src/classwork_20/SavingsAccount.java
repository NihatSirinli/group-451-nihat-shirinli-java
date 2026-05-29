package classwork_20;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    
    public void applyInterest() {
        balance += balance * interestRate;
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied: insufficient funds (overdraft not allowed)");
        }
    }
}
