package oops.polymorphism.overriding.examples;

public class Supporting extends Employee {
	double varPay = 100000;
	
	@Override
	public double salaryCalc(byte durationInMonths) {
		return (basePay+varPay) * durationInMonths/12 ;
	}
	
//	@Override
//	public float salaryCalc(byte durationInMonths) {
//		return (float) (basePay+varPay) * durationInMonths/12 ;
//	}
//
//	// This static method cannot hide the instance method from Employee
//	public static double salaryCalc(byte durationInMonths) {
//		return (basePay+varPay) * durationInMonths/12 ;
//	}
//
//	// Cannot reduce the visibility of the inherited method from Employee
//	@Override
//	protected double salaryCalc(byte durationInMonths) {
//		return (basePay+varPay) * durationInMonths/12 ;
//	}
//	
	public double salaryCalc(byte durationInMonths, double bonus) {
		return (basePay+varPay) * durationInMonths/12 + bonus*(durationInMonths/12);
	}
}
