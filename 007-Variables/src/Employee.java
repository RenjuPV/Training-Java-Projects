
public class Employee {
	
	int empId;// Instance variable
	String name;//Instance variable
	
	static int count;//Global Variable

	void calculateAllowance() {
		double allowance;// local variable
		//System.out.println(allowance);//without
		allowance=12.0;
		System.out.println(allowance);
		System.out.println(empId);
	}

	void calculateTax() {
		double tax = 0;// local variable
		System.out.println(tax);
	}

	
	void calculateIncentive(int extraHours) {//parameter variable,scope-inside the function,neednot be initialised
		System.out.println(extraHours);
		
	}
	void test() {
		int x=90;//x has method scope
		if(x>50) {
			System.out.println("Qualified");
			int y=100;//y has block scope
			System.out.println(y);
		}
	}
}
