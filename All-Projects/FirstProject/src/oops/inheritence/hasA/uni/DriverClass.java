package oops.inheritence.hasA.uni;

public class DriverClass {

	public static void main(String[] args) {
		Engine e = new Engine();
		Car c = new Car();
		c.engine = e; 				// Fixing engine inside car
		
//		System.out.println(e.noOfCyl);		
//		System.out.println(e.car.col);
		System.out.println("car.color: " + c.col);
		System.out.println("car.engine: " + c.engine);
		System.out.println("car.engine.noOfCyl: " + c.engine.noOfCyl);
	}

}
