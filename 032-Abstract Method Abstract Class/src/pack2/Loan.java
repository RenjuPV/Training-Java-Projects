package pack2;

public abstract class Loan {
	
	private double laoanAmount;
	private int tenure;
	private String customerName;
	
	public Loan(double laoanAmount, int tenure, String customerName) {
		super();
		this.laoanAmount = laoanAmount;
		this.tenure = tenure;
		this.customerName = customerName;
	}
	
	public abstract double getInterestRate() ;
	

}
