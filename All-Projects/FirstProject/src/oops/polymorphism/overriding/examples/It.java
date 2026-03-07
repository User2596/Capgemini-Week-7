package oops.polymorphism.overriding.examples;

public class It extends Employee {
	double varPay = 200000;
	
//	public double salaryCalc(byte durationInMonths) {
//		return (basePay+varPay) * durationInMonths/12 ;
//	}
	
//	@Override 	// Both override and overloading doesn't happen at the same time
	public double salaryCalc(byte durationInMonths, double bonus) { 	// Overriding requires same declaration
		return (basePay+varPay) * durationInMonths/12 + bonus*(durationInMonths/12);
	}
}
