package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Student;

public class Main04 {

	public static void main(String[] args) {
		
		Student student1;
		Student student2;
		Student student3;
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		student1=(Student)context.getBean("studentBean");
		student1.setRollNumber(10);
		System.out.println("student 1 -Roll Number: "+student1.getRollNumber());
		System.out.println(student1);
		
		student2=(Student)context.getBean("studentBean");
		student2.setRollNumber(20);
		System.out.println("student 2 -Roll Number: "+student2.getRollNumber());
		System.out.println(student2);
		
		student3=(Student)context.getBean("studentBean");
		student3.setRollNumber(30);
		System.out.println("student 2 -Roll Number: "+student2.getRollNumber());
		System.out.println(student3);
		

	}

}
