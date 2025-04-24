package com.training.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main2 {
	public static void main(String[] args) {// Step 1
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
		// step 3 call sp

		try {
			CallableStatement statement = connection.prepareCall("{call incrementSalary(?,?,?)}");
			statement.setString(1, "UK");
			statement.setInt(2, 5);
			statement.registerOutParameter(3, java.sql.Types.DOUBLE);
			statement.execute();
			System.out.println(statement.getInt(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Step 4
		// Close the connection

		try {

			connection.close();
			System.out.println("Connection closedsuccessfully");
		} catch (SQLException e) {
			System.err.println(e);

		}

	}

}
