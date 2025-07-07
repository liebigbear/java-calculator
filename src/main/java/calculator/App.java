package calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class App {
    /**
     * 두 정수를 입력받아 출력하는 프로그램
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> memoResult = new LinkedList<>();

        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            /* CharAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환하고자 하는 문자열의 위치(index) */
            char operator = sc.next().charAt(0);

            boolean valid = true;

            int result = 0;
            if(operator == '+') {
                result = a + b;
            } else if(operator == '-') {
                result = a - b;
            } else if(operator == '*') {
                result = a * b;
            } else if(operator == '/') {
                if(b == 0)  {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    valid = false;
                }
                else result = a / b;
            } else if(operator == '%') {
                result = a % b;
            } else {
                System.out.println("잘못된 연산자를 입력하셨습니다.");
                valid = false;
            }

            if(valid) {
                memoResult.add(result);
            }
            System.out.println("결과: " + result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String isRemove = sc.next();
            if(isRemove.equals("remove")) {
                memoResult.remove();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if(exit.equals("exit")) {
                break;
            }
        }
        System.out.println(memoResult);

        sc.close();
    }
}
