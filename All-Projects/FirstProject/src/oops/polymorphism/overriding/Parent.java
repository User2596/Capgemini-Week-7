package oops.polymorphism.overriding;

public class Parent {
	public void printStar() {
		System.out.println('*');
	}
	public void printStar(int num) {
		while (num-- > 0) {
			System.out.println('*');
		}
	}
//	public void printStar(int num) {
//		for (int i=0; i<num; i++) {
//			System.out.println('*');
//		}
//	} 	// Duplication due to same method signature
}
