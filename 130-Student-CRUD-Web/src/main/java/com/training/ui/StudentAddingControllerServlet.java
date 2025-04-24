package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.training.model.Student;
import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;

public class StudentAddingControllerServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str_rollNumber=request.getParameter("txt_rollNumber");
		String str_name=request.getParameter("txt_name");
		String str_gender=request.getParameter("rad_gender");
		String str_mark1=request.getParameter("txt_mark1");
		String str_mark2=request.getParameter("txt_mark2");
		
		int rollNumber=Integer.parseInt(str_rollNumber);
		String name=str_name;
		char gender=str_gender.charAt(0);
		int mark1=Integer.parseInt(str_mark1);
		int mark2=Integer.parseInt(str_mark2);
		
		Student student=new Student(rollNumber, name, gender, mark1, mark2);
		
		StudentService service=new StudentServiceImpl(); 
		boolean status=service.addStudent(student);
		if(status==true) {
			request.setAttribute("add_status", "Student added Successfully");
		}else {
			request.setAttribute("add_status", "Failed to add student");
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("StudentAddResult.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
