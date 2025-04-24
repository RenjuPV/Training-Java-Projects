package pack2;

public class RetailBusenessLoan extends BusinessLoan {

	public RetailBusenessLoan(double laoanAmount, int tenure, String customerName, String companyName) {
		super(laoanAmount, tenure, customerName, companyName);
		
	}

	@Override
	public double getInterestRate() {
		
		return 0.35;
	}
	

}
