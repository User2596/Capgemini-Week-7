package oops.polymorphism.overriding;

import java.util.Scanner;

public class Child extends Parent {
	@Override
	public void printStar(int num) {
		for (int i=0; i<num; i++) {
			System.out.println('*');
		}
	} 	// inheritance
	
	@Override 	// informative but not necessary but good practice
	public void printStar() {
		System.out.print("Enter star count: ");
		Scanner userInput = new Scanner(System.in);
		int starCount =userInput.nextInt();
		userInput.nextLine();
		for (int i=0; i<starCount; i++) {
			System.out.println('*');
		}
		userInput.close();
	}
}
