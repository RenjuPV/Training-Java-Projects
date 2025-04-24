package pack2;

public class PersonalLoan extends Loan{
	private double monthlySalary;

	public PersonalLoan(double laoanAmount, int tenure, String customerName, double monthlySalary) {
		super(laoanAmount, tenure, customerName);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double getInterestRate() {
		
		return 0.21;
	}
	

}
