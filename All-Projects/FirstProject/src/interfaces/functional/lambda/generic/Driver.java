package interfaces.functional.lambda.generic;

public class Driver {
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Hello World!"));
	}
}
