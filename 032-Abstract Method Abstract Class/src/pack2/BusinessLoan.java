package pack2;

public abstract class BusinessLoan extends Loan{
	
	private String companyName;

	public BusinessLoan(double laoanAmount, int tenure, String customerName, String companyName) {
		super(laoanAmount, tenure, customerName);
		this.companyName = companyName;
	}
	
	

}
