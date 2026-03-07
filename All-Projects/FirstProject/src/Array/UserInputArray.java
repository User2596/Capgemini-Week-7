package Array;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		System.out.print("Enter your array size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Object[] arr = new Object[n];
		
		System.out.println("Enter array data: ");
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			if (s.length() == 1) {
				arr[i] = s.charAt(0);
			} else if (s.matches("[0-9]*.[0-9]*")) {
				arr[i] = Double.valueOf(s);
			} else if (s.matches("[0-9]+")) {
				arr[i] = Long.valueOf(s);
			} else if (s.equals("true") || s.equals("false")) {
				arr[i] = Boolean.valueOf(s);
			} else {
				arr[i] = s;
			}
		}
		sc.close();
		
		
		
		System.out.println("User given array is: ");
		for (Object i : arr) {
			System.out.println(i + "\tType: " + i.getClass());
		}
	}

}
