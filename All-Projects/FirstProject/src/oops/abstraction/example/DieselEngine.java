package oops.abstraction.example;

public class DieselEngine implements Engine {

	// Provide implementation of abstract method
	@Override
	public void startEngine() { 	// runtime binding since overriding
		System.out.println("More vibration");
	}
	
}
