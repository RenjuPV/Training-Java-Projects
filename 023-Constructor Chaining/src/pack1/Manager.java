package pack1;

public class Manager extends Employee {
	private int employeeCount;

	public Manager(int id, String name, String gender, double basic, int employeeCount) {
		super(id, name, gender, basic);
		this.employeeCount = employeeCount;
	}

	public Manager(int id, String name, String gender, int employeeCount) {
		super(id, name, gender);
		this.employeeCount = employeeCount;
	}

	public Manager(int id, int employeeCount) {
		super(id);
		this.employeeCount = employeeCount;
	}

	public Manager(int id, String name, int employeeCount) {
		super(id, name);
		this.employeeCount = employeeCount;
	}

	public Manager(int id, String name, double basic, int employeeCount) {
		super(id, name, basic);
		this.employeeCount = employeeCount;
	}

	public Manager(int employeeCount) {
		super();
		this.employeeCount = employeeCount;
	}

	public Manager() {
		super();
	}

	

}
