

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class FirstApp extends HttpServlet {
	
	public FirstApp() {
		System.out.print("Servlet object created internally");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		
		PrintWriter writer=response.getWriter();
		
		writer.println("<html style='background-color:'green';'> <h1> Hello "+name+"</h1> <p>I know you are from"+city+"</p> </html>");
		
	}

}
