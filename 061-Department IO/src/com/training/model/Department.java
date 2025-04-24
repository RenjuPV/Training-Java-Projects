package com.training.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Department implements Serializable {

	private String name;
	private String managerName;
	List<Employee> employees;

	public Department(String name, String managerName) {
		super();
		this.name = name;
		this.managerName = managerName;
		this.employees = new LinkedList<>();
	}

	public Department() {
		super();

	}

	public void addEmployee(int id, String name, String gender, String city, double basic) {
		Employee e = new Employee(id, name, gender, city, basic);
		this.employees.add(e);

	}

	public void printReport() {

		System.out.println("Department Name: " + this.name);
		System.out.println("Manager Name: " + this.managerName);
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		System.out.println(
				"Sl No   ID      Name          Gender             City         Basic Salary          NetSalary");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		int slno = 1;
		double totalNet = 0.0;
		int femaleCount = 0;
		int maleCount = 0;

		for (Employee e : this.employees) {

			System.out.println(slno + "\t" + e.getId() + "\t" + e.getName() + "\t\t" + e.getGender() + "\t\t"
					+ e.getCityName() + "\t\t" + e.getBasic() + "\t\t\t" + e.netSalary());
			slno++;
			totalNet += e.netSalary();
			if (e.getGender().equalsIgnoreCase("Female"))
				femaleCount++;
			else
				maleCount++;

		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");

		System.out.println("Total Net Salary         :" + totalNet);
		System.out.println("Female Count             :" + femaleCount);
		System.out.println("Male count               :" + maleCount);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");

	}

	public boolean isPresent(int id) {
		Employee emp = new Employee();
		emp.setId(id);
		boolean result = this.employees.contains(emp);// check in equals and hash code method
		return result;
	}

	public Employee findByEmployeeId(int id) {
		Employee emp = new Employee();
		emp.setId(id);
		int result = this.employees.indexOf(emp);
		if (result == -1)
			return null;
		else
			return this.employees.get(result);
	}

	public void updateEmployee(int id, String name, String gender, String city, double basic) {
		Employee e = new Employee(id, name, gender, city, basic);
		e.setId(id);
		int indexResult = this.employees.indexOf(e);
		if (indexResult == -1) {
			System.out.println("Employee not found.....");
		} else {

			Employee temp = new Employee(id, name, gender, city, basic);
			this.employees.set(indexResult, temp);
		}

	}

	public void deleteEmployee(int id) {
		Employee e = new Employee();
		e.setId(id);
		this.employees.remove(e);
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", managerName=" + managerName + ", employees=" + employees + "]";
	}
	
	

}
