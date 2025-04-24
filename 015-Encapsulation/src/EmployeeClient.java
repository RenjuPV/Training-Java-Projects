
public class EmployeeClient {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setId(101);
		employee.setName("Renju");
		employee.setBasic(5000.00);
		employee.setCityName("Kochi");
		employee.setGrade('A');
		
		
		employee.getId();
		employee.getName();
		employee.getBasic();
		employee.getCityName();
		employee.getGrade();
		

	}

}
