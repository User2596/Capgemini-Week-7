package oops.polymorphism.overriding;

public class Driver {
	public static void main(String[] args) {
		Parent p =new Parent();
		p.printStar();
		
		Child c =new Child();
		c.printStar();
	}
}
