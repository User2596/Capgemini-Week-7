package oops.inheritence.doubts.B;

import oops.inheritence.doubts.A.A;

//public class B {
class B extends A {
		
	static int b = 2;
	public static void main(String[] args) {
		System.out.println(b);
		System.out.println(A.a);
	}
	
}
