package oops.polymorphism.overloading.inheritence;

public class Driver {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.printNum(6.1);
//		p.printNum(1.2, 8.5);
		
		Child c = new Child();
		c.printNum(4.5); 		// inherited
		c.printNum(7.3, 9.7); 	// overloaded
	}
}