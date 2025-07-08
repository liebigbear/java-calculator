package calculator.two;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class App {
    /**
     * 두 정수를 입력받아 출력하는 프로그램
     * @param args
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            /* CharAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환하고자 하는 문자열의 위치(index) */
            char operator = sc.next().charAt(0);

            calculator.calculate(a, b, operator);

            System.out.println("calculator.getMemoResult() = " + calculator.getMemoResult());

            //값 초기화
            calculator.setMemoResult(new LinkedList<>());

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if(exit.equals("exit")) {
                break;
            }
        }
    }
}
