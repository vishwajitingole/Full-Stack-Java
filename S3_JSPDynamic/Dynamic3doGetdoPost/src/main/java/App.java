import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/App")
public class App extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");
        

        PrintWriter out = response.getWriter();
        
       
        String name = request.getParameter("name");
        String city = request.getParameter("city");

     
        if (name == null || city == null || name.isEmpty() || city.isEmpty()) {
            out.println("<html><body>");
            out.println("<h2>Invalid Input</h2>");
            out.println("<p>Please enter both Username and City.</p>");
            out.println("</body></html>");
            return;
        }

       
        out.println("<html><body>");
        out.println("<h2>Control in Servlet</h2>");

      
        if ("Vishwajit".equalsIgnoreCase(name) && "Pune".equalsIgnoreCase(city)) {
            out.println("<h2>Success</h2>");
        } else {
            out.println("<h2>Unauthorized Login</h2>");
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	 // Set response content type
        response.setContentType("text/html");
        

        PrintWriter out = response.getWriter();
        
       
        String name = request.getParameter("name");
        String city = request.getParameter("city");

     
        if (name == null || city == null || name.isEmpty() || city.isEmpty()) {
            out.println("<html><body>");
            out.println("<h2>Invalid Input</h2>");
            out.println("<p>Please enter both Username and City.</p>");
            out.println("</body></html>");
            return;
        }

       
        out.println("<html><body>");
        out.println("<h2>Control in Servlet</h2>");

      
        if ("Vishwajit".equalsIgnoreCase(name) && "Pune".equalsIgnoreCase(city)) {
            out.println("<h2>Success</h2>");
        } else {
            out.println("<h2>Unauthorized Login</h2>");
        }

        out.println("</body></html>");
    	
    }
}
