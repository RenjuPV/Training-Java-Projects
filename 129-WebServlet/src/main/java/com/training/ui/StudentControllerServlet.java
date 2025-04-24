package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.training.model.Student;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet(name = "StudentController", urlPatterns = { "/SCS" })
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		@SuppressWarnings("unused")
		String str_rollNumber=request.getParameter("txt_rollNumber");
		String str_name=request.getParameter("txt_name");
		String str_gender=request.getParameter("rad_gender");
		String str_mark1=request.getParameter("txt_mark1");
		String str_mark2=request.getParameter("txt_mark2");
		
		int rollNumber=Integer.parseInt(str_rollNumber);
		String name=str_name;
		String gender=str_gender;
		int mark1=Integer.parseInt(str_mark1);
		
		int mark2=Integer.parseInt(str_mark2);
		
		Student student=new Student(rollNumber, name, gender, mark1, mark2);
		request.setAttribute("stud",student);
		RequestDispatcher dispatcher=request.getRequestDispatcher("StudentOutput.jsp");
		dispatcher.forward(request, response);
		
	}

}
