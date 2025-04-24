package com.training.service;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;

import com.training.db.ConnectionManager;
import com.training.db.CustomerMySQLDAO;
import com.training.db.CustomerMySQLDAOImpl;
import com.training.model.Customer;

public class CustomerServiceImpl implements CustomerService {


	@Override
	public boolean addCustomer(Customer customer) {
		Connection connection = ConnectionManager.createConnection();
		CustomerMySQLDAO dao = new CustomerMySQLDAOImpl();
		boolean status = dao.insertCustomer(connection, customer);
		ConnectionManager.closeConnection(connection);
		return status;

	}

	@Override
	public Customer searchCustomer(int id) {
		Customer customer;

		Connection connection = ConnectionManager.createConnection();
		CustomerMySQLDAO dao = new CustomerMySQLDAOImpl();
		customer = dao.findCustomerById(connection, id);
		ConnectionManager.closeConnection(connection);
		return customer;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		boolean status = false;
		Connection connection = ConnectionManager.createConnection();
		CustomerMySQLDAO dao = new CustomerMySQLDAOImpl();
		status = dao.updateCustomer(connection, customer);
		ConnectionManager.closeConnection(connection);
		return status;

	}

	@Override
	public List<Customer> getAllCustomers() {
		Connection connection=ConnectionManager.createConnection();
		CustomerMySQLDAO dao = new CustomerMySQLDAOImpl();
		List<Customer>customers=dao.findAllCustomer(connection);
		ConnectionManager.closeConnection(connection);
		return customers;
		
	}

	@Override
	public boolean deleteCustomer(int id) {
		Customer customer=new Customer();
		customer.setId(id);
		Connection connection=ConnectionManager.createConnection();
		CustomerMySQLDAO dao = new CustomerMySQLDAOImpl();
		boolean status = dao.deleteCustomer(connection, customer);
		ConnectionManager.closeConnection(connection);
		return status;

	}

}
