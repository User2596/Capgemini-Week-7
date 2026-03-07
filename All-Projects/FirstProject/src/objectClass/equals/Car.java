package objectClass.equals;

public class Car {
	String name;
	byte noOfDoors;

	public Car(String name, byte noOfDoors) {
		this.name = name;
		this.noOfDoors = noOfDoors;
	}

	@Override
	public boolean equals(Object obj) throws NullPointerException {
		if (this == obj) {
			System.out.println("Same reference");
			return true;
		}
		if (obj == null || getClass()!=obj.getClass()) {
			System.out.println("Either object null or different class");
			return false;
		}
		Car car = (Car) obj; 	// To access the attributes of child class
		return (this.name == car.name && this.noOfDoors == car.noOfDoors);
	}
}