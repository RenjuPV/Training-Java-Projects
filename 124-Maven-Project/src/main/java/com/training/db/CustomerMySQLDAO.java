package com.training.db;

import java.sql.Connection;
import java.util.List;

import com.training.model.Customer;

public interface CustomerMySQLDAO {
	
	String INSERT_QRY="insert into customer values(?,?,?,?,?)";
	String UPDATE_QRY="update customer set name=?, balance=?,email=?,phone=? where id=?";
	String DELETE_QRY="delete from customer where id=?";
	String SEARCH_QRY="select * from customer where id=?";
	String FINDALL_QRY="Select * from customer";
	
	boolean insertCustomer(Connection connection,Customer customer);
	boolean updateCustomer(Connection connection,Customer customer);
	boolean deleteCustomer(Connection connection,Customer customer);
	Customer findCustomerById(Connection connection,int id);
	List<Customer>findAllCustomer(Connection connection);
	
	

}
