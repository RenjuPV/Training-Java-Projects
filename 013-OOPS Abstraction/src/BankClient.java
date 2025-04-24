
public class BankClient {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		

		System.out.println(bankAccount.balance);

		bankAccount.deposit(1000.00);
		bankAccount.deposit(200.00);
		bankAccount.deposit(400.00);

		//System.out.println(bankAccount.getBalance());
		bankAccount.printBalance();

		bankAccount.withdraw(500.00);
		bankAccount.printBalance();

	}

}
