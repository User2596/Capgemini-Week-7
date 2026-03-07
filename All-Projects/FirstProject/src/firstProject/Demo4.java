package firstProject;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = userInput.nextInt();
		System.out.print("Enter Month: ");
		int month = userInput.nextInt();
		userInput.close();
		
		switch(month) {
			case 1,3,5,7,8,10,12:
				System.out.println("31 days");
				break;
			case 4,6,9,11:
				System.out.println("30 days");
				break;
			case 2:
				System.out.println((year%4==0 && year%100!=0) || (year%400==0)?"29 days":"28 days");
				break;
			default:
				System.out.println("Enter valid value for year and month.");
		}
	}

}
