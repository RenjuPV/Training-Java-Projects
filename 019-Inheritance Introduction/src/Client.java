
public class Client {

	public static void main(String[] args) {
		
		Manager manager=new Manager();
		manager.setId(101);
		manager.setName("Renju");
		manager.setGender("Female");
		manager.setBasicSalary(1000.00);
		manager.setEmployeeCount(50);
		
		System.out.println("ID :"+manager.getId());
		System.out.println("Name :"+manager.getName());
		System.out.println("Gender :"+manager.getGender());
		System.out.println("Salary :"+manager.getBasicSalary());
		System.out.println("Employee Count :"+manager.getEmployeeCount());
		System.out.println("Net Salary :"+manager.getNetSalary());
		
		
		
		SalesEmployee emp=new SalesEmployee();
		emp.setId(102);
		emp.setName("Anju");
		emp.setGender("Female");
		emp.setBasicSalary(2000.00);
		emp.setSalesAreaName("Tvm");
		
		System.out.println("ID :"+emp.getId());
		System.out.println("Name :"+emp.getName());
		System.out.println("Gender :"+emp.getGender());
		System.out.println("Salary :"+emp.getBasicSalary());
		System.out.println("Sales Area Name :"+emp.getSalesAreaName());
		System.out.println("Net Salary :"+emp.getNetSalary());
		
	
	}

}
