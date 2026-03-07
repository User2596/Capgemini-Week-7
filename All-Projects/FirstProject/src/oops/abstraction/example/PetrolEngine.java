package oops.abstraction.example;

public class PetrolEngine implements Engine {
	
	// Provide implementation of abstract method
	@Override
	public void startEngine() {
		System.out.println("Less vibrations");
	}
	
}
