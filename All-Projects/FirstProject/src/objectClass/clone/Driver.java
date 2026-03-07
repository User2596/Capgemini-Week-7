package objectClass.clone;

public class Driver {

	public static void main(String[] args) throws Exception {
		Employee e1 = new Employee(101);
//		Employee e2 = (Employee) e1.clone();
		Employee e2 = e1.clone();
		System.out.println(e1.id + " " + e2.id);
		System.out.println(e1.equals(e2));
		System.out.println(e1);
		System.out.println(e2);
	}

}
