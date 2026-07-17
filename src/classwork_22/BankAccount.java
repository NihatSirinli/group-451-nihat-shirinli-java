package classwork_22;

public class BankAccount {
	String owner;
	double balance;
	
	public BankAccount(String owner,double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		} else {
			System.out.println("Something went wrong, try again.");
		}
	}
	void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Something went wrong, try again.");
		}else {
			balance -= amount;
		}
	}
	
	double getBalance() {
		return balance;
	}
	void printStatement() {
		System.out.println("Владелец: " + owner);
		System.out.println("Баланс: " + balance);
	}
}
