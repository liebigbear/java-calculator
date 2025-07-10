package calculator.two;

public class CircleCalculator extends Calculator {

    private static final double PI = 3.141592;

    /* 원의 넓이를 구하는 메서드 선언*/
    @Override
    public void calculate(String input) {
        /* 원의 넓이 계산 구현 */
        double radius = Double.parseDouble(input);

        double areaCircle = PI * radius * radius;
        addResult(String.valueOf(areaCircle));
    }

    private double parser(String input) {
        return Double.parseDouble(input);
    }
}
