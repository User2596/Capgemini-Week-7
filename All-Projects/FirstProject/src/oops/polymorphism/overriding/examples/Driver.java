package oops.polymorphism.overriding.examples;

public class Driver {

	public static void main(String[] args) {
		It it = new It();
		System.out.println("It base pay: "+ it.basePay);
		System.out.println("It variable pay: "+ it.varPay);
		System.out.println("It 14 months salary: "+ it.salaryCalc((byte) 14));
		System.out.println("It 14 months salary (bonus + 25,000): "+ it.salaryCalc((byte) 14, 25000));
		
		Supporting supporting = new Supporting();
		System.out.println("Supporting base pay: "+ supporting.basePay);
		System.out.println("Supporting variable pay: "+ supporting.varPay);
		System.out.println("Supporting  31 months salary: "+ supporting.salaryCalc((byte) 31));
	}
}