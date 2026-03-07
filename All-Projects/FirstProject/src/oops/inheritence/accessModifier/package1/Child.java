package oops.inheritence.accessModifier.package1;

public class Child extends Parent {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.publicMethod();
		c1.protectedMethod();
		c1.defaultMethod();
//		c1.privateMethod();
	}
}
