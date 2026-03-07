package interfaces.functional.lambda.methodRef;

@FunctionalInterface
public interface Function<Input, Output> {
	Output apply(Input ip);
	
	static double incr(int i) {
		return ++i;
	}
	
	default double square(int i) {
		return (double) incr(i) * --i - i++ + i--;
	}
}