package design.factory;

public class Driver {
	public static void main(String[] args) {
//		Laptop l1 = new Laptop();
//		Laptop l2 = new Laptop();
//		System.out.println(l1);
//		System.out.println(l2);
		
		Laptop l3 = Laptop.laptopFactory();
		Laptop l4 = Laptop.laptopFactory();
		System.out.println(l3);
		System.out.println(l4);
		
	}
}
