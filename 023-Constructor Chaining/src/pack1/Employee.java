package pack1;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private double basic;
	public Employee(int id, String name, String gender, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.basic = basic;
	}
	public Employee(int id) {
		super();
		this.id = id;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	public Employee(int id, String name, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
	}
	public Employee() {
		super();
	}
	
	
	

}
