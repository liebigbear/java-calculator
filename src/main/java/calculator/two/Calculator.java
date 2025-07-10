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
    protected ModOperator modOperator;

    public class AddOperator implements Operation {
        @Override
        public int operate(int a, int b) {
            return a + b;
        }
    }

    public class SubtractOperator implements Operation {
        @Override
        public int operate(int a, int b) {
            return a - b;
        }
    }

    public class MultiplyOperator implements Operation {
        @Override
        public int operate(int a, int b) {
            return a * b;
        }
    }


    public class DivideOperator implements Operation {
        @Override
        public int operate(int a, int b) {
            if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
            return a / b;
        }
    }

    public class ModOperator implements Operation {
        @Override
        public int operate(int a, int b) {
            return a % b;
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
        this.modOperator = new ModOperator();
    }

    public Queue<String> getMemoResult() {
        return memoResult;
    }

    public void setMemoResult(Queue<String> memoResult) {
        this.memoResult = memoResult;
    }
}
