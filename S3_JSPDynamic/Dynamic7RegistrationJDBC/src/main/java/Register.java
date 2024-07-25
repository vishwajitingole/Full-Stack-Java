

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("Control aagya");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		String city=request.getParameter("city");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String root="jdbc:mysql://localhost:3306/jdbclearning";
			String user="root";
			String pass="Vishwajit@2001";
		Connection connect=	DriverManager.getConnection(root,user,pass);
		
		PreparedStatement psm=connect.prepareStatement("INSERT INTO Register(name,password,city) "+"VALUES(?,?,?)");
		psm.setString(1, name);
		psm.setString(2, password);
		psm.setString(3,city);
		int rows=psm.executeUpdate();		
		System.out.print("Rows Affected"+rows);
		PrintWriter wr=response.getWriter();
		
		if(rows!=0) {
			wr.println("<h1>Registration Successful!!</h1>");
		}else {
			wr.println("<h1>Registration Failed :(</h1>");
		}
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
		

}
