package ProjectDay;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter operator: ");
        String operator = sc.next();
        if (operator.equals("+")) System.out.println(num1+num2);
        if (operator.equals("*")) System.out.println(num1*num2);
        if (operator.equals("-")) System.out.println(num1-num2);
        if (operator.equals("/")) System.out.println(num1/num2);

    }
}
