
public class BankAccount {

	 double balance;

	void deposit(double amt) {
		balance = balance + amt;
	}
	
	

	void withdraw(double amt) {
		balance = balance - amt;
	}

	void printBalance() {
		System.out.println("The balance is " + balance);
	}

	double getBalance() {
		return balance;
	}

}
