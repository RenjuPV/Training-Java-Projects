package pack1;

public class RegionalManager extends Manager {

	private String regionName;

	public RegionalManager(int id, String name, String gender, double basic, int employeeCount, String regionName) {
		super(id, name, gender, basic, employeeCount);
		this.regionName = regionName;
	}

	public RegionalManager(int id, String name, String gender, int employeeCount, String regionName) {
		super(id, name, gender, employeeCount);
		this.regionName = regionName;
	}

	public RegionalManager(int id, String name, int employeeCount, String regionName) {
		super(id, name, employeeCount);
		this.regionName = regionName;
	}

	public RegionalManager(int id, int employeeCount, String regionName) {
		super(id, employeeCount);
		this.regionName = regionName;
	}

	public RegionalManager(int employeeCount, String regionName) {
		super(employeeCount);
		this.regionName = regionName;
	}

	public RegionalManager(String regionName) {
		super();
		this.regionName = regionName;
	}

	public RegionalManager() {
		super();
	}

	public RegionalManager(int id, String name, double basic, int employeeCount, String regionName) {
		super(id, name, basic, employeeCount);
		this.regionName = regionName;
	}

	public RegionalManager(int id, String name, String gender, double basic, int employeeCount) {
		super(id, name, gender, basic, employeeCount);
	}

}
