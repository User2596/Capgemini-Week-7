package precision.doubleType;

import java.math.BigDecimal;

public class Driver {
	public static void main(String[] args) {
		double a = 0.1;
		double b = 0.2;
		System.out.println("Sum of " + a + " and " + b + " is: "+ (a+b));
		
		float af = 0.1f;
		float bf = 0.2f;
		System.out.println("Sum of " + af + " and " + bf + " is: "+ (af+bf));
		
		BigDecimal abd = new BigDecimal("0.1");
		BigDecimal bbd = new BigDecimal(0.2); 	// Should not be double, parse from String only
		System.out.println("Sum of " + abd + " and " + bbd + " is: "+ (abd.add(bbd)));
	}
}
