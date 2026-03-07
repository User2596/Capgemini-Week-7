package oops.inheritence.isA.examples;

public class DriverClass {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		System.out.println("parent.a: " + parent.a);
		System.out.println("child.b: " + child.b);
		System.out.println("child.a: " + child.a);
	}
}
