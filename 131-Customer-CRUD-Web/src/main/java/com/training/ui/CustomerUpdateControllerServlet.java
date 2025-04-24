package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;

public class CustomerUpdateControllerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str_id=request.getParameter("txt_id");
		String str_name=request.getParameter("txt_name");
		String str_balance=request.getParameter("txt_balance");
		String str_email=request.getParameter("txt_email");
		String str_phone=request.getParameter("txt_phone");
		
		int id=Integer.parseInt(str_id);
		String name=str_name;
		double balance=Double.parseDouble(str_balance);
		String phone=str_phone;
		String email=str_email;
		
		Customer customer=new Customer(id, name, balance, email, phone);
		
		
		CustomerService service=new CustomerServiceImpl();
		boolean status=service.updateCustomer(customer);
		if(status==true) {
			request.setAttribute("update_status", "Updated Successfully");
		}else {
			request.setAttribute("update_status", "Failed to update Customer");
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("CustomerUpdateResult.jsp");
		dispatcher.forward(request, response);
	}

}
