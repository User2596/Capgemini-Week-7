package exception.checked.custom;

import java.util.Scanner;

public class CustomCheckedExceptionDemo {
	public static Permit validateAge(int age) throws InvalidAgeException, NegativeAgeException { 	// throws used in method declaration
		if (age < 0) throw new NegativeAgeException();
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or older to register"); 	// throw used in body to throe exception
		} else if (age < 21) {
			return Permit.SOFT;
		}
		return Permit.HARD;
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter age: ");
		
		try {			
			int age = userInput.nextInt();
			userInput.nextLine();
			Permit permit = validateAge(age);
			switch(permit) {
				case SOFT:
					System.out.println("Soft drinks are allowed");
					break;
				case HARD:
					System.out.println("All drinks are allowed");
					break;
				default:
			}	
			System.out.println("Proceed to registration");
		} catch (InvalidAgeException | NegativeAgeException e) {
			System.out.println("Caught exception: " + e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getClass() + ": " + e.getMessage());
		} finally {
			userInput.close();
		}
	}
}