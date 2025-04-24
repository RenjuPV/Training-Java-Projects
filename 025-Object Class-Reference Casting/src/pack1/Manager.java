package pack1;

public class Manager extends Employee{
	private int empCount;

	public Manager(int id, String name, double basic, int empCount) {
		super(id, name, basic);
		this.empCount = empCount;
	}

	public Manager() {
		
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	

}
