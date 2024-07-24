

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/App")
public class FirstServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession(false);
	    if (session == null) {
	        // Log a warning and handle the missing session
	        System.out.println("Session is null. Creating a new session.");
	        session = request.getSession(); // Optionally create a new session
	    }
	    
	   // session.setMaxInactiveInterval(10000);
	    //This will set an expiration for the session after that time frame the session will be expired automatically

			String name=request.getParameter("name");
			String city=request.getParameter("city");
			
			//False represents that only session will be used inorder to store the data
			session.setAttribute("name",name);
			session.setAttribute("city", city);
			RequestDispatcher r=request.getRequestDispatcher("/SecondServlet");
			r.forward(request, response);
	}

}
