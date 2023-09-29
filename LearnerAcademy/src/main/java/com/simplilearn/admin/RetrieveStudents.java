package com.simplilearn.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	public class RetrieveStudents {

	    public static void main(String[] args) {
	        String jdbcUrl = "jdbc:mysql://localhost:8036/academy1";
	        String username = "root";
	        String password = "PHP#mysql#44";

	        try {
	            // Establish the database connection
	            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

	            // SQL query to retrieve students
	            String sqlQuery = "SELECT Student_ID, First_Name, Last_Name FROM Students";

	            // Create a prepared statement
	            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

	            // Execute the query
	            ResultSet resultSet = preparedStatement.executeQuery();

	            // Iterate through the results and print student information
	            while (resultSet.next()) {
	                int studentID = resultSet.getInt("Student_ID");
	                String firstName = resultSet.getString("First_Name");
	                String lastName = resultSet.getString("Last_Name");

	                System.out.println("Student ID: " + studentID);
	                System.out.println("First Name: " + firstName);
	                System.out.println("Last Name: " + lastName);
	                System.out.println();
	            }

	            // Close the resources
	            resultSet.close();
	            preparedStatement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
