

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class ServeletLifeCycle extends HttpServlet {

static {
	System.out.println("Servlet Loaded");
}
public ServeletLifeCycle() {
	System.out.println("Servlet object is created");
}
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet initialised");
	}


	public void destroy() {
		System.out.println("Servlet destroyed");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request and Response ");
		PrintWriter wr=response.getWriter();
		wr.write("Hello");
		//Lifecycle of a Servlet
//		Servlet Loaded
//		Servlet object is created
//		Servlet initialised
//		Request and Response 
		//If there is any error internally destroy method will called
	}

}
