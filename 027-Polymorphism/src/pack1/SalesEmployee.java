package pack1;

public class SalesEmployee extends Employee {
	private double salesAchieved;

	public SalesEmployee(double basicsalary, double salesAchieved) {
		super(basicsalary);
		this.salesAchieved = salesAchieved;
	}

	@Override
	public double computeNetSalary() {
		double net = super.computeNetSalary();
		net = net + (salesAchieved * 0.25);
		return net;
	}

	@Override
	public double computeNetSalary(int extraHours) {

		double net = super.computeNetSalary(extraHours);
		net = net + (salesAchieved * 0.25);
		return net;
	}

	@Override
	public double computeNetSalary(int extraHours, double perHourPayment) {
		double net = super.computeNetSalary(extraHours, perHourPayment);
		net = net + (salesAchieved * 0.25);
		return net;
		
	}

	@Override
	public String toString() {
		return "SalesEmployee [salesAchieved=" + salesAchieved + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(salesAchieved);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof SalesEmployee))
			return false;
		SalesEmployee other = (SalesEmployee) obj;
		if (Double.doubleToLongBits(salesAchieved) != Double.doubleToLongBits(other.salesAchieved))
			return false;
		return true;
	}
	
}
