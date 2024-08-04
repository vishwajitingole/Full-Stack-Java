import java.sql.Connection;
import java.sql.PreparedStatement;

public class Model {
	private String name;
	private String password;
	private String city;
	
	
	Connection con=null;
	PreparedStatement pstmt;
	int row=0;
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public int register() {
		try {
			 con=Jdbcutil.getDBConnection();
			String sql="INSERT INTO register (name,password,city) values(?,?,?)";
			pstmt=con.prepareStatement(sql);
			
			//Setting data
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.setString(3, city);
			
			 row=pstmt.executeUpdate();
			
			
			
			
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return row;
}
}
