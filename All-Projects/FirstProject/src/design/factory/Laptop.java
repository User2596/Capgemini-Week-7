package design.factory;

public class Laptop {
	
	private Laptop() {}

	public static Laptop laptopFactory() {
		Laptop laptop = new Laptop();
		return laptop;
	}
	
}
