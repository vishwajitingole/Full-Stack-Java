package com.telusko.jdbclearning;

import java.sql.*;
import java.util.*;

public class LaunchApp6PreparedStatement {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "Vishwajit@2001";

        Connection connect = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            // Establish the database connection
            connect = DriverManager.getConnection(url, user, password);

            // Prepare the SQL query with placeholders
            String query = "INSERT INTO studentinfo(id, sname, sage, scity) VALUES (?, ?, ?, ?)";
            statement = connect.prepareStatement(query);

            System.out.println("Please enter the details to insert into DB:");

            System.out.print("Enter your id: ");
            int id = sc.nextInt();

            // Clear buffer before reading string input
            sc.nextLine();

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Clear buffer again
            sc.nextLine();

            System.out.print("Enter your city: ");
            String address = sc.nextLine();

            // Set the parameters for the prepared statement
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, age);
            statement.setString(4, address);

            // Execute the insert operation
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new student record was inserted successfully!");
            } else {
                System.out.println("No record was inserted.");
            }

            // Execute a SELECT query to retrieve and display all records
            String selectQuery = "SELECT * FROM studentinfo";
            rs = statement.executeQuery(selectQuery);

            System.out.println("Current records in the database:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " "
                        + rs.getString("sname") + " "
                        + rs.getInt("sage") + " "
                        + rs.getString("scity"));
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Print SQL error details
        } finally {
            // Close resources manually
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (connect != null) connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
