package Day2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException{
		String hostName = "localhost";
		String dbName = "24h";
		String userName = "root";
		String password = "nkh24288";
		
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}

}
