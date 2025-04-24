package pack1;

public class SalesEmployee extends Manager {
	private String areaName;
	
	

	public SalesEmployee(int id, String name, double basic, int empCount, String areaName) {
		super(id, name, basic, empCount);
		this.areaName = areaName;
	}

	
	public SalesEmployee() {
		
	}


	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	

}
