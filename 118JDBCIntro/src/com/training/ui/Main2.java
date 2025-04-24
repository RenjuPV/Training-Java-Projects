package com.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {

	public static void main(String[] args) {

		// Step 1
		// Load a Driver

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}

		// Step 2
		// Establish a connection to a database
		Connection connection = null;
		String dbUrl = "jdbc:mysql://localhost:3306/trainingdb4?useSSL=false";
		String userName = "root";
		String password = "root";
		try {
			connection = DriverManager.getConnection(dbUrl, userName, password);
			System.out.println("Connected Successfully");
		} catch (SQLException e) {
			System.err.println(e);
		}

		// step 3
		// Execute Queries
		String query = "update products set pprice=60000.00 where pid=1002";
		Statement statement = null;
		try {
			statement = connection.createStatement();
			System.out.println("Statement Created Successfully");
			int r = statement.executeUpdate(query);
			System.out.println(r + " row(s) updated");
		} catch (SQLException e) {
			System.err.println(e);
		}

		// Step 4
		// Close the connection

		try {
			statement.close();
			connection.close();
			System.out.println("Connection closedsuccessfully");
		} catch (SQLException e) {
			System.err.println(e);

		}
	}

}
