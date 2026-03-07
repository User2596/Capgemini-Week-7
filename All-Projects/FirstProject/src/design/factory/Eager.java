package design.factory;

public class Eager {
	private static Eager eager = new Eager();
	
	private Eager() {
		System.out.println("Eager Instance created");
	}
	
	public static Eager eagerFactory() {
		return eager;
	}
}
