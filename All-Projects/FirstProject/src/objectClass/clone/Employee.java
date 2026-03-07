package objectClass.clone;

public class Employee implements Cloneable {
	int id;
	
	public Employee(int id) {
		this.id = id;
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
}
