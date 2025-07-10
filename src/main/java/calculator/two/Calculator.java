package calculator.two;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    protected Queue<String> memoResult;
    protected AddOperator addOperator;
    protected SubtractOperator subtractOperator;
    protected MultiplyOperator multiplyOperator;
    protected DivideOperator divideOperator;

    public class AddOperator {
        public int operate(int a, int b) {
            return a + b;
        }
    }

    public class SubtractOperator {
        public int operate(int a, int b) {
            return a - b;
        }
    }

    public class MultiplyOperator {
        public int operate(int a, int b) {
            return a * b;
        }
    }


    public class DivideOperator {
        public int operate(int a, int b) {
            if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
            return a / b;
        }
    }

    public void addResult(String result) {
        memoResult.add(result);
    }
    public void inquiryResults() {
        memoResult.forEach(System.out::println);
    }
    public void removeResult() {
        memoResult.remove();
    }

    abstract public void calculate(String input);

    public Calculator() {
        this.memoResult = new LinkedList<>();
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }

    public Queue<String> getMemoResult() {
        return memoResult;
    }

    public void setMemoResult(Queue<String> memoResult) {
        this.memoResult = memoResult;
    }
}
