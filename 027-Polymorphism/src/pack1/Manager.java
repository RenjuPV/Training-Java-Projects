package pack1;

public class Manager extends Employee {

	private int empCount;

	public Manager(double basicsalary, int empCount) {
		super(basicsalary);
		this.empCount = empCount;
	}

	@Override
	public double computeNetSalary() {
		double net = super.computeNetSalary();
		net = net + (this.empCount * 2000.0);
		return net;
	}

	@Override
	public double computeNetSalary(int extraHours) {
		double net = super.computeNetSalary(extraHours);
		net = net + (this.empCount * 2000.0);
		return net;

	}

	@Override
	public double computeNetSalary(int extraHours, double perHourPayment) {
		double net = super.computeNetSalary(extraHours, perHourPayment);
		net = net + (this.empCount * 3000.0);
		return net + 5000.00;

	}

	@Override
	public String toString() {
		return "Manager [empCount=" + empCount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + empCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Manager))
			return false;
		Manager other = (Manager) obj;
		if (empCount != other.empCount)
			return false;
		return true;
	}
	
}
