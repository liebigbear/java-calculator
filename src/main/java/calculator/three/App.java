package calculator.three;

import java.util.Scanner;


public class App {
    /**
     * 두 정수를 입력받아 출력하는 프로그램
     * @param args
     */
    public static void main(String[] args) {
        Calculator arithmeticCalculator = new ArithmeticCalculator();
        Calculator circleCalculator = new CircleCalculator();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("사칙연산 (plus 입력 시 사칙 연산) 원의 넓이 (areaCircle 입력 시 원의 넓이)");
            String command = sc.nextLine();
            if(command.equals("plus")) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int a = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int b = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                /* CharAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환하고자 하는 문자열의 위치(index) */
                char operator = sc.next().charAt(0);
                String input = a+" "+b+" "+operator;

                arithmeticCalculator.calculate(input);

                System.out.println("calculator.getMemoResult() = " + arithmeticCalculator.getMemoResult());

                //값 초기화
                //calculator.setMemoResult(new LinkedList<>());

                //값 삭제
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String isRemove = sc.nextLine();
                if(isRemove.equals("remove")) {
                    arithmeticCalculator.removeResult();
                }

                //연산 결과 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String isInquiry = sc.nextLine();
                if(isInquiry.equals("inquiry")) {
                    arithmeticCalculator.inquiryResults();
                }
            }
            if(command.equals("areaCircle")) {
                System.out.println("반지름을 입력하세요");
                String input = sc.nextLine();
                /* 원의 넓이를 구하는 경우 반지름을 입력받아 원의 넓이를 구한 후 출력*/
                /* 원의 넓이 저장 */
                circleCalculator.calculate(input);

                /* 저장된 원의 넓이 값들 바로 전체 조회 */
                System.out.println(circleCalculator.getMemoResult());
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();
            if(exit.equals("exit")) {
                break;
            }
        }
    }
}
