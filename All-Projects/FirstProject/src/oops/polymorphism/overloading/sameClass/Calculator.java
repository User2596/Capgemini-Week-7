package oops.polymorphism.overloading.sameClass;

public class Calculator {

	public static void addition() {
		// base1
	}
	
//	public static void addition() {}
	
//	public void addition() {} 	// changing access modifier doesn't affect method signature
	
//	public double addition() {
//		return 0;
//	} 	// changing return type doesn't affect method signature 
	
	public static void addition(double op1, double op2) {
		// different no of formal arguments
		// base2 compared to base1
	}
	
	public static void addition(float op1, double op2) {
		// changing datatype of formal argument
		// base3 compared to base1
	}
	
	public static void addition(double op1, float op2) {
		// changing sequence of datatypes in formal arguments
		// base4 compared to base1
	}
	
	public static void addition(double op1, char opr, double op2) {
		// changing number, datatypes and sequence of datatypes in formal arguments
		// base5 compared to base1
	}
	
	// all bases for method overloading have different signature
}
