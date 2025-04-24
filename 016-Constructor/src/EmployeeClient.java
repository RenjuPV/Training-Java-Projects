
public class EmployeeClient {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		employee.setId(1);
		employee.setName("Renju");
		employee.setCityName("Kochi");
		employee.setBasic(10000.00);;
		employee.setGrade('A');
		
		System.out.println("ID :"+employee.getId());
		System.out.println("Name :"+employee.getName());
		System.out.println("City :"+employee.getCityName());
		System.out.println("Basic :"+employee.getBasic());
		System.out.println("Grade :"+employee.getGrade());
		
		
		Employee employee1=new Employee(2, "Anju", "TVM", 15000, 'B');
		System.out.println("ID :"+employee1.getId());
		System.out.println("Name :"+employee1.getName());
		System.out.println("City :"+employee1.getCityName());
		System.out.println("Basic :"+employee1.getBasic());
		System.out.println("Grade :"+employee1.getGrade());
		
		
		
		

	}

}
