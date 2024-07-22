package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp1 {

    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
        	Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver loaded successfully!");
            String url="jdbc:mysql://localhost:3306/jdbclearning";
            String user="root";
            String password="Vishwajit@2001";
            
            //Establishing Connection
            Connection connect = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established");
            //Creating Statement
            Statement statement=connect.createStatement();
            System.out.println("Statement Created");

          
          
          //Close the resources
          statement.close();
          connect.close();
          System.out.println("Resources closed carefully");
          
        } catch (Exception e) {
            // Handle the exception
            System.out.println("Error: Driver not found!");
            e.printStackTrace();
        }
    }
}
