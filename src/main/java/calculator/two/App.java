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
        int a = calculator.calculate(1,0,'/');
        System.out.println("a = " + a);
    }
}
