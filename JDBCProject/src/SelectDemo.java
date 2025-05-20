import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
//		Step 1 - Load the Driver into the memory
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
			String query = "select * from account";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt("acc_id") + "\t" + rs.getString("acc_name") + "\t" + rs.getInt("acc_balance"));
			}
			
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
