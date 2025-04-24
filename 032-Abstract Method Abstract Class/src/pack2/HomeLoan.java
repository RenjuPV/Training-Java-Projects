package pack2;

public class HomeLoan extends Loan{
	private String location;

	public HomeLoan(double laoanAmount, int tenure, String customerName, String location) {
		super(laoanAmount, tenure, customerName);
		this.location = location;
	}

	@Override
	public double getInterestRate() {
		
		return 0.11;
	}
	

}
