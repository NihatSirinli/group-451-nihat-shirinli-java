package classwork_19;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = super.getBalance() * interestRate;
        System.out.println("Начисление процентов (" + (interestRate * 100) + "%):");
        
        super.deposit(interest);
    }
}
