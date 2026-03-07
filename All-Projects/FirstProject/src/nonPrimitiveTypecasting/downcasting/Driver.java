
package nonPrimitiveTypecasting.downcasting;

public class Driver {

	public static void main(String[] args) {
//		Parent p1 = new Parent();
//		System.out.println(p1);
//		Child c1 = (Child) p1;
//		System.out.println(c1);
		
		Child c = new Child();
		System.out.println("c: " + c);
		Parent upcastedParentVar = c;
		System.out.println("upcastedParentVar: " + upcastedParentVar);
		Child downcastedChildVar = (Child) upcastedParentVar;
		System.out.println("downcastedChildVar: " + downcastedChildVar);
		System.out.println(upcastedParentVar.p);
		upcastedParentVar.pm();

		System.out.println(downcastedChildVar.c);
		downcastedChildVar.cm();
		System.out.println(downcastedChildVar.p);
		downcastedChildVar.pm();
	}

}