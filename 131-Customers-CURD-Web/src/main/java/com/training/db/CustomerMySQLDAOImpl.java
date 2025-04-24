package com.training.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.training.model.Customer;

public class CustomerMySQLDAOImpl implements CustomerMySQLDAO {

	@Override
	public boolean insertCustomer(Connection connection, Customer customer) {
		boolean status = false;
		try {
			PreparedStatement statement = connection.prepareStatement(INSERT_QRY);
			statement.setInt(1, customer.getId());
			statement.setString(2, customer.getName());
			statement.setDouble(3, customer.getBalance());
			statement.setString(4, customer.getEmail());
			statement.setString(5, customer.getPhone());
			int r = statement.executeUpdate();
			if (r > 0)
				status = true;
		} catch (SQLException e) {

			System.err.println(e);
		}
		return status;
	}

	@Override
	public boolean updateCustomer(Connection connection, Customer customer) {
		boolean status = false;
		try {
			PreparedStatement statement = connection.prepareStatement(UPDATE_QRY);

			
			statement.setString(1, customer.getName());
			statement.setDouble(2, customer.getBalance());
			statement.setString(3, customer.getEmail());
			statement.setString(4, customer.getPhone());
			statement.setInt(5, customer.getId());
			int r = statement.executeUpdate();
			if (r > 0)
				status = true;
		} catch (SQLException e) {
			System.err.println(e);
		}

		return status;
	}

	@Override
	public boolean deleteCustomer(Connection connection, Customer customer) {
		boolean status = false;
		try {
			PreparedStatement statement = connection.prepareStatement(DELETE_QRY);
			statement.setInt(1, customer.getId());
			int r = statement.executeUpdate();
			if (r > 0)
				status = true;

		} catch (SQLException e) {
			System.err.println(e);
		}

		return status;
	}

	@Override
	public Customer findCustomerById(Connection connection, int id) {
		Customer customer = null;
		try {
			PreparedStatement statement = connection.prepareStatement(SEARCH_QRY);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				customer = new Customer();
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setBalance(rs.getDouble(3));
				customer.setEmail(rs.getString(4));
				customer.setPhone(rs.getString(5));
				
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		return customer;
	}

	@Override
	public List<Customer> findAllCustomer(Connection connection) {
		List<Customer> allcustomers = new LinkedList<>();
		try {
			PreparedStatement statement = connection.prepareStatement(FINDALL_QRY);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setBalance(rs.getDouble(3));
				customer.setEmail(rs.getString(4));
				customer.setPhone(rs.getString(5));
				allcustomers.add(customer);

			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		return allcustomers;
	}

}
