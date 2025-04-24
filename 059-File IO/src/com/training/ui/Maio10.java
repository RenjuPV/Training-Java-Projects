package com.training.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.training.model.Employee;

public class Maio10 {
	
	public static void main(String[] args) throws IOException {
		

		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		int id;
		String name;
		String gender;
		String cityName;
		double basic;
		
		
		System.out.println("Enter the id : ");
		String str = br.readLine();
		id = Integer.parseInt(str);
		
		
		
		System.out.println("Enter  name : ");
		name = br.readLine();
		

		System.out.println("Enter gender : ");
		gender = br.readLine();
		
		System.out.println("Enter cityname : ");
		cityName = br.readLine();
		

		System.out.println("Enter your salary : ");
		str = br.readLine();
		basic = Double.parseDouble(str);
		
		Employee emp=new Employee(id, name, gender, cityName, basic);
		System.out.println("Employee Details:  \n**********************************");
		System.out.println(emp.toString());
		System.out.println("NET SALARY: "+emp.netSalary());
		
		
	}

}
