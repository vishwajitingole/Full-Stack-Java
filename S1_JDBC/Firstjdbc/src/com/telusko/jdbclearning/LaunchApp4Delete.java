package com.telusko.jdbclearning;
import java.sql.*;

public class LaunchApp4Delete {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="Vishwajit@2001";
		
		Connection connect=DriverManager.getConnection(url,user,password);
		
		Statement st=connect.createStatement();
		String sql="DELETE FROM studentinfo where id=2";
		int rowsAffected=st.executeUpdate(sql);
		
		if(rowsAffected==0) {
			System.out.print("No rows Affected");
		}else {
			System.out.print(rowsAffected+" Affected");
		}
		
	}

}
