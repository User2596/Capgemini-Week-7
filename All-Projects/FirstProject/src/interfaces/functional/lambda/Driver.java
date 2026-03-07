package interfaces.functional.lambda;

public class Driver {

	public static void main(String[] args) {
		Draw c1 = () ->	System.out.println("C1 draw");
		Draw c2 = () ->	System.out.println("C2 draw");
		Draw c3 = () ->	System.out.println("C3 draw");

		c1.circle();
		c1.func1();
		Draw.func2();
		c3.circle();
		c2.circle();
	}
}