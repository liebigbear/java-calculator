package calculator.three;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator extends Calculator<String> {

    private List<Double> inputRecode;

    public ArithmeticCalculator() {
        super();
        inputRecode = new ArrayList<Double>();
    }

    @Override
    public void calculate(String input) {
        String[] inputValues = input.split(" ");
        double a = Double.parseDouble(inputValues[0]);
        double b = Double.parseDouble(inputValues[1]);
        char operator = inputValues[2].charAt(0);

        // 입력값 저장
        inputRecode.add(a);
        inputRecode.add(b);

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

    public List<Double> getInputRecode() {
        return inputRecode;
    }

    public List<String> getResultGreaterInput() {
        double maxInput = inputRecode.stream()
                .mapToDouble(Double::doubleValue)
                .max().orElse(0);

        return memoResult.stream()
                .filter(s -> {
                    try {
                        return Double.parseDouble(s)> maxInput;
                    } catch (NumberFormatException e) {
                        return false; //에러 메시지인 경우 제외
                    }
                })
                .collect(Collectors.toList());
    }
}
