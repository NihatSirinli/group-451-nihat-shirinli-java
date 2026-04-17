package classwork_10;

public class BankAccount {
	String owner;
	int balance;
	double amount;
	
	void deposit(double amount) {
		this.amount += amount;
	}
	
	double withdraw(double amount) {
		if(balance < amount) {
			System.out.println("Error");
			return 0;
		}else {
			balance -= amount;
			return amount;
		}
	}

}
