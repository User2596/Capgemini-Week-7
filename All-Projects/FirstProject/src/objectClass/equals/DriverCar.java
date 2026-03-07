package objectClass.equals;

public class DriverCar {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Car c1 = new Car("HV", (byte) 5);
		Car c2 = new Car("HC", (byte) 5);
		Car c3 = new Car("HV", (byte) 5);
		Car c4 = c1;
		Car c5 = null;
		
		try {
			System.out.println(c5.equals(null));
		} catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(c1.equals(null));
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
	}

}