
public class Employee {

	double basicSalary;

	double getNetSalary() {
		double allowance = this.basicSalary * 0.30;
		double tax = this.basicSalary * 0.10;
		double net = basicSalary + allowance - tax;
		return net;

	}

	double getNetSalary(double incentive) {
		double allowance = this.basicSalary * 0.30;
		double tax = this.basicSalary * 0.10;
		double net = basicSalary + allowance - tax + incentive;
		return net;

	}

	double getNetSalary(int extraHours) {
		double allowance = this.basicSalary * 0.30;
		double tax = this.basicSalary * 0.10;
		double net = basicSalary + allowance - tax + (1000 * extraHours);
		return net;

	}
	double getNetSalary(boolean isPermanent,int extraHours) {
		double allowance = this.basicSalary * 0.30;
		double tax = this.basicSalary * 0.10;
		double net;
		if(isPermanent) {
			net=basicSalary + allowance - tax + (2000 * extraHours);
		}else {
			net=basicSalary + allowance - tax + (500 * extraHours);
		}
		
		return net;

	}
}
