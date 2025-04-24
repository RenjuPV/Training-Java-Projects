package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;

public class StudentDeleteControllerServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int rollNumber = Integer.parseInt(request.getParameter("txt_rollNumber"));
		StudentService service = new StudentServiceImpl();
		
		boolean status = service.deleteStudent(rollNumber);
		
		if(status==true)
			request.setAttribute("delete_status", "Student Deleted Successfully");
		else
			request.setAttribute("delete_status", "Student Deleted Failed");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("StudentDeleteResult.jsp");
		dispatcher.forward(request, response);

	}

}
