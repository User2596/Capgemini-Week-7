package enumerator.example.operation;

public class Driver {
	public static void main(String[] args) {
		Operation op = Operation.MULT;
		System.out.println(op.operate(1.2, 3.5));
	}
}
