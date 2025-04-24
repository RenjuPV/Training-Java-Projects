package com.training.ui;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.training.model.CourseItem;


public class Main15 {

	public static void main(String[] args) {

		try {

			CourseItem courseItem = new CourseItem("HTML", 30, 4500);
			OutputStream os = new FileOutputStream("courseItem.dat");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(courseItem);
			oos.flush();
			oos.close();
			os.close();

		} catch (Throwable e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}

	}

}
