package objectClass.equals;

public class DriverEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(12, "A B");
		Employee e2 = new Employee(31, "A B");
		Employee e3 = new Employee(12, "A B");
		
		System.out.println(e1.equals(e1));
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}
}
