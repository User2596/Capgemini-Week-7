package firstProject;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		System.out.print("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		
		if (c >= 'A' && c <= 'Z') {
			System.out.println("Character is a uppercase letter.");
		}
		else if (c >= 'a' && c <= 'z') {
			System.out.println("Character is a lowercase letter.");
		}
		else if (c >= '0' && c <= '9') {
			System.out.println("Character is a number.");
		}
		else {
			System.out.println("Character is a special character.");
		}
	}

}
