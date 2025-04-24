
public class EmployeeClient {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.basicSalary=1000.00;
		System.out.println(emp.getNetSalary());
		System.out.println(emp.getNetSalary(300));
		System.out.println(emp.getNetSalary(3));
		System.out.println(emp.getNetSalary(false, 10));
		System.out.println(emp.getNetSalary(true, 10));
		
		

	}

}
