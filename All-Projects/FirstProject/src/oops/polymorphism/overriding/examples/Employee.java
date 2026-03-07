package oops.polymorphism.overriding.examples;

public class Employee {
	double basePay = 300000;
	
	public double salaryCalc(byte durationInMonths) {
		return (basePay) * durationInMonths/12 ;
	}
	
}