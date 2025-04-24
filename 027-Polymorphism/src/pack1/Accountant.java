package pack1;

public class Accountant extends Employee {

	boolean isAuditor;

	public Accountant(double basicsalary, boolean isAuditor) {
		super(basicsalary);
		this.isAuditor = isAuditor;
	}

	@Override
	public double computeNetSalary() {

		double net = super.computeNetSalary();
		if (isAuditor)
			net = net + 1000.0;
		return net;
	}

	@Override
	public double computeNetSalary(int extraHours) {

		double net = super.computeNetSalary(extraHours);
		if (isAuditor)
			net = net + 1000.0;
		return net;
	}

	@Override
	public double computeNetSalary(int extraHours, double perHourPayment) {

		double net = super.computeNetSalary(extraHours, perHourPayment);
		if (isAuditor)
			net = net + 1000.0;
		return net;
	}

	@Override
	public String toString() {
		return "Accountant [isAuditor=" + isAuditor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (isAuditor ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Accountant))
			return false;
		Accountant other = (Accountant) obj;
		if (isAuditor != other.isAuditor)
			return false;
		return true;
	}
	
	

}
