package design.singleton;

public class Laptop {
	private static Laptop laptop;
	
	private Laptop() {}
	
	public static Laptop laptopFactory() {
		if (laptop == null) {
			System.out.println("laptop object created");
			laptop = new Laptop();
		} else {
			System.out.println("Previously created laptop object is returned");
		}
		return laptop;
	}
}
