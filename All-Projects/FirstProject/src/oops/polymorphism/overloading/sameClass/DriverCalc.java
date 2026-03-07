package oops.polymorphism.overloading.sameClass;

public class DriverCalc {

	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
		System.out.println(calc.addition());
		System.out.println(calc.addition(0.2, 0.9f));
		System.out.println(calc.addition(0.3f, 0.7));
		System.out.println(calc.addition(0.1, 0.6));
		System.out.println(calc.addition(0.3, '+', 0.5));
	}

}
