package calculator.two;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private Queue<String> memoResult = new LinkedList<>();

    public Queue<String> getMemoResult() {
        return memoResult;
    }

    public void setMemoResult(Queue<String> memoResult) {
        this.memoResult = memoResult;
    }

    public void removeResult() {
        memoResult.remove();
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

}
