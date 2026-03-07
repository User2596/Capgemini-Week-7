package firstProject;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		System.out.print("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		
		switch((c>='A' && c<='Z') ? 1 : (c >= 'a' && c <= 'z') ? 2
				: (c >= '0' && c <= '9') ? 3 : 0) {
			case 1:
				System.out.println("Character is a uppercase letter.");
			case 2:
				System.out.println("Character is a lowercase letter.");
			case 3:
				System.out.println("Character is a number");
			default:
				System.out.println("Character is a special character.");		
		}
	}

}
