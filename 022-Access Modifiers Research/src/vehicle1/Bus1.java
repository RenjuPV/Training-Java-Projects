package vehicle1;

public class Bus1 {
	
	public static String ownerName;
	private int busNo;// private access
	String color;// default access level
	protected String location;
	public String name;

	public void check1() {
		System.out.println(busNo);
		System.out.println(location);
		System.out.println(name);
		System.out.println(color);
	}

	protected void display() {
		System.out.println("Protected");
	}

	protected Bus1(int busNo, String color, String location, String name) {
		super();
		this.busNo = busNo;
		this.color = color;
		this.location = location;
		this.name = name;
	}

	public Bus1() {

	}

}
