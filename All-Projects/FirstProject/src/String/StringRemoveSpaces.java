package String;

import java.util.Scanner;

public class StringRemoveSpaces {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		StringBuilder str = new StringBuilder(s);
		while (str.length() > 0 && str.charAt(0) == ' ') str.deleteCharAt(0);
		
		System.out.print("Non-padded String: ");
		System.out.println(str);
	}

}