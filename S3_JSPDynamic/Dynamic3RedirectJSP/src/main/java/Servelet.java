

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Servelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		System.out.print(name+" "+city);
		
		PrintWriter wr=response.getWriter();
	
		
		if(name.isEmpty() || city.isEmpty() || name==null ||city==null ) {
			wr.print("Please add values ");
			return;
			
		}
		
		response.sendRedirect("Success.jsp");
	}

}
