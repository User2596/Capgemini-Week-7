package oops.inheritence.hasA.bi;

public class DriverClass {

	public static void main(String[] args) {
			Car c = new Car();
			Engine e = new Engine();
			c.engine = e; 				// Fixing engine inside car
			
			System.out.println("car.color: " + c.col);
			System.out.println("car.engine: " + c.engine);
			System.out.println("car.engine.noOfCyl: " + c.engine.noOfCyl);
			System.out.println("car.engine.car: " + c.engine.car);
			Engine engineInCar = c.engine;
			Car carInEngineInCar = engineInCar.car;
			System.out.println(carInEngineInCar);
	}

}
