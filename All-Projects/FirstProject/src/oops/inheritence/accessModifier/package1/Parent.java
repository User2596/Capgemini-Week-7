package oops.inheritence.accessModifier.package1;

public class Parent {
	public void publicMethod() {
		System.out.println("Public Method in Parent Class");
	}
	protected void protectedMethod() {
		System.out.println("Protected Method in Parent Class");
	}
	void defaultMethod() {
		System.out.println("Default Method in Parent Class");
	}
	@SuppressWarnings("unused")
	private void privateMethod() {
		System.out.println("Private Method in Parent Class");
	}
}
