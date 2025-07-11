package calculator.three;

public enum OperatorType {
    ADD('+') {
        public int operator(int a, int b) { return a + b; }
    },
    MINUS('-') {
        public int operator(int a, int b) { return a - b; }
    },
    MULTIPLY('*') {
        public int operator(int a, int b) { return a * b; }
    },
    DIVIDE('/') {
        public int operator(int a, int b) {
            if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
            return a / b;
        }
    },
    MODULO('%') {
        public int operator(int a, int b) { return a%b; }
    };

    private final char operator;
    OperatorType(char operator) { this.operator = operator; }
    public char getOperator() { return operator; }
    public abstract int operator(int a, int b);

    public static OperatorType getOperatorType(char operator) {
        for (OperatorType type : OperatorType.values()) {
            if (type.getOperator() == operator) return type;
        }
        throw new IllegalArgumentException("잘못된 연산자를 입력하셨습니다.");
    }
}
