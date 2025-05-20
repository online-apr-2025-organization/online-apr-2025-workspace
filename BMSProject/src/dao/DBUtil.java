package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection conn = null;
	// Step 1 - Load the driver
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// Step 2 - Establish connection to the DB
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/book_management_system";
		String username = "root";
		String password = "root";
		if(conn == null) {
			try {
				conn = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	// Step 5 - close the connection
	public void closeTheConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
