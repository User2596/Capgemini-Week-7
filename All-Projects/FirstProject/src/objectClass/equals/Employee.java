package objectClass.equals;

public class Employee {
	int id;
	String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + " name:" + this.name;
	}
}
