package classwork_16;

public class PiggyBank {
    private double balance;
    private boolean isBroken;

    public PiggyBank() {
        this.balance = 0.0;
        this.isBroken = false;
    }

     void addMoney(double amount) {
        if (!this.isBroken) {
            this.balance += amount;
        }
    }

     double breakOpen() {
        double savedMoney = this.balance;
        this.balance = 0.0;
        this.isBroken = true;
        return savedMoney;
    }

     double getBalance() {
        if (this.isBroken) {
            return 0.0;
        }
        return this.balance;
    }
}