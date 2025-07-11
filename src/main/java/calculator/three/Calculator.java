package calculator.three;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class Calculator<T> {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    protected Queue<T> memoResult;

    public void addResult(T result) {
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
    }

    public Queue<T> getMemoResult() {
        return memoResult;
    }

    public void setMemoResult(Queue<T> memoResult) {
        this.memoResult = memoResult;
    }
}
