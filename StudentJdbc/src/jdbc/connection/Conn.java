package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import details.mysql.MySQL;

public class Conn {
	public static Connection tryConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(MySQL.getUrl(), MySQL.getUsername(), MySQL.getPassword());
		return conn;
	}
}
