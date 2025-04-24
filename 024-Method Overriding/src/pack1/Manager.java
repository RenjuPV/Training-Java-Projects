package pack1;

public class Manager extends Employee {
	public int empCount;

	@Override
	public double computeAllowance() {
		double allowance = this.basicSalary * 0.50;
		return allowance;
	}
	
	@Override
	public double getTax() {
		double tax=0.00;
		tax = this.basicSalary * 0.20;
		return tax;
	}

	@Override
	public double computeNetSalary() {
		// double tax=this.basicSalary*0.10;
		// double net=this.basicSalary+allowance-tax;
		// double net=this.basicSalary+allowance-tax;
		double net = super.computeNetSalary();
		net = net + (empCount * 1000.00);
		return net;

	}

}
