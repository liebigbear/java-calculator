package calculator.three;

public class ArithmeticCalculator extends Calculator<String> {


    @Override
    public void calculate(String input) {
        String[] inputValues = input.split(" ");
        double a = Double.parseDouble(inputValues[0]);
        double b = Double.parseDouble(inputValues[1]);
        char operator = inputValues[2].charAt(0);

        try {
            OperatorType getOpration = OperatorType.getOperatorType(operator);
            double result = getOpration.operator(a, b);
            addResult(String.format("%.2f", result));
        } catch (Exception e) {
            addResult(e.getMessage());
        }
    }
    private String[] parser(String input) {
        return input.split(" ");
    }
}
