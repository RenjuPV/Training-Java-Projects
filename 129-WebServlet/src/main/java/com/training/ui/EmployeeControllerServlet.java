package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.training.model.Employee;
import com.training.model.Student;

/**
 * Servlet implementation class EmployeeControllerServlet
 */
@WebServlet(name = "EmployeeController", urlPatterns = { "/ECS" })
public class EmployeeControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str_id=request.getParameter("txt_id");
		String str_name=request.getParameter("txt_name");
		String str_gender=request.getParameter("rad_gender");
		String str_basicSalary=request.getParameter("txt_basicSalary");
	
		
		int id=Integer.parseInt(str_id);
		String name=str_name;
		String gender=str_gender;
		int basicSalary=Integer.parseInt(str_basicSalary);
		
		
		Employee employee=new Employee(id, name, gender, basicSalary);
		request.setAttribute("emp",employee);
		RequestDispatcher dispatcher=request.getRequestDispatcher("EmployeeOutput.jsp");
		dispatcher.forward(request, response);
	}

}
