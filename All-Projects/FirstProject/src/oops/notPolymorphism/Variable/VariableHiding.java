package oops.notPolymorphism.Variable;

public class VariableHiding {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = (Child) p;
		System.out.println(p.x);
		System.out.println(c.x);
	}
}
