package pack2;

public class WholeSaleBusinessLoan extends BusinessLoan{

	public WholeSaleBusinessLoan(double laoanAmount, int tenure, String customerName, String companyName) {
		super(laoanAmount, tenure, customerName, companyName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getInterestRate() {
		
		return 0.40;
	}
	

}
