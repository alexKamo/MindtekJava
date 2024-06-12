package homeworks;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        /*
        1. Create a class with name MaxMinNumber
        2. Create main method with Scanner.
        3. Write a program that will ask from user to enter 3 numbers and program
        will print the largest number and the lowest number.
         */
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 0;
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        max = num1;
        min = num1;

        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        if(num2>max) max = num2;
        if(num2<min) min = num2;

        System.out.println("Enter 3rd number:");
        int num3 = sc.nextInt();
        if(num3>max) max = num3;
        if(num3<min) min = num3;

        System.out.println("Maximum:" + max);
        System.out.println("Minimum:" + min);






    }
}
