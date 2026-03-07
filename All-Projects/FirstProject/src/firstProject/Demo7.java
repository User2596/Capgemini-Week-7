package firstProject;

import java.util.Scanner;

public class Demo7 {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		Expression exp = new Expression();
		System.out.println("Simple Calculator: ");
		double ans = 0;
		
		do {
			switch(exp.operator) {
				case '+':
					ans = add(exp);
					break;
				case '-':
					ans = sub(exp);
					break;
				case '*':
					ans = mult(exp);
					break;
				case '/':
					ans = div(exp);
					break;
				default:
					System.out.println("Invalid operator");
			}
			System.out.println("" + exp.operand1 + " " + exp.operator + " " + exp.operand2 + " = " + ans);
			toContinue();
		} while(true);
	}
	
	
	public static Expression inputs() {
		Expression exp = new Expression();
		System.out.print("Enter Operand 1:");
		exp.operand1 = userInput.nextDouble();
		System.out.print("Enter Operator:");
		exp.operator = userInput.next().charAt(0);
		System.out.print("Enter Operand 2:");
		exp.operand2 = userInput.nextDouble();
		userInput.nextLine();
		return exp;
	}
	
	public static void toContinue() {
		System.out.println("To continue enter 'y': ");
		char selection = userInput.next().charAt(0);
		if (selection!='y') {
			System.out.println("---EXIT---");
			System.exit(0);
		}
	}
	
	public static double add(Expression exp) {
		return exp.operand1+exp.operand2;
	}
	public static double sub(Expression exp) {
		return exp.operand1-exp.operand2;
	}
	public static double mult(Expression exp) {
		return exp.operand1*exp.operand2;
	}
	public static double div(Expression exp) {
		return exp.operand1/exp.operand2;
	}
}

class Expression {
	double operand1, operand2;
	char operator;
}