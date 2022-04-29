import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnect {
	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			// 1. load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2.establish connection with the database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy", "root", "root");
			
			//System.out.println("Connected to DataBase");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
