package com.telusko.jdbclearning;
import java.sql.*;

public class LaunchApp3RetrieveData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String password="Vishwajit@2001";
        
        Connection connect=DriverManager.getConnection(url,user,password);
        
       Statement statement= connect.createStatement();
       
       String sql="SELECT * FROM studentinfo";
      ResultSet rs= statement.executeQuery(sql);
      
      while(rs.next()) {
//    	  System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
    	  System.out.print(rs.getInt("id")+" "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString("scity"));
//We can either use column number or column name to retrieve data from it
    	  System.out.println();
      }
      
      rs.close();
      statement.close();
      connect.close();

	}

}
