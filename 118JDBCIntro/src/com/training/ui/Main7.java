package com.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main7 {

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
		String query = "update products set pname=?,pprice=?,pcategory=? where pid=?";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(query);
			System.out.println("Statement Created Successfully");
			Scanner scanner = new Scanner(System.in);

			int prodId;
			String pName;
			double price;
			String category;
			
			System.out.println("Enter ID to Update : ");
			prodId = Integer.parseInt(scanner.nextLine());

			
			System.out.println("Enter Product Name to update : ");
			pName = scanner.nextLine();
			
			System.out.println("Enter Price to upadte : ");
			price = Double.parseDouble(scanner.nextLine());
			
			System.out.println("Enter Category to update: ");
			category = scanner.nextLine();
			
			statement.setInt(4,prodId);
			statement.setString(1,pName);
			statement.setDouble(2,price);
			statement.setString(3,category);
			
			int r = statement.executeUpdate();
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
