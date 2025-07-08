package calculator.two;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private Queue<String> memoResult;
    private LinkedList<String> circleResult;
    /*
    static : 메모리 할당을 컴파일 시간에 한다. 메소드 영역에 저장되며 이는 프로그램 실행 직후부터 프로그램 종료까지 메모리에 남아있다.
    메모리를 절약할 수 있어 내부 클래스를 만들 때도 사용
    final : 재할당 금지(변수 : 한 번만 초기화 가능, 메소드 : 해당 메소드 오버라이딩 금지, 클래스 : 상속 불가능)
    인스턴스 변수로 선언 시 힙 영역에 저장되며 각 객체가 다른 값을 가질 수 있다.
    static 으로 클래스의 모든 인스턴스에 해당 상수에 대한 메모리를 할당(항상 동일한 값)
    static final : 변하지 않는 값(상수)를 선언할 때 사용, 메소드 영역 Constant Pool에 따로 저장된다.
     */
    private static final double PI = 3.141592;

    public Calculator() {
        this.memoResult = new LinkedList<>();
        this.circleResult = new LinkedList<>();
    }


    public Queue<String> getMemoResult() {
        return memoResult;
    }

    public void setMemoResult(Queue<String> memoResult) {
        this.memoResult = memoResult;
    }

    public void removeResult() {
        memoResult.remove();
    }

    public void inquiryResults() {
        memoResult.forEach(System.out::println);
    }

    public LinkedList<String> getCircleResult() {
        return circleResult;
    }

    public void setCircleResult(LinkedList<String> circleResult) {
        this.circleResult = circleResult;
    }

    public void calculate(int a, int b, char operator) {
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
            memoResult.add(String.valueOf(result));
        } catch (Exception e) {
            memoResult.add(e.getMessage());
        }
    }

    /* 원의 넓이를 구하는 메서드 선언*/
    public double calculateCircleArea(double radius) {
        /* 원의 넓이 계산 구현 */
        double areaCircle = PI * radius * radius;
        circleResult.add(String.valueOf(areaCircle));
        return areaCircle;
    }
}
