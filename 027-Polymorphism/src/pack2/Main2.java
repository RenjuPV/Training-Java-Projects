package pack2;

import pack1.Accountant;
import pack1.Employee;
import pack1.Manager;
import pack1.SalesEmployee;

public class Main2 {

	private static void processEmployee(Employee e) {
		System.out.println("Net Salary " + e.computeNetSalary(25, 2500));// Runtime Binding,Late binding,Runtime
																			// polymorphism
		System.out.println(e.toString());
	}

	public static void main(String[] args) {

		SalesEmployee s1 = new SalesEmployee(1000.00, 100000.00);
		processEmployee(s1);

		Manager m1 = new Manager(1000.00, 10);
		processEmployee(m1);

		SalesEmployee s2 = new SalesEmployee(2000.00, 400000.00);
		processEmployee(s2);

		Manager m2 = new Manager(5000.00, 4);
		processEmployee(m2);
		
		Accountant a1=new Accountant(5000, true);
		processEmployee(a1);

	}

}
