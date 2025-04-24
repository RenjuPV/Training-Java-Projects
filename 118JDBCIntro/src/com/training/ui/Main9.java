package com.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main9 {

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
		String query = "select * from products where pid=?";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(query);
			System.out.println("Statement Created Successfully");
			Scanner scanner = new Scanner(System.in);

			int prodId;

			System.out.println("Enter ID to Search : ");
			prodId = Integer.parseInt(scanner.nextLine());
			statement.setInt(1, prodId);
			ResultSet rs = statement.executeQuery();
			System.out.printf("ID\t ProductName \t\tPrice  \t\tType \n");
			System.out.println("--------------------------------------------------------");

			if (rs.next()) {
				int pid = rs.getInt(1);
				String pname = rs.getString(2);
				double price = rs.getDouble(3);
				String category = rs.getString(4);
				System.out.printf("%d\t %-20s %10.2f \t%-20s \n", pid, pname, price, category);
			} else {
				System.out.println("Id not found");
			}
			System.out.println("--------------------------------------------------------");

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
