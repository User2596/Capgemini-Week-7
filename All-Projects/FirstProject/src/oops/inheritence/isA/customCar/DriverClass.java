package oops.inheritence.isA.customCar;

import java.util.Scanner;

public class DriverClass {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("Which Engine to fit?");
		System.out.println("1. Petrol engine");
		System.out.println("2. Diesel engine");
		System.out.print("Enter your choice: ");
		byte userChoice = userInput.nextByte();
		userInput.nextLine();
		switch (userChoice) {
		case 1:
			PetrolEngine petrolEngine = new PetrolEngine();
			car.engine = petrolEngine;
			break;
		case 2:
			DieselEngine dieselEngine = new DieselEngine();
			car.engine = dieselEngine;
			break;
			
		default:
			PetrolEngine petrolEngine1 = new PetrolEngine();
			car.engine = petrolEngine1;
			break;
		}
		System.out.println("Engine is: " + car.engine);
	}

}
