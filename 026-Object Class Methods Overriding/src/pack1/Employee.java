package pack1;

public class Employee {

	private int id;
	private String name;
	private double basicSalary;
	private char grade;

	public Employee(int id, String name, double basicSalary, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.grade = grade;
	}

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

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public double calculateAllowance() {
		return this.basicSalary * 0.40;
	}

	public double calculateTax() {
		return this.basicSalary * 0.10;
	}

	public double computeNetSalary() {
		return this.basicSalary + this.calculateAllowance() - this.calculateTax();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	

}
