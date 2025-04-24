package pack2;

public class EducationalLoan extends Loan{
	private int durationOfStudy;

	public EducationalLoan(double laoanAmount, int tenure, String customerName, int durationOfStudy) {
		super(laoanAmount, tenure, customerName);
		this.durationOfStudy = durationOfStudy;
	}

	@Override
	public double getInterestRate() {
		
		return 0.30;
	}
	

}
