package firstProject;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter boolean: ");
		boolean bol = userInput.nextBoolean();
		System.out.print("Enter String: ");
		String bolStr = userInput.nextLine();
		System.out.println("Boolean: " + bol);
		System.out.println("String: " + bolStr);
		
		System.out.print("Enter byte: ");
		byte byt = userInput.nextByte();
		System.out.print("Enter String: ");
		String bytStr = userInput.nextLine();
		System.out.println("Byte: " + byt);
		System.out.println("String: " + bytStr);
		
		System.out.print("Enter short: ");
		short srt = userInput.nextShort();
		System.out.print("Enter String: ");
		String srtStr = userInput.nextLine();
		System.out.println("Short: " + srt);
		System.out.println("String: " + srtStr);
		
		System.out.print("Enter int: ");
		int intg = userInput.nextInt();
		System.out.print("Enter String: ");
		String intgStr = userInput.nextLine();
		System.out.println("Int: " + intg);
		System.out.println("String: " + intgStr);
		
		System.out.print("Enter float: ");
		float flt = userInput.nextFloat();
		System.out.print("Enter String: ");
		String fltStr = userInput.nextLine();
		System.out.println("Float: " + flt);
		System.out.println("String: " + fltStr);
		
		System.out.print("Enter long: ");
		long lng = userInput.nextLong();
		System.out.print("Enter String: ");
		String lngStr = userInput.nextLine();
		System.out.println("Long: " + lng);
		System.out.println("String: " + lngStr);
		
		System.out.print("Enter double: ");
		double dbl = userInput.nextDouble();
		System.out.print("Enter String: ");
		String dblStr = userInput.nextLine();
		System.out.println("Double: " + dbl);
		System.out.println("String: " + dblStr);
		
		userInput.close();
	}
}