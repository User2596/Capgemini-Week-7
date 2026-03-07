package objects;

public class User {
	String email;
	String password;
	String address;
		
	public User() {}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public User(String email, String password, String address) {
		this(email, password);
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", address=" + address + "]";
	}
	
}