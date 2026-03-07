package enumerator.example.operation;

public enum Operation {
	PLUS('+') {
        @Override
        public double operate(double a, double b) {
            return a + b;
        }
    },
    MINUS('-') {
        @Override
        public double operate(double a, double b) {
            return a - b;
        }
    },
    MULT('*') {
        @Override
        public double operate(double a, double b) {
            return a * b;
        }
    },
    DIV('/') {
        @Override
        public double operate(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        }
    };
	
	private final char op;
	
	private Operation(char op) {
		this.op = op;
	}
	
	public double operate(double num1, double num2) {
		return this == PLUS ? num1 + num2 :
			this == MINUS ? num1 - num2 :
			this == MULT ? num1 * num2 :
			this == DIV ? num1 / num2 : null;
	}
	
	public Operation fromChar(char op) {
		for (Operation opr : Operation.values()) if (opr.op == op) return opr;
		return null;
	}

	public char getOp() {
		return op;
	}
}
