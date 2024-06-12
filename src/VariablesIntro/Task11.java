package VariablesIntro;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // ask a user to enter 4 numbers
        // print total sum of the given numbers
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter four numbers");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        int num4 = sc.nextInt();
        int sum = 0;
        System.out.println("Enter four numbers");
        int num1 = sc.nextInt();
        sum = sum + num1;
        num1 = sc.nextInt();
        sum = sum + num1;
        num1 = sc.nextInt();
        sum = sum + num1;
        num1 = sc.nextInt();
        sum = sum + num1;

        System.out.println("Total is: " + sum);
    }
}

