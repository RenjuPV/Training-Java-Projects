package com.training.ui;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.training.model.Department;

public class Main02 {
	
	public static void main(String[] args) {
		Department department = null;
		try {

			InputStream is = new FileInputStream("department.dat");
			ObjectInputStream ois = new ObjectInputStream(is);

			Department dept = (Department) ois.readObject();
			System.out.println(dept);
			dept.printReport();
			ois.close();
			is.close();

		} catch (Exception e) {
			System.err.println(e);
			System.exit(0);
		}
	}

}
