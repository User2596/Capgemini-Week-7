package problemStatement.investmentFirm;

public class User {
	private static User user = null;
	private String userName;
	private String securityCode;
	
	private User(String userName) {
		this.userName = userName;
		this.securityCode = Double.valueOf(Math.random()*10000).toString();
		System.out.println("User Name: " + userName + "\nPassword: " + securityCode);
	}
	
	public static User fetchUser(String userName) {
		if (user==null) user = new User(userName);
		return user;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return securityCode;
	}
	public void setsecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
	
}
