package oops.polymorphism.overloading.sameClass;

public class Calculator2 {

	public double addition() {
		return 0;
	}
	
//	public static void addition() {}
	
//	public void addition() {} 	// changing access modifier doesn't affect method signature
	
//	public double addition() {
//		return 0;
//	} 	// changing return type doesn't affect method signature 
	
	public double addition(double op1, double op2) {
		return op1+op2;
	}
	
	public float addition(float op1, double op2) {
		return (float) (op1+op2);
	}
	
	public float addition(double op1, float op2) {
		return (float) (op1+op2);
	}
	
	public double addition(double op1, char opr, double op2) {
		return op1+op2;
	}
	
	// all bases for method overloading have different signature
}
