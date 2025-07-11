package calculator.three;

public class CircleCalculator extends Calculator<String> {
    /*
    static : 메모리 할당을 컴파일 시간에 한다. 메소드 영역에 저장되며 이는 프로그램 실행 직후부터 프로그램 종료까지 메모리에 남아있다.
    메모리를 절약할 수 있어 내부 클래스를 만들 때도 사용
    final : 재할당 금지(변수 : 한 번만 초기화 가능, 메소드 : 해당 메소드 오버라이딩 금지, 클래스 : 상속 불가능)
    인스턴스 변수로 선언 시 힙 영역에 저장되며 각 객체가 다른 값을 가질 수 있다.
    static 으로 클래스의 모든 인스턴스에 해당 상수에 대한 메모리를 할당(항상 동일한 값)
    static final : 변하지 않는 값(상수)를 선언할 때 사용, 메소드 영역 Constant Pool에 따로 저장된다.
     */
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
