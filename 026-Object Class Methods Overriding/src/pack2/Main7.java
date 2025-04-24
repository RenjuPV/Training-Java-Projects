package pack2;

import pack1.Employee;

public class Main7 {

	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "Renju", 1000.00, 'A');
		Employee e2=new Employee(102, "Renju", 1000.00, 'A');
		System.out.println(e1.equals(e2));
		
		Employee e3=new Employee(101, "Anju", 2000.00, 'B');
		System.out.println(e1.equals(e3));
	}

}
