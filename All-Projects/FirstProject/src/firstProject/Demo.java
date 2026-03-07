package firstProject;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter 3 digit num: ");
		short num = userInput.nextShort();
		userInput.nextLine();
		System.out.print("Enter name: ");
		String name = userInput.nextLine();
		userInput.close();
		
		System.out.println("Num: " + num);
		System.out.println("Name: " + name);
	}

}