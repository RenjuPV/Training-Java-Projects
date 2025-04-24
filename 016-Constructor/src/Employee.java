
public class Employee {
	private int id;
	private String name;
	private String cityName;
	private double basic;
	private char grade;

	Employee(int id, String name, String cityName, double basic, char grade) {

		setId(id);
		setName(name);
		setCityName(cityName);
		setBasic(basic);
		setGrade(grade);
	}

	Employee() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id<0) {
			System.out.println("Invalid Roll Number");
			return;
		}
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name==null) {
			System.out.println("Name cant be Null");
			return;
		}
		this.name = name;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		if(cityName==null) {
			System.out.println("City name can not be null");
			return;
		}
		this.cityName = cityName;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		if(basic<0) {
			System.out.println("Invalid Basic pay");
			return;
		}
		this.basic = basic;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		if(grade!='A' & grade!='B' & grade!='C'  & grade !='D') {
			System.out.println("Invalid grade");
			return;
		}
		this.grade = grade;
	}

}
