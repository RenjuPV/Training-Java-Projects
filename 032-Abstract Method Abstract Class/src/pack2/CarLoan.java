package pack2;

public class CarLoan extends Loan {

	private String regNumber;

	public CarLoan(double laoanAmount, int tenure, String customerName, String regNumber) {
		super(laoanAmount, tenure, customerName);
		this.regNumber = regNumber;
	}

	@Override
	public double getInterestRate() {
		return 0.15;
	}
}
