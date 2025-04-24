
public class Insurance {
	
	int policyId;
	String policyHolderName;
	int premium;
	int years;
	float rate;
	

	double calculateAmountToBePaid() {
		return premium * years;
	}

	double calulateInterest() {
		return calculateAmountToBePaid() * (rate / 100);
	}

	double calulateInsuredAmount() {
		
		return calculateAmountToBePaid()+calulateInterest();

	}

}
