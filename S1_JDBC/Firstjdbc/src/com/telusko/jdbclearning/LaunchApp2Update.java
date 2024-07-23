package com.telusko.jdbclearning;
import java.sql.*;
public class LaunchApp2Update {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String password="Vishwajit@2001";
        Connection connect = DriverManager.getConnection(url, user, password);
       Statement statement= connect.createStatement();
       
       String sql="UPDATE studentinfo set sage=34 where id=2";
      int rowsAffected= statement.executeUpdate(sql);
      //Whenever we want manipulate the data in db we would use executeUpdate
      //or else we will use  .executeQuery();
      if(rowsAffected==0) {
    	  System.out.println("No rows Affected");
      }else {
    	  System.out.print(rowsAffected+" No of rows affected");
      }
	}
	

}
