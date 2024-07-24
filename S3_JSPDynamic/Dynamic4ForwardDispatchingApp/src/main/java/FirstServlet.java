

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {


	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("Control in first servlet");
		RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServlet");
		reqDispatch.forward(request, response);
		
		//THis part of the code won't be accessed as we are redirected the control to the Second Servlet
		PrintWriter wr = response.getWriter();
		wr.println("<h1>Response from servlet 1</h1>");
		wr.close();
	}

}
