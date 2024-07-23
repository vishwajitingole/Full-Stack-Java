package com.telusko.jdbclearning;
import java.sql.*;

public class LaunchApp5CRUDusingExecuteMeth {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="Vishwajit@2001";
		
		Connection connection=DriverManager.getConnection(url,user,password);
		Statement st=connection.createStatement();
		String sql1="SELECT * from studentinfo";
		boolean res=st.execute(sql1);
		if(res==true) {
			System.out.println("Data received");
		
			
			
			ResultSet r=st.executeQuery("SELECT * FROM studentinfo");
			 while(r.next()) {
				 System.out.print(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)+" "+r.getString(4));
				 System.out.println();
			 }
			
			
		}else {
			System.out.print("Nothing received");
		}
		
	}

}
