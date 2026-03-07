package firstProject;

import java.util.Scanner;

public class VarArgCalc {
	static Scanner sc = new Scanner(System.in);
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Object[] arr = new Object[100];
		int i = 0;
		while(sc.hasNext()) {
			char op = sc.next().charAt(0);
			do {
				arr[i++] = sc.next();
			} while (arr[i-1]!="=");
		}
		varArgs('+',3,4,5,6,7);
	}
	public static void varArgs(char op, double ... ds) {
		switch (op) {
			case '+':
				System.out.println(add(op, ds));
				break;
			default:
		}
	}
	
	public static double add(char op, double ... ds) {
		double sum = 0;
		for (int i = 0; i < ds.length; i++) {
			sum += ds[i];
		}
		return sum;
	}
}
