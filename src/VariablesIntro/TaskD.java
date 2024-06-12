package VariablesIntro;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Total: "+(num1+num2));

        System.out.println("Enter two numbers: ");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println("Total: "+(num3*num4));
    }
}

