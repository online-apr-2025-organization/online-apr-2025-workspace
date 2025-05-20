import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
//		Step 1 - Load the Driver class into the memory
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "root";
		Connection conn = null;
		try {
//			Step 2 - Establish connection to the DB
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Established Connection...");
//			Step 3 - Create a Statement and Execute it
			Statement stmt = conn.createStatement();
			System.out.println("Statement created...");
			String query = "insert into account(acc_name, acc_balance) values(\"ZXC\", 11000)";
			int rowsAffected = stmt.executeUpdate(query);
			System.out.println(rowsAffected + " rows affected...");
			
		} catch (SQLException e) {
//			Step 4 - Handle the exceptions
			e.printStackTrace();
		} finally {
// 			Step 5 - Close the connection
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
