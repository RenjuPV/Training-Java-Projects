
public class Client3 {
	
	
	public static void test3(Employee e) {
		System.out.println("In test3 Before changes");
		e.display();
		
		e.id=e.id+1;
		e.name="Raman";
		e.age=e.age+1;
		
		System.out.println("In test3 After changes");
		e.display();
		
	}

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.id=1001;
		emp.name="Ram";
		emp.age=25;
		System.out.println("In main before function call");
		emp.display();
		test3(emp);
		System.out.println("In main after function call");
		emp.display();
		
	}

}
