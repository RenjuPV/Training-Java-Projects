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

public class FetchCustomerForUpdateControllerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str_id=request.getParameter("txt_id");
		int id=Integer.parseInt(str_id);
		
		CustomerService service=new CustomerServiceImpl();
		Customer customer=service.searchCustomer(id);
		request.setAttribute("cust", customer);
		RequestDispatcher dispatcher=request.getRequestDispatcher("EditCustomer.jsp");
		dispatcher.forward(request, response);
	}

}
