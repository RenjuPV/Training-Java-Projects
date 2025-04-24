package com.training.ui;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.EmployeeManagement;

public class Main08 {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeManagement emplManagement = (EmployeeManagement) factory.getBean("empManagementBean");
		System.out.println(emplManagement);

	}

}
