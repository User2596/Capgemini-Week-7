package oops.inheritence.accessModifier.package2;

import oops.inheritence.accessModifier.package1.Parent;

public class Child extends Parent {
	public static void main(String[] args) {
		Child c2 = new Child();
		c2.publicMethod();
		c2.protectedMethod();
//		c2.defaultMethod();
//		c2.privateMethod();
	}
}
