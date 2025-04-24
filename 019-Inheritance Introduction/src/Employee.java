
public class Employee {

	private int id;
	private String name;
	private String gender;
	protected double basicSalary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Employee(int id, String name, String gender, double basicSalary) {

		this.id = id;
		this.name = name;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}

	public Employee() {

	}

	double getNetSalary() {
		double allowance = this.basicSalary * 0.35;
		double tax = this.basicSalary * .010;
		double net = this.basicSalary + allowance - tax;
		return net;

	}

}
