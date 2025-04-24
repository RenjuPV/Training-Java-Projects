package com.training.ui;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.training.model.CourseItem;

public class Main16 {
	
	public static void main(String[] args) {
		
	try {
			
			InputStream is=new FileInputStream("courseItem.dat");
			ObjectInputStream ois=new ObjectInputStream(is);
			
			CourseItem ci=(CourseItem)ois.readObject();
			System.out.println(ci);
			ois.close();
			is.close();
			
		}catch (Exception e) {
			System.err.println(e);
			System.exit(0);
		}
		
	}

}
