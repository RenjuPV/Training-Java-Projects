
public class InsuranceClient {
	
	public static void main(String[] args) {
		
		Insurance insurance=new Insurance();
		insurance.policyId=1;
		insurance.policyHolderName="Renju";
		insurance.premium=1000;
		insurance.years=15;
		insurance.rate=10;
		
		System.out.println("Policy ID :"+insurance.policyId);
		System.out.println("Holder name :"+insurance.policyHolderName);
		System.out.println("Premium :"+insurance.premium);
		System.out.println("No of Years :"+insurance.years);
		System.out.println("Rate of interest :"+insurance.rate);
		System.out.println("Amount to be paid :"+insurance.calculateAmountToBePaid());
		System.out.println("Interest amount :"+insurance.calulateInterest());
		System.out.println("Total insured amount : "+insurance.calulateInsuredAmount());
		
		
		Insurance insurance1=new Insurance();
		insurance1.policyId=2;
		insurance1.policyHolderName="Anju";
		insurance1.premium=5000;
		insurance1.years=10;
		insurance1.rate=6;
		System.out.println("\n*******************\n");
		System.out.println("Policy ID :"+insurance1.policyId);
		System.out.println("Holder name :"+insurance1.policyHolderName);
		System.out.println("Premium :"+insurance1.premium);
		System.out.println("No of Years :"+insurance1.years);
		System.out.println("Rate of interest :"+insurance1.rate);
		System.out.println("Amount to be paid :"+insurance1.calculateAmountToBePaid());
		System.out.println("Interest amount : "+insurance1.calulateInterest());
		System.out.println("Total insured amount : "+insurance1.calulateInsuredAmount());
		
		
		
	}

}
