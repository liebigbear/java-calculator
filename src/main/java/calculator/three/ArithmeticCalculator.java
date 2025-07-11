package calculator.three;

public class ArithmeticCalculator extends Calculator {


    @Override
    public void calculate(String input) {
        String[] inputValues = input.split(" ");
        int a = Integer.parseInt(inputValues[0]);
        int b = Integer.parseInt(inputValues[1]);
        char operator = inputValues[2].charAt(0);

        try {
            OperatorType getOpration = OperatorType.getOperatorType(operator);
            int result = getOpration.operator(a, b);
            addResult(String.valueOf(result));
        } catch (Exception e) {
            addResult(e.getMessage());
        }
    }
    private String[] parser(String input) {
        return input.split(" ");
    }
}
