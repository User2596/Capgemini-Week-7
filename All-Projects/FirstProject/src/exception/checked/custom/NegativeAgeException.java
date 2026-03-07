package exception.checked.custom;

import java.io.IOException;

public class NegativeAgeException extends Exception {
	public NegativeAgeException() {
		super("Age must be positive, i.e. greater than zero", new IOException("Meow"));
	}
}