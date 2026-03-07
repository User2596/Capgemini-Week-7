package String;

public class StringLower {

	static String str = "uHGBHYbfecppy";
	public static void main(String[] args) {
		StringBuilder upper = new StringBuilder();
		StringBuilder lower = new StringBuilder();
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				upper.append((char)(str.charAt(i)-32));
				lower.append(str.charAt(i));
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				upper.append(str.charAt(i));
				lower.append((char)(str.charAt(i)+32));
			} else {
				upper.append(str.charAt(i));
				lower.append(str.charAt(i));
			}
		}
		System.out.println(upper + " " + lower);
	}

}
