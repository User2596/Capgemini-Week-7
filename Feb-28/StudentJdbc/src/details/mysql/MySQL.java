package details.mysql;

public class MySQL {
	private static final String url = "jdbc:mysql://localhost:3306/testschema";
	private static final String username = "root";
	private static final String password = "Password123";
	
	public static String getUrl() {
		return url;
	}
	public static String getUsername() {
		return username;
	}
	public static String getPassword() {
		return password;
	}	
}