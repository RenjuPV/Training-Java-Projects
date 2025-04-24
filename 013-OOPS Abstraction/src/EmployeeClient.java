
public class EmployeeClient {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.basicSalary = 5000.00;
		e1.grade = 'A';
		System.out.println(e1.calculateAllowance() + "," + e1.calculateDeduction() + "," + e1.calculateNetSalary());

		Employee e2 = new Employee();
		e2.basicSalary = 5000.00;
		e2.grade = 'B';
		System.out.println(e2.calculateAllowance() + "," + e2.calculateDeduction() + "," + e2.calculateNetSalary());

		Employee e3 = new Employee();
		e3.basicSalary = 5000.00;
		e3.grade = 'C';
		System.out.println(e3.calculateAllowance() + "," + e3.calculateDeduction() + "," + e3.calculateNetSalary());

	}

}
