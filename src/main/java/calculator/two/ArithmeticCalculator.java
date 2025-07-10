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
                result = a + b;
            } else if(operator == '-') {
                result = a - b;
            } else if(operator == '*') {
                result = a * b;
            } else if(operator == '/') {
                if(b == 0)  {
                    //매개변수로 해당 오류 내용 전달
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                else result = a / b;
            } else if(operator == '%') {
                result = a % b;
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
