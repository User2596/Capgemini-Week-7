package interfaces.functional.lambda.generic;

@FunctionalInterface
public interface Function<Input, Output> {
	Output apply(Input ip);
}
