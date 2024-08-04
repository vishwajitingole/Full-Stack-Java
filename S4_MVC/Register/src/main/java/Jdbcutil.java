import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbcutil {

 
    private static final String URL = "jdbc:mysql://localhost:3306/jdbclearning";
    private static final String USER = "root";
    private static final String PASSWORD = "Vishwajit@2001"; 

    public static Connection getDBConnection() {
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connection established successfully.");
            
        } catch (SQLException e) {
            // Handle SQL exceptions
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // Handle Class not found exceptions
            System.err.println("JDBC Driver not found: " + e.getMessage());
            e.printStackTrace();
        }
        
        return connection;
    }
}
