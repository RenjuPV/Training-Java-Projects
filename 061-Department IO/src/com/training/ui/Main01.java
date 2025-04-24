package com.training.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.training.model.Department;
import com.training.util.ConsoleIO;

public class Main01 {

	public static void main(String[] args) throws IOException {

		String name;
		String managerName;
		System.out.println("Enter Department Name");
		name = ConsoleIO.inputString();

		System.out.println("Enter Manager Name");
		managerName = ConsoleIO.inputString();

		char anymore;
		Department department = new Department(name, managerName);
		do {
			int id;
			String empName;
			String gender;
			String cityName;
			double basic;

			System.out.println("Enter Employee Id");
			id = ConsoleIO.inputInt();

			System.out.println("Enter Employee Name");
			empName = ConsoleIO.inputString();

			System.out.println("Enter Employee gender");
			gender = ConsoleIO.inputString();

			System.out.println("Enter Employee City");
			cityName = ConsoleIO.inputString();

			System.out.println("Enter Employee Basic");
			basic = ConsoleIO.inputDouble();

			department.addEmployee(id, empName, gender, cityName, basic);

			System.out.println("Add More Items ?: ");
			anymore = ConsoleIO.inputChar();
		} while (anymore == 'Y' || anymore == 'y');

		department.printReport();

		try {

			OutputStream os = new FileOutputStream("department.dat");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(department);
			oos.flush();
			oos.close();
			os.close();

		} catch (Throwable e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}

	}

}
