package pack2;

import pack1.Employee;

public class Main1 {

	public static void main(String[] args) {
		
		Employee employee=new Employee(1000);
		System.out.println(employee.computeNetSalary());//static binding,early binding
		System.out.println(employee.computeNetSalary(10));
		System.out.println(employee.computeNetSalary(10,800));
	}

}
