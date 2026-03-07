package interfaces.functional.lambda;

@FunctionalInterface
public interface Draw {
	public abstract void circle();
	public default void func1() {}
	public static void func2() {}
}
