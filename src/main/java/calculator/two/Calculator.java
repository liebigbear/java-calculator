package calculator.two;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private Queue<Integer> memoResult = new LinkedList<>();


    public int calculate(int a, int b, char operator) {
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
        return result;
    }
}
