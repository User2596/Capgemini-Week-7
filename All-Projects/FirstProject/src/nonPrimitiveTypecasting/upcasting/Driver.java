
package nonPrimitiveTypecasting.upcasting;

public class Driver {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.c);
		c.cm();
		System.out.println(c.p);
		c.pm();
		
		Child c1 = new Child();
		System.out.println(c1);
		Parent upcastedParentVar = c1;
		System.out.println(upcastedParentVar);
		System.out.println(c1.c);
		c1.cm();
		System.out.println(c1.p);
		c1.pm();
		
//		System.out.println(p1.c);
//		p1.cm();
		System.out.println(upcastedParentVar.p);
		upcastedParentVar.pm();
	}

}