package String;

public class EmailValidation {

	
	static String email = "kp.at.workplace@gmail.com";
	public static void main(String[] args) {
		if (isEmailValid(email)) {
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}
	}
	
	public static boolean isEmailValid(String email) {
//		return email.indexOf('@')==email.lastIndexOf('@');
		if (email.endsWith("@gmail.com") || email.endsWith("@yahoo.in")) {
			
		}
		return true;
	}

}
