package pack1;

public class Employee {

	private double basicsalary;

	public Employee(double basicsalary) {
		super();
		this.basicsalary = basicsalary;
	}

	public double computeNetSalary() {
		double allowance = this.basicsalary * 0.40;
		double net = this.basicsalary + allowance;
		return net;

	}

	public double computeNetSalary(int extraHours) {
		double allowance = this.basicsalary * 0.40;
		double net = this.basicsalary + allowance + (extraHours * 1000);
		return net;

	}

	public double computeNetSalary(int extraHours, double perHourPayment) {
		double allowance = this.basicsalary * 0.40;
		double net = this.basicsalary + allowance + (extraHours * perHourPayment);
		return net;

	}

	@Override
	public String toString() {
		return "Employee [basicsalary=" + basicsalary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basicsalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(basicsalary) != Double.doubleToLongBits(other.basicsalary))
			return false;
		return true;
	}
	
	

}
