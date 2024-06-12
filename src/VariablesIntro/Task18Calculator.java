package VariablesIntro;

import java.util.Scanner;

public class Task18Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Write a program that asks to enter two int numbers and String as operator, then print
        correct calculation of two numbers for entered operator.
        Operators: + - * / */
        System.out.println("Enter first numbers:");
        double num1 = sc.nextInt();
        System.out.println("Enter second numbers:");
        double num2 = sc.nextInt();
        System.out.println("Enter operator:");
        String operator = sc.next();

        if (operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")) {
            if (operator.equals("+")) System.out.println("Sum of plus: " + (num1 + num2));
            if (operator.equals("-")) System.out.println("Sum of minus: " + (num1 - num2));
            if (operator.equals("*")) System.out.println("Sum of multiplications: " + (num1 * num2));
            if (operator.equals("/") && num2 != 0) System.out.println("Sum of division: " + (num1 / num2));
            if (operator.equals("/") && num2 == 0) System.out.println("Error");
        }else System.out.println("Invalid operator...");
    }
}

