package pack1;

public class Employee {

	public double basicSalary;

	public double computeAllowance() {
		double allowance = this.basicSalary * 0.35;
		return allowance;
	}
	
	public double getTax() {
		double tax=0.00;
		tax = this.basicSalary * 0.10;
		return tax;
	}

	public double computeNetSalary() {
		double allowance = this.basicSalary * 0.35;
		double tax = this.basicSalary * 0.10;
		double net = this.basicSalary + allowance - tax;
		return net;

	}

}
