package calculator.two;

public class ArithmeticCalculator extends Calculator {


    @Override
    public void calculate(String input) {
        String[] inputValues = input.split(" ");
        int a = Integer.parseInt(inputValues[0]);
        int b = Integer.parseInt(inputValues[1]);
        char operator = inputValues[2].charAt(0);

        try {
            int result = 0;
            if(operator == '+') {
                result = addOperator.operate(a, b);
            } else if(operator == '-') {
                result = subtractOperator.operate(a, b);
            } else if(operator == '*') {
                result = multiplyOperator.operate(a, b);
            } else if(operator == '/') {
                result = divideOperator.operate(a, b);
            } else if(operator == '%') {
                result = modOperator.operate(a, b);
            } else {
                throw new IllegalArgumentException("잘못된 연산자를 입력하셨습니다.");
            }
            addResult(String.valueOf(result));
        } catch (Exception e) {
            addResult(e.getMessage());
        }
    }
    private String[] parser(String input) {
        return input.split(" ");
    }
}
