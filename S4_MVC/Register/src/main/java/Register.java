

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String city=request.getParameter("city");
		
		Model m=new Model();
		m.setName(name);
		m.setCity(city);
		m.setPassword(password);
		
		int row=m.register();
		HttpSession s=request.getSession();
		s.setAttribute("name", name);
		
		if(row!=0) {
			response.sendRedirect("/Register/success.jsp");
		}else {
			response.sendRedirect("/Register/fail.jsp");
		}
		
		
	}

}
